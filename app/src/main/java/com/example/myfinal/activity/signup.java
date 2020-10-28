package com.example.myfinal.activity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfinal.R;
import com.example.myfinal.dao.UserDao;
import com.example.myfinal.sqllite.DBHelper;
import com.example.myfinal.vo.User;


public class signup extends AppCompatActivity implements View.OnClickListener {

    private EditText editText_name;
    private EditText editText_pass;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
    }

    public void init() {

        editText_name = findViewById(R.id.si_username);
        editText_pass = findViewById(R.id.si_password);
        User user = new User();

        Button btn_signup = findViewById(R.id.btn_signup_cf);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_signup_cf:
                        username = editText_name.getText().toString();
                        password = editText_pass.getText().toString();
                        user.setUsername(username);
                        user.setPassword(password);
                        UserDao userDao = new UserDao(signup.this);
                        userDao.register(user);
                        if (userDao.register(user)){
                            Toast.makeText(signup.this,"注册成功",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(signup.this, login.class);
                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(signup.this,"失败，重新注册",Toast.LENGTH_SHORT).show();
                        }
                        break;

                }


            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}