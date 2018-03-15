package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, ListActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.villagercreation);
        mediaPlayer.start();
    }




}


