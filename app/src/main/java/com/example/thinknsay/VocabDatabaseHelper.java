package com.example.thinknsay;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class VocabDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "game.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "game_table";
    public static final String COL_ID = "id";
    public static final String COL_WORD = "word";
    public static final String COL_CATEGORY = "category";

    private static final String SQL_CREATE_TABLE
            = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_WORD + " TEXT,"
            + COL_CATEGORY + " TEXT"
            + ")";

    private String DROP_TABLE_NAME = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public VocabDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(DROP_TABLE_NAME);
        onCreate(db);
    }

    public void insertData(Vocab vocabgame) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_ID, vocabgame.getId());
        cv.put(COL_WORD, vocabgame.getNameWord());
        cv.put(COL_CATEGORY, vocabgame.getCategory());

        db.insert(TABLE_NAME,null,cv);
        db.close();
    }

    public ArrayList<Vocab> getAllData() {

        ArrayList<Vocab> arrList = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Vocab game = new Vocab(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2));

                arrList.add(game);
            } while (cursor.moveToNext());
        }
        return arrList;
    }
}