package com.livejournal.karino2.tobinq.app;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class OpenUrlActivity extends AppCompatActivity {

    Handler handler = new Handler();
    UpdateChecker checker;

    String docId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_url);

        Intent intent = getIntent();
        if(intent != null) {
            // https://karino2.github.io/TobinQJsonBackend/pages/nMOGwQc7E6SuQ4a2SwLlrAvQTtkZpKop.html
            Uri data = Uri.parse(intent.getDataString());
            // nMOGwQc7E6SuQ4a2SwLlrAvQTtkZpKop.html
            String fileName = data.getLastPathSegment();
            // trim .html
            docId = fileName.substring(0, fileName.length()-5);
        }

        checker = new UpdateChecker(this, (NotificationManager)getSystemService(NOTIFICATION_SERVICE), new UpdateChecker.UpdateListener() {
            @Override
            public void onUpdate() {
                notifyLoadDone();
            }
        });


        new Thread(new Runnable(){
            @Override
            public void run() {
                ScriptEntity ent = getDatabase().findByDocId(docId);
                if(ent == null) {
                    checker.startSync();
                    return;
                }
                startEvalActivity(ent);
            }
        }).run();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("open_docId", docId);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        docId = savedInstanceState.getString("open_docId");
    }


    private void startEvalActivity(ScriptEntity ent) {
        EvalActivity.startEvalActivity(this, ent.getDocId(), ent.getTitle(), ent.getScript(), ent.getDescription());
        finish();
    }

    private void notifyLoadDone() {
        ScriptEntity ent = getDatabase().findByDocId(docId);
        if(ent == null) {
            showErrorMessage();
            return;
        }
        startEvalActivity(ent);
    }

    private void showErrorMessage() {
        handler.post(new Runnable() {

            @Override
            public void run() {
                TextView tvLoading = (TextView) findViewById(R.id.textViewLoading);
                TextView tvError = (TextView) findViewById(R.id.textViewError);
                tvLoading.setVisibility(View.INVISIBLE);
                tvError.setVisibility(View.VISIBLE);
            }
        });
    }


    Database getDatabase() { return Database.getInstance(this); }


}
