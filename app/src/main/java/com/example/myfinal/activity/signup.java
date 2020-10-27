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

    private String username;
    private String password;
    private EditText editText_name;
    private EditText editText_pass;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
    }

    public void init(){

        editText_name = findViewById(R.id.si_username);
        editText_pass = findViewById(R.id.si_password);
        username = editText_name.getText().toString();
        password = editText_pass.getText().toString();


        User user = new User(username,password);
        Button btn_signup = findViewById(R.id.btn_signup_cf);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_signup_cf:
                       UserDao userDao = new UserDao(context);
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