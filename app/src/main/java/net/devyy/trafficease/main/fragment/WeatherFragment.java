package net.devyy.trafficease.main.fragment;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import net.devyy.trafficease.R;
import net.devyy.trafficease.main.heweather.bean.HeweatherBean;
import net.devyy.trafficease.main.heweather.util.HttpUtil;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by ZYY on 2018/5/2.
 */

public class WeatherFragment extends Fragment {

    @BindView(R.id.comf_text)
    TextView comfText;
    @BindView(R.id.drsg_text)
    TextView drsgText;
    @BindView(R.id.flu_text)
    TextView fluText;
    @BindView(R.id.sport_text)
    TextView sportText;
    @BindView(R.id.trav_text)
    TextView travText;
    @BindView(R.id.uv_text)
    TextView uvText;
    @BindView(R.id.cw_text)
    TextView cwText;
    @BindView(R.id.air_text)
    TextView airText;
    Unbinder unbinder;

    public SwipeRefreshLayout swipeRefresh;
    private ScrollView weatherLayout;
    private Button navButton;
    private TextView titleCity;
    private TextView titleUpdateTime;
    private TextView degreeText;
    private TextView weatherInfoText;
    private LinearLayout hourlyLayout;
    private LinearLayout forecastLayout;
    private ImageView bingPicImg;
    private String mWeatherId;

    private Gson gson = new Gson();

    public WeatherFragment( ) {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.module_fragment_weather, container, false);

        // 初始化各控件
        bingPicImg = (ImageView) view.findViewById(R.id.bing_pic_img);
        weatherLayout = (ScrollView) view.findViewById(R.id.weather_layout);
        titleCity = (TextView) view.findViewById(R.id.title_city);
        titleUpdateTime = (TextView) view.findViewById(R.id.title_update_time);
        degreeText = (TextView) view.findViewById(R.id.degree_text);
        weatherInfoText = (TextView) view.findViewById(R.id.weather_info_text);
        hourlyLayout= (LinearLayout) view.findViewById(R.id.hourly_layout);
        forecastLayout = (LinearLayout) view.findViewById(R.id.forecast_layout);
        swipeRefresh = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
        swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
        navButton = (Button) view.findViewById(R.id.nav_button);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String weatherString = prefs.getString("HeWeather6", null);
        if (weatherString != null) {
            // 有缓存时直接解析天气数据
            HeweatherBean heweatherBean = gson.fromJson(weatherString, HeweatherBean.class);
            HeweatherBean.HeWeather6Bean heWeather6Bean = heweatherBean.getHeWeather6().get(0);
            mWeatherId = heWeather6Bean.getBasic().getCid();
            showWeatherInfo(heWeather6Bean);
        } else {
            // 无缓存时去服务器查询天气
//            mWeatherId = getIntent().getStringExtra("weather_id");
            mWeatherId = "CN101280102";
            weatherLayout.setVisibility(View.INVISIBLE);
            requestWeather(mWeatherId);
        }
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh( ) {
                requestWeather(mWeatherId);
            }
        });
        // navButton 功能保留
        navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                drawerLayout.openDrawer(GravityCompat.START);
                Toast.makeText(getActivity(), "城市选择接口（待实现）", Toast.LENGTH_SHORT).show();
            }
        });
        String bingPic = prefs.getString("bing_pic", null);
        if (bingPic != null) {
            Glide.with(this).load(bingPic).into(bingPicImg);
        } else {
            loadBingPic();
        }
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    /**
     * 根据天气id请求城市天气信息。
     */
    public void requestWeather(final String weatherId) {
        String weatherUrl = "https://free-api.heweather.com/s6/weather?location=" + weatherId + "&key=ee1491e93c5d4e019a5f320c05aa59d9";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                Log.d("json", responseText);
//                final HeweatherBean heweatherBean = Utility.handleWeatherResponse(responseText);
                final HeweatherBean heweatherBean = gson.fromJson(responseText, HeweatherBean.class);
                final HeweatherBean.HeWeather6Bean heWeather6Bean = heweatherBean.getHeWeather6().get(0);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run( ) {
                        if (heWeather6Bean != null && "ok".equals(heWeather6Bean.getStatus())) {
                            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                            editor.putString("weather", responseText);
                            editor.apply();
                            mWeatherId = heWeather6Bean.getBasic().getCid();
                            showWeatherInfo(heWeather6Bean);
                        } else {
                            Toast.makeText(getActivity(), "获取天气信息失败", Toast.LENGTH_SHORT).show();
                        }
                        swipeRefresh.setRefreshing(false);
                    }
                });
            }

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run( ) {
                        Toast.makeText(getActivity(), "获取天气信息失败", Toast.LENGTH_SHORT).show();
                        swipeRefresh.setRefreshing(false);
                    }
                });
            }
        });
        loadBingPic();
    }

    /**
     * 加载必应每日一图
     */
    private void loadBingPic( ) {
        String requestBingPic = "http://guolin.tech/api/bing_pic";
        HttpUtil.sendOkHttpRequest(requestBingPic, new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String bingPic = response.body().string();
                SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                editor.putString("bing_pic", bingPic);
                editor.apply();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run( ) {
                        Glide.with(WeatherFragment.this).load(bingPic).into(bingPicImg);
                    }
                });
            }

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * 处理并展示 HeweatherBean 实体类中的数据。
     */
    private void showWeatherInfo(HeweatherBean.HeWeather6Bean heWeather6Bean) {
        // 地区／城市名称
        String cityName = heWeather6Bean.getBasic().getLocation();
        // 接口更新时间
        String updateTime = heWeather6Bean.getUpdate().getLoc().split(" ")[1];
        // 温度，默认单位：摄氏度
        String degree = heWeather6Bean.getNow().getTmp() + "℃";
        // 实况天气状况
        String weatherInfo = heWeather6Bean.getNow().getCond_txt();

        titleCity.setText(cityName);
        titleUpdateTime.setText("更新时间：" + updateTime);
        degreeText.setText(degree);
        weatherInfoText.setText(weatherInfo);


        // 逐三小时预报 Title部分
        hourlyLayout.removeAllViews();
        View hourlyviewt = LayoutInflater.from(getActivity()).inflate(R.layout.hourly_item, hourlyLayout, false);
        TextView timeTextt = (TextView) hourlyviewt.findViewById(R.id.time_text);
        TextView tmpTexttt = (TextView) hourlyviewt.findViewById(R.id.tmp_text);
        TextView condTextt = (TextView) hourlyviewt.findViewById(R.id.cond_text);
        TextView winddirTextt = (TextView) hourlyviewt.findViewById(R.id.wind_dir_text);
        TextView windscTextt = (TextView) hourlyviewt.findViewById(R.id.wind_sc_text);
        timeTextt.setText("预报时间");
        tmpTexttt.setText("温度");
        condTextt.setText("天气");
        winddirTextt.setText("风向");
        windscTextt.setText("风力");
        hourlyLayout.addView(hourlyviewt);
        // 逐三小时预报 子部分
        for (HeweatherBean.HeWeather6Bean.HourlyBean hourlyBean : heWeather6Bean.getHourly()) {
            View hourlyview = LayoutInflater.from(getActivity()).inflate(R.layout.hourly_item, hourlyLayout, false);
            TextView timeText = (TextView) hourlyview.findViewById(R.id.time_text);
            TextView tmpText = (TextView) hourlyview.findViewById(R.id.tmp_text);
            TextView condText = (TextView) hourlyview.findViewById(R.id.cond_text);
            TextView winddirText = (TextView) hourlyview.findViewById(R.id.wind_dir_text);
            TextView windscText = (TextView) hourlyview.findViewById(R.id.wind_sc_text);
            timeText.setText(hourlyBean.getTime());
            tmpText.setText(hourlyBean.getTmp());
            condText.setText(hourlyBean.getCond_txt());
            winddirText.setText(hourlyBean.getWind_dir());
            windscText.setText(hourlyBean.getWind_sc());
            hourlyLayout.addView(hourlyview);
        }


        // 七天预报 Title部分
        forecastLayout.removeAllViews();
        View viewt = LayoutInflater.from(getActivity()).inflate(R.layout.forecast_item, forecastLayout, false);
        TextView dateTextt = (TextView) viewt.findViewById(R.id.date_text);
        TextView conddTextt = (TextView) viewt.findViewById(R.id.condd_text);
        TextView condnTextt = (TextView) viewt.findViewById(R.id.condn_text);
        TextView maxTextt = (TextView) viewt.findViewById(R.id.max_text);
        TextView minTextt = (TextView) viewt.findViewById(R.id.min_text);
        dateTextt.setText("预报日期");
        conddTextt.setText("白天");
        condnTextt.setText("晚间");
        maxTextt.setText("最高温");
        minTextt.setText("最低温");
        forecastLayout.addView(viewt);
        // 七天预报 子部分
        for (HeweatherBean.HeWeather6Bean.DailyForecastBean dailyForecastBean : heWeather6Bean.getDaily_forecast()) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.forecast_item, forecastLayout, false);
            TextView dateText = (TextView) view.findViewById(R.id.date_text);
            TextView conddText = (TextView) view.findViewById(R.id.condd_text);
            TextView condnText = (TextView) view.findViewById(R.id.condn_text);
            TextView maxText = (TextView) view.findViewById(R.id.max_text);
            TextView minText = (TextView) view.findViewById(R.id.min_text);
            dateText.setText(dailyForecastBean.getDate());
            conddText.setText(dailyForecastBean.getCond_txt_d());
            condnText.setText(dailyForecastBean.getCond_txt_n());
            maxText.setText(dailyForecastBean.getTmp_max());
            minText.setText(dailyForecastBean.getTmp_min());
            forecastLayout.addView(view);
        }


        // 生活指数 部分
        comfText.setText("舒适度指数：" + heWeather6Bean.getLifestyle().get(0).getTxt());
        drsgText.setText("穿衣指数：" + heWeather6Bean.getLifestyle().get(1).getTxt());
        fluText.setText("感冒指数：" + heWeather6Bean.getLifestyle().get(2).getTxt());
        sportText.setText("运动指数：" + heWeather6Bean.getLifestyle().get(3).getTxt());
        travText.setText("旅游指数：" + heWeather6Bean.getLifestyle().get(4).getTxt());
        uvText.setText("紫外线指数：" + heWeather6Bean.getLifestyle().get(5).getTxt());
        cwText.setText("洗车指数：" + heWeather6Bean.getLifestyle().get(6).getTxt());
        airText.setText("空气污染扩散条件指数：" + heWeather6Bean.getLifestyle().get(7).getTxt());
        weatherLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDestroyView( ) {
        super.onDestroyView();
        unbinder.unbind();
    }
}
