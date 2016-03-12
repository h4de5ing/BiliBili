package com.code19.bilibili;


import android.support.v4.app.Fragment;
import android.util.SparseArray;

import com.code19.bilibili.fragment.LiveFragment;


/**
 * Created by Gh0st on 2016/3/12 012.
 */
public class FragmentFactory {
    private static SparseArray<Fragment> map = new SparseArray<Fragment>();

    public static Fragment getFragment(int positon) {
        Fragment fragment = null;
        if (map.get(positon, fragment) != null) {
            return map.get(positon);
        }
        switch (positon) {
            case 0:
                fragment=new LiveFragment();
                break;
            case 1:
                fragment=new LiveFragment();
                break;
            case 2:
                fragment=new LiveFragment();
                break;
            case 3:
                fragment=new LiveFragment();
                break;
            case 4:
                fragment=new LiveFragment();
                break;
            case 5:
                fragment=new LiveFragment();
                break;
        }
        return fragment;
    }
}
