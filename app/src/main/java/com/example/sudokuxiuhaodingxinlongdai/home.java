package com.example.sudokuxiuhaodingxinlongdai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button start = findViewById(R.id.Start);
        start.setOnClickListener(unused -> startActivity(new Intent(this, GameActivity.class)));
    }

}
