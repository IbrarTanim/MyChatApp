package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        public TextView tvNameTitle, tvChatText, tvChatTime;
        public CircleImageView civLiveChatProfilePic;

        public MyViewHolder(View view) {
            super(view);
            tvNameTitle = view.findViewById(R.id.tvNameTitle);
            tvChatText = view.findViewById(R.id.tvChatText);
            tvChatTime = view.findViewById(R.id.tvChatTime);
            civLiveChatProfilePic = view.findViewById(R.id.civLiveChatProfilePic);
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

        /*holder.tvNameTitle.setText(liveChat.getNameTitle());
        holder.tvChatText.setText(liveChat.getChatText());
        holder.tvChatTime.setText(liveChat.getChatTime());
        Glide.with(mContext).load(liveChat.getLivProfilePic()).into(holder.civLiveChatProfilePic);*/

    }


    @Override
    public int getItemCount() {
        return photoBlogsList.size();
    }
}
