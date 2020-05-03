package com.example.sudokuxiuhaodingxinlongdai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * ending page.
 */
public class ending extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ending);
        Button ta = findViewById(R.id.tryagain);
        ta.setOnClickListener(unused -> startActivity(new Intent(this, home.class)));
    }
}