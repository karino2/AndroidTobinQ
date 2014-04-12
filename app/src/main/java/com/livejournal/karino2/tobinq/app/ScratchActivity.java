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
import org.antlr.runtime.tree.Tree;
import org.apache.http.impl.client.DefaultHttpClient;


public class ScratchActivity extends ActionBarActivity {
    PopupWindow popup;

    QInterpreter interpreter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

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

        interpreter = new QInterpreter(new Writable() {
            @Override
            public void write(CharSequence cs) {
                EditText et = findEditText(R.id.etOutput);
                String res = cs.toString()+ et.getText().toString();
                et.setText(res);
            }
        }, new ChartWrapper(), new CsvTableRetriever(new CsvTableRetriever.ResumeListener() {
            @Override
            public void onResume() {
                onScriptResume();
            }

            @Override
            public void onResumeFail(String message) {
                onScriptResumeFail(message);
            }

            @Override
            public void notifyStatus(String message) {
                showMessage(message);
            }
        }, new Retriever(new DefaultHttpClient(), getDatabase())));

    }

    private ToggleButton findToggleButtonShowChart() {
        return ((ToggleButton)findViewById(R.id.tbShowChart));
    }

    void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    Database getDatabase() { return Database.getInstance(this); }


    class ChartWrapper implements Plotable {

        XYMultipleSeriesDataset dataset;
        XYMultipleSeriesRenderer renderer;



        GraphicalView chart;


        @Override
        public void setDatasetRenderer(XYMultipleSeriesDataset dataset, XYMultipleSeriesRenderer renderer) {
            this.dataset = dataset;
            this.renderer = renderer;
        }

        @Override
        public void resetChart() {
            if(popup == null)
                return;
            LinearLayout holder = (LinearLayout)popup.getContentView().findViewById(R.id.layout_chart) ;
            if(chart != null) {
                holder.removeView(chart);
            }
            chart = ChartFactory.getLineChartView(ScratchActivity.this, dataset, renderer);
            holder.addView(chart);
        }

        @Override
        public void showChart() {
            findToggleButtonShowChart().setChecked(true);
            if(popup == null) {
                LayoutInflater inflater = getLayoutInflater();
                View popupView = inflater.inflate(R.layout.popup_chart, null);
                popup = new PopupWindow(popupView, getChartWidth(), getChartHeight(), false);
                resetChart();
            }
            chart.repaint();
            showChartPopup();

        }
    }

    private void showChartPopup() {
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
        getMenuInflater().inflate(R.menu.edit, menu);
        return true;
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
        if (id==R.id.action_run) {
            String code = findEditText(R.id.etScript).getText().toString();
            eval(code);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    Tree suspendedValue;
    private void eval(String code) {
        try {
            interpreter.eval(code);
        } catch (BlockException be) {
            suspendedValue = be._currentValueNode;
        } catch (RuntimeException re) {
            interpreter.println("error: " + re.toString());
        }
    }

    void onScriptResume() {
        try{
            interpreter.continueEval(suspendedValue);
        }
        catch(BlockException be)
        {
            suspendedValue = be._currentValueNode;
        }
        catch(RuntimeException e)
        {
            interpreter.println("error: " + e.toString());
        }
    }

    public void onScriptResumeFail(String message) {
        interpreter.println("Block call failure:" + message);
    }

}
