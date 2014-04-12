package com.livejournal.karino2.tobinq.app;


import java.util.ArrayList;
import java.util.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {


    public Cursor queryScripts() {
        return database.query("script_table",  new String[] {"_id", "docId", "title", "description", "script", "date"}, null, null, null, null, "date DESC, _id DESC");
    }

    public void recreateRemoteContentTable() {
        dropRemoteContentTable(database);
        createRemoteContentTable(database);
    }

    public void recreateScriptTable() {
        dropScriptTable(database);
        createScriptTable(database);
    }

    private class OpenHelper extends SQLiteOpenHelper {
		
		OpenHelper(Context context) {
			super(context, "tobinq.db", null, 2);
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
        createRemoteContentTable(db);
        createScriptTable(db);
    }

    private void createScriptTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE script_table (_id integer primary key autoincrement"
                +",docId text"
                +",title text"
                +",description text"
                +",script text"
                +",date bigint not null "
                +");");
    }

    private void createRemoteContentTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE remote_content_table (_id integer primary key autoincrement"
                +",url text not null"
                +",content text not null"
                +",retrieveAt bigint not null"
                +");");
    }

    private void dropTables(SQLiteDatabase db) {
        dropRemoteContentTable(db);
        dropScriptTable(db);
    }

    private void dropScriptTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS script_table;");
    }

    private void dropRemoteContentTable(SQLiteDatabase db) {
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


    public ScriptEntity find(long id) {
        if(id == -1)
            return null;
        Cursor cursor = database.query("script_table", new String[]{"_id", "docId", "title", "description", "script", "date"},
                "_id = ?", new String[]{String.valueOf(id)}, null, null, null);
        try {
            if(cursor.getCount() == 0)
                return null;
            cursor.moveToFirst();
            ScriptEntity ent = toScript(cursor);
            return ent;
        }finally {
            cursor.close();
        }
    }

    private ScriptEntity toScript(Cursor cursor) {
        ScriptEntity ent = new ScriptEntity();
        ent.id = cursor.getInt(0);
        ent.setDocId(cursor.getString(1));
        ent.title = cursor.getString(2);
        ent.setDescription(cursor.getString(3));
        ent.setScript(cursor.getString(4));
        ent.setDate(cursor.getLong(5));
        return ent;
    }

    public void saveScript(ScriptEntity ent) {
        ScriptEntity found = find(ent.id);
        if(found == null)
            insertScript(ent);
        else
            updateScript(ent);
    }

    private void insertScript(ScriptEntity ent) {
        ContentValues values = toContentValue(ent);
        ent.id = database.insert("script_table", null, values);
    }

    private ContentValues toContentValue(ScriptEntity ent) {
        ContentValues values = new ContentValues();
        values.put("title", ent.title);
        values.put("docId", ent.getDocId());
        values.put("description", ent.getDescription());
        values.put("script", ent.getScript());
        values.put("date", ent.getDate());
        return values;
    }

    private void updateScript(ScriptEntity ent) {
        ContentValues values = toContentValue(ent);
        database.update("script_table", values, "_id=?", new String[]{String.valueOf(ent.id)});

    }


}
