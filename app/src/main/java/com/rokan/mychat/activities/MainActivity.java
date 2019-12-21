package com.rokan.mychat.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.HotListAdapter;
import com.rokan.mychat.adapters.LiveChatAdapter;
import com.rokan.mychat.adapters.NewMatchesAdapter;
import com.rokan.mychat.pojo.HotList;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainActivity activity;
    private RecyclerView rvNewMatches;
    private RecyclerView rvLiveChat;
    LinearLayout llHotList, llNewMatches;
    private LiveChatAdapter liveChatAdapter;
    private List<HotList> hotLists;
    private List<LiveChat> liveChatList;
    private NewMatchesAdapter newMatchesAdapter;
    LinearLayoutManager layoutManagerNewMatches;
    //LinearLayoutManager layoutManagerLiveChat;
    boolean isLetterShowing = false;

    ImageButton ibtnPhotoBlogs, ibtMessage, ibChatRoom, ibNotification, ibProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }
        setContentView(R.layout.activity_main);
        activity = this;

        rvNewMatches = findViewById(R.id.rvNewMatches);
        rvLiveChat = findViewById(R.id.rvLiveChat);
        llHotList = findViewById(R.id.llHotList);
        llNewMatches = findViewById(R.id.llNewMatches);
        ibtnPhotoBlogs = findViewById(R.id.ibtnPhotoBlogs);
        ibtMessage = findViewById(R.id.ibtMessage);
        ibChatRoom = findViewById(R.id.ibChatRoom);
        ibNotification = findViewById(R.id.ibNotification);
        ibProfile = findViewById(R.id.ibProfile);

        ibtnPhotoBlogs.setOnClickListener(this);
        ibtMessage.setOnClickListener(this);
        ibChatRoom.setOnClickListener(this);
        ibNotification.setOnClickListener(this);
        ibProfile.setOnClickListener(this);


        hotLists = new ArrayList<>();
        newMatchesAdapter = new NewMatchesAdapter(activity, hotLists);

        liveChatList = new ArrayList<>();
        liveChatAdapter = new LiveChatAdapter(activity, liveChatList);


        layoutManagerNewMatches = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //layoutManagerLiveChat = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvLiveChat.setLayoutManager(mLayoutManager);
        rvLiveChat.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvLiveChat.setItemAnimator(new DefaultItemAnimator());
        rvLiveChat.setAdapter(liveChatAdapter);


        //rvLiveChat.setLayoutManager(layoutManagerLiveChat);
        //rvLiveChat.setAdapter(liveChatAdapter);


        rvNewMatches.setLayoutManager(layoutManagerNewMatches);
        rvNewMatches.setAdapter(newMatchesAdapter);


        prepareHotList();
        prepareLiveChat();

    }


    private void prepareLiveChat() {
        int[] listItem = new int[]{
                R.mipmap.nazrul,
                R.mipmap.jaforiqbal,
                R.mipmap.sufia_kamal,
                R.mipmap.sharat,
                R.mipmap.samsurrahman,
                R.mipmap.robindronath,
                R.mipmap.humayunahmed,
                R.mipmap.samsurrahman,
        };


        LiveChat liveChat = new LiveChat(listItem[0], getString(R.string.nazrul), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[1], getString(R.string.jafariqbal), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[2], getString(R.string.sufiakamal), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[3], getString(R.string.sarat), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[4], getString(R.string.samsurrahman), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[5], getString(R.string.robindronath), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[6], getString(R.string.humayanahmed), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[7], getString(R.string.samsurrahman), getString(R.string.nazrul_activities), getString(R.string.time));
        liveChatList.add(liveChat);


        newMatchesAdapter.notifyDataSetChanged();
    }


    private void prepareHotList() {
        int[] listItem = new int[]{
                R.mipmap.nazrul,
                R.mipmap.jaforiqbal,
                R.mipmap.sufia_kamal,
                R.mipmap.sharat,
                R.mipmap.samsurrahman,
                R.mipmap.robindronath,
                R.mipmap.humayunahmed,
                R.mipmap.samsurrahman,
        };


        HotList hotList = new HotList(listItem[0]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[1]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[2]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[3]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[4]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[5]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[6]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[7]);
        hotLists.add(hotList);


        newMatchesAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibtnPhotoBlogs:
                startActivity(new Intent(activity, LoginActivity.class));
                break;
            case R.id.ibtMessage:
                startActivity(new Intent(activity, LandingActivity.class));
                break;
            case R.id.ibChatRoom:
                startActivity(new Intent(activity, PhotoBlogsActivity.class));
                break;

            case R.id.ibNotification:
                startActivity(new Intent(activity, ChattingActivity.class));
                break;

            case R.id.ibProfile:
                startActivity(new Intent(activity, ProfileFirstActivity.class));
                break;


        }
    }


}
