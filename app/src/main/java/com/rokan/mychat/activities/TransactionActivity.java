package com.rokan.mychat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.BlockUserAdapter;
import com.rokan.mychat.adapters.TransactionAdapter;
import com.rokan.mychat.pojo.LiveChat;
import com.rokan.mychat.pojo.Transaction;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class TransactionActivity extends AppCompatActivity {

    TransactionActivity activity;
    private TransactionAdapter transactionAdapter;
    private RecyclerView rvChatRequest;
    private List<Transaction> transactionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        activity = this;

        rvChatRequest = findViewById(R.id.rvChatRequest);
        transactionList = new ArrayList<>();
        transactionAdapter = new TransactionAdapter(activity, transactionList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvChatRequest.setLayoutManager(mLayoutManager);
        rvChatRequest.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvChatRequest.setItemAnimator(new DefaultItemAnimator());
        rvChatRequest.setAdapter(transactionAdapter);

        prepareLiveChat();
    }


    private void prepareLiveChat() {


        Transaction transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "20 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "620 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "240 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "290 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "206 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "120 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room","01.01.2020  12.25 am", "230 credits");
        transactionList.add(transaction);

        transaction = new Transaction( "Joind Global chat room", "01.01.2020  12.25 am", "250 credits");
        transactionList.add(transaction);


        transactionAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, SettingsActivity.class));
        finish();
    }
}
