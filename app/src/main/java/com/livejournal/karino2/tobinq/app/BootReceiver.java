package com.livejournal.karino2.tobinq.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent2) {
        if (intent2.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            AlarmManager alarmMgr;
            alarmMgr = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);

            Intent alarmIntent = new Intent(context, AlarmReceiver.class);
            PendingIntent alarmPIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, 0);

            alarmMgr.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                AlarmManager.INTERVAL_HOUR,
                AlarmManager.INTERVAL_DAY, alarmPIntent);

        }
    }
}
