package com.livejournal.karino2.tobinq.app;

import android.app.NotificationManager;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class OpenUrlActivity extends ActionBarActivity  {

    Handler handler = new Handler();
    UpdateChecker checker;

    String docId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_url);

        Intent intent = getIntent();
        if(intent != null) {
            Uri data = Uri.parse(intent.getDataString());
            docId = data.getQueryParameter("id");
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
