package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.List;

public class SearchUserAdapter extends RecyclerView.Adapter<SearchUserAdapter.MyViewHolder> {


    private Context mContext;
    private List<UserPhotoBlogs> userPhotoBlogsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView ivSearchUserProfile;
        public CardView searchUserProfileCard;

        public MyViewHolder(View view) {
            super(view);
            ivSearchUserProfile = view.findViewById(R.id.ivSearchUserProfile);
            searchUserProfileCard = view.findViewById(R.id.searchUserProfileCard);

        }

    }


    public SearchUserAdapter(Context mContext, List<UserPhotoBlogs> userPhotoBlogsList) {
        this.mContext = mContext;
        this.userPhotoBlogsList = userPhotoBlogsList;
    }

    @Override
    public SearchUserAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_user_cell, parent, false);
        final SearchUserAdapter.MyViewHolder myViewHolder = new SearchUserAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final SearchUserAdapter.MyViewHolder holder, int position) {
        UserPhotoBlogs userPhotoBlogs = userPhotoBlogsList.get(position);

        Glide.with(mContext).load(userPhotoBlogs.getRoundedUserBlogProfilePic()).into(holder.ivSearchUserProfile);


    }

    @Override
    public int getItemCount() {
        return userPhotoBlogsList.size();
    }
}
