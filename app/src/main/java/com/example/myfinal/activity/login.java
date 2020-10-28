package com.example.myfinal.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfinal.MainActivity;
import com.example.myfinal.R;
import com.example.myfinal.dao.UserDao;
import com.example.myfinal.vo.User;


public class login extends AppCompatActivity {

    private EditText et_lgusername;
    private EditText et_lgpassword;
    private String username;
    private String password;
    public  String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {

        Button btn_login = findViewById(R.id.btn_login);
        Button btn_signup = findViewById(R.id.btn_signup);
        User user = new User();
        et_lgusername = findViewById(R.id.lg_username);
        et_lgpassword = findViewById(R.id.lg_password);

        //登录按钮
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = et_lgusername.getText().toString().trim();
                password = et_lgpassword.getText().toString().trim();
                user.setUsername(username);
                user.setPassword(password);
                UserDao userDao = new UserDao(login.this);
                if (userDao.login(user)) {
                    Toast.makeText(login.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username",username);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
        //注册按钮
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);

            }
        });
    }
}