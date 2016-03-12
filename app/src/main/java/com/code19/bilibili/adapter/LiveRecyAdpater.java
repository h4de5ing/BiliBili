package com.code19.bilibili.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.code19.bilibili.R;

import java.util.List;

/**
 * Created by Gh0st on 2016/3/12 012.
 */
public class LiveRecyAdpater extends RecyclerView.Adapter<LiveRecyAdpater.NormalViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private List<String> mData;

    public LiveRecyAdpater(Context context, List<String> data) {
        mContext = context;
        mData = data;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NormalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalViewHolder(mLayoutInflater.inflate(R.layout.live_item, parent, false));
    }

    @Override
    public void onBindViewHolder(NormalViewHolder holder, int position) {
        holder.mTextView.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NormalViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public NormalViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.live_item);
        }
    }
}
