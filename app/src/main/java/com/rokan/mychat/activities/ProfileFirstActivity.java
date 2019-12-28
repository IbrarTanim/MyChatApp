package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.rokan.mychat.R;

public class ProfileFirstActivity extends AppCompatActivity implements View.OnClickListener {
    ProfileFirstActivity activity;
    ImageButton ibPictureProfile, ibMessageProfile, ibChatRoomProfile, ibActivitiesProfile, ibProfileProfile;
    TextView tvEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_first);
        activity = this;

        ibPictureProfile = findViewById(R.id.ibPictureProfile);
        ibMessageProfile = findViewById(R.id.ibMessageProfile);
        ibChatRoomProfile = findViewById(R.id.ibChatRoomProfile);
        ibActivitiesProfile = findViewById(R.id.ibActivitiesProfile);
        ibProfileProfile = findViewById(R.id.ibProfileProfile);
        tvEdit = findViewById(R.id.tvEdit);

        ibPictureProfile.setOnClickListener(this);
        ibMessageProfile.setOnClickListener(this);
        ibChatRoomProfile.setOnClickListener(this);
        ibActivitiesProfile.setOnClickListener(this);
        ibProfileProfile.setOnClickListener(this);
        tvEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibPictureProfile:
                startActivity(new Intent(activity, PrivateChatActivity.class));
                finish();
                break;
            case R.id.ibMessageProfile:
                startActivity(new Intent(activity, LandingActivity.class));
                finish();
                break;
            case R.id.ibChatRoomProfile:
                startActivity(new Intent(activity, PicturesActivity.class));
                finish();
                break;

            case R.id.ibActivitiesProfile:
                startActivity(new Intent(activity, ViewImageActivity.class));
                finish();
                break;

            case R.id.ibProfileProfile:
                startActivity(new Intent(activity, ProfileFirstActivity.class));
                finish();
                break;

            case R.id.tvEdit:
                startActivity(new Intent(activity, ProfileSecondActivity.class));
                finish();
                break;

        }
    }
}
