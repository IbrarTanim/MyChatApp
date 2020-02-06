package com.rokan.mychat.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.rokan.mychat.R;
import com.rokan.mychat.activities.ViewImageActivity;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HotlistFirstProfileAdapter extends RecyclerView.Adapter<HotlistFirstProfileAdapter.MyViewHolder> {


    private Context mContext;
    private List<UserPhotoBlogs> userPhotoBlogsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView ivHotlistFirstProfile;

        public MyViewHolder(View view) {
            super(view);
            ivHotlistFirstProfile = view.findViewById(R.id.ivHotlistFirstProfile);

        }

    }


    public HotlistFirstProfileAdapter(Context mContext, List<UserPhotoBlogs> userPhotoBlogsList) {
        this.mContext = mContext;
        this.userPhotoBlogsList = userPhotoBlogsList;
    }

    @Override
    public HotlistFirstProfileAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotlist_first_profile_cell, parent, false);
        final HotlistFirstProfileAdapter.MyViewHolder myViewHolder = new HotlistFirstProfileAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final HotlistFirstProfileAdapter.MyViewHolder holder, int position) {
        UserPhotoBlogs userPhotoBlogs = userPhotoBlogsList.get(position);

        Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivHotlistFirstProfile);


    }

    @Override
    public int getItemCount() {
        return userPhotoBlogsList.size();
    }
}
