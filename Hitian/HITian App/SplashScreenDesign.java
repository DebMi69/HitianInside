

package com.example.hitianinside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenDesign extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2500;

    ImageView img,img2;
    TextView txt;
    Animation splash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        img= findViewById(R.id.img);
        img2= findViewById(R.id.img2);
        txt= findViewById(R.id.txt);

        splash= AnimationUtils.loadAnimation(this,R.anim.splash);

        img.setAnimation(splash);
        img2.setAnimation(splash);
        txt.setAnimation(splash);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
