package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.LiveChatAdapter;
import com.rokan.mychat.adapters.NewMatchesAdapter;
import com.rokan.mychat.pojo.HotList;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class MessagesActivity extends AppCompatActivity implements View.OnClickListener {

    MessagesActivity activity;
    private RecyclerView rvNewMatches;
    private RecyclerView rvLiveChat;
    LinearLayout llHotList, llNewMatches;
    private LiveChatAdapter liveChatAdapter;
    private List<HotList> hotLists;
    private List<LiveChat> liveChatList;
    private NewMatchesAdapter newMatchesAdapter;
    LinearLayoutManager layoutManagerNewMatches;
    boolean isLetterShowing = false;

    ImageButton ibPictureMessages, ibMessageMessages, ibChatRoomMessages, ibActivitiesMessages, ibProfileMessages;
    ImageView ivChatRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }
        setContentView(R.layout.activity_messages);
        activity = this;

        rvNewMatches = findViewById(R.id.rvNewMatches);
        rvLiveChat = findViewById(R.id.rvLiveChat);
        llHotList = findViewById(R.id.llHotList);
        llNewMatches = findViewById(R.id.llNewMatches);
        ibPictureMessages = findViewById(R.id.ibPictureMessages);
        ibMessageMessages = findViewById(R.id.ibMessageMessages);
        ibChatRoomMessages = findViewById(R.id.ibChatRoomMessages);
        ibActivitiesMessages = findViewById(R.id.ibActivitiesMessages);
        ibProfileMessages = findViewById(R.id.ibProfileMessages);
        ivChatRequest = findViewById(R.id.ivChatRequest);

        ibPictureMessages.setOnClickListener(this);
        ibMessageMessages.setOnClickListener(this);
        ibChatRoomMessages.setOnClickListener(this);
        ibActivitiesMessages.setOnClickListener(this);
        ibProfileMessages.setOnClickListener(this);
        ivChatRequest.setOnClickListener(this);

        hotLists = new ArrayList<>();
        newMatchesAdapter = new NewMatchesAdapter(activity, hotLists);
        liveChatList = new ArrayList<>();
        liveChatAdapter = new LiveChatAdapter(activity, liveChatList);
        layoutManagerNewMatches = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvLiveChat.setLayoutManager(mLayoutManager);
        rvLiveChat.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvLiveChat.setItemAnimator(new DefaultItemAnimator());
        rvLiveChat.setAdapter(liveChatAdapter);

        rvNewMatches.setLayoutManager(layoutManagerNewMatches);
        rvNewMatches.setAdapter(newMatchesAdapter);


        prepareHotList();
        prepareLiveChat();

    }


    private void prepareLiveChat() {
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
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
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
            case R.id.ibPictureMessages:
                startActivity(new Intent(activity, PicturesActivity.class));
                finish();
                break;
            case R.id.ibMessageMessages:
                startActivity(new Intent(activity, MessagesActivity.class));
                finish();
                break;
            case R.id.ibChatRoomMessages:
                startActivity(new Intent(activity, ChatRoomsActivity.class));
                finish();
                break;

            case R.id.ibActivitiesMessages:
                startActivity(new Intent(activity, ActivitiesActivity.class));
                finish();
                break;

            case R.id.ibProfileMessages:
                startActivity(new Intent(activity, ProfileFirstActivity.class));
                finish();
                break;

            case R.id.ivChatRequest:
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
