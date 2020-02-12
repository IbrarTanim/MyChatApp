package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rokan.mychat.R;

public class TermsOfServiceActivity extends AppCompatActivity {

    TermsOfServiceActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_service);
        activity = this;
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, SettingsActivity.class));
        finish();
    }
}
