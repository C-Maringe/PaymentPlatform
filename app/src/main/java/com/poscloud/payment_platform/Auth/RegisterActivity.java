package com.poscloud.payment_platform.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.poscloud.payment_platform.R;

public class RegisterActivity extends AppCompatActivity {

    Button register_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_user = findViewById(R.id.register_user);
        register_user.setOnClickListener(view-> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}