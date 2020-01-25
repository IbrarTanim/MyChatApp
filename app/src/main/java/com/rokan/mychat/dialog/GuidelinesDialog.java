package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsActivity;
import com.rokan.mychat.activities.LandingActivity;

public class GuidelinesDialog extends Dialog {

    Context context;
    ChatRoomsActivity activity;

    public GuidelinesDialog(ChatRoomsActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidelines_dialog);
    }
}
