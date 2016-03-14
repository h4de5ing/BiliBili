package com.code19.bilibili;

import android.support.v4.app.Fragment;
import android.util.SparseArray;

import com.code19.bilibili.fragment.DiscoveryFragment;
import com.code19.bilibili.fragment.DramaFragment;
import com.code19.bilibili.fragment.FollowFragment;
import com.code19.bilibili.fragment.LiveFragment;
import com.code19.bilibili.fragment.PartitionFragment;
import com.code19.bilibili.fragment.RecommendFragment;

/**
 * Created by Gh0st on 2016/3/14 014.
 */
public class HomeFragmentFactory {
    private static SparseArray<Fragment> map = new SparseArray<Fragment>();

    public static Fragment getFragment(int position) {
        Fragment fragment = null;
        if (map.get(position, fragment) != null) {
            return map.get(position);
        }
        switch (position) {
            case 0:
                fragment = new LiveFragment();
                break;
            case 1:
                fragment = new DramaFragment();
                break;
            case 2:
                fragment = new RecommendFragment();
                break;
            case 3:
                fragment = new PartitionFragment();
                break;
            case 4:
                fragment = new FollowFragment();
                break;
            case 5:
                fragment = new DiscoveryFragment();
                break;
        }
        return fragment;
    }
}
