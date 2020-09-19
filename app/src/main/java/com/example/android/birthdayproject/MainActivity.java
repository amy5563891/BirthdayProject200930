package com.example.android.birthdayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int[] answers= {0,0,0,0,0,0};
    public static int[] targets= {1,3,4,2,3,1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Start(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , Question1.class);
        startActivity(intent);
    }
}
