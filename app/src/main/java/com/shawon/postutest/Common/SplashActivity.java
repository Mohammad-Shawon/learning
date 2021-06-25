package com.shawon.postutest.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.shawon.postutest.R;

public class SplashActivity extends AppCompatActivity {

    //Verriable
    LinearLayout splashLayout;

    //Animation
    Animation splashAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Hooks
        splashLayout = findViewById(R.id.splashLayout);


        //Set Animation
        splashAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_animation);
        splashLayout.setAnimation(splashAnimation);


    }
}