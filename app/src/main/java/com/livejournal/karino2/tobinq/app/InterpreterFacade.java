package com.livejournal.karino2.tobinq.app;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v4.app.NotificationCompat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 * Created by karino on 4/12/14.
 */
public class InterpreterFacade {
    public interface NotifyListener {
        void notifyStatus(String message);
    }

    public interface FinishListener {
        void onFinish(QObject result);
    }

    NotifyListener notify;
    QInterpreter interpreter;
    FinishListener finishListener = new FinishListener() {
        @Override
        public void onFinish(QObject result) {

        }
    };


    Activity activity;
    NotificationManager notificationManager;

    public InterpreterFacade(Writable console, Plotable plotable, NotifyListener notifyListener, Retriever retriever, Activity act) {
        activity = act;
        notificationManager = (NotificationManager)activity.getSystemService(Activity.NOTIFICATION_SERVICE);

        notify = notifyListener;
        interpreter = new QInterpreter(console, plotable, new CsvTableRetriever(new CsvTableRetriever.ResumeListener() {
            @Override
            public void onResume() {
                onScriptResume();
            }

            @Override
            public void onResumeFail(String message) {
                onScriptResumeFail(message);
            }

            @Override
            public void notifyStatus(String message)
            {
                if(message.equals("request start."))
                {
                    showNotification(activity.getString(R.string.notification_title), "Retrieve CSV...");
                }
                else if(message.equals("request success.")) {
                    hideNotification();
                }
                else if(message.equals("request failure.")) {
                    hideNotification();
                    showNotification(activity.getString(R.string.notification_title), "Error: retrieve csv.");
                }
                else {
                    notify.notifyStatus(message);
                }
            }
        }, retriever));
    }

    private final int STATUS_NOTIFICAITON_ID = R.layout.activity_scratch;

    private void hideNotification() {
        showNotification(null, null);
    }
    private void showNotification(String title, String message) {
        if(title == null) {
            notificationManager.cancel(STATUS_NOTIFICAITON_ID);
            return;
        }
        PendingIntent contentIntent = PendingIntent.getActivity(activity, 0, new Intent(activity, ScriptListActivity.class), PendingIntent.FLAG_CANCEL_CURRENT);

        notificationManager.notify(STATUS_NOTIFICAITON_ID, new NotificationCompat.Builder(activity)
                .setContentTitle(title)
                .setContentText(message)
                .setTicker(message)
                .setContentIntent(contentIntent)
                .setSmallIcon(R.drawable.ic_stat)
                .build());
    }

    public void evalWithListener(String code, FinishListener listener) {
        finishListener = listener;
        eval(code);
    }

    public void eval(String code) {
        try {
            QObject result = interpreter.eval(code);
            finishListener.onFinish(result);
        } catch (BlockException be) {
            // block call. wait callback.
        } catch (QException qe) {
            interpreter.println(qe.getMessage());
        } catch (RuntimeException re) {
            interpreter.println("error: " + re.toString());
        }
    }


    void onScriptResume() {
        try{
            QObject result = interpreter.resumeEval();
            finishListener.onFinish(result);
        }
        catch(BlockException be)
        {
            // block call. wait callback.
        }
        catch(RuntimeException e)
        {
            interpreter.println("error: " + e.toString());
        }
    }

    void onScriptResumeFail(String message) {
        interpreter.println("Block call failure:" + message);
    }

}
