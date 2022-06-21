package com.example.sesi2trainingmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClickMe = findViewById(R.id.btn_clickHere);

        btnClickMe.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        });
    }
}