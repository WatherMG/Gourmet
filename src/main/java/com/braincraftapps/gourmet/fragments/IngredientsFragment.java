package com.braincraftapps.gourmet.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.braincraftapps.gourmet.R;

public class IngredientsFragment extends Fragment {


    public IngredientsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.recipes_list_item, container, false);

    }
}
