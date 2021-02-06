package com.example.musicwiki;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ImageView mImageView;
    private ProgressBar mProgressbar;
    private TextView mTryAgainTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initializeViews();
        setupSplashPageAnimation();

        /*Intent intent=new Intent(SplashActivity.this, MainActivity.class);
        //intent.putExtra("key ", "");
        startActivity(intent);*/
    }


    private void initializeViews() {
        mImageView = findViewById(R.id.splash_page_icon_view);
        mProgressbar = findViewById(R.id.loading_view);
        mTryAgainTextView = findViewById(R.id.splash_try_again);

        mProgressbar.setVisibility(View.INVISIBLE);
        mTryAgainTextView.setVisibility(View.VISIBLE);
    }

    /**
     * Animation setup for splash page branding image
     */
    private void setupSplashPageAnimation() {
        Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_slide_up);
        mImageView.startAnimation(slideUpAnimation);
        slideUpAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                mProgressbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mProgressbar.setVisibility(View.INVISIBLE);


                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
