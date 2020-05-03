package com.example.sudokuxiuhaodingxinlongdai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.layout.activity_list_item;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * set grid and logic.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[][] k = (int[][]) getIntent().getExtras().get("array");
        GridView gw = findViewById(R.id.map);
        int[] arraOne = oneandtwo.one(k);
        int[] checks = new int[arraOne.length];
        for (int i = 0; i < arraOne.length; i++) {
            checks[i] = arraOne[i];
        }
        for (int i = 0; i < arraOne.length; i++) {
            arraOne[i] = arraOne[i] * -1;
        }
        Integer[] arraOneInteger = InttoInteger.cii(arraOne);
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arraOneInteger);
        gw.setAdapter(adapter);
        Button chk = findViewById(R.id.check);
        gw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (checks[position] != 0) {
                    return;
                }
                arraOne[position] += 1;
                arraOne[position] %= 10;
                if (arraOne[position] == 0) {
                    arraOne[position] += 1;
                }
                Integer[] arraOneInteger2 = InttoInteger.cii(arraOne);
                ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1, arraOneInteger2);
                gw.setAdapter(adapter2);
            }
        });
        chk.setOnClickListener(unused -> {
            int[][] c = oneandtwo.two(arraOne);
            int[][] checking = check.change(c);
            if (check.ck(checking) == true) {
                startActivity(new Intent(this, ending.class));
            }
        });
    }

}
