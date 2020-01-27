package com.rokan.mychat.fragment;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsBaseActivity;
import com.rokan.mychat.dialog.ChatDialog;
import com.rokan.mychat.dialog.DialogControl;


public class BangladeshFragment extends Fragment implements View.OnClickListener {
    ChatRoomsBaseActivity activity;
    RelativeLayout rlTextAnother;

    public BangladeshFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangladesh, container, false);
        activity = (ChatRoomsBaseActivity) getActivity();

        rlTextAnother = view.findViewById(R.id.rlTextAnother);
        rlTextAnother.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rlTextAnother:
                ChatDialog chatDialog = new ChatDialog(activity);
                DialogControl.ShowDialog(activity, chatDialog);
                break;
        }
    }
}
