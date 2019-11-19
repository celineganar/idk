package com.example.sweproject;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;






public class myDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentDB.db";
    public static final String TABLE_NAME = "Student";
    public static final String COLUMN_STUDENTID = "Student ID";
    public static final String COLUMN_NAME = "StudentName";
    public static final String COLUMN_NUMBER = "Number";
    public static final String COLUMN_EMAIL = "Email";
    public static final String COLUMN_ECONTACT = "Emergency Contact";


    public myDBHandler(Context context, String NAME, SQLiteDatabase.CursorFactory factory, int VERSION) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = " CREATE TABLE " + TABLE_NAME + "(" + COLUMN_STUDENTID + "INTEGER PRIMARY KEY, " + COLUMN_NAME + "TEXT, "
                + COLUMN_NUMBER + "TEXT, " + COLUMN_EMAIL + "TEXT, "
                + COLUMN_ECONTACT + "TEXT )";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    public String loadHandler() {
        String result = " ";
        String query = "Select * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            String result_2 = cursor.getString(2);
            String result_3 = cursor.getString(3);
            String result_4 = cursor.getString(4);
            String result_5 = cursor.getString(5);
            result += String.valueOf(result_0) + " " + result_1 + result_2 + result_3 + result_4 + result_5 +
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }

    public void addHandler(Student student) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_STUDENTID, student.getStudentID());
        values.put(COLUMN_NAME, student.getStudentName());
        values.put(COLUMN_NUMBER, student.getNumber());
        values.put(COLUMN_EMAIL, student.getEmail());
        values.put(COLUMN_ECONTACT, student.getEContact());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

}




