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
public class DescriptionFragment extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_category, container, false);

        return rootView;

    }
}