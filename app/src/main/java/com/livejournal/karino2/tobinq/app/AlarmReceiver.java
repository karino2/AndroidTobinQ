package com.livejournal.karino2.tobinq.app;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

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
    }
}
