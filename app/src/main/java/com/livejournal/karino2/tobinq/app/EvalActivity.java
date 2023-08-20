package com.livejournal.karino2.tobinq.app;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.achartengine.GraphicalView;

import java.io.IOException;

import okhttp3.OkHttpClient;


public class EvalActivity extends AppCompatActivity {
    final int PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE_ID = 1;
    public static void startEvalActivity(Context context, String docId, String title, String script, String description) {
        Intent intent = new Intent(context, EvalActivity.class);
        intent.putExtra("script_content", script);
        intent.putExtra("description", description);
        intent.putExtra("docId", docId);
        intent.putExtra("title", title);
        context.startActivity(intent);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode) {
            case PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE_ID:
                if(grantResults.length > 0 &&
                        grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    saveAndShareChart();
                } else {
                    showMessage("Permission doesn't granted. Some feature of share would be fail.");
                }

        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }



    InterpreterFacade interpreter;
    GraphicalView chart;

    String script;
    String docId;
    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval);

        if(script == null) {
            script = getIntent().getStringExtra("script_content");
            docId = getIntent().getStringExtra("docId");
            title = getIntent().getStringExtra("title");
            ((TextView)findViewById(R.id.tvDescription)).setText(getIntent().getStringExtra("description"));
        }


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
                LinearLayout ll = (LinearLayout)findViewById(R.id.layout_chart);
                if(chart != null)
                    ll.removeView(chart);
                chart = createChart(EvalActivity.this);
                updateMenu();
                ll.addView(chart);
                // chart.repaint();
            }
        }, new InterpreterFacade.NotifyListener() {
            @Override
            public void notifyStatus(String message) {
                showMessage(message);
            }
        }, new Retriever(new OkHttpClient(), getDatabase()),
                this);


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
        outState.putString("received_docId", docId);
        outState.putString("received_title", title);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        script = savedInstanceState.getString("received_script");
        docId = savedInstanceState.getString("received_docId");
        title = savedInstanceState.getString("received_title");
    }

    Handler handler = new Handler();

    void showMessage(String msg) { Toast.makeText(this, msg, Toast.LENGTH_LONG).show(); }
    Database getDatabase() { return Database.getInstance(this); }
    EditText findEditText(int rid) {
        return (EditText)findViewById(rid);
    }


    boolean isDebug() {
        PackageManager pm = getPackageManager();
        try {
            ApplicationInfo ai = pm.getApplicationInfo(getPackageName(), 0);
            if((ai.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0)
            {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eval, menu);
        if(isDebug()) {
            SubMenu sm = menu.addSubMenu("Debug");
            getMenuInflater().inflate(R.menu.admin, sm);
        }
        return true;
    }

    Menu _menu;

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        _menu = menu;
        updateMenu();
        return super.onPrepareOptionsMenu(menu);
    }

    private void updateMenu() {
        if(_menu != null)
            _menu.findItem(R.id.action_share).setEnabled(chart != null);
    }

    OneTimeFileSaver fileSaver;
    OneTimeFileSaver getFileSaver() {
        if(fileSaver == null) {
            fileSaver = new OneTimeFileSaver("QChart", "QChartDelivery", getContentResolver());
        }
        return fileSaver;
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
        if(id == R.id.action_admin_share) {
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            {
                saveAndShareChart();
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE_ID);
            }
            return true;
        }
        if( id == R.id.action_copy_to_scratch) {
            Intent intent = new Intent(this, ScratchActivity.class);
            intent.putExtra("script_content", script);
            startActivity(intent);
            return true;
        }
        if(id == R.id.action_share) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, title);
            intent.putExtra(Intent.EXTRA_TEXT, "https://karino2.github.io/TobinQJsonBackend/pages/" + docId +".html");
            startActivity(Intent.createChooser(intent, "Share URL"));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    private void saveAndShareChart() {
        Bitmap bitmap = chart.toBitmap();
        try {
            Intent intent = getFileSaver().saveAndCreateSendIntent(bitmap);
            startActivity(intent);
        } catch (IOException e) {
            showMessage("save fail: " + e.getMessage());
        }
    }

}
