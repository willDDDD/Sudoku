package com.example.sudokuxiuhaodingxinlongdai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import static android.R.layout.activity_list_item;

public class MainActivity extends AppCompatActivity {
    int[][] k = new int[9][9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        k = (int[][]) getIntent().getExtras().get("array");
        GridView gw = findViewById(R.id.map);
        int[] arraOne = oneandtwo.one(k);
        Integer[] arraOneInteger = InttoInteger.cii(arraOne);
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arraOneInteger);
        gw.setAdapter(adapter);
        Button chk = findViewById(R.id.check);
        chk.setOnClickListener(unused -> {
            int[][] checking = check.change(k);
            if (check.ck(checking) == false) {
                startActivity(new Intent(this, ending.class));
            }
        });
    }

}
