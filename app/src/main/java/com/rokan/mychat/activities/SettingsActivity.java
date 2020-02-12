package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rokan.mychat.R;
import com.rokan.mychat.dialog.DailyLoginBonusDialog;
import com.rokan.mychat.dialog.DialogControl;
import com.rokan.mychat.dialog.GuidelinesDialog;
import com.rokan.mychat.dialog.InsufficientCreditsDialog;
import com.rokan.mychat.dialog.ViewVisitorDialog;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    SettingsActivity activity;
    TextView tvBlockeduser, tvTransaction, tvBasicInfo, tvTermsOfService, tvPrivacyPolicy, tvUID, tvBoddoVersion;
    TextView tvRestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        activity = this;
        tvBlockeduser = findViewById(R.id.tvBlockeduser);
        tvTransaction = findViewById(R.id.tvTransaction);
        tvBasicInfo = findViewById(R.id.tvBasicInfo);
        tvTermsOfService = findViewById(R.id.tvTermsOfService);
        tvPrivacyPolicy = findViewById(R.id.tvPrivacyPolicy);
        tvUID = findViewById(R.id.tvUID);
        tvBoddoVersion = findViewById(R.id.tvBoddoVersion);
        tvRestore = findViewById(R.id.tvRestore);

        tvBlockeduser.setOnClickListener(this);
        tvTransaction.setOnClickListener(this);
        tvBasicInfo.setOnClickListener(this);
        tvTermsOfService.setOnClickListener(this);
        tvPrivacyPolicy.setOnClickListener(this);
        tvUID.setOnClickListener(this);
        tvBoddoVersion.setOnClickListener(this);
        tvRestore.setOnClickListener(this);
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
            case R.id.tvTermsOfService:
                startActivity(new Intent(activity, TermsOfServiceActivity.class));
                finish();
                break;

            case R.id.tvPrivacyPolicy:
                startActivity(new Intent(activity, PrivacyPolicyActivity.class));
                finish();
                break;

            case R.id.tvUID:
                DailyLoginBonusDialog dailyLoginBonusDialog = new DailyLoginBonusDialog(activity);
                DialogControl.ShowDialog(activity, dailyLoginBonusDialog);
                break;

            case R.id.tvBoddoVersion:
                InsufficientCreditsDialog insufficientCreditsDialog = new InsufficientCreditsDialog(activity);
                DialogControl.ShowDialog(activity, insufficientCreditsDialog);
                break;
            case R.id.tvRestore:
                ViewVisitorDialog viewVisitorDialog = new ViewVisitorDialog(activity);
                DialogControl.ShowDialog(activity, viewVisitorDialog);
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
