package com.rokan.mychat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.HotlistFirstProfileAdapter;
import com.rokan.mychat.adapters.UserPhotoBlogsAdapter;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.ArrayList;
import java.util.List;

public class HotListActivity extends AppCompatActivity {

    HotListActivity activity;
    private HotlistFirstProfileAdapter hotlistFirstProfileAdapter;
    private List<UserPhotoBlogs> userPhotoBlogsList;
    private RecyclerView rvHotListFirstProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_list);
        activity = this;

        rvHotListFirstProfile = findViewById(R.id.rvHotListFirstProfile);
        userPhotoBlogsList = new ArrayList<>();


        hotlistFirstProfileAdapter = new HotlistFirstProfileAdapter(activity, userPhotoBlogsList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        rvHotListFirstProfile.setLayoutManager(staggeredGridLayoutManager);
        rvHotListFirstProfile.setAdapter(hotlistFirstProfileAdapter);


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


        hotlistFirstProfileAdapter.notifyDataSetChanged();
    }
}