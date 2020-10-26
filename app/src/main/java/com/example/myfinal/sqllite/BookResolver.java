package com.example.myfinal.sqllite;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

import com.example.myfinal.vo.Book;

import java.util.List;

public class BookResolver {

    private final static String INFO_URI = "com.example.myfinal.sqllite";

    private Uri uri;
    private ContentResolver resolver;
    private BookDBHelper helper;

    public BookResolver(Context context) {
        this.uri = Uri.parse(INFO_URI);
        this.resolver = context.getContentResolver();
    }
//    public int insert(){}
//    public List<Book> queryAll(){}
//    public boolean update(){}
//    public boolean search(){}



}
