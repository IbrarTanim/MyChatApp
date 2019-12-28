package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.InfoDialog;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    LandingActivity activity;
    ImageView ivInfo;
    TextView tvContinue, tvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        activity = this;

        ivInfo = findViewById(R.id.ivInfo);
        tvContinue = findViewById(R.id.tvContinue);
        tvSkip = findViewById(R.id.tvSkip);
        ivInfo.setOnClickListener(this);
        tvContinue.setOnClickListener(this);
        tvSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivInfo:
                InfoDialog infoDialog = new InfoDialog(activity);
                infoDialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                infoDialog.show();
                infoDialog.setCancelable(true);
                infoDialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
                infoDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);

                break;
            case R.id.tvContinue:
                startActivity(new Intent(activity, UserPhotoBlogActivity.class));
                break;

            case R.id.tvSkip:
                startActivity(new Intent(activity, MatchActivity.class));
                break;


        }
    }


}
