package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.ActiveUserAdapter;
import com.rokan.mychat.adapters.ChatRequestAdapter;
import com.rokan.mychat.pojo.ActiveUser;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ActiveUserActivity extends AppCompatActivity {

    ActiveUserActivity activity;
    private ActiveUserAdapter activeUserAdapter;
    private RecyclerView rvActiveUser;
    private List<ActiveUser> activeUserList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_user);
        activity = this;

        rvActiveUser = findViewById(R.id.rvActiveUser);
        activeUserList = new ArrayList<>();
        activeUserAdapter = new ActiveUserAdapter(activity, activeUserList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvActiveUser.setLayoutManager(mLayoutManager);
        rvActiveUser.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvActiveUser.setItemAnimator(new DefaultItemAnimator());
        rvActiveUser.setAdapter(activeUserAdapter);

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


        ActiveUser activeUser = new ActiveUser(listItem[0], getString(R.string.nazrul));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[1], getString(R.string.jafariqbal));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[2], getString(R.string.sufiakamal));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[3], getString(R.string.sarat));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[4], getString(R.string.samsurrahman));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[5], getString(R.string.robindronath));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[6], getString(R.string.humayanahmed));
        activeUserList.add(activeUser);

        activeUser = new ActiveUser(listItem[7], getString(R.string.samsurrahman));
        activeUserList.add(activeUser);


        activeUserAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ChatRoomsBaseActivity.class));
        finish();
    }
}
