package com.example.sharedp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.os.Handler;

public class HomeActivity extends AppCompatActivity {
    TextView tvEmail,tvPassword,tvIsLogin,tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent i = getIntent();
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvPassword  = (TextView)findViewById(R.id.tvPassword);
//        tvIsLogin  = (TextView)findViewById(R.id.tvIsLogin);
//        tvNumber = (TextView)findViewById(R.id.tvNumber);

        SharedPreferences preferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        String email = preferences.getString("email", "");
        String password = preferences.getString("password", "");
//        boolean isLogin = preferences.getBoolean("islogin", false);
//        int number = preferences.getInt("number", 0);


        tvEmail.setText(email);
        tvPassword.setText(password);
//        tvIsLogin.setText(""+isLogin);
//        tvNumber.setText(""+number);


    }



}