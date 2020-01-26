package com.rokan.mychat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rokan.mychat.R;
import com.rokan.mychat.activities.ChatRoomsBaseActivity;


public class FriendsFragment extends Fragment {
    ChatRoomsBaseActivity activity;

    public FriendsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        activity = (ChatRoomsBaseActivity) getActivity();


        return view;
    }


}
