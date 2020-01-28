package com.rokan.mychat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.LandingActivity;
import com.rokan.mychat.activities.PhotoCommentActivity;
import com.rokan.mychat.activities.ViewImageActivity;
import com.rokan.mychat.adapters.LikeAdapter;
import com.rokan.mychat.adapters.PhotoCommentAdapter;
import com.rokan.mychat.pojo.Comment;
import com.rokan.mychat.pojo.Like;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class LikeDialog extends Dialog {

    Context context;

    ViewImageActivity activity;
    private LikeAdapter likeAdapter;
    private RecyclerView rvLike;
    private List<Like> likeList;

    public LikeDialog(ViewImageActivity activity) {
        super(activity, R.style.CustomAlertDialog);
        this.activity = activity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.like_dialog);

        rvLike = findViewById(R.id.rvLike);
        likeList = new ArrayList<>();
        likeAdapter = new LikeAdapter(activity, likeList);


        LinearLayoutManager layoutManager = new LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false);
        rvLike.setLayoutManager(layoutManager);
        rvLike.setAdapter(likeAdapter);

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


        Like like = new Like(listItem[0]);
        likeList.add(like);

        like = new Like(listItem[1]);
        likeList.add(like);

        like = new Like(listItem[2]);
        likeList.add(like);

        like = new Like(listItem[3]);
        likeList.add(like);

        like = new Like(listItem[4]);
        likeList.add(like);

        like = new Like(listItem[5]);
        likeList.add(like);

        like = new Like(listItem[6]);
        likeList.add(like);

        like = new Like(listItem[7]);
        likeList.add(like);

        likeAdapter.notifyDataSetChanged();


    }
}