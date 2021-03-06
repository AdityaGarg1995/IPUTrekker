package com.example.ipu_trekker.ggsipu;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView iv = (ImageView) findViewById(R.id.splash);

        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate),
                        an2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);

        iv.startAnimation(an);

        an.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) { }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an2);
                finish();
                try {
                    startActivity(new Intent(Splash.this, HomeActivity.class));
                }catch (Exception e){e.printStackTrace();}
            }

            @Override
            public void onAnimationRepeat(Animation animation) { }

        });
    }
}