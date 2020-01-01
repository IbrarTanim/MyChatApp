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
import com.rokan.mychat.pojo.PrivateChat;
import com.rokan.mychat.pojo.UserPhotoBlogs;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PrivateChatAdapter extends RecyclerView.Adapter<PrivateChatAdapter.MyViewHolder> {


    private Context mContext;
    private List<PrivateChat> privateChatList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView rivPrivateChatImage;

        public MyViewHolder(View view) {
            super(view);
            rivPrivateChatImage = view.findViewById(R.id.rivPrivateChatImage);

        }

    }

    public PrivateChatAdapter(Context mContext, List<PrivateChat> privateChatList) {
        this.mContext = mContext;
        this.privateChatList = privateChatList;
    }

    @Override
    public PrivateChatAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.private_chat_cell, parent, false);
        final PrivateChatAdapter.MyViewHolder myViewHolder = new PrivateChatAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final PrivateChatAdapter.MyViewHolder holder, int position) {
        PrivateChat privateChat = privateChatList.get(position);
        Glide.with(mContext).load(privateChat.getRoundedPrivateChatPic()).into(holder.rivPrivateChatImage);
    }

    @Override
    public int getItemCount() {
        return privateChatList.size();
    }
}
