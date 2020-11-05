package com.example.myfinal.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.myfinal.sqllite.DBHelper;
import com.example.myfinal.vo.Book;
import com.example.myfinal.vo.Connect;
import com.example.myfinal.vo.User;

import java.util.ArrayList;
import java.util.HashMap;

public class ConnectDao {

    private DBHelper helper;

    public ConnectDao(Context context) {
        this.helper = new DBHelper(context);
    }
8
    //用于查看当前用户的购物车的功能
    public Connect search() {
        SQLiteDatabase db = helper.getWritableDatabase();
        ArrayList<Connect> connectArrayList = new ArrayList<>();
        String sql = "select * id "
        return connectArrayList;
    }

}
