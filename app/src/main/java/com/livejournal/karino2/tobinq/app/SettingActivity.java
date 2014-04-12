package com.livejournal.karino2.tobinq.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SettingActivity extends Activity {


    void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    Database getDatabase() { return Database.getInstance(this); }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ((Button)findViewById(R.id.btClearCsv)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Clear CSV done");
                getDatabase().recreateRemoteContentTable();
                Button bt = (Button)v;
                bt.setEnabled(false);
            }
        });

        ((Button)findViewById(R.id.btClearScripts)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Delete all scripts done");
                getDatabase().recreateScriptTable();
                MainActivity.writeLastCheckedTimeStatic(-1, getSharedPreferences("script_list", MODE_PRIVATE));
                Button bt = (Button)v;
                bt.setEnabled(false);
            }
        });
    }

}
