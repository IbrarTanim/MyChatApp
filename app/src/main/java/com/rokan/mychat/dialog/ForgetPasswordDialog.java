package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.LoginActivity;

public class ForgetPasswordDialog extends Dialog {

    Context context;
    LoginActivity activity;

    public ForgetPasswordDialog(Context context) {
        super(context, R.style.CustomAlertDialog);
        this.context = context;
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password_dialog);
    }
}
