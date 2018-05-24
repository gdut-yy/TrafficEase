package net.devyy.trafficease.main.homepage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import net.devyy.trafficease.R;

import java.util.List;

/**
 * Created by ZYY on 2018/5/24.
 */

public class NewsRecyclerAdapter extends RecyclerView.Adapter{
    //定义2种常量  表示2种条目类型
//    public static final int TYPE_RIGHT_IMAGE = 1;
//    public static final int TYPE_THREE_IMAGE = 2;

    // 注意：HDEMO 仅为快速展示效果，demo中预先添加8条推送，后续版本中会去除
    public static final int HDEMO_01 = 1;
    public static final int HDEMO_02 = 2;
    public static final int HDEMO_03 = 3;
    public static final int HDEMO_04 = 4;
    public static final int HDEMO_05 = 5;
    public static final int HDEMO_06 = 6;
    public static final int HDEMO_07 = 7;
    public static final int HDEMO_08 = 8;

    private List<MoreTypeBean> mData;

    public NewsRecyclerAdapter(List<MoreTypeBean> data) {
        this.mData = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //创建不同的 ViewHolder
        View view;
        //根据viewtype来创建条目

        // 注意：HDEMO 仅为快速展示效果，demo中预先添加8条推送，后续版本中会去除
        if (viewType == HDEMO_01) {
            view =View.inflate(parent.getContext(), R.layout.demo_item_01,null);
            return new ThreeImageHolder(view);
        } else if(viewType == HDEMO_02){
            view =View.inflate(parent.getContext(),R.layout.demo_item_02,null);
            return new ThreeImageHolder(view);
        } else if(viewType == HDEMO_03){
            view =View.inflate(parent.getContext(),R.layout.demo_item_03,null);
            return new ThreeImageHolder(view);
        } else if(viewType == HDEMO_04){
            view =View.inflate(parent.getContext(),R.layout.demo_item_04,null);
            return new RightImageHolder(view);
        } else if(viewType == HDEMO_05){
            view =View.inflate(parent.getContext(),R.layout.demo_item_05,null);
            return new ThreeImageHolder(view);
        } else if(viewType == HDEMO_06){
            view =View.inflate(parent.getContext(),R.layout.demo_item_06,null);
            return new RightImageHolder(view);
        } else if(viewType == HDEMO_07){
            view =View.inflate(parent.getContext(),R.layout.demo_item_07,null);
            return new ThreeImageHolder(view);
        } else {
            view =View.inflate(parent.getContext(),R.layout.demo_item_08,null);
            return new ThreeImageHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mData != null) {
            return mData.size();
        }
        return 0;
    }

    // 根据条件返回条目的类型
    @Override
    public int getItemViewType(int position) {

        // 注意：HDEMO 仅为快速展示效果，demo中预先添加8条推送，后续版本中会去除
        MoreTypeBean moreTypeBean = mData.get(position);
        if (moreTypeBean.type == 1) {
            return HDEMO_01;
        } else if(moreTypeBean.type == 2) {
            return HDEMO_02;
        } else if(moreTypeBean.type == 3) {
            return HDEMO_03;
        } else if(moreTypeBean.type == 4) {
            return HDEMO_04;
        } else if(moreTypeBean.type == 5) {
            return HDEMO_05;
        } else if(moreTypeBean.type == 6) {
            return HDEMO_06;
        } else if(moreTypeBean.type == 7) {
            return HDEMO_07;
        } else {
            return HDEMO_08;
        }
    }

    /**
     * 创建2种ViewHolder
     */
    private class RightImageHolder extends RecyclerView.ViewHolder {

        public RightImageHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("testingiiiii","RightImageHolder");
                }
            });
        }
    }

    private class ThreeImageHolder extends RecyclerView.ViewHolder {

        public ThreeImageHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("testingiiiii","ThreeImageHolder");
                }
            });
        }
    }
}
