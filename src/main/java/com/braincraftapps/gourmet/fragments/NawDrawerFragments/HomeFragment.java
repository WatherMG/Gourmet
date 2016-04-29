package com.braincraftapps.gourmet.fragments.NawDrawerFragments;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.adapter.TabsPagerAdapter;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class HomeFragment extends android.support.v4.app.Fragment {

    private ViewPager mViewPager;
    private TabWidget mTabWidget;
    private TabHost mTabHost;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mViewPager = (ViewPager) container.findViewById(R.id.pager);
        mTabWidget = (TabWidget) container.findViewById(android.R.id.tabs);
        mTabHost = (TabHost) container.findViewById(android.R.id.tabhost);

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TabsPagerAdapter mPagerAdapter = new TabsPagerAdapter(getFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);

        mTabWidget.setStripEnabled(false);
        mTabWidget.setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setup();
        String[] nameArray = {"Все подряд","Что-то","Что-то еще"};

        for (int i = 0; i < mPagerAdapter.getCount(); i++) {
            mTabHost.addTab(mTabHost
                    .newTabSpec(String.valueOf(nameArray[i]))
                    .setIndicator(mPagerAdapter.getPageTitle(i))
                    .setContent(android.R.id.tabcontent));
        }

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                mViewPager.setCurrentItem(Integer.valueOf(tabId));
            }
        });

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mTabHost.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
