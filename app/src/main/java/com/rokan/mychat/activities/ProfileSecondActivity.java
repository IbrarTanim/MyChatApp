package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.rokan.mychat.R;

public class ProfileSecondActivity extends AppCompatActivity implements View.OnClickListener {

    ProfileSecondActivity activity;
    ImageView ivPictureProfileSecond, ivchatProfileSecond, ivInfoProfileSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_second);
        activity = this;

        ivPictureProfileSecond = findViewById(R.id.ivPictureProfileSecond);
        ivchatProfileSecond = findViewById(R.id.ivchatProfileSecond);
        ivInfoProfileSecond = findViewById(R.id.ivInfoProfileSecond);
        ivPictureProfileSecond.setOnClickListener(this);
        ivchatProfileSecond.setOnClickListener(this);
        ivInfoProfileSecond.setOnClickListener(this);
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

            case R.id.ivInfoProfileSecond:
                startActivity(new Intent(activity, InfoActivity.class));
                finish();
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
