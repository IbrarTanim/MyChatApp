package com.rokan.mychat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsBaseActivity;


public class GlobalFragment extends Fragment {
    ChatRoomsBaseActivity activity;

    public GlobalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_global, container, false);
        activity = (ChatRoomsBaseActivity) getActivity();


        return view;
    }


}
