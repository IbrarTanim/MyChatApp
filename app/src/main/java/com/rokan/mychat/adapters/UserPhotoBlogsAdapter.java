package com.rokan.mychat.adapters;

import android.content.Context;
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
        public CardView userPhotoBlogCard;

        public MyViewHolder(View view) {
            super(view);

            ivUserProPicPhotoBlog = view.findViewById(R.id.ivUserProPicPhotoBlog);
            userPhotoBlogCard = view.findViewById(R.id.userPhotoBlogCard);
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


        //Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);

        if (position % 4 == 0) {
            holder.userPhotoBlogCard.setBackground(mContext.getResources().getDrawable(R.drawable.card_bottom_right));
            holder.ivUserProPicPhotoBlog.setCornerRadius(40, 40, 40, 0);
            Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);


        } else if (position % 4 == 1) {
            holder.userPhotoBlogCard.setBackground(mContext.getResources().getDrawable(R.drawable.card_bottom_left));
            holder.ivUserProPicPhotoBlog.setCornerRadius(40, 40, 0, 40);
            Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);

        } else if (position % 4 == 2) {
            holder.userPhotoBlogCard.setBackground(mContext.getResources().getDrawable(R.drawable.card_top_right));
            holder.ivUserProPicPhotoBlog.setCornerRadius(40, 0, 40, 40);
            Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);

        } else if (position % 4 == 3) {
            holder.userPhotoBlogCard.setBackground(mContext.getResources().getDrawable(R.drawable.card_top_left));
            holder.ivUserProPicPhotoBlog.setCornerRadius(0, 40, 40, 40);
            Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivUserProPicPhotoBlog);

        }

    }

    @Override
    public int getItemCount() {
        return userPhotoBlogsList.size();
    }
}
