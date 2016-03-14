package com.code19.bilibili.fragment;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.code19.bilibili.R;
import com.code19.bilibili.adapter.LiveRecyAdpater;
import com.code19.bilibili.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gh0st on 2016/3/12 012.
 */
public class LiveFragment extends BaseFragment {
    private List<String> mData;
    private RecyclerView mRecyclerView;

    @Override
    protected void initData() {
        mData = new ArrayList<>();
        for (int i = 0; i <30; i++) {
            mData.add("Bean:...." + (i * 2));
        }
    }

    @Override
    protected View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.live_fragment, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.live_listview);
        // mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerView.setAdapter(new LiveRecyAdpater(getActivity(), mData));
        return view;
    }

    @Override
    protected void initListener() {

    }


}
