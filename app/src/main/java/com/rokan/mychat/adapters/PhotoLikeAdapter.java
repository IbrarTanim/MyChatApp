package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.Comment;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PhotoLikeAdapter extends RecyclerView.Adapter<PhotoLikeAdapter.MyViewHolder> {


    private Context mContext;
    private List<Comment> commentList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNameTitle, tvCommentTitle, tvTimeStamp;
        public CircleImageView civCommentProfilePic;
        LinearLayout llLiveChat;

        public MyViewHolder(View view) {
            super(view);
            tvNameTitle = view.findViewById(R.id.tvNameTitle);
            tvCommentTitle = view.findViewById(R.id.tvCommentTitle);
            tvTimeStamp = view.findViewById(R.id.tvTimeStamp);
            civCommentProfilePic = view.findViewById(R.id.civCommentProfilePic);
        }

    }


    public PhotoLikeAdapter(Context mContext, List<Comment> commentList) {
        this.mContext = mContext;
        this.commentList = commentList;
    }

    @Override
    public PhotoLikeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_like_cell, parent, false);
        final PhotoLikeAdapter.MyViewHolder myViewHolder = new PhotoLikeAdapter.MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final PhotoLikeAdapter.MyViewHolder holder, int position) {
        Comment comment = commentList.get(position);

        holder.tvNameTitle.setText(comment.getNameTitle());
        holder.tvCommentTitle.setText(comment.getCommentTitle());
        holder.tvTimeStamp.setText(comment.getTimeStamp());
        Glide.with(mContext).load(comment.getCommentProfilePic()).into(holder.civCommentProfilePic);

    }


    @Override
    public int getItemCount() {
        return commentList.size();
    }
}
