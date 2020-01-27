package com.rokan.mychat.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rokan.mychat.R;
import com.rokan.mychat.activities.PrivateChatActivity;
import com.rokan.mychat.pojo.ActiveUser;
import com.rokan.mychat.pojo.LiveChat;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActiveUserAdapter extends RecyclerView.Adapter<ActiveUserAdapter.MyViewHolder> {


    private Context mContext;
    private List<ActiveUser> activeUserList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvNameTitle, tvChatText, tvChatRequestAccept;
        public CircleImageView civLiveChatProfilePic;
        LinearLayout llLiveChat;

        public MyViewHolder(View view) {
            super(view);
            tvNameTitle = view.findViewById(R.id.tvNameTitle);
            tvChatText = view.findViewById(R.id.tvChatText);
            tvChatRequestAccept = view.findViewById(R.id.tvChatRequestAccept);
            civLiveChatProfilePic = view.findViewById(R.id.civLiveChatProfilePic);
            llLiveChat = view.findViewById(R.id.llLiveChat);
            llLiveChat.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.llLiveChat:
                    mContext.startActivity(new Intent(mContext, PrivateChatActivity.class));
                    break;
            }

        }
    }


    public ActiveUserAdapter(Context mContext, List<ActiveUser> activeUserList) {
        this.mContext = mContext;
        this.activeUserList = activeUserList;
    }

    @Override
    public ActiveUserAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.active_user_cell, parent, false);
        final ActiveUserAdapter.MyViewHolder myViewHolder = new ActiveUserAdapter.MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final ActiveUserAdapter.MyViewHolder holder, int position) {
        ActiveUser activeUser = activeUserList.get(position);

        holder.tvNameTitle.setText(activeUser.getNameTitle());
        Glide.with(mContext).load(activeUser.getLivProfilePic()).into(holder.civLiveChatProfilePic);

    }


    @Override
    public int getItemCount() {
        return activeUserList.size();
    }
}
