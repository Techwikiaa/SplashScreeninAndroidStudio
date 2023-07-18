package com.techwikiaa.splashscreeninandroidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iNext = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(iNext);

                finish(); // deleted this activity from stack and can't be regain using back press;
            }
        },2000);
    }
}
