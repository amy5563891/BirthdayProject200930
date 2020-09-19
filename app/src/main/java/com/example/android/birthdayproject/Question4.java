package com.example.android.birthdayproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Question4 extends AppCompatActivity {
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        button1=(Button)this.findViewById(R.id.button1);
        button2=(Button)this.findViewById(R.id.button2);
        button3=(Button)this.findViewById(R.id.button3);
        button4=(Button)this.findViewById(R.id.button4);
        if(MainActivity.answers[3]!=0){
            switch(MainActivity.answers[3]){
                case 1:
                    B1click(button1);
                    break;
                case 2:
                    B2click(button2);
                    break;
                case 3:
                    B3click(button3);
                    break;
                case 4:
                    B4click(button4);
                    break;
            }
        }
    }
    public void LastPage(View v){
        Intent intent = new Intent();
        intent.setClass(Question4.this , Question3.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void NextPage(View v){
        Intent intent = new Intent();
        intent.setClass(Question4.this , Question5.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void B1click(View v){
        MainActivity.answers[3]=1;
        button1.setBackgroundColor(Color.parseColor("#6096BA"));
        button2.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button3.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button4.setBackgroundColor(Color.parseColor("#B0B5B3"));
    }
    public void B2click(View v){
        MainActivity.answers[3]=2;
        button1.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button2.setBackgroundColor(Color.parseColor("#6096BA"));
        button3.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button4.setBackgroundColor(Color.parseColor("#B0B5B3"));
    }
    public void B3click(View v){
        MainActivity.answers[3]=3;
        button1.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button2.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button3.setBackgroundColor(Color.parseColor("#6096BA"));
        button4.setBackgroundColor(Color.parseColor("#B0B5B3"));
    }
    public void B4click(View v){
        MainActivity.answers[3]=4;
        button1.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button2.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button3.setBackgroundColor(Color.parseColor("#B0B5B3"));
        button4.setBackgroundColor(Color.parseColor("#6096BA"));
    }
}
