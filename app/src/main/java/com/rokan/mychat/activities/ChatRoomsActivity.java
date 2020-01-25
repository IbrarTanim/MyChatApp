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

public class ChatRoomsActivity extends AppCompatActivity {
    ChatRoomsActivity activity;
    ImageView ivChatRoomInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_rooms);
        activity = this;

        ivChatRoomInfo = findViewById(R.id.ivChatRoomInfo);
        ivChatRoomInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatRoomInfoDialog chatRoomInfoDialog = new ChatRoomInfoDialog(activity);
                DialogControl.ShowDialog(activity, chatRoomInfoDialog);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, PicturesActivity.class));
        finish();
    }
}
