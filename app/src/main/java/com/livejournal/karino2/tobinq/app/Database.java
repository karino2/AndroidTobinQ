package com.livejournal.karino2.tobinq.app;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {



    private class OpenHelper extends SQLiteOpenHelper {
		
		OpenHelper(Context context) {
			super(context, "tobinq.db", null, 1);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			createTables(db);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
			recreate(db);
		}
		
	}

	private void createTables(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE remote_content_table (_id integer primary key autoincrement"
                +",url text not null"
                +",content text not null"
                +",retrieveAt bigint not null"
                +");");
	}

	private void dropTables(SQLiteDatabase db) {
		db.execSQL("DROP TABLE IF EXISTS remote_content_table;");
	}
	
	private void recreate(SQLiteDatabase db) {
		dropTables(db);
		createTables(db);
	}

	private Database(){}
	
		
	public static void finalizeInstance() {
		if(s_instance != null) {
			s_instance.close();
			s_instance = null;
		}
	}
	
	public static synchronized Database getInstance(Context ctx) {
		if(s_instance == null) {
			s_instance = new Database();
			s_instance.open(ctx);
		}
		return s_instance;
	}
	
	private static Database s_instance;

	OpenHelper helper;
	SQLiteDatabase database;
	public void open(Context context) {
		helper = new OpenHelper(context);
		database = helper.getWritableDatabase();
	}
	
	public void close() {
		helper.close();
	}
	
	public void recreate() {
		recreate(database);
	}

    // return null if not exist.
    public String retrieveContent(String url) {
        Cursor cursor = retrieveContentCursor(url);
        try {
            if(cursor.getCount() == 0)
                return null;
            cursor.moveToFirst();
            return cursor.getString(2);
        }finally {
            cursor.close();
        }
    }

    private Cursor retrieveContentCursor(String url) {
        return database.query("remote_content_table", new String[]{"_id", "url", "content"}, "url=?", new String[]{url}, null, null, null);
    }

    public void insertContent(String url, String content)  {
        removeOldContent(url);

		ContentValues values = new ContentValues();
        values.put("url", url);
        values.put("content", content);
        values.put("retrieveAt", (new Date()).getTime());
		database.insert("remote_content_table", null, values);
	}

    private void removeOldContent(String url) {
        ArrayList<Integer> deleteCands = new ArrayList<Integer>();
        Cursor cursor = retrieveContentCursor(url);
        try {
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                do {
                    deleteCands.add(cursor.getInt(0));
                }while(cursor.moveToNext());
            }
        }finally {
            cursor.close();
        }
        if(deleteCands.size() != 0) {
            for(int id : deleteCands) {
                database.delete("remote_content_table", "_id = ?", new String[]{ String.valueOf(id) });
            }
        }
    }


}
