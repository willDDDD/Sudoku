package com.example.sudokuxiuhaodingxinlongdai;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
/**
 * choose difficulty and get information through web api.
 */
public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button easy =  findViewById(R.id.easy);
        Button medium = findViewById(R.id.medium);
        Button hard = findViewById(R.id.hard);
        easy.setOnClickListener(unused -> setGame(1));
        medium.setOnClickListener(unused -> setGame(2));
        hard.setOnClickListener(unused -> setGame(3));
    }
    public void setGame(int diff) {
        int[][] arr = new int[9][9];
        String response = webApi.mainA(diff);
        if (response == null) {
            response = exception.getE(diff);
        }
        char[] a = response.toCharArray();
        for (int i = 39; i < a.length - 10; i += 24) {
            int x = Integer.parseInt(String.valueOf(a[i + 5]));
            int y = Integer.parseInt(String.valueOf(a[i + 11]));
            int val = Integer.parseInt(String.valueOf(a[i + 21]));
            arr[x][y] = val;
        }
        Intent next = new Intent(GameActivity.this, MainActivity.class);
        next.putExtra("array", arr);
        startActivity(next);
    }
}