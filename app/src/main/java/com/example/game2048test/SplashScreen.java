package com.example.game2048test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    Animation topAnim;
    Animation bottomAnim;
    ImageView image;
    TextView msg;
    TextView author;

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);


        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.logo_intro);
        msg = findViewById(R.id.welcome_msg);
        author = findViewById(R.id.author_text);

        image.setAnimation(topAnim);
        msg.setAnimation(bottomAnim);
        author.setAnimation(bottomAnim);

        int SPLASH_SCREEN_TIME = 5000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,Menu.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIME);


    }

}
