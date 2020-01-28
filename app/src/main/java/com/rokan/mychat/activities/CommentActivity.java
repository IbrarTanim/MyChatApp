package com.rokan.mychat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.rokan.mychat.R;
import com.rokan.mychat.adapters.ActiveUserAdapter;
import com.rokan.mychat.adapters.CommentAdapter;
import com.rokan.mychat.pojo.ActiveUser;
import com.rokan.mychat.pojo.Comment;
import com.rokan.mychat.utilities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    CommentActivity activity;
    private CommentAdapter commentAdapter;
    private RecyclerView rvComment;
    private List<Comment> commentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        activity = this;

        rvComment = findViewById(R.id.rvComment);
        commentList = new ArrayList<>();
        commentAdapter = new CommentAdapter(activity, commentList);

        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(activity, 1);
        rvComment.setLayoutManager(mLayoutManager);
        rvComment.addItemDecoration(new GridSpacingItemDecoration(1, GridSpacingItemDecoration.dpToPx(10, activity), true));
        rvComment.setItemAnimator(new DefaultItemAnimator());
        rvComment.setAdapter(commentAdapter);
*/


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL);
        rvComment.setLayoutManager(staggeredGridLayoutManager);
        rvComment.setAdapter(commentAdapter);



        prepareLiveChat();
    }


    private void prepareLiveChat() {
        int[] listItem = new int[]{
                R.mipmap.chatting,
                R.mipmap.humayunahmed,
                R.mipmap.find_your_love,
                R.mipmap.anisul,
                R.mipmap.find_friends,
                R.mipmap.jaforiqbal,
                R.mipmap.taking_photo,
                R.mipmap.samsurrahman,
        };


        Comment comment = new Comment(listItem[0], getString(R.string.nazrul), "Hi, Farabi", "11.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[1], getString(R.string.jafariqbal), "The government has been asked to appoint the candidates at their respective posts within 60 days of receiving the High Court judgement. The HC bench of Justice MD Ashraful Kamal and Justice Razik-al-Jalil gave the verdict after hearing three separate writ petitions filed by the deprived candidates, challenging the legality of the government decision.", "9.32 pm");
        commentList.add(comment);

        comment = new Comment(listItem[2], getString(R.string.sufiakamal), "How are you?", "12.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[3], getString(R.string.sarat), "তিনটি বিমানবন্দর, দুটি সমুদ্রবন্দরসহ দেশের ২৪টি প্রবেশপথে নেয়া হয়েছে নিরাপত্তামূলক ব্যবস্থা। খোলা হয়েছে হেলথ ডেস্ক। শাহজালাল আন্তর্জাতিক বিমানবন্দরে ইতিমধ্যে চীন ফেরত ২৪৭০ জন যাত্রীর স্বাস্থ্য পরীক্ষা করা হয়েছে।", "8.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[4], getString(R.string.samsurrahman), "I'm also fine.", "2.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[5], getString(R.string.robindronath), "তিনটি বিমানবন্দর, দুটি সমুদ্রবন্দরসহ দেশের ২৪টি প্রবেশপথে নেয়া হয়েছে নিরাপত্তামূলক ব্যবস্থা। খোলা হয়েছে হেলথ ডেস্ক। শাহজালাল আন্তর্জাতিক বিমানবন্দরে ইতিমধ্যে চীন ফেরত ২৪৭০ জন যাত্রীর স্বাস্থ্য পরীক্ষা করা হয়েছে।", "2.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[6], getString(R.string.humayanahmed), "Hello, Farabi", "2.36 pm");
        commentList.add(comment);

        comment = new Comment(listItem[7], getString(R.string.samsurrahman), "Hi, Fahad", "2.36 pm");
        commentList.add(comment);


        commentAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity, ChatRoomsBaseActivity.class));
        finish();
    }
}
