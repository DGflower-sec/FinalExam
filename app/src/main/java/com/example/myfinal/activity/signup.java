package com.example.myfinal.activity;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfinal.R;
import com.example.myfinal.dao.UserDao;
import com.example.myfinal.sqllite.DBHelper;
import com.example.myfinal.vo.User;


public class signup extends AppCompatActivity implements View.OnClickListener{

    private EditText editText_name;
    private EditText editText_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
    }

    public void init(){

        editText_name = findViewById(R.id.si_username);
        editText_pass = findViewById(R.id.si_password);
        User user = new User();
        user.setUsername(editText_name.getText().toString().trim());
        user.setPassword(editText_pass.getText().toString().trim());
        Button btn_signup = findViewById(R.id.btn_signup_cf);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_signup_cf:
                       UserDao userDao = new UserDao(signup.this);
                       userDao.register(user);
                        break;

                }


            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}