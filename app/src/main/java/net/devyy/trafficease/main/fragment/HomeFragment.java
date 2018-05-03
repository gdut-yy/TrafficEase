package net.devyy.trafficease.main.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.devyy.trafficease.R;

/**
 * Created by ZYY on 2018/5/2.
 */

public class HomeFragment extends Fragment {
    private String content;

    public HomeFragment() {
        this.content = "（预留）这是HomeFragment";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText(content);
        return view;
    }
}

