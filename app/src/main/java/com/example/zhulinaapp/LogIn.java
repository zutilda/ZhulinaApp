package com.example.zhulinaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class LogIn extends AppCompatActivity {
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        checkBox = findViewById(R.id.chkBox);
    }

    public void onRegister(View view) {
        Intent regIntent = new Intent(this,AuthActivity.class);
        startActivity(regIntent);
    }
}