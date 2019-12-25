package com.rokan.mychat.adapters;

import android.content.Context;
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
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserPhotoBlogsAdapter extends RecyclerView.Adapter<UserPhotoBlogsAdapter.MyViewHolder> {


    private Context mContext;
    private List<UserPhotoBlogs> userPhotoBlogsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView ivUserProPicPhotoBlog;

        public MyViewHolder(View view) {
            super(view);

            ivUserProPicPhotoBlog = view.findViewById(R.id.ivUserProPicPhotoBlog);
        }

    }


    public UserPhotoBlogsAdapter(Context mContext, List<UserPhotoBlogs> userPhotoBlogsList) {
        this.mContext = mContext;
        this.userPhotoBlogsList = userPhotoBlogsList;
    }

    @Override
    public UserPhotoBlogsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_photo_blogs_cell, parent, false);
        final UserPhotoBlogsAdapter.MyViewHolder myViewHolder = new UserPhotoBlogsAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final UserPhotoBlogsAdapter.MyViewHolder holder, int position) {
        UserPhotoBlogs userPhotoBlogs = userPhotoBlogsList.get(position);

        Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);

    }

    @Override
    public int getItemCount() {
        return userPhotoBlogsList.size();
    }
}
