package com.example.android.applicationbanque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void openLoginPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}