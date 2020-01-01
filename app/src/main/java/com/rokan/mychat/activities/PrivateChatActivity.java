package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.PrivateChatAdapter;
import com.rokan.mychat.adapters.UserPhotoBlogsAdapter;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.ArrayList;
import java.util.List;

public class PrivateChatActivity extends AppCompatActivity {
    PrivateChatActivity activity;

    private PrivateChatAdapter  privateChatAdapter;
    private List<UserPhotoBlogs> privateChatList;
    private RecyclerView rvPrivateChat;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_chat);
        activity = this;


        rvPrivateChat = findViewById(R.id.rvUserPhotoBlogs);
        privateChatList = new ArrayList<>();


        privateChatAdapter = new PrivateChatAdapter(activity, privateChatList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        rvPrivateChat.setLayoutManager(staggeredGridLayoutManager);
        rvPrivateChat.setAdapter(privateChatAdapter);



        preparePhotoBlogs();
    }

    private void preparePhotoBlogs() {


        int[] listItemPhotoBlogs = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };

        UserPhotoBlogs userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[0]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[1]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[2]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[3]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[4]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[5]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[6]);
        privateChatList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[7]);
        privateChatList.add(userPhotoBlogs);


        privateChatAdapter.notifyDataSetChanged();
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ProfileSecondActivity.class));
        finish();

    }
}
