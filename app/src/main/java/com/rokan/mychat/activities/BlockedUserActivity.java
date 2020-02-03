package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.BlockUserAdapter;
import com.rokan.mychat.adapters.ChatRequestAdapter;
import com.rokan.mychat.adapters.LiveChatAdapter;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class BlockedUserActivity extends AppCompatActivity {

    BlockedUserActivity activity;
    private BlockUserAdapter blockUserAdapter;
    private RecyclerView rvChatRequest;
    private List<LiveChat> liveChatList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocked_user);
        activity = this;

        rvChatRequest = findViewById(R.id.rvChatRequest);
        liveChatList = new ArrayList<>();
        blockUserAdapter = new BlockUserAdapter(activity, liveChatList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvChatRequest.setLayoutManager(mLayoutManager);
        rvChatRequest.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvChatRequest.setItemAnimator(new DefaultItemAnimator());
        rvChatRequest.setAdapter(blockUserAdapter);

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


        LiveChat liveChat = new LiveChat(listItem[0], getString(R.string.nazrul), "Blocked 3 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[1], getString(R.string.jafariqbal), "Blocked 4 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[2], getString(R.string.sufiakamal), "Blocked 3 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[3], getString(R.string.sarat), "Blocked 7 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[4], getString(R.string.samsurrahman), "Blocked 13 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[5], getString(R.string.robindronath), "Blocked 23 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[6], getString(R.string.humayanahmed), "Blocked 16 days ago", "Unblock");
        liveChatList.add(liveChat);

        liveChat = new LiveChat(listItem[7], getString(R.string.samsurrahman), "Blocked 28 days ago", "Unblock");
        liveChatList.add(liveChat);


        blockUserAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, SettingsActivity.class));
        finish();
    }
}
