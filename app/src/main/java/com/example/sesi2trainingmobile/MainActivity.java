package com.example.sesi2trainingmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button logout;
    TextView username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.btn_logout);
        username = findViewById(R.id. tv_username);
        email = findViewById(R.id. tv_email);

        Intent intent = getIntent();
        String tempUsername = intent.getStringExtra("account_username");
        String tempEmail = intent.getStringExtra("account_email");

        username.setText(tempUsername);
        username.setText(tempEmail);

        logout.setOnClickListener(v -> {
            Intent logoutIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(logoutIntent);
        });
    }
}