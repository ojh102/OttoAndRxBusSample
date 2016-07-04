package com.ojh.ottosample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 01071724654 on 2016-07-04.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_PAGE = 2;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = FragmentOne.newInstance();
                break;
            case 1:
                fragment = FragmentTwo.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_OF_PAGE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "이벤트!";
            case 1:
                return "받아라!";
            default:
                return null;
        }
    }
}
