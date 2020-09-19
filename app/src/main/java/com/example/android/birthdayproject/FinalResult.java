package com.example.android.birthdayproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FinalResult extends AppCompatActivity {
    public TextView correctTotal;
    public Button getGift;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_result);
        int correctnum=0;
        for(int x=0; x<=5; x++){
            if(MainActivity.answers[x]==MainActivity.targets[x]){
                correctnum+=1;
            }
        }
        correctTotal=(TextView)this.findViewById(R.id.correctTotal);
        getGift=(Button)this.findViewById(R.id.button1);
        if(correctnum>=5){
            correctTotal.setText("恭喜你答對了"+correctnum+"題!現在就趕緊去拿禮物吧!");
        }else{
            correctTotal.setText("你答對了"+correctnum+"題，要接受可怕的懲罰QQ");
        }
    }
    public void GetGift(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://line.me/R/nv/more"));
        startActivity(intent);
    }
}
