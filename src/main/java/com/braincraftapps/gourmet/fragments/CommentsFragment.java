package com.braincraftapps.gourmet.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.braincraftapps.gourmet.R;

/**
 * Created by Alex Sysoiev on 16.03.2015.
 */
public class CommentsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_settings, container, false);


    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


}
