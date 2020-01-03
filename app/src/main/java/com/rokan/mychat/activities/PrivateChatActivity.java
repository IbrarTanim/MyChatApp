package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.PrivateChatAdapter;
import com.rokan.mychat.pojo.PrivateChat;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.ArrayList;
import java.util.List;

public class PrivateChatActivity extends AppCompatActivity {
    PrivateChatActivity activity;

    private PrivateChatAdapter privateChatAdapter;
    private List<PrivateChat> privateChatList;
    private RecyclerView rvPrivateChat;
    ImageView ivPrivateChatSendImage;
    NestedScrollView nsPrivateChatAlbum, nsPrivateChatAlbumMain;
    CardView cvPrivateChat;

    boolean isPrivateChatImageOption = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_chat);
        activity = this;
        isPrivateChatImageOption = true;
        cvPrivateChat = findViewById(R.id.cvPrivateChat);

        rvPrivateChat = findViewById(R.id.rvPrivateChat);
        ivPrivateChatSendImage = findViewById(R.id.ivPrivateChatSendImage);
        nsPrivateChatAlbum = findViewById(R.id.nsPrivateChatAlbum);
        nsPrivateChatAlbumMain = findViewById(R.id.nsPrivateChatAlbumMain);
        nsPrivateChatAlbum.setVisibility(View.GONE);
        cvPrivateChat.setRadius(0);


        ivPrivateChatSendImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isPrivateChatImageOption != true) {
                    nsPrivateChatAlbum.setVisibility(View.GONE);
                    cvPrivateChat.setRadius(0);
                    isPrivateChatImageOption = true;

                } else {
                    nsPrivateChatAlbum.setVisibility(View.VISIBLE);
                    cvPrivateChat.setRadius(20);
                    isPrivateChatImageOption = false;
                }

            }
        });
        privateChatList = new ArrayList<>();

        privateChatAdapter = new PrivateChatAdapter(activity, privateChatList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.HORIZONTAL);
        rvPrivateChat.setLayoutManager(staggeredGridLayoutManager);
        rvPrivateChat.setAdapter(privateChatAdapter);


        preparePrivateChat();
    }

    private void preparePrivateChat() {
        int[] listItemPrivateChat = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };

        PrivateChat privateChat = new PrivateChat(listItemPrivateChat[0]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[1]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[2]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[3]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[4]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[5]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[6]);
        privateChatList.add(privateChat);

        privateChat = new PrivateChat(listItemPrivateChat[7]);
        privateChatList.add(privateChat);


        privateChatAdapter.notifyDataSetChanged();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ProfileSecondActivity.class));
        finish();

    }
}
