package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsActivity;
import com.rokan.mychat.activities.LandingActivity;

public class ApplyForAdminDialog extends Dialog {

    Context context;
    ChatRoomsActivity activity;

    public ApplyForAdminDialog(ChatRoomsActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applyfor_admin_dialog);
    }
}
