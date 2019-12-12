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

        PhotoBlogs photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogs = new PhotoBlogs("15", "3", "9", "Mr.Ahmed", "Ibrar Tanim Rokan");
        photoBlogsList.add(photoBlogs);

        photoBlogsAdapter.notifyDataSetChanged();
    }

}
