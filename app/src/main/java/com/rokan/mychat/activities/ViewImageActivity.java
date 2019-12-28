package com.rokan.mychat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rokan.mychat.R;

public class ViewImageActivity extends AppCompatActivity implements View.OnClickListener {

    ViewImageActivity activity;
    ImageView ivTitleShowHide;
    TextView tvTitleChatting;
    boolean isTitleShowed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);
        activity = this;
        ivTitleShowHide = findViewById(R.id.ivTitleShowHide);
        tvTitleChatting = findViewById(R.id.tvTitleChatting);

        ivTitleShowHide.setImageResource(R.drawable.ic_view_text_arrow_icon_up);
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

                    ivTitleShowHide.setImageResource(R.drawable.ic_view_text_arrow_icon_down);
                    tvTitleChatting.setMaxLines(Integer.MAX_VALUE);
                    tvTitleChatting.setEllipsize(null);
                    tvTitleChatting.setText(getString(R.string.chatting_title));
                    //tvTitleChatting.setVerticalScrollBarEnabled(true);
                    //tvTitleChatting.setMovementMethod(new ScrollingMovementMethod());

                    isTitleShowed = false;
                } else {

                    ivTitleShowHide.setImageResource(R.drawable.ic_view_text_arrow_icon_up);
                    tvTitleChatting.setMaxLines(2);
                    tvTitleChatting.setText(getString(R.string.chatting_title));
                    //tvTitleChatting.setVerticalScrollBarEnabled(false);
                    tvTitleChatting.setEllipsize(TextUtils.TruncateAt.END);

                    isTitleShowed = true;
                }

                break;
        }
    }
}
