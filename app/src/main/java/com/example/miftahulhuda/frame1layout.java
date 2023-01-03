package com.example.miftahulhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class frame1layout extends AppCompatActivity {
    ImageView gambarLoading;
    Animation rotasiAnimasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1layout);
        gambarLoading = findViewById(R.id.loading);
        rotasi();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(frame1layout.this, frame2layout.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
private void rotasi(){
    rotasiAnimasi =AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
    gambarLoading.startAnimation(rotasiAnimasi);
}
}