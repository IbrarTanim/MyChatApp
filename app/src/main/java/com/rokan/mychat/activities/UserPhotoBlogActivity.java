package com.rokan.mychat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.UserPhotoBlogsAdapter;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserPhotoBlogActivity extends AppCompatActivity implements View.OnClickListener {

    UserPhotoBlogActivity activity;
    private UserPhotoBlogsAdapter userPhotoBlogsAdapter;
    private List<UserPhotoBlogs> userPhotoBlogsList;
    private RecyclerView rvUserPhotoBlogs;
    LinearLayoutManager layoutManager;
    CircleImageView civUploadPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_photo_blog);

        activity = this;
        rvUserPhotoBlogs = findViewById(R.id.rvUserPhotoBlogs);
        civUploadPhoto = findViewById(R.id.civUploadPhoto);
        userPhotoBlogsList = new ArrayList<>();


        userPhotoBlogsAdapter = new UserPhotoBlogsAdapter(activity, userPhotoBlogsList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        rvUserPhotoBlogs.setLayoutManager(staggeredGridLayoutManager);
        rvUserPhotoBlogs.setAdapter(userPhotoBlogsAdapter);


        civUploadPhoto.setOnClickListener(this);
        preparePhotoBlogs();

    }


    private void preparePhotoBlogs() {


        int[] listItemPhotoBlogs = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };

        UserPhotoBlogs userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[0]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[1]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[2]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[3]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[4]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[5]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[6]);
        userPhotoBlogsList.add(userPhotoBlogs);

        userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[7]);
        userPhotoBlogsList.add(userPhotoBlogs);


        userPhotoBlogsAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ProfileSecondActivity.class));
        finish();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.civUploadPhoto:
                startActivity(new Intent(activity, UploadPhotoActivity.class));
                finish();
                break;
        }
    }
}
