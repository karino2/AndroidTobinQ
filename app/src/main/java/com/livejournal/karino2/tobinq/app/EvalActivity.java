package com.livejournal.karino2.tobinq.app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.achartengine.GraphicalView;
import org.apache.http.impl.client.DefaultHttpClient;


public class EvalActivity extends ActionBarActivity {

    InterpreterFacade interpreter;
    GraphicalView chart;

    String script;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval);

        if(script == null)
            script = getIntent().getStringExtra("script_content");


        interpreter = new InterpreterFacade(new Writable() {
            @Override
            public void write(CharSequence cs) {
                EditText et = findEditText(R.id.etOutput);
                String res = cs.toString()+ et.getText().toString();
                et.setText(res);
            }
        }, new ChartPlotter() {
            @Override
            public void showChart() {
                LinearLayout ll = (LinearLayout)findViewById(R.id.root);
                if(chart != null)
                    ll.removeView(chart);
                chart = createChart(EvalActivity.this);
                ll.addView(chart);
                // chart.repaint();
            }
        }, new InterpreterFacade.NotifyListener() {
            @Override
            public void notifyStatus(String message) {
                showMessage(message);
            }
        }, new Retriever(new DefaultHttpClient(), getDatabase()));


    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText etOut = (EditText)findViewById(R.id.etOutput);
        etOut.setText("");
        etOut.setVisibility(View.GONE);
        interpreter.evalWithListener(script, new InterpreterFacade.FinishListener() {
            @Override
            public void onFinish(QObject result) {
                if(chart == null) {
                    ((EditText)findViewById(R.id.etOutput)).setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("received_script", script);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        script = savedInstanceState.getString("received_script");
    }

    Handler handler = new Handler();

    void showMessage(String msg) { Toast.makeText(this, msg, Toast.LENGTH_LONG).show(); }
    Database getDatabase() { return Database.getInstance(this); }
    EditText findEditText(int rid) {
        return (EditText)findViewById(rid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eval, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }
        if( id == R.id.action_copy_to_scratch) {
            Intent intent = new Intent(this, ScratchActivity.class);
            intent.putExtra("script_content", script);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
