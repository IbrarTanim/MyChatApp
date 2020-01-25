package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsActivity;
import com.rokan.mychat.activities.LandingActivity;

public class ChatRoomInfoDialog extends Dialog implements View.OnClickListener {

    ChatRoomsActivity activity;
    TextView tvGuidelines, tvApplyForAdmin;

    public ChatRoomInfoDialog(ChatRoomsActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatroom_info_dialog);

        tvGuidelines = findViewById(R.id.tvGuidelines);
        tvApplyForAdmin = findViewById(R.id.tvApplyForAdmin);

        tvGuidelines.setOnClickListener(this);
        tvApplyForAdmin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvGuidelines:
                GuidelinesDialog guidelinesDialog = new GuidelinesDialog(activity);
                DialogControl.ShowDialog(activity, guidelinesDialog);
                break;

            case R.id.tvApplyForAdmin:
                ApplyForAdminDialog  applyForAdminDialog = new ApplyForAdminDialog(activity);
                DialogControl.ShowDialog(activity, applyForAdminDialog);
                break;


        }
    }
}
