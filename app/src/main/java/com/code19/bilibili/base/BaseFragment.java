package com.code19.bilibili.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gh0st on 2016/3/12 012.
 */
public abstract class BaseFragment extends Fragment {
    private View mRootView;
    public Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        mContext = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = initView(inflater);
        return mRootView;
    }

    public View getRootView() {
        return mRootView != null ? mRootView : null;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initListener();
    }

    protected abstract void initData();

    protected abstract View initView(LayoutInflater inflater);

    protected abstract void initListener();
}
