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

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PhotoBlockAdapter extends RecyclerView.Adapter<PhotoBlockAdapter.MyViewHolder> {


    private Context mContext;
    private List<LiveChat> liveChatList;

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


    public PhotoBlockAdapter(Context mContext, List<LiveChat> liveChatList) {
        this.mContext = mContext;
        this.liveChatList = liveChatList;
    }

    @Override
    public PhotoBlockAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        final PhotoBlockAdapter.MyViewHolder myViewHolder = new PhotoBlockAdapter.MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final PhotoBlockAdapter.MyViewHolder holder, int position) {
        LiveChat liveChat = liveChatList.get(position);

        holder.tvNameTitle.setText(liveChat.getNameTitle());
        holder.tvChatText.setText(liveChat.getChatText());
        holder.tvChatTime.setText(liveChat.getChatTime());
        Glide.with(mContext).load(liveChat.getLivProfilePic()).into(holder.civLiveChatProfilePic);

    }


    @Override
    public int getItemCount() {
        return liveChatList.size();
    }
}
