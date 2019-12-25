package com.rokan.mychat.activities;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.TypedValue;
import android.view.View;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.HotListAdapter;
import com.rokan.mychat.adapters.PhotoBlogsAdapter;
import com.rokan.mychat.adapters.UserPhotoBlogsAdapter;
import com.rokan.mychat.pojo.HotList;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;
import com.rokan.mychat.pojo.UserPhotoBlogs;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ProfileThirdActivity extends AppCompatActivity {

    ProfileThirdActivity activity;
    private UserPhotoBlogsAdapter userPhotoBlogsAdapter;
    private List<UserPhotoBlogs> userPhotoBlogsList;
    private RecyclerView rvUserPhotoBlogs;
    LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_third);

        activity = this;
        rvUserPhotoBlogs = findViewById(R.id.rvUserPhotoBlogs);
        userPhotoBlogsList = new ArrayList<>();


        userPhotoBlogsAdapter = new UserPhotoBlogsAdapter(activity, userPhotoBlogsList);
        //layoutManagerPhotoBlogs = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);



        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 2);
        rvPhotoBlogs.setLayoutManager(mLayoutManager);
        rvPhotoBlogs.addItemDecoration(new GridSpacingItemDecoration(2, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvPhotoBlogs.setItemAnimator(new DefaultItemAnimator());*/

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        rvUserPhotoBlogs.setLayoutManager(staggeredGridLayoutManager);
        rvUserPhotoBlogs.setAdapter(userPhotoBlogsAdapter);


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

        UserPhotoBlogs
                userPhotoBlogs = new UserPhotoBlogs(listItemPhotoBlogs[0]);
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


}
