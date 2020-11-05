package com.example.myfinal.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.myfinal.dao.UserDao;

public class DBHelper extends SQLiteOpenHelper {

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    public DBHelper(@Nullable Context context) {

        super(context, "finnalexam.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user(id INTEGER PRIMARY KEY AUTOINCREMENT, username VARCHAR(20)," +
                "password VARCHAR(20))");
        db.execSQL("CREATE TABLE coonnnect(id INTEGER PRIMARY KEY AUTOINCREMENT,u_id int,b_id int)");
        db.execSQL("CREATE TABLE book(id INTEGER PRIMARY KEY AUTOINCREMENT, bookname VARCHAR(20), " +
                " content VARCHAR , price int)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public synchronized void close() {
        super.close();
    }
}
