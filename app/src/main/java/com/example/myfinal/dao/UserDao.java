package com.example.myfinal.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.myfinal.sqllite.DBHelper;
import com.example.myfinal.vo.User;

public class UserDao {
    private DBHelper helper;

    public UserDao(Context context) {
        this.helper = new DBHelper(context);
    }

    public boolean register(User user){
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",user.getUsername());
        contentValues.put("password",user.getPassword());
        return db.insert("user",null,contentValues)>0;
    }

    public boolean login(User user){
        SQLiteDatabase db = helper.getReadableDatabase();
        String sql = "select * from user where username=? and password=?";
        Cursor cursor = db.rawQuery(sql, new String[]{user.getUsername(),user.getPassword()});
        if (cursor.moveToFirst()==true){
            cursor.close();
            return true;
        }

        return false;


    }
}
