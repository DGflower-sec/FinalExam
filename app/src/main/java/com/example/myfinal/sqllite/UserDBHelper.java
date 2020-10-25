package com.example.myfinal.sqllite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserDBHelper extends SQLiteOpenHelper {
    public UserDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user(_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(20), password  VARCHAR(20),collect INTEGER ,pciture VARCHAR )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists user");
            onCreate(db);


    }
}
