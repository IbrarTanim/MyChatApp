package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageButton;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.ActivitiesAdapter;
import com.rokan.mychat.pojo.Activities;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesActivity extends AppCompatActivity implements View.OnClickListener {
    ActivitiesActivity activity;
    ImageButton ibPictureActivities, ibMessageActivities, ibChatRoomActivities, ibActivitiesActivities, ibProfileActivities;
    ActivitiesAdapter activitiesAdapter;
    private List<Activities> activitiesList;
    private RecyclerView rvActivities;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        activity = this;

        activitiesList = new ArrayList<>();
        activitiesAdapter = new ActivitiesAdapter(activity, activitiesList);
        rvActivities = findViewById(R.id.rvActivities);

        ibPictureActivities = findViewById(R.id.ibPictureActivities);
        ibMessageActivities = findViewById(R.id.ibMessageActivities);
        ibChatRoomActivities = findViewById(R.id.ibChatRoomActivities);
        ibActivitiesActivities = findViewById(R.id.ibActivitiesActivities);
        ibProfileActivities = findViewById(R.id.ibProfileActivities);

        ibPictureActivities.setOnClickListener(this);
        ibMessageActivities.setOnClickListener(this);
        ibChatRoomActivities.setOnClickListener(this);
        ibActivitiesActivities.setOnClickListener(this);
        ibProfileActivities.setOnClickListener(this);

        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 3);
        rvActivities.setLayoutManager(mLayoutManager);
        rvActivities.addItemDecoration(new GridSpacingItemDecoration(3, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvActivities.setItemAnimator(new DefaultItemAnimator());*/

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        rvActivities.setLayoutManager(staggeredGridLayoutManager);
        rvActivities.setAdapter(activitiesAdapter);
        prepareActivities();
    }


    private void prepareActivities() {
        int[] listItem = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };


        Activities activities = new Activities(listItem[0], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activities = new Activities(listItem[1], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activities = new Activities(listItem[2], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activities = new Activities(listItem[3], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activities = new Activities(listItem[4], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activities = new Activities(listItem[5], getString(R.string.amanta), getString(R.string.time));
        activitiesList.add(activities);

        activitiesAdapter.notifyDataSetChanged();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibPictureActivities:
                startActivity(new Intent(activity, PicturesActivity.class));
                finish();
                break;
            case R.id.ibMessageActivities:
                startActivity(new Intent(activity, MessagesActivity.class));
                finish();
                break;
            case R.id.ibChatRoomActivities:
                startActivity(new Intent(activity, ChatRoomsActivity.class));
                finish();
                break;

            case R.id.ibActivitiesActivities:
                startActivity(new Intent(activity, ActivitiesActivity.class));
                finish();
                break;

            case R.id.ibProfileActivities:
                startActivity(new Intent(activity, ProfileFirstActivity.class));
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
