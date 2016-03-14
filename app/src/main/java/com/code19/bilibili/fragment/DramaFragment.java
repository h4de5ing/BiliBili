package com.code19.bilibili.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.code19.bilibili.base.BaseFragment;

/**
 * Created by Gh0st on 2016/3/14 014.
 */
public class DramaFragment extends BaseFragment {
    @Override
    protected void initData() {

    }

    @Override
    protected View initView(LayoutInflater inflater) {
        TextView tv = new TextView(getActivity());
        tv.setText("番剧");
        return tv;
    }

    @Override
    protected void initListener() {

    }
}
