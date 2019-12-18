package com.rokan.mychat.activities;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.HotListAdapter;
import com.rokan.mychat.adapters.PhotoBlogsAdapter;
import com.rokan.mychat.pojo.HotList;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class PhotoBlogsActivity extends AppCompatActivity {

    PhotoBlogsActivity activity;
    private PhotoBlogsAdapter photoBlogsAdapter;
    private List<PhotoBlogs> photoBlogsList;
    private RecyclerView rvPhotoBlogs;
    private RecyclerView rvHotList;
    private List<HotList> hotLists;
    //LinearLayoutManager layoutManagerPhotoBlogs;
    private HotListAdapter hotListAdapter;
    LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_blogs);

        activity = this;
        rvHotList = findViewById(R.id.rvHotList);
        rvPhotoBlogs = findViewById(R.id.rvPhotoBlogs);
        photoBlogsList = new ArrayList<>();


        photoBlogsAdapter = new PhotoBlogsAdapter(activity, photoBlogsList);
        //layoutManagerPhotoBlogs = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        hotLists = new ArrayList<>();
        hotListAdapter = new HotListAdapter(activity, hotLists);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rvHotList.setLayoutManager(layoutManager);
        rvHotList.setAdapter(hotListAdapter);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 2);
        rvPhotoBlogs.setLayoutManager(mLayoutManager);
        rvPhotoBlogs.addItemDecoration(new GridSpacingItemDecoration(2, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvPhotoBlogs.setItemAnimator(new DefaultItemAnimator());
        rvPhotoBlogs.setAdapter(photoBlogsAdapter);


        preparePhotoBlogs();
        prepareHotList();

    }


    private void prepareHotList() {
        int[] listItem = new int[]{
                R.mipmap.nazrul,
                R.mipmap.jaforiqbal,
                R.mipmap.sufia_kamal,
                R.mipmap.sharat,
                R.mipmap.samsurrahman,
                R.mipmap.robindronath,
                R.mipmap.humayunahmed,
                R.mipmap.samsurrahman,
        };


        HotList hotList = new HotList(listItem[0]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[1]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[2]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[3]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[4]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[5]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[6]);
        hotLists.add(hotList);

        hotList = new HotList(listItem[7]);
        hotLists.add(hotList);


        hotListAdapter.notifyDataSetChanged();
    }

    private void preparePhotoBlogs() {


        int[] listItemPhotoBlogs = new int[]{
                R.mipmap.nazrul,
                R.mipmap.jaforiqbal,
                R.mipmap.sufia_kamal,
                R.mipmap.sharat,
                R.mipmap.samsurrahman,
                R.mipmap.robindronath,
                R.mipmap.humayunahmed,
                R.mipmap.samsurrahman,
        };

        PhotoBlogs photoBlogs = new PhotoBlogs(listItemPhotoBlogs[0], listItemPhotoBlogs[0], "13", "3", "9", "Kazi Nazrul Islam our national poet, We Love him from our heart. Kazi Nazrul Islam our national poet, We Love him from our heart");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[1], listItemPhotoBlogs[1], "13", "3", "9", getString(R.string.jafariqbal));
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[2], listItemPhotoBlogs[2], "13", "3", "9",  getString(R.string.sufiakamal));
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[3], listItemPhotoBlogs[3], "13", "3", "9", "Kazi Nazrul Islam our national poet, We Love him from our heart. Kazi Nazrul Islam our national poet, We Love him from our heart");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[4], listItemPhotoBlogs[4], "13", "3", "9", "Kazi Nazrul Islam our national poet, We Love him from our heart. Kazi Nazrul Islam our national poet, We Love him from our heart");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[5], listItemPhotoBlogs[5], "13", "3", "9", getString(R.string.robindronath));
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[6], listItemPhotoBlogs[6], "13", "3", "9", getString(R.string.humayanahmed));
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[7], listItemPhotoBlogs[7], "13", "3", "9", "Kazi Nazrul Islam our national poet, We Love him from our heart. Kazi Nazrul Islam our national poet, We Love him from our heart");
        photoBlogsList.add(photoBlogs);


        photoBlogsAdapter.notifyDataSetChanged();
    }


}
