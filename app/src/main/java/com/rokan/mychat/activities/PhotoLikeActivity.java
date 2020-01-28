package com.rokan.mychat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.PhotoCommentAdapter;
import com.rokan.mychat.adapters.PhotoLikeAdapter;
import com.rokan.mychat.pojo.Comment;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class PhotoLikeActivity extends AppCompatActivity {

    PhotoLikeActivity activity;
    private PhotoLikeAdapter photoLikeAdapter;
    private RecyclerView rvComment;
    private List<Comment> commentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_like);
        activity = this;

        rvComment = findViewById(R.id.rvComment);
        commentList = new ArrayList<>();
        photoLikeAdapter = new PhotoLikeAdapter(activity, commentList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvComment.setLayoutManager(mLayoutManager);
        rvComment.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvComment.setItemAnimator(new DefaultItemAnimator());
        rvComment.setAdapter(photoLikeAdapter);


        prepareLiveChat();
    }


    private void prepareLiveChat() {
        int[] listItem = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };


        Comment comment = new Comment(listItem[0], getString(R.string.nazrul), "@Nazrul", "11.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[1], getString(R.string.jafariqbal), "@Jafor", "11.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[2], getString(R.string.sufiakamal), "@Sufia", "12.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[3], getString(R.string.sarat), "@Shorath", "11.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[4], getString(R.string.samsurrahman), "@Samsur", "2.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[5], getString(R.string.robindronath), "@Farabi", "11.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[6], getString(R.string.humayanahmed), "@Farabi", "2.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[7], getString(R.string.samsurrahman), "@Farabi", "2.36 pm");
        commentList.add(comment);


        photoLikeAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ViewImageActivity.class));
        finish();
    }
}
