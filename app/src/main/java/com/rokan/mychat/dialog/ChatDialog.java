package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.LandingActivity;

public class ChatDialog extends Dialog {

    Context context;
    LandingActivity activity;

    public ChatDialog(Context context) {
        super(context, R.style.CustomAlertDialog);
        this.context = context;
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_dialog);
    }
}
