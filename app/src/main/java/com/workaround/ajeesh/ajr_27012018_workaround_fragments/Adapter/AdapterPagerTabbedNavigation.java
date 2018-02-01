package com.workaround.ajeesh.ajr_27012018_workaround_fragments.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTabbedOne;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Fragments.FragmentTabbedTwo;
import com.workaround.ajeesh.ajr_27012018_workaround_fragments.Helpers.LogHelper;

/**
 * Package Name : com.workaround.ajeesh.ajr_27012018_workaround_fragments.Adapter
 * Created by ajesh on 31-01-2018.
 * Project Name : AJR-27012018-WORKAROUND-FRAGMENTS
 */

public class AdapterPagerTabbedNavigation extends FragmentPagerAdapter {
    private String logName = "WWF-ADP-PGR-TAB";
    private int mNumOfTabs;


    public AdapterPagerTabbedNavigation(FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);
        mNumOfTabs = tabCount;
        LogHelper.LogThreadId(logName, "Pager Adapter - Tabbed Navigation - Initiated");
    }

    @Override
    public Fragment getItem(int position) {
        Fragment theFragment = null;
        LogHelper.LogThreadId(logName, "Pager Adapter - Tabbed Navigation - Selected Position : " + position);
        switch (position) {
            case 0:
                theFragment = new FragmentTabbedOne();
                LogHelper.LogThreadId(logName, "Pager Adapter - Tabbed Navigation - Fragment Selected : " + theFragment);
                return theFragment;

            case 1:
                theFragment = new FragmentTabbedTwo();
                LogHelper.LogThreadId(logName, "Pager Adapter - Tabbed Navigation - Fragment Selected : " + theFragment);
                return theFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
