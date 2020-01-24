package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.rokan.mychat.R;
import com.rokan.mychat.activities.LandingActivity;
import com.rokan.mychat.activities.ProfilePictureActivity;
import com.rokan.mychat.activities.ProfileSecondActivity;

public class ProfileSecondInfoDailog extends Dialog implements View.OnClickListener {
    ProfileSecondActivity activity;

    LinearLayout llAbout, llRelationship, llLocationFor, llProfession, llEducation, llLanguage, llHeight, llHairColor, llEyeColor, llSmoking, llHobbies;

    TextView tvRlationship, tvLookingfor, tvProfession, tvEducation, tvLanguage;
    TextView tvHeight, tvHairColor, tvEyeColor, tvSmoking, tvHobbie;
    RoundedImageView rivInfoProfileSecond;


    public ProfileSecondInfoDailog(ProfileSecondActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_dialog_profile_second);

        llAbout = findViewById(R.id.llAbout);
        llRelationship = findViewById(R.id.llRelationship);
        llLocationFor = findViewById(R.id.llLocationFor);
        llProfession = findViewById(R.id.llProfession);
        llEducation = findViewById(R.id.llEducation);
        llLanguage = findViewById(R.id.llLanguage);
        llHeight = findViewById(R.id.llHeight);
        llHairColor = findViewById(R.id.llHairColor);
        llEyeColor = findViewById(R.id.llEyeColor);
        llSmoking = findViewById(R.id.llSmoking);
        llHobbies = findViewById(R.id.llHobbies);


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
        rivInfoProfileSecond = findViewById(R.id.rivInfoProfileSecond);

        llAbout.setOnClickListener(this);
        llRelationship.setOnClickListener(this);
        llLocationFor.setOnClickListener(this);
        llProfession.setOnClickListener(this);
        llEducation.setOnClickListener(this);
        llLanguage.setOnClickListener(this);
        llHeight.setOnClickListener(this);
        llHairColor.setOnClickListener(this);
        llEyeColor.setOnClickListener(this);
        llSmoking.setOnClickListener(this);
        llHobbies.setOnClickListener(this);
        rivInfoProfileSecond.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.llAbout:
                AboutDialog aboutDialog = new AboutDialog(activity);
                DialogControl.ShowDialog(activity, aboutDialog);
                break;

            case R.id.llRelationship:
                RelationShipDialog relationShipDialog = new RelationShipDialog(activity);
                DialogControl.ShowDialog(activity, relationShipDialog);
                break;


            case R.id.llLocationFor:
                LookingforDialog lookingforDialog = new LookingforDialog(activity);
                DialogControl.ShowDialog(activity, lookingforDialog);
                break;

            case R.id.llProfession:
                ProfessionDialog professionDialog = new ProfessionDialog(activity);
                DialogControl.ShowDialog(activity, professionDialog);
                break;

            case R.id.llEducation:
                EducationDialog educationDialog = new EducationDialog(activity);
                DialogControl.ShowDialog(activity, educationDialog);
                break;

            case R.id.llLanguage:
                LanguageDialog languageDialog = new LanguageDialog(activity);
                DialogControl.ShowDialog(activity, languageDialog);
                break;

            case R.id.llHeight:
                HeightDialog heightDialog = new HeightDialog(activity);
                DialogControl.ShowDialog(activity, heightDialog);
                break;

            case R.id.llHairColor:
                HairColorDialog hairColorDialog = new HairColorDialog(activity);
                DialogControl.ShowDialog(activity, hairColorDialog);
                break;

            case R.id.llEyeColor:
                EyeColorDialog eyeColorDialog = new EyeColorDialog(activity);
                DialogControl.ShowDialog(activity, eyeColorDialog);
                break;

            case R.id.llSmoking:
                SmokingDialog smokingDialog = new SmokingDialog(activity);
                DialogControl.ShowDialog(activity, smokingDialog);
                break;

            case R.id.llHobbies:
                HobbiesDialog hobbiesDialog = new HobbiesDialog(activity);
                DialogControl.ShowDialog(activity, hobbiesDialog);
                break;

            case R.id.rivInfoProfileSecond:
                activity.startActivity(new Intent(activity, ProfilePictureActivity.class));
                break;

        }
    }
}
