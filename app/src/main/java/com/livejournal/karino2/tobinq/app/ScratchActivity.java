package com.livejournal.karino2.tobinq.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;


public class ScratchActivity extends ActionBarActivity {
    PopupWindow popup;
    GraphicalView chart;

    InterpreterFacade interpreter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scratch);

        String script = getIntent().getStringExtra("script_content");
        if(script != null)
            findEditText(R.id.etScript).setText(script);


        findToggleButtonShowChart().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (popup == null) {
                    showMessage("no chart");
                    return;
                }
                if (isChecked)
                    showChartPopup();
                else
                    popup.dismiss();
            }
        });

        ((Button)findViewById(R.id.btClear)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findEditText(R.id.etOutput).setText("");
            }
        });

        interpreter = new InterpreterFacade(new Writable() {
            @Override
            public void write(CharSequence cs) {
                EditText et = findEditText(R.id.etOutput);
                String res = cs.toString()+ et.getText().toString();
                et.setText(res);
            }
        }, new ChartWrapper(), new InterpreterFacade.NotifyListener() {
            @Override
            public void notifyStatus(String message) {
                showMessage(message);
            }
        }
        , new Retriever(new DefaultHttpClient(), getDatabase()));


    }

    private ToggleButton findToggleButtonShowChart() {
        return ((ToggleButton)findViewById(R.id.tbShowChart));
    }

    void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    Database getDatabase() { return Database.getInstance(this); }


    class ChartWrapper extends ChartPlotter {



        private void resetChartToPopup() {
            LinearLayout holder = (LinearLayout)popup.getContentView().findViewById(R.id.layout_chart) ;
            if(chart != null) {
                holder.removeView(chart);
            }
            chart = createChart(ScratchActivity.this);
            updateMenu();
            holder.addView(chart);
        }

        @Override
        public void showChart() {
            if(popup == null) {
                LayoutInflater inflater = getLayoutInflater();
                View popupView = inflater.inflate(R.layout.popup_chart, null);
                popup = new PopupWindow(popupView, getChartWidth(), getChartHeight(), false);
            }
            resetChartToPopup();
            showChartPopup();
            findToggleButtonShowChart().setChecked(true);

        }
    }

    private void showChartPopup() {
        if(!popup.isShowing())
            popup.showAtLocation(findViewById(R.id.root), Gravity.BOTTOM, 0, 0);
    }

    private int getChartHeight() {
        ToggleButton tb = findToggleButtonShowChart();
        return findViewById(R.id.root).getMeasuredHeight()-tb.getBottom();
    }

    private int getChartWidth() {
        return findViewById(R.id.root).getMeasuredWidth();
    }


    @Override
    protected void onStop() {
        if(popup != null) {
            popup.dismiss();
            popup = null;
        }
        super.onStop();
    }

    EditText findEditText(int rid) {
        return (EditText)findViewById(rid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.scratch, menu);
        return true;
    }


    Menu _menu;
    private void updateMenu() {
        if(_menu != null)
            _menu.findItem(R.id.action_share).setEnabled(chart != null);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        _menu = menu;
        updateMenu();
        return super.onPrepareOptionsMenu(menu);
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
        if(id ==R.id.action_settings) {
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }
        if(id== R.id.action_share) {
            try {
                startActivity(getFileSaver().saveAndCreateSendIntent(chart.toBitmap()));
            } catch (IOException e) {
                showMessage("Fail to save bitmap: " + e.getMessage());
            }
            return true;
        }
        if (id==R.id.action_run) {
            String code = findEditText(R.id.etScript).getText().toString();
            eval(code);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void eval(String code) {
        interpreter.eval(code);
    }

}
