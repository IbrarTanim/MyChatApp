package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.ProfileSecondInfoDailog;

public class ProfileSecondActivity extends AppCompatActivity implements View.OnClickListener {

    ProfileSecondActivity activity;
    ImageView ivPictureProfileSecond, ivchatProfileSecond, ivInfoProfileSecond, ivLikeProfileSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_second);
        activity = this;

        ivPictureProfileSecond = findViewById(R.id.ivPictureProfileSecond);
        ivchatProfileSecond = findViewById(R.id.ivchatProfileSecond);
        ivInfoProfileSecond = findViewById(R.id.ivInfoProfileSecond);
        ivLikeProfileSecond = findViewById(R.id.ivLikeProfileSecond);

        ivPictureProfileSecond.setOnClickListener(this);
        ivchatProfileSecond.setOnClickListener(this);
        ivInfoProfileSecond.setOnClickListener(this);
        ivLikeProfileSecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivPictureProfileSecond:
                startActivity(new Intent(activity, UserPhotoBlogActivity.class));
                finish();
                break;
            case R.id.ivchatProfileSecond:
                startActivity(new Intent(activity, PrivateChatActivity.class));
                finish();
                break;
            case R.id.ivLikeProfileSecond:
                startActivity(new Intent(activity, LandingActivity.class));
                finish();
                break;

            case R.id.ivInfoProfileSecond:
                ProfileSecondInfoDailog profileSecondInfoDailog = new ProfileSecondInfoDailog(activity);
                profileSecondInfoDailog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                profileSecondInfoDailog.show();
                profileSecondInfoDailog.setCancelable(true);
                profileSecondInfoDailog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
                profileSecondInfoDailog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                break;


        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ProfileFirstActivity.class));
        finish();
    }
}
