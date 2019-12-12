package com.rokan.mychat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.PhotoBlogsAdapter;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;

import java.util.ArrayList;
import java.util.List;

public class PhotoBlogsActivity extends AppCompatActivity {

    PhotoBlogsActivity activity;
    private PhotoBlogsAdapter photoBlogsAdapter;
    private List<PhotoBlogs> photoBlogsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_blogs);

        activity = this;
        photoBlogsList = new ArrayList<>();
        photoBlogsAdapter = new PhotoBlogsAdapter(activity, photoBlogsList);
        preparePhotoBlogs();
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

        PhotoBlogs photoBlogs = new PhotoBlogs(listItemPhotoBlogs[0], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[1], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[2], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[3], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[4], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[5], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[6], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs(listItemPhotoBlogs[7], "15", "13", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogsAdapter.notifyDataSetChanged();
    }

}
