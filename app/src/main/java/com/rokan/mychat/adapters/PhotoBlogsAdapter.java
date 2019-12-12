package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.PhotoBlogs;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PhotoBlogsAdapter extends RecyclerView.Adapter<PhotoBlogsAdapter.MyViewHolder> {


    private Context mContext;
    private List<PhotoBlogs> photoBlogsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvUserName, tvTitle, tvView, tvComment, tvLike, tvLove;
        public ImageView ivProPicPhotoBlog;

        public MyViewHolder(View view) {
            super(view);
            tvUserName = view.findViewById(R.id.tvUserName);
            tvTitle = view.findViewById(R.id.tvTitle);
            tvView = view.findViewById(R.id.tvView);
            tvComment = view.findViewById(R.id.tvComment);
            tvLike = view.findViewById(R.id.tvLike);
            tvLove = view.findViewById(R.id.tvLove);
            ivProPicPhotoBlog = view.findViewById(R.id.ivProPicPhotoBlog);
        }


    }


    public PhotoBlogsAdapter(Context mContext, List<PhotoBlogs> photoBlogsList) {
        this.mContext = mContext;
        this.photoBlogsList = photoBlogsList;
    }

    @Override
    public PhotoBlogsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_blogs_cell, parent, false);
        final PhotoBlogsAdapter.MyViewHolder myViewHolder = new PhotoBlogsAdapter.MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final PhotoBlogsAdapter.MyViewHolder holder, int position) {
        PhotoBlogs photoBlogs = photoBlogsList.get(position);

        holder.tvUserName.setText(photoBlogs.getUserName());
        holder.tvTitle.setText(photoBlogs.getTitle());
        holder.tvView.setText(photoBlogs.getView());
        holder.tvComment.setText(photoBlogs.getComment());
        holder.tvLike.setText(photoBlogs.getLike());
        holder.tvLove.setText(photoBlogs.getLove());

        Glide.with(mContext).load(photoBlogs.getPhotoBlogProfilePic()).into(holder.ivProPicPhotoBlog);

    }


    @Override
    public int getItemCount() {
        return photoBlogsList.size();
    }
}
