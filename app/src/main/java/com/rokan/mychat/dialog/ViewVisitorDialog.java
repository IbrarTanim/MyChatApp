package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.SettingsActivity;

public class ViewVisitorDialog extends Dialog {

    Context context;
    SettingsActivity activity;

    public ViewVisitorDialog(SettingsActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_visitor_dialog);
    }
}
