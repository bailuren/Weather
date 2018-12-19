package com.example.yp.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    /**
     * 返回的天气数据中还会包含一项status数据,成功返回ok,失败则会返回具体的原因
     */
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    /**
     * 由于daily_forecast中包含的是一个数组
     * 因此这里使用了List集合来引用Forecast类
     */
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
