package com.poscloud.payment_platform.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.poscloud.payment_platform.MainActivity;
import com.poscloud.payment_platform.Pages.HomeActivity;
import com.poscloud.payment_platform.R;

public class LoginActivity extends AppCompatActivity {

    TextView register_user;
    TextView forgot_password;

    Button login_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register_user = findViewById(R.id.register_user);
        forgot_password = findViewById(R.id.forgot_password);
        login_user = findViewById(R.id.login_user);

        register_user.setOnClickListener(view->{
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        forgot_password.setOnClickListener(view->{
            Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        });

        login_user.setOnClickListener(view-> {
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}