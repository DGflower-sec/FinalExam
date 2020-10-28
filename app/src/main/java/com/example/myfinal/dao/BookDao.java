package com.example.myfinal.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myfinal.fragment.FR_Book;
import com.example.myfinal.sqllite.DBHelper;
import com.example.myfinal.vo.Book;

import java.util.ArrayList;

public class BookDao {
    private DBHelper helper;


    public BookDao(Context context) {
        this.helper = new DBHelper(context);
    }

    public ArrayList<Book> queryAll() {

        ArrayList<Book> bookArrayList = new ArrayList<>();
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.query("book", null, null, null, null, null, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                Book book = new Book();
                book.setId(cursor.getInt(cursor.getColumnIndex("id")));
                book.setName(cursor.getString(cursor.getColumnIndex("bookname")));
                book.setContainer(cursor.getString(cursor.getColumnIndex("content")));

                bookArrayList.add(book);
                cursor.close();
                db.close();
            }
        }
        return bookArrayList;
    }
}
