package com.example.myfinal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void init(){

        Button btn_login = findViewById(R.id.btn_login);
        Button btn_signup = findViewById(R.id.btn_signup);

        //登录按钮
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.myfinal.login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        //注册按钮
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.myfinal.login.this,signup.class);
                startActivity(intent);
            }
        });
    }
}