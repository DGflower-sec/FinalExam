package com.example.myfinal.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfinal.R;
import com.example.myfinal.adapter.BookAdapter;
import com.example.myfinal.dao.BookDao;
import com.example.myfinal.vo.Book;

import java.util.ArrayList;

public class FR_Book extends Fragment {
    private View view;
    private RecyclerView brecyclerView;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private BookAdapter bookAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.fragment_book,container,false);
        initData();
        initRecycle();
        return view;

    }

    private void initData() {
        for(int i=0;i<10;i++){
            Book book = new Book();
            book.setName("模拟书本"+i);
            book.setContainer("模拟内容"+i);
            bookList.add(book);
        }
//        BookDao bookDao = new BookDao(this);
//        bookDao.queryAll();

    }

    private void initRecycle() {
        brecyclerView = (RecyclerView) view.findViewById(R.id.book_re);
        bookAdapter = new BookAdapter(getActivity(), bookList);
        brecyclerView.setAdapter(bookAdapter);
        brecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        brecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        bookAdapter.setOnItemClickListener(new BookAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, Book data) {
                Toast.makeText(getActivity(), "1", Toast.LENGTH_LONG).show();
            }
        });


    }
}