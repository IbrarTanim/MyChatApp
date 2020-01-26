package com.rokan.mychat.fragment;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsBaseActivity;

import java.util.ArrayList;
import java.util.List;


public class BangladeshFragment extends Fragment {
    ChatRoomsBaseActivity activity;

    public BangladeshFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangladesh, container, false);
        activity = (ChatRoomsBaseActivity) getActivity();


        return view;
    }


}
