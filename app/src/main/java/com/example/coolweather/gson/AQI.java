package com.example.coolweather.gson;

/**
 * Created by Lee Pong on 2017/12/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
