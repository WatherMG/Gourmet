package com.braincraftapps.gourmet.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.braincraftapps.gourmet.fragments.CommentsFragment;
import com.braincraftapps.gourmet.fragments.DescriptionFragment;
import com.braincraftapps.gourmet.fragments.IngredientsFragment;

/**
 * Created by Alex Sysoiev on 16.03.2015.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new DescriptionFragment();

            case 1:
                return new IngredientsFragment();

            case 2:
                return new CommentsFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
