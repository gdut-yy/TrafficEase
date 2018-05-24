package net.devyy.trafficease.main.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.devyy.trafficease.R;
import net.devyy.trafficease.main.homepage.MoreTypeBean;
import net.devyy.trafficease.main.homepage.NewsRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZYY on 2018/5/2.
 */

public class HomeFragment extends Fragment {

    private RecyclerView mRecy;
    private List<MoreTypeBean> mData;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.module_fragment_homepage,container,false);
        mRecy = (RecyclerView)view.findViewById(R.id.news_recyclerview);
        initData();
        initViewOper();
        return view;
    }

    // 注意：HDEMO 仅为快速展示效果，demo中预先添加8条推送，后续版本中会去除
    private void initData() {
        mData = new ArrayList<>();

        MoreTypeBean hdemo01 = new MoreTypeBean();
        MoreTypeBean hdemo02 = new MoreTypeBean();
        MoreTypeBean hdemo03 = new MoreTypeBean();
        MoreTypeBean hdemo04 = new MoreTypeBean();
        MoreTypeBean hdemo05 = new MoreTypeBean();
        MoreTypeBean hdemo06 = new MoreTypeBean();
        MoreTypeBean hdemo07 = new MoreTypeBean();
        MoreTypeBean hdemo08 = new MoreTypeBean();

        hdemo01.pic=1;hdemo01.type=1;
        hdemo02.pic=1;hdemo02.type=2;
        hdemo03.pic=1;hdemo03.type=3;
        hdemo04.pic=1;hdemo04.type=4;
        hdemo05.pic=1;hdemo05.type=5;
        hdemo06.pic=1;hdemo06.type=6;
        hdemo07.pic=1;hdemo07.type=7;
        hdemo08.pic=1;hdemo08.type=8;

        mData.add(hdemo01);
        mData.add(hdemo02);
        mData.add(hdemo03);
        mData.add(hdemo04);
        mData.add(hdemo05);
        mData.add(hdemo06);
        mData.add(hdemo07);
        mData.add(hdemo08);
    }

    private void initViewOper() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecy.setLayoutManager(linearLayoutManager);
        NewsRecyclerAdapter adapter = new NewsRecyclerAdapter(mData);
        mRecy.setAdapter(adapter);
    }
}

