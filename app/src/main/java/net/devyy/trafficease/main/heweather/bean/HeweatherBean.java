package net.devyy.trafficease.main.heweather.bean;

import java.util.List;

/**
 * 和风天气常规天气数据集合实体类（由 Gson 工具生成 | 认证个人开发者版本）
 *
 * 认证个人开发者可获取7天预报和24小时内逐3小时预报数据，实况数据以及免费的生活指数
 * URL=https://free-api.heweather.com/s6/weather?parameters
 *
 * Created by ZYY on 2018/5/6.
 */

public class HeweatherBean {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6( ) {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101280102","location":"番禺","parent_city":"广州","admin_area":"广东","cnty":"中国","lat":"22.93858147","lon":"113.36461639","tz":"+8.00"}
         * update : {"loc":"2018-05-06 22:48","utc":"2018-05-06 14:48"}
         * status : ok
         * now : {"cloud":"50","cond_code":"101","cond_txt":"多云","fl":"29","hum":"87","pcpn":"0.0","pres":"1008","tmp":"26","vis":"10","wind_deg":"122","wind_dir":"东南风","wind_sc":"2","wind_spd":"9"}
         * daily_forecast : [{"cond_code_d":"103","cond_code_n":"302","cond_txt_d":"晴间多云","cond_txt_n":"雷阵雨","date":"2018-05-06","hum":"71","mr":"14:46","ms":"10:37","pcpn":"0.0","pop":"0","pres":"1012","sr":"05:51","ss":"18:56","tmp_max":"31","tmp_min":"23","uv_index":"11","vis":"18","wind_deg":"0","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"2"},{"cond_code_d":"310","cond_code_n":"310","cond_txt_d":"暴雨","cond_txt_n":"暴雨","date":"2018-05-07","hum":"69","mr":"00:14","ms":"11:28","pcpn":"0.0","pop":"0","pres":"1009","sr":"05:50","ss":"18:56","tmp_max":"27","tmp_min":"22","uv_index":"11","vis":"16","wind_deg":"0","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"8"},{"cond_code_d":"310","cond_code_n":"307","cond_txt_d":"暴雨","cond_txt_n":"大雨","date":"2018-05-08","hum":"61","mr":"00:57","ms":"12:19","pcpn":"0.3","pop":"27","pres":"1007","sr":"05:50","ss":"18:57","tmp_max":"26","tmp_min":"22","uv_index":"8","vis":"14","wind_deg":"0","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"5"},{"cond_code_d":"306","cond_code_n":"306","cond_txt_d":"中雨","cond_txt_n":"中雨","date":"2018-05-09","hum":"77","mr":"01:38","ms":"13:11","pcpn":"13.0","pop":"73","pres":"1011","sr":"05:49","ss":"18:57","tmp_max":"25","tmp_min":"21","uv_index":"5","vis":"11","wind_deg":"0","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"1"},{"cond_code_d":"101","cond_code_n":"300","cond_txt_d":"多云","cond_txt_n":"阵雨","date":"2018-05-10","hum":"68","mr":"02:17","ms":"14:03","pcpn":"1.5","pop":"65","pres":"1014","sr":"05:49","ss":"18:58","tmp_max":"25","tmp_min":"21","uv_index":"4","vis":"13","wind_deg":"90","wind_dir":"东风","wind_sc":"3-4","wind_spd":"16"},{"cond_code_d":"300","cond_code_n":"101","cond_txt_d":"阵雨","cond_txt_n":"多云","date":"2018-05-11","hum":"67","mr":"02:55","ms":"14:57","pcpn":"0.0","pop":"0","pres":"1013","sr":"05:48","ss":"18:58","tmp_max":"27","tmp_min":"22","uv_index":"6","vis":"14","wind_deg":"129","wind_dir":"东南风","wind_sc":"3-4","wind_spd":"14"},{"cond_code_d":"101","cond_code_n":"300","cond_txt_d":"多云","cond_txt_n":"阵雨","date":"2018-05-12","hum":"75","mr":"03:33","ms":"15:52","pcpn":"0.8","pop":"68","pres":"1011","sr":"05:48","ss":"18:59","tmp_max":"29","tmp_min":"23","uv_index":"6","vis":"17","wind_deg":"0","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"8"}]
         * hourly : [{"cloud":"31","cond_code":"302","cond_txt":"雷阵雨","dew":"24","hum":"97","pop":"22","pres":"1009","time":"2018-05-07 01:00","tmp":"25","wind_deg":"175","wind_dir":"南风","wind_sc":"1-2","wind_spd":"6"},{"cloud":"70","cond_code":"302","cond_txt":"雷阵雨","dew":"24","hum":"97","pop":"59","pres":"1008","time":"2018-05-07 04:00","tmp":"25","wind_deg":"169","wind_dir":"南风","wind_sc":"1-2","wind_spd":"8"},{"cloud":"76","cond_code":"302","cond_txt":"雷阵雨","dew":"24","hum":"96","pop":"51","pres":"1009","time":"2018-05-07 07:00","tmp":"26","wind_deg":"181","wind_dir":"南风","wind_sc":"1-2","wind_spd":"1"},{"cloud":"76","cond_code":"306","cond_txt":"中雨","dew":"24","hum":"97","pop":"65","pres":"1009","time":"2018-05-07 10:00","tmp":"25","wind_deg":"223","wind_dir":"西南风","wind_sc":"1-2","wind_spd":"7"},{"cloud":"95","cond_code":"306","cond_txt":"中雨","dew":"25","hum":"97","pop":"49","pres":"1007","time":"2018-05-07 13:00","tmp":"23","wind_deg":"185","wind_dir":"南风","wind_sc":"1-2","wind_spd":"8"},{"cloud":"98","cond_code":"306","cond_txt":"中雨","dew":"24","hum":"96","pop":"49","pres":"1005","time":"2018-05-07 16:00","tmp":"24","wind_deg":"183","wind_dir":"南风","wind_sc":"1-2","wind_spd":"2"},{"cloud":"99","cond_code":"306","cond_txt":"中雨","dew":"24","hum":"91","pop":"25","pres":"1005","time":"2018-05-07 19:00","tmp":"25","wind_deg":"186","wind_dir":"南风","wind_sc":"1-2","wind_spd":"1"},{"cloud":"99","cond_code":"307","cond_txt":"大雨","dew":"24","hum":"92","pop":"20","pres":"1007","time":"2018-05-07 22:00","tmp":"24","wind_deg":"185","wind_dir":"南风","wind_sc":"1-2","wind_spd":"9"}]
         * lifestyle : [{"type":"comf","brf":"较舒适","txt":"今天夜间有雨，从而使空气湿度加大，会使人们感觉有点儿闷热，但的天气很凉爽、舒适。"},{"type":"drsg","brf":"舒适","txt":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},{"type":"flu","brf":"较易发","txt":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"},{"type":"sport","brf":"较不宜","txt":"有较强降水，建议您选择在室内进行健身休闲运动。"},{"type":"trav","brf":"较不宜","txt":"温度适宜，风力不大，但预计将有有强降水出现，会给您的出游增添很多麻烦，建议您最好选择室内活动。"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"type":"air","brf":"优","txt":"气象条件非常有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;
        private List<LifestyleBean> lifestyle;

        public BasicBean getBasic( ) {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate( ) {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus( ) {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow( ) {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast( ) {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly( ) {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public List<LifestyleBean> getLifestyle( ) {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
        }

        public static class BasicBean {
            /**
             * cid : CN101280102
             * location : 番禺
             * parent_city : 广州
             * admin_area : 广东
             * cnty : 中国
             * lat : 22.93858147
             * lon : 113.36461639
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid( ) {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation( ) {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city( ) {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area( ) {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty( ) {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat( ) {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon( ) {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz( ) {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2018-05-06 22:48
             * utc : 2018-05-06 14:48
             */

            private String loc;
            private String utc;

            public String getLoc( ) {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc( ) {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 50
             * cond_code : 101
             * cond_txt : 多云
             * fl : 29
             * hum : 87
             * pcpn : 0.0
             * pres : 1008
             * tmp : 26
             * vis : 10
             * wind_deg : 122
             * wind_dir : 东南风
             * wind_sc : 2
             * wind_spd : 9
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud( ) {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code( ) {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt( ) {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl( ) {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum( ) {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn( ) {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres( ) {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp( ) {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis( ) {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg( ) {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir( ) {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc( ) {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd( ) {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 103
             * cond_code_n : 302
             * cond_txt_d : 晴间多云
             * cond_txt_n : 雷阵雨
             * date : 2018-05-06
             * hum : 71
             * mr : 14:46
             * ms : 10:37
             * pcpn : 0.0
             * pop : 0
             * pres : 1012
             * sr : 05:51
             * ss : 18:56
             * tmp_max : 31
             * tmp_min : 23
             * uv_index : 11
             * vis : 18
             * wind_deg : 0
             * wind_dir : 无持续风向
             * wind_sc : 1-2
             * wind_spd : 2
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d( ) {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n( ) {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d( ) {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n( ) {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate( ) {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum( ) {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr( ) {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs( ) {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn( ) {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop( ) {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres( ) {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr( ) {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs( ) {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max( ) {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min( ) {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index( ) {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis( ) {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg( ) {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir( ) {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc( ) {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd( ) {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 31
             * cond_code : 302
             * cond_txt : 雷阵雨
             * dew : 24
             * hum : 97
             * pop : 22
             * pres : 1009
             * time : 2018-05-07 01:00
             * tmp : 25
             * wind_deg : 175
             * wind_dir : 南风
             * wind_sc : 1-2
             * wind_spd : 6
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud( ) {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code( ) {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt( ) {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew( ) {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum( ) {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop( ) {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres( ) {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime( ) {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp( ) {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg( ) {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir( ) {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc( ) {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd( ) {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 较舒适
             * txt : 今天夜间有雨，从而使空气湿度加大，会使人们感觉有点儿闷热，但的天气很凉爽、舒适。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType( ) {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf( ) {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt( ) {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
