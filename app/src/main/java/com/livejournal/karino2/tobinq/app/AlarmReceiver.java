package com.livejournal.karino2.tobinq.app;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.Date;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    UpdateChecker checker;

    @Override
    public void onReceive(Context context, Intent intent) {
        if(checker == null) {
            checker = new UpdateChecker(context, (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE), new UpdateChecker.UpdateListener() {
                @Override
                public void onUpdate() {
                }
            });
        }
        checker.startSyncIfNecessary();
        writeLastAlarmFoundTime(UpdateChecker.getSharedPreferences(context));
    }

    static void writeLastAlarmFoundTime(SharedPreferences prefs) {
        prefs.edit()
                .putLong("lastAlarmFound", currentTime())
                .commit();
    }
    static long getLastAlarmFoundTime(SharedPreferences prefs) {
        return prefs.getLong("lastAlarmFound", -1);
    }


    static long currentTime() {
        return (new Date()).getTime();
    }

    static final long TWO_DAYS_MILLSEC = 48*60*60*1000;

    public static void RegisterAlarmIfNecessary(Context context) {
        SharedPreferences prefs = UpdateChecker.getSharedPreferences(context);
        long lastRegister = getLastAlarmFoundTime(prefs);
        if(lastRegister == -1) {
            RegisterAlarm(context);
            return;
        }

        long cur = currentTime();
        long diffMill = cur - lastRegister;

        // If last alarm found time is more than two days, there are some situation that alarm is not registered.
        // So register here.
        if(diffMill > TWO_DAYS_MILLSEC) {
            writeLastAlarmFoundTime(prefs);
            RegisterAlarm(context);
            return;
        }

    }


    public static void RegisterAlarm(Context context) {
        AlarmManager alarmMgr;
        alarmMgr = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);

        Intent alarmIntent = new Intent(context, AlarmReceiver.class);
        PendingIntent alarmPIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, 0);

        alarmMgr.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                AlarmManager.INTERVAL_HOUR,
                AlarmManager.INTERVAL_DAY, alarmPIntent);

        writeLastAlarmFoundTime(UpdateChecker.getSharedPreferences(context));
    }
}
