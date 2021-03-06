package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rokan.mychat.R;

public class ProfileFirstActivity extends AppCompatActivity implements View.OnClickListener {
    ProfileFirstActivity activity;
    ImageButton ibPictureProfile, ibMessageProfile, ibChatRoomProfile, ibActivitiesProfile, ibProfileProfile;
    ImageView ivBoddoSupport;
    TextView tvEdit, tvAddBoddoCredits, tvDiscoverBoddoPlus;
    LinearLayout llHotlistFirstProfile, llSettings, llLikedMe, llFavoritedMe;

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
        ivBoddoSupport = findViewById(R.id.ivBoddoSupport);
        tvEdit = findViewById(R.id.tvEdit);
        tvAddBoddoCredits = findViewById(R.id.tvAddBoddoCredits);
        tvDiscoverBoddoPlus = findViewById(R.id.tvDiscoverBoddoPlus);
        llHotlistFirstProfile = findViewById(R.id.llHotlistFirstProfile);
        llSettings = findViewById(R.id.llSettings);
        llLikedMe = findViewById(R.id.llLikedMe);
        llFavoritedMe = findViewById(R.id.llFavoritedMe);

        ibPictureProfile.setOnClickListener(this);
        ibMessageProfile.setOnClickListener(this);
        ibChatRoomProfile.setOnClickListener(this);
        ibActivitiesProfile.setOnClickListener(this);
        ibProfileProfile.setOnClickListener(this);
        ivBoddoSupport.setOnClickListener(this);
        tvEdit.setOnClickListener(this);
        tvAddBoddoCredits.setOnClickListener(this);
        tvDiscoverBoddoPlus.setOnClickListener(this);
        llHotlistFirstProfile.setOnClickListener(this);
        llSettings.setOnClickListener(this);
        llLikedMe.setOnClickListener(this);
        llFavoritedMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibPictureProfile:
                startActivity(new Intent(activity, PrivateChatActivity.class));
                finish();
                break;
            case R.id.ibMessageProfile:
                startActivity(new Intent(activity, MessagesActivity.class));
                finish();
                break;
            case R.id.ibChatRoomProfile:
                startActivity(new Intent(activity, ChatRoomsActivity.class));
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

            case R.id.ivBoddoSupport:
                startActivity(new Intent(activity, BoddoSupportActivity.class));
                finish();
                break;


            case R.id.tvEdit:
                startActivity(new Intent(activity, ProfileSecondActivity.class));
                finish();
                break;

            case R.id.tvAddBoddoCredits:
                startActivity(new Intent(activity, BuyBoddoCreditsActivity.class));
                finish();
                break;

            case R.id.tvDiscoverBoddoPlus:
                startActivity(new Intent(activity, AccountClosedActivity.class));
                finish();
                break;


            case R.id.llHotlistFirstProfile:
                startActivity(new Intent(activity, HotListActivity.class));
                finish();
                break;

            case R.id.llSettings:
                startActivity(new Intent(activity, SettingsActivity.class));
                finish();
                break;
            case R.id.llLikedMe:
                startActivity(new Intent(activity, ForgetPasswordActivity.class));
                finish();
                break;

            case R.id.llFavoritedMe:
                startActivity(new Intent(activity, MatchActivity.class));
                finish();
                break;


        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, PicturesActivity.class));
        finish();
    }
}
