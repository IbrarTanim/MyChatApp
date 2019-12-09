package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.ForgetPasswordDialog;
import com.rokan.mychat.dialog.InfoDialog;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    LoginActivity activity;
    Button btnLogin;
    ImageView ivPopUPLogIn, ivInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;
        btnLogin = findViewById(R.id.btnLogin);
        ivPopUPLogIn = findViewById(R.id.ivPopUPLogIn);
        ivInfo = findViewById(R.id.ivInfo);
        btnLogin.setOnClickListener(this);
        ivPopUPLogIn.setOnClickListener(this);
        ivInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                startActivity(new Intent(activity, RegistrationActivity.class));

                break;

            case R.id.ivPopUPLogIn:
                ForgetPasswordDialog dialog = new ForgetPasswordDialog(activity);
                dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                dialog.show();
                dialog.setCancelable(true);
                dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
                dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);

                break;


            case R.id.ivInfo:
                InfoDialog infoDialog = new InfoDialog(activity);
                infoDialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                infoDialog.show();
                infoDialog.setCancelable(true);
                infoDialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
                infoDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                break;


        }
    }
}
