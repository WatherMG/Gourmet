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
public class ToolsFragment extends Fragment {

    public ToolsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tools, container, false);
        return rootView;
    }
}
