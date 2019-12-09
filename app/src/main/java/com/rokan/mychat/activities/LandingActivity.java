package com.rokan.mychat.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Switch;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.InfoDialog;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    LandingActivity activity;
    ImageView ivInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        activity = this;

        ivInfo = findViewById(R.id.ivInfo);
        ivInfo.setOnClickListener(this);
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
        }
    }



    public void runSplash() {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

               /* Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();*/

            }
        }, 4000);

    }
}
