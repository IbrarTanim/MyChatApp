package com.rokan.mychat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rokan.mychat.R;
import com.rokan.mychat.pojo.Activities;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.MyViewHolder> {


    private Context mContext;
    private List<Activities> activitiesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvActivitiesName, tvActivitiesTime;
        public CircleImageView civActivitiesProfilePic;

        public MyViewHolder(View view) {
            super(view);
            tvActivitiesName = view.findViewById(R.id.tvActivitiesName);
            tvActivitiesTime = view.findViewById(R.id.tvActivitiesTime);
            civActivitiesProfilePic = view.findViewById(R.id.civActivitiesProfilePic);
        }


    }


    public ActivitiesAdapter(Context mContext, List<Activities> activitiesList) {
        this.mContext = mContext;
        this.activitiesList = activitiesList;
    }

    @Override
    public ActivitiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activities_cell, parent, false);
        final ActivitiesAdapter.MyViewHolder myViewHolder = new ActivitiesAdapter.MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final ActivitiesAdapter.MyViewHolder holder, int position) {
        Activities activities = activitiesList.get(position);






    }


    @Override
    public int getItemCount() {
        return activitiesList.size();
    }
}
