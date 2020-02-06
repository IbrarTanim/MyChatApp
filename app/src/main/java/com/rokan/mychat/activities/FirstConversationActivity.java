package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.PrivateChatAdapter;
import com.rokan.mychat.pojo.PrivateChat;

import java.util.ArrayList;
import java.util.List;

public class FirstConversationActivity extends AppCompatActivity {
    FirstConversationActivity activity;
    NestedScrollView nsFirstConversation;
    ImageView ivPrivateChatSendImage;
    boolean isPrivateChatImageOption = false;
    RecyclerView rvFirstConversation;
    private List<PrivateChat> privateChatList;
    private PrivateChatAdapter privateChatAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_conversation);
        activity = this;

        nsFirstConversation = findViewById(R.id.nsFirstConversation);
        ivPrivateChatSendImage = findViewById(R.id.ivPrivateChatSendImage);
        rvFirstConversation = findViewById(R.id.rvFirstConversation);

        nsFirstConversation.setVisibility(View.GONE);
        isPrivateChatImageOption = true;

        ivPrivateChatSendImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isPrivateChatImageOption != true) {
                    nsFirstConversation.setVisibility(View.GONE);
                    isPrivateChatImageOption = true;

                } else {
                    nsFirstConversation.setVisibility(View.VISIBLE);
                    isPrivateChatImageOption = false;
                }

            }
        });



        privateChatList = new ArrayList<>();

        privateChatAdapter = new PrivateChatAdapter(activity, privateChatList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.HORIZONTAL);
        rvFirstConversation.setLayoutManager(staggeredGridLayoutManager);
        rvFirstConversation.setAdapter(privateChatAdapter);


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
        startActivity(new Intent(activity, SearchUserActivity.class));
        finish();
    }
}
