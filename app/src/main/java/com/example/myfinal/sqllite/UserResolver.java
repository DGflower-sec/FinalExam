package com.example.myfinal.sqllite;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

import com.example.myfinal.dao.UserDao;

import java.util.List;

public class UserResolver {
    private final static String INFO_URI = "com.example.myfinal.sqllite";

    private Uri uri;
    private ContentResolver resolver;
    private UserDBHelper helper;

    public UserResolver(Context context) {
        this.uri = Uri.parse(INFO_URI);
        this.resolver = context.getContentResolver();
    }

    public int insert() {
    }

    public List<UserDao> queryAll() {
    }

    public boolean update() {
    }

    public boolean search() {
    }
}
