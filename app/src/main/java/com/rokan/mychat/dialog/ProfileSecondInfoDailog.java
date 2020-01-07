package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ProfileSecondActivity;

public class ProfileSecondInfoDailog extends Dialog {
    ProfileSecondInfoDailog activity;
    Context context;



    public ProfileSecondInfoDailog(Context context) {
        super(context, R.style.CustomAlertDialog);
        this.context = context;
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }


}
