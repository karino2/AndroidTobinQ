package com.livejournal.karino2.tobinq.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.impl.client.DefaultHttpClient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ScriptListActivity extends ActionBarActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    final int SETTING_ACTIVITY_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retriever = new Retriever(new DefaultHttpClient(), getDatabase());

        adapter = new SimpleCursorAdapter(this, R.layout.script_list_item, null,
                new String[]{"title", "description", "date", "docId"}, new int[]{R.id.tvTitle, R.id.tvDescription, R.id.tvDate,  R.id.tvRemoteLocal}, 0);

        adapter.setViewBinder(new SimpleCursorAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
                // docId
                if(columnIndex == 1) {
                    TextView tv = (TextView)view;
                    if(isNullOrEmpty(cursor.getString(columnIndex)))
                        tv.setText("local");
                    else
                        tv.setText("remote");
                    return true;
                }
                // date
                if(columnIndex == 5) {
                    TextView tv = (TextView)view;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
                    tv.setText(sdf.format(new Date(cursor.getLong(columnIndex))));
                    return true;
                }
                return false;
            }
        });

        getListView().setAdapter(adapter);
        getSupportLoaderManager().initLoader(0, null, this);
    }

    Retriever retriever;

    private boolean isNullOrEmpty(String string) {
        if(string == null)
            return true;
        return string.equals("");
    }

    ListView getListView() {
        return(ListView) findViewById(R.id.list);
    }

    void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    Database getDatabase() { return Database.getInstance(this); }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    long startCheck = -1;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.action_edit) {
            startActivity(new Intent(this, EditActivity.class));
            return true;
        }
        if(id==R.id.action_sync) {
            showMessage("Sync scripts");
            startCheck = (new Date()).getTime();
            retriever.retrieveScriptList(getDatabase().latestUpdatedAt(), new Retriever.OnScriptEntityReadyListener() {
                @Override
                public void onReady(List<ScriptEntity> ents) {
                    showMessage("sync done.");
                    writeLastCheckedTime(startCheck);
                    reloadCursor();
                }

                @Override
                public void onFail(String message) {
                    showMessage("Sync scripts fail: " + message);
                    startCheck = -1;
                }
            });
            return true;
        }
        if(id ==R.id.action_settings) {
            startActivityForResult(new Intent(this, SettingActivity.class), SETTING_ACTIVITY_ID);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == SETTING_ACTIVITY_ID) {
            reloadCursor();
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private long getLastCheckedTime() {
        SharedPreferences prefs = getSharedPreferences("script_list", MODE_PRIVATE);
        return prefs.getLong("lastCheckedTime", -1);
    }

    private void writeLastCheckedTime(long lastChecked) {
        SharedPreferences prefs = getSharedPreferences("script_list", MODE_PRIVATE);
        writeLastCheckedTimeStatic(lastChecked, prefs);

    }

    public static void writeLastCheckedTimeStatic(long lastChecked, SharedPreferences prefs) {
        prefs.edit()
                .putLong("lastCheckedTime", lastChecked)
                .commit();
    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new SimpleCursorLoader(this) {
            @Override
            public Cursor doCursorLoad() {
                return getDatabase().queryScripts();
            }
        };
    }

    SimpleCursorAdapter adapter;

    void reloadCursor() {
        Loader<Object> loader = getSupportLoaderManager().getLoader(0);
        if(loader != null)
            loader.forceLoad();
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapter.swapCursor(null);
    }
}
