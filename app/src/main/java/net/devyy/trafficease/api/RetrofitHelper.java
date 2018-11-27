package net.devyy.trafficease.api;

import net.devyy.trafficease.api.remote.TrafficEaseApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ZYY on 2018/2/27.
 */

public class RetrofitHelper {
    // 校园网 Ip 地址
//    private final static String serverIp= "http://169.254.42.232:9997/";

    // 腾讯云 Ip
    private final static String serverIp= "http://193.112.86.171:9997/";

    private Retrofit retrofit;
    private TrafficEaseApi easeApi;
    public TrafficEaseApi getTeApi( ){
        //加上之前 @POST（）里的地址 组成完整的接口url
        retrofit=new Retrofit.Builder()
                .baseUrl(serverIp)
                .addConverterFactory(GsonConverterFactory.create())
                .build();//增加返回值为实体类的支持
        //创建service
        return retrofit.create(TrafficEaseApi.class);
    }
}
