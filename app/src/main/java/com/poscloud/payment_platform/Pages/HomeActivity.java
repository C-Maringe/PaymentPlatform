package com.poscloud.payment_platform.Pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.poscloud.payment_platform.Auth.LoginActivity;
import com.poscloud.payment_platform.R;

public class HomeActivity extends AppCompatActivity {

    Button logout_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logout_user = findViewById(R.id.logout_user);

        logout_user.setOnClickListener(view-> {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}