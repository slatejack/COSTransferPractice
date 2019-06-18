package com.tencent.qcloud.costransferpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Start extends AppCompatActivity {
    private  final int SPLASH_DISPLAY_LENGHT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Start.this,logintable.class);
                Start.this.startActivity(mainIntent);
                Start.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);

    }

}
