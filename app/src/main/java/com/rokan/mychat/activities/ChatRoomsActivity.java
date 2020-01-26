package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.ChatRoomInfoDialog;
import com.rokan.mychat.dialog.DialogControl;
import com.rokan.mychat.dialog.LookingforDialog;

public class ChatRoomsActivity extends AppCompatActivity implements View.OnClickListener {
    ChatRoomsActivity activity;
    ImageView ivChatRoomInfo, ivBangladesh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_rooms);
        activity = this;

        ivChatRoomInfo = findViewById(R.id.ivChatRoomInfo);
        ivBangladesh = findViewById(R.id.ivBangladesh);

        ivChatRoomInfo.setOnClickListener(this);
        ivBangladesh.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivChatRoomInfo:
                ChatRoomInfoDialog chatRoomInfoDialog = new ChatRoomInfoDialog(activity);
                DialogControl.ShowDialog(activity, chatRoomInfoDialog);

                break;
            case R.id.ivBangladesh:
                startActivity(new Intent(activity, ChatRoomsBaseActivity.class));
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
