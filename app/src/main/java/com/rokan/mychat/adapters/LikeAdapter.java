package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.Comment;
import com.rokan.mychat.pojo.Like;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.MyViewHolder> {


    private Context mContext;
    private List<Like> likeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView civLikeProfilePic;

        public MyViewHolder(View view) {
            super(view);

            civLikeProfilePic = view.findViewById(R.id.civLikeProfilePic);
        }

    }


    public LikeAdapter(Context mContext, List<Like> likeList) {
        this.mContext = mContext;
        this.likeList = likeList;
    }

    @Override
    public LikeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.like_cell, parent, false);
        final LikeAdapter.MyViewHolder myViewHolder = new LikeAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final LikeAdapter.MyViewHolder holder, int position) {
        Like like = likeList.get(position);
        Glide.with(mContext).load(like.getLikeProfilePic()).into(holder.civLikeProfilePic);

    }


    @Override
    public int getItemCount() {
        return likeList.size();
    }
}
