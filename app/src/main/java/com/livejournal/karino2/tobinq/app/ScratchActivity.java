package com.livejournal.karino2.tobinq.app;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.achartengine.GraphicalView;

import java.io.IOException;

import okhttp3.OkHttpClient;


public class ScratchActivity extends AppCompatActivity {
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


        findViewById(R.id.button_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOutputConsole();
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
        , new Retriever(new OkHttpClient(), getDatabase()),
                this);


    }

    @Override
    public void onBackPressed() {
        if(popup != null && popup.isShowing()) {
            hideChartPopup();
            updateMenu();
            return;
        }
        super.onBackPressed();
    }

    private void clearOutputConsole() {
        findEditText(R.id.etOutput).setText("");
    }


    private void toggleShowChart() {
        if (popup == null) {
            showMessage("no chart");
            return;
        }
        if(popup.isShowing())
            hideChartPopup();
        else
            showChartPopup();
        updateMenu();
    }

    private void hideChartPopup() {
        popup.dismiss();
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
            holder.addView(chart);
        }

        @Override
        public void showChart() {
            if(popup == null) {
                LayoutInflater inflater = getLayoutInflater();
                View popupView = inflater.inflate(R.layout.popup_chart, null);
                popup = new PopupWindow(popupView, getChartWidth(), getChartHeight(), false);
                inflateChartMenu();
            }
            resetChartToPopup();
            showChartPopup();

        }
    }

    private void showChartPopup() {
        if(!popup.isShowing())
            popup.showAtLocation(findViewById(R.id.root), Gravity.BOTTOM, 0, 0);
        updateMenu();
    }

    private int getChartHeight() {
        return findViewById(R.id.root).getMeasuredHeight();
    }

    private int getChartWidth() {
        return findViewById(R.id.root).getMeasuredWidth();
    }


    @Override
    protected void onStop() {
        if(popup != null) {
            popup.dismiss();
            popup = null;
            chart = null;
            removeChartMenuIfExist();
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

    boolean chartMenuAdded = false;
    void inflateChartMenu() {
        if(!chartMenuAdded) {
            chartMenuAdded = true;
            getMenuInflater().inflate(R.menu.scratch_with_chart, _menu);
        }
    }


    Menu _menu;
    private void updateMenu() {
        if(!chartMenuAdded)
            return;

        boolean chartShown = chart != null;
        if(_menu != null) {
            _menu.findItem(R.id.action_share).setEnabled(chartShown);
            _menu.findItem(R.id.action_toggle_chart).setEnabled(chartShown);
            if(chartShown) {
                int rid;
                if(popup.isShowing())
                    rid =android.R.drawable.ic_menu_close_clear_cancel;
                else
                    rid = android.R.drawable.ic_menu_gallery;
                _menu.findItem(R.id.action_toggle_chart).setIcon(rid);
            }
        }
    }

    private void removeChartMenuIfExist() {
        chartMenuAdded = false;
        if(_menu == null)
            return;
        _menu.removeItem(R.id.action_share);
        _menu.removeItem(R.id.action_toggle_chart);
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
            fileSaver = new OneTimeFileSaver(this,"QChart", getContentResolver());
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
        if(id==R.id.action_toggle_chart) {
            toggleShowChart();
            return true;
        }
        if (id==R.id.action_run) {
            String code = findEditText(R.id.etScript).getText().toString();
            eval(code);
            hideSoftkey();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void hideSoftkey() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(findEditText(R.id.etScript).getWindowToken(), 0);
    }


    private void eval(String code) {
        interpreter.eval(code);
    }

}
