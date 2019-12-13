
package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.HotList;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class HotListAdapter extends RecyclerView.Adapter<HotListAdapter.MyViewHolder> {


    private Context mContext;
    private List<HotList> hotLists;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView civHotListAdd;
        RoundedImageView ivHotListProfilePic;

        public MyViewHolder(View view) {
            super(view);
            ivHotListProfilePic = view.findViewById(R.id.ivHotListProfilePic);
            civHotListAdd = view.findViewById(R.id.civHotListAdd);
        }


    }


    public HotListAdapter(Context mContext, List<HotList> hotLists) {
        this.mContext = mContext;
        this.hotLists = hotLists;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotlist_cell, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        HotList hotList = hotLists.get(position);

        if (position == 0) {
            holder.civHotListAdd.setVisibility(View.VISIBLE);
        } else {
            holder.civHotListAdd.setVisibility(View.GONE);
        }

        Glide.with(mContext).load(hotList.getProfilePic()).into(holder.ivHotListProfilePic);

    }


    @Override
    public int getItemCount() {
        return hotLists.size();
    }
}
