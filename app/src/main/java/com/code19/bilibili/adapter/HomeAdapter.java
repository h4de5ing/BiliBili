package com.code19.bilibili.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.code19.bilibili.HomeFragmentFactory;

/**
 * Created by Gh0st on 2016/3/12 012.
 */
public class HomeAdapter extends FragmentPagerAdapter {
    private String[] title;


    public HomeAdapter(FragmentManager fm, String[] home_title) {
        super(fm);
        this.title = home_title;
    }

    @Override
    public Fragment getItem(int position) {
        return HomeFragmentFactory.getFragment(position);
    }

    @Override
    public int getCount() {
        return title.length != 0 ? title.length : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
