package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rokan.mychat.R;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    SettingsActivity activity;
    TextView tvBlockeduser, tvTransaction, tvBasicInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        activity = this;
        tvBlockeduser = findViewById(R.id.tvBlockeduser);
        tvTransaction = findViewById(R.id.tvTransaction);
        tvBasicInfo = findViewById(R.id.tvBasicInfo);
        tvBlockeduser.setOnClickListener(this);
        tvTransaction.setOnClickListener(this);
        tvBasicInfo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvBlockeduser:
                startActivity(new Intent(activity, BlockedUserActivity.class));
                finish();
                break;
            case R.id.tvTransaction:
                startActivity(new Intent(activity, TransactionActivity.class));
                finish();
                break;

            case R.id.tvBasicInfo:
                startActivity(new Intent(activity, EditBasicInfoActivity.class));
                finish();
                break;


        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ProfileFirstActivity.class));
        finish();
    }
}
