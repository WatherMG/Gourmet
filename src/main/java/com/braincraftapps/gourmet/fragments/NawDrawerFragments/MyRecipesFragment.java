package com.braincraftapps.gourmet.fragments.NawDrawerFragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.braincraftapps.gourmet.R;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class MyRecipesFragment extends Fragment {

    public MyRecipesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_recipes, container, false);
        return rootView;
    }
}
