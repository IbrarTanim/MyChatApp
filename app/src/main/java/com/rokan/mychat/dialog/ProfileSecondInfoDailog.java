package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ProfileSecondActivity;

public class ProfileSecondInfoDailog extends Dialog implements View.OnClickListener {
    ProfileSecondActivity activity;
    //Context context;

    TextView tvRlationship, tvLookingfor, tvProfession, tvEducation, tvLanguage;
    TextView tvHeight, tvHairColor, tvEyeColor, tvSmoking, tvHobbie;


    public ProfileSecondInfoDailog(ProfileSecondActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        //this.context = context;
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_dialog_profile_second);

        tvRlationship = findViewById(R.id.tvRlationship);
        tvLookingfor = findViewById(R.id.tvLookingfor);
        tvProfession = findViewById(R.id.tvProfession);
        tvEducation = findViewById(R.id.tvEducation);
        tvLanguage = findViewById(R.id.tvLanguage);
        tvHeight = findViewById(R.id.tvHeight);
        tvHairColor = findViewById(R.id.tvHairColor);
        tvEyeColor = findViewById(R.id.tvEyeColor);
        tvSmoking = findViewById(R.id.tvSmoking);
        tvHobbie = findViewById(R.id.tvHobbie);

        tvRlationship.setOnClickListener(this);
        tvLookingfor.setOnClickListener(this);
        tvProfession.setOnClickListener(this);
        tvEducation.setOnClickListener(this);
        tvLanguage.setOnClickListener(this);
        tvHeight.setOnClickListener(this);
        tvHairColor.setOnClickListener(this);
        tvEyeColor.setOnClickListener(this);
        tvSmoking.setOnClickListener(this);
        tvHobbie.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvRlationship:
                RelationShipDialog relationShipDialog = new RelationShipDialog(activity);
                DialogControl.ShowDialog(activity, relationShipDialog);

                break;

            case R.id.tvLookingfor:
                break;

            case R.id.tvProfession:
                break;

            case R.id.tvEducation:
                break;

            case R.id.tvLanguage:
                break;

            case R.id.tvHeight:
                break;

            case R.id.tvHairColor:
                break;

            case R.id.tvEyeColor:
                break;

            case R.id.tvSmoking:
                break;

            case R.id.tvHobbie:
                break;


        }
    }
}
