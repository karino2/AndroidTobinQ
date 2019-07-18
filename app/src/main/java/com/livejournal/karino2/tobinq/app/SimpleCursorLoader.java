package com.livejournal.karino2.tobinq.app;

import android.content.Context;
import android.database.Cursor;

import androidx.loader.content.CursorLoader;

/**
 * Created by karino on 4/12/14.
 */
public abstract class SimpleCursorLoader extends CursorLoader {
    private final ForceLoadContentObserver observer = new ForceLoadContentObserver();

    public SimpleCursorLoader(Context context) {
        super(context);
    }

    public abstract Cursor doCursorLoad();

    @Override
    public Cursor loadInBackground() {
        Cursor cursor = doCursorLoad();

        if (cursor != null) {
            cursor.getCount();
            cursor.registerContentObserver(observer);
        }

        return cursor;
    }
}
