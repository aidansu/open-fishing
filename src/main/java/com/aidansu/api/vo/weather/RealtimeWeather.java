package com.aidansu.api.vo.weather;

import lombok.Data;

import java.io.Serializable;

/**
 * 当天天气情况
 *
 * @author aidansu
 */
@Data
public class RealtimeWeather implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 天气情况，如：晴、多云
     */
    private String info;
    /**
     * 天气标识id，可参考小接口2
     */
    private String wid;
    /**
     * 温度，可能为空
     */
    private String temperature;
    /**
     * 湿度，可能为空
     */
    private String humidity;
    /**
     * 风向，可能为空
     */
    private String direct;
    /**
     * 风力，可能为空
     */
    private String power;
    /**
     * 空气质量指数，可能为空
     */
    private String aqi;

}
