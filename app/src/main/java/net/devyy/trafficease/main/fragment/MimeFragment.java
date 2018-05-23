package net.devyy.trafficease.main.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.devyy.trafficease.R;
import net.devyy.trafficease.improve.widget.PortraitView;
import net.devyy.trafficease.improve.widget.SolarSystemView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by ZYY on 2018/5/2.
 */

public class MimeFragment extends Fragment {


    @BindView(R.id.user_view_solar_system)
    SolarSystemView userViewSolarSystem;
    @BindView(R.id.iv_logo_setting)
    ImageView ivLogoSetting;
    @BindView(R.id.iv_logo_zxing)
    ImageView ivLogoZxing;
    @BindView(R.id.user_info_head_container)
    FrameLayout userInfoHeadContainer;
    @BindView(R.id.iv_portrait)
    PortraitView ivPortrait;
    @BindView(R.id.iv_gender)
    ImageView ivGender;
    @BindView(R.id.user_info_icon_container)
    FrameLayout userInfoIconContainer;
    @BindView(R.id.tv_nick)
    TextView tvNick;
    @BindView(R.id.tv_avail_score)
    TextView tvAvailScore;
    @BindView(R.id.tv_active_score)
    TextView tvActiveScore;
    @BindView(R.id.rl_show_my_info)
    LinearLayout rlShowMyInfo;
    @BindView(R.id.about_line)
    View aboutLine;
    @BindView(R.id.tv_tweet)
    TextView tvTweet;
    @BindView(R.id.ly_tweet)
    LinearLayout lyTweet;
    @BindView(R.id.tv_favorite)
    TextView tvFavorite;
    @BindView(R.id.ly_favorite)
    LinearLayout lyFavorite;
    @BindView(R.id.tv_following)
    TextView tvFollowing;
    @BindView(R.id.ly_following)
    LinearLayout lyFollowing;
    @BindView(R.id.tv_follower)
    TextView tvFollower;
    @BindView(R.id.user_info_notice_fans)
    TextView userInfoNoticeFans;
    @BindView(R.id.ly_follower)
    LinearLayout lyFollower;
    @BindView(R.id.lay_about_info)
    LinearLayout layAboutInfo;
    @BindView(R.id.user_info_notice_message)
    TextView userInfoNoticeMessage;
    @BindView(R.id.rl_message)
    LinearLayout rlMessage;
    @BindView(R.id.rl_data)
    LinearLayout rlData;
    @BindView(R.id.rl_blog)
    LinearLayout rlBlog;
    @BindView(R.id.rl_info_question)
    LinearLayout rlInfoQuestion;
    @BindView(R.id.rl_info_activities)
    LinearLayout rlInfoActivities;
    @BindView(R.id.rl_team)
    LinearLayout rlTeam;
    Unbinder unbinder;

    public MimeFragment( ) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.module_fragment_mime, container, false);

        unbinder = ButterKnife.bind(this, view);
        hideView();
        return view;
    }

    @Override
    public void onDestroyView( ) {
        super.onDestroyView();
        unbinder.unbind();

    }

    private void hideView() {
        ivPortrait.setImageResource(R.mipmap.widget_default_face);
        tvNick.setText(R.string.user_hint_login);
        tvNick.setTextSize(16.0f);
        ivGender.setVisibility(View.INVISIBLE);
        tvActiveScore.setVisibility(View.INVISIBLE);
        tvAvailScore.setVisibility(View.INVISIBLE);
        layAboutInfo.setVisibility(View.GONE);
        aboutLine.setVisibility(View.GONE);
    }

    @Override
    public void onPause( ) {
        super.onPause();
        hideView();
    }

    @Override
    public void onResume( ) {
        super.onResume();
        hideView();
    }
}
