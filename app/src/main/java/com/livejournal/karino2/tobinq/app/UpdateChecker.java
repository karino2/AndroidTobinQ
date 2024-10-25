package com.livejournal.karino2.tobinq.app;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.core.app.NotificationCompat;

import java.util.Date;
import java.util.List;

import okhttp3.OkHttpClient;

/**
 * Created by karino on 6/27/15.
 */
public class UpdateChecker {
    private final int STATUS_NOTIFICATION_ID = R.layout.activity_script_list;
    public static final String CHANNEL_ID = "TOUKEI_GRAPH_CHANNEL";



    Context context;
    NotificationManager notificationManager;
    Retriever retriever;

    public interface UpdateListener {
        void onUpdate();
    }

    UpdateListener updateListener;

    public UpdateChecker(Context ctx, NotificationManager nm, UpdateListener ul) {
        context = ctx;
        notificationManager = nm;
        updateListener = ul;

        retriever = new Retriever(new OkHttpClient(), getDatabase());

        Retriever.lastScriptUpdateAt = getLastReceiveTime();
    }

    long startCheck = -1;


    public void startSyncIfNecessary() {
        hideNotification();

        if(-1 == getDatabase().latestUpdatedAt()) {
            // show notification by caller for a while.
            // showMessage("Script list empty. Try sync...");
            startSync();
            return;
        }

        long lastCheck = getLastCheckedTime();
        if(currentTime()-lastCheck > 24*60*60*1000) {
            startSync();
            return;
        }
    }

    public void startSync() {
        startCheck = currentTime();
        showNotification(getString(R.string.notification_title), "Sync scripts...", "Sync scripts...");
        retriever.retrieveScriptList(getDatabase().latestUpdatedAt(), getLastModified(), new Retriever.OnScriptEntityReadyListener() {
            @Override
            public void onReady(List<ScriptEntity> ents, String lastModified) {
                hideNotification();
                writeLastCheckedTime(startCheck);
                writeLastModified(lastModified);
                if (ents.size() >= 1) {
                    writeLastReceiveTime(startCheck);
                    showNotification(getString(R.string.notification_title), ents.size() + " chart updated.", ents.size() + " chart updated.");
                }
                updateListener.onUpdate();
                // reloadCursor();
            }

            @Override
            public void onNotModified()
            {
                hideNotification();
                writeLastCheckedTime(startCheck);
            }

            @Override
            public void onFail(String message) {
                showNotification(getString(R.string.notification_title), "Sync scripts fail: " + message, "Sync script fail.");
                writeLastCheckedTime(startCheck);
                startCheck = -1;
            }
        });
    }



    String getString(int resId) {
        return context.getString(resId);
    }

    Database getDatabase() { return Database.getInstance(context); }

    public static SharedPreferences getSharedPreferences(Context context1) {
        return  context1.getSharedPreferences("script_list", Activity.MODE_PRIVATE);

    }

    SharedPreferences getSharedPreferences() {
        return getSharedPreferences(context);
    }

    private long getLastCheckedTime() {
        SharedPreferences prefs = getSharedPreferences();
        return prefs.getLong("lastCheckedTime", -1);
    }

    private void writeLastCheckedTime(long lastChecked) {
        SharedPreferences prefs = getSharedPreferences();
        writeLastCheckedTimeStatic(lastChecked, prefs);
    }

    public static void writeLastCheckedTimeStatic(long lastChecked, SharedPreferences prefs) {
        prefs.edit()
                .putLong("lastCheckedTime", lastChecked)
                .commit();
    }

    public static void writeLastModifiedStatic(String lastModified, SharedPreferences prefs) {
        prefs.edit()
                .putString("lastModifiedHeader", lastModified)
                .commit();
    }

    public void writeLastModified(String lastModified) {
        SharedPreferences prefs = getSharedPreferences();
        writeLastModifiedStatic(lastModified, prefs);
    }

    public String getLastModified() {
        SharedPreferences prefs = getSharedPreferences();
        return prefs.getString("lastModifiedHeader", "");
    }

    void writeLastReceiveTime(long succeedAt) {
        SharedPreferences prefs = getSharedPreferences();
        writeLastReceiveTimeStatic(succeedAt, prefs);
    }

    public static void writeLastReceiveTimeStatic(long succeedAt, SharedPreferences prefs) {
        Retriever.lastScriptUpdateAt = succeedAt;
        prefs.edit()
                .putLong("lastReceiveTime", succeedAt)
                .commit();
    }

    long getLastReceiveTime() {
        SharedPreferences prefs = getSharedPreferences();
        return prefs.getLong("lastReceiveTime", -1);
    }

    private long currentTime() {
        return (new Date()).getTime();
    }

    void hideNotification() {
        showNotification(null, null, null);
    }

    public static void createNotificationChannel(Context context, NotificationManager notificationManager) {
        String channelName = context.getString(R.string.notification_title) + " Channel";
        NotificationChannel channel = new NotificationChannel(UpdateChecker.CHANNEL_ID, channelName, NotificationManager.IMPORTANCE_LOW);
        notificationManager.createNotificationChannel(channel);
    }

    private void showNotification(String title, String message, String ticker) {
        if(title == null) {
            notificationManager.cancel(STATUS_NOTIFICATION_ID);
            return;
        }
        createNotificationChannel(context, notificationManager);

        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, new Intent(context, ScriptListActivity.class), PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        /*
        PendingIntent contentIntent = PendingIntent.getActivities(this, 0,
                new Intent[]{new Intent(this, ScriptListActivity.class)}, PendingIntent.FLAG_CANCEL_CURRENT);
                */

        notificationManager.notify(STATUS_NOTIFICATION_ID, new NotificationCompat.Builder(context, CHANNEL_ID)
                .setContentTitle(title)
                .setTicker(ticker)
                .setContentText(message)
                .setContentIntent(contentIntent)
                .setSmallIcon(R.drawable.ic_stat)
                .build());
    }


}
