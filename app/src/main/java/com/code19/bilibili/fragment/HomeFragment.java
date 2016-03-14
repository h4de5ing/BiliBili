package com.code19.bilibili.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import com.code19.bilibili.MainActivity;
import com.code19.bilibili.R;
import com.code19.bilibili.adapter.HomeAdapter;
import com.code19.bilibili.base.BaseFragment;
import com.code19.bilibili.base.Config;

import retrofit2.Retrofit;

/**
 * Created by Gh0st on 2016/3/14 014.
 */
public class HomeFragment extends BaseFragment {
    private String[] Home_title;
    private MainActivity appCompatActivity;
    private Toolbar mToolbar;

    @Override
    protected void initData() {
        Home_title = getActivity().getResources().getStringArray(R.array.home_title);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.API_URL)
                .build();

        //GitHubService service = retrofit.create(GitHubService.class);
    }

    @Override
    protected View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.home_fragment, null);
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        TabLayout tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        setToolbar();
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new HomeAdapter(getActivity().getSupportFragmentManager(), Home_title));
        tablayout.setupWithViewPager(viewPager);
        return view;
    }

    private void setToolbar() {
        appCompatActivity.setSupportActionBar(mToolbar);
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        appCompatActivity = (MainActivity) context;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        appCompatActivity.setupNavigationDrawer(mToolbar);
    }

}
