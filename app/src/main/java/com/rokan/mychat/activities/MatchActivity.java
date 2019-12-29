package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rokan.mychat.R;

public class MatchActivity extends AppCompatActivity {

    MatchActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        activity = this;
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, MessagesActivity.class));
        finish();
    }
}
