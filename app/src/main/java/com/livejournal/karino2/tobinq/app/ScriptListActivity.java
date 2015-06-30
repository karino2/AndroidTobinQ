package com.livejournal.karino2.tobinq.app;

import android.app.NotificationManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ScriptListActivity extends ActionBarActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    final int SETTING_ACTIVITY_ID = 1;
    UpdateChecker checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script_list);

        adapter = new SimpleCursorAdapter(this, R.layout.script_list_item, null,
                new String[]{"title", "description", "date", "docId"}, new int[]{R.id.tvTitle, R.id.tvDescription, R.id.tvDate,  R.id.tvRemoteLocal}, 0);

        adapter.setViewBinder(new SimpleCursorAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
                // docId
                if (columnIndex == 1) {
                    TextView tv = (TextView) view;
                    if (isNullOrEmpty(cursor.getString(columnIndex))) {
                        tv.setText("local");
                    } else {
                        tv.setText("remote");
                        tv.setTag(cursor.getString(columnIndex));
                    }

                    //4 is script
                    ((View) view.getParent()).setTag(cursor.getString(4));
                    return true;
                }
                // date
                if (columnIndex == 5) {
                    TextView tv = (TextView) view;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
                    tv.setText(sdf.format(new Date(cursor.getLong(columnIndex))));
                    return true;
                }
                return false;
            }
        });

        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String script = (String)view.getTag();
                Intent intent = new Intent(ScriptListActivity.this, EvalActivity.class);
                intent.putExtra("script_content", script);
                intent.putExtra("description", ((TextView)view.findViewById(R.id.tvDescription)).getText());
                intent.putExtra("docId", (String)view.findViewById(R.id.tvRemoteLocal).getTag());
                intent.putExtra("title", (String)((TextView)view.findViewById(R.id.tvTitle)).getText());
                startActivity(intent);
            }
        });
        getSupportLoaderManager().initLoader(0, null, this);

        checker = new UpdateChecker(this, (NotificationManager)getSystemService(NOTIFICATION_SERVICE), new UpdateChecker.UpdateListener() {
            @Override
            public void onUpdate() {
                reloadCursor();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        AlarmReceiver.RegisterAlarmIfNecessary(this);

        if(-1 == getDatabase().latestUpdatedAt()) {
            showMessage("Script list empty. Try sync...");
        }

        checker.startSyncIfNecessary();
    }

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
        getMenuInflater().inflate(R.menu.script_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.action_scratch) {
            startActivity(new Intent(this, ScratchActivity.class));
            return true;
        }
        if(id==R.id.action_sync) {
            checker.startSync();
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
