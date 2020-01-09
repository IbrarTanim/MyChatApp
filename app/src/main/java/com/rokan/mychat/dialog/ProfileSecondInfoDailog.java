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
                LookingforDialog lookingforDialog = new LookingforDialog(activity);
                DialogControl.ShowDialog(activity, lookingforDialog);
                break;

            case R.id.tvProfession:
                ProfessionDialog professionDialog = new ProfessionDialog(activity);
                DialogControl.ShowDialog(activity, professionDialog);
                break;

            case R.id.tvEducation:
                EducationDialog educationDialog = new EducationDialog(activity);
                DialogControl.ShowDialog(activity, educationDialog);
                break;

            case R.id.tvLanguage:
                LanguageDialog languageDialog = new LanguageDialog(activity);
                DialogControl.ShowDialog(activity, languageDialog);
                break;

            case R.id.tvHeight:
                HeightDialog heightDialog = new HeightDialog(activity);
                DialogControl.ShowDialog(activity, heightDialog);
                break;

            case R.id.tvHairColor:
                HairColorDialog hairColorDialog = new HairColorDialog(activity);
                DialogControl.ShowDialog(activity, hairColorDialog);
                break;

            case R.id.tvEyeColor:
                EyeColorDialog eyeColorDialog = new EyeColorDialog(activity);
                DialogControl.ShowDialog(activity, eyeColorDialog);
                break;

            case R.id.tvSmoking:
                SmokingDialog smokingDialog = new SmokingDialog(activity);
                DialogControl.ShowDialog(activity, smokingDialog);
                break;

            case R.id.tvHobbie:
                HobbiesDialog hobbiesDialog = new HobbiesDialog(activity);
                DialogControl.ShowDialog(activity, hobbiesDialog);
                break;


        }
    }
}
