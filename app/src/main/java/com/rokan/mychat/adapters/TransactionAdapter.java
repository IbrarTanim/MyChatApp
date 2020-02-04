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
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.Transaction;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.MyViewHolder> {


    private Context mContext;
    private List<Transaction> transactionList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvNameTitle, tvChatText, tvChatRequestAccept;
        LinearLayout llLiveChat;

        public MyViewHolder(View view) {
            super(view);
            tvNameTitle = view.findViewById(R.id.tvNameTitle);
            tvChatText = view.findViewById(R.id.tvChatText);
            tvChatRequestAccept = view.findViewById(R.id.tvChatRequestAccept);
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


    public TransactionAdapter(Context mContext, List<Transaction> transactionList) {
        this.mContext = mContext;
        this.transactionList = transactionList;
    }

    @Override
    public TransactionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_cell, parent, false);
        final TransactionAdapter.MyViewHolder myViewHolder = new TransactionAdapter.MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final TransactionAdapter.MyViewHolder holder, int position) {
        Transaction transaction = transactionList.get(position);

        holder.tvNameTitle.setText(transaction.getNameTitle());
        holder.tvChatText.setText(transaction.getCredit());
        holder.tvChatRequestAccept.setText(transaction.getChatTime());

    }


    @Override
    public int getItemCount() {
        return transactionList.size();
    }
}
