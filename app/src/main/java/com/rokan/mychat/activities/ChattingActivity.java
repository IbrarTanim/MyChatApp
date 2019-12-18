package com.rokan.mychat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rokan.mychat.R;

public class ChattingActivity extends AppCompatActivity implements View.OnClickListener {

    ChattingActivity activity;
    ImageView ivTitleShowHide;
    TextView tvTitleChatting;
    boolean isTitleShowed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);
        activity = this;
        ivTitleShowHide = findViewById(R.id.ivTitleShowHide);
        tvTitleChatting = findViewById(R.id.tvTitleChatting);

        ivTitleShowHide.setImageResource(android.R.drawable.arrow_up_float);
        tvTitleChatting.setMaxLines(2);
        tvTitleChatting.setVerticalScrollBarEnabled(false);
        tvTitleChatting.setEllipsize(TextUtils.TruncateAt.END);
        tvTitleChatting.setText(getString(R.string.chatting_title));


        ivTitleShowHide.setOnClickListener(this);
        isTitleShowed = true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivTitleShowHide:
                if (isTitleShowed) {

                    ivTitleShowHide.setImageResource(android.R.drawable.arrow_down_float);
                    tvTitleChatting.setMaxLines(Integer.MAX_VALUE);
                    tvTitleChatting.setEllipsize(null);
                    tvTitleChatting.setText(getString(R.string.chatting_title));
                    tvTitleChatting.setVerticalScrollBarEnabled(true);
                    tvTitleChatting.setMovementMethod(new ScrollingMovementMethod());

                    isTitleShowed = false;
                } else {

                    ivTitleShowHide.setImageResource(android.R.drawable.arrow_up_float);
                    tvTitleChatting.setMaxLines(2);
                    tvTitleChatting.setText(getString(R.string.chatting_title));
                    tvTitleChatting.setVerticalScrollBarEnabled(false);
                    tvTitleChatting.setEllipsize(TextUtils.TruncateAt.END);

                    isTitleShowed = true;
                }

                break;
        }
    }
}
