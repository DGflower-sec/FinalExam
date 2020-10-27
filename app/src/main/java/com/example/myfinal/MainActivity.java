package com.example.myfinal;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myfinal.fragment.FR_Book;
import com.example.myfinal.fragment.FR_Home;
import com.example.myfinal.fragment.FR_My;
import com.example.myfinal.fragment.FR_Tuijian;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fr_home;
    private Fragment fr_my;
    private Fragment fr_tuijian;
    private Fragment fr_book;
    private Fragment[] fragments;
    private int lastfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        fr_home = new FR_Home();
        fr_my = new FR_My();
        fr_book = new FR_Book();
        fr_tuijian = new FR_Tuijian();
        fragments = new Fragment[]{fr_home, fr_my, fr_book,fr_tuijian};
        lastfragment = 0;
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_fragment, fr_home).show(fr_home).commit();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(changeFrament);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener changeFrament = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {

                case R.id.home: {
                    if (lastfragment != 0) {
                        switchFrament(lastfragment, 0);
                        lastfragment = 0;
                    }
                    return true;
                }
                case R.id.my: {
                    if (lastfragment != 1) {
                        switchFrament(lastfragment, 1);
                        lastfragment = 1;
                    }
                    return true;
                }
                case R.id.book: {
                    if (lastfragment != 2) {
                        switchFrament(lastfragment, 2);
                        lastfragment = 2;
                    }
                    return true;
                }
                case R.id.tuijian: {
                    if (lastfragment != 3) {
                        switchFrament(lastfragment, 3);
                        lastfragment = 3;
                    }
                    return true;
                }
            }

            return false;
        }
    };


    private void switchFrament(int lastfragment, int i) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(fragments[lastfragment]);//隐藏上一个frament
        if (fragments[i].isAdded() == false) {
            transaction.add(R.id.frame_fragment, fragments[i]);
        }
        transaction.show(fragments[i]).commitAllowingStateLoss();

    }
}

