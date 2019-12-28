package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.rokan.mychat.R;

public class ProfileFirstActivity extends AppCompatActivity implements View.OnClickListener {
    ProfileFirstActivity activity;
    ImageButton ibtnPicturesFirst;
    TextView tvEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_first);
        activity = this;

        ibtnPicturesFirst = findViewById(R.id.ibtnPicturesFirst);
        tvEdit = findViewById(R.id.tvEdit);

        ibtnPicturesFirst.setOnClickListener(this);
        tvEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibtnPicturesFirst:
                startActivity(new Intent(activity, PrivateChatActivity.class));
                break;

            case R.id.tvEdit:
                startActivity(new Intent(activity, ProfileSecondActivity.class));
                break;

        }
    }
}
