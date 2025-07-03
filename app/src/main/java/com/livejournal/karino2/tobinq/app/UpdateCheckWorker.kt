package com.livejournal.karino2.tobinq.app

import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.util.concurrent.TimeUnit

class UpdateCheckWorker(appContext: Context, workerParams: WorkerParameters):
    Worker(appContext, workerParams) {
    companion object {
        fun checkUpdateIfNecessary(context: Context) {
            val checker = UpdateChecker(context, context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager, { })
            checker.startSyncIfNecessary()
        }

        fun registerWorker(context: Context) {
            checkUpdateIfNecessary(context)

            val constraints = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            // 8時間ごとに起きるが、本当にチェックするかは前回チェックの結果次第
            val workRequest = PeriodicWorkRequestBuilder<UpdateCheckWorker>(8, TimeUnit.HOURS)
                .setConstraints(constraints)
                .build()

            WorkManager.getInstance(context).enqueue(workRequest)
        }
    }

    override fun doWork(): Result {
        checkUpdateIfNecessary(applicationContext)
        return Result.success()
    }
}