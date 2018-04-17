package com.dragon.gaodemaplibrary.location;

/**
 * Created by dragon on 2018/4/16.
 */

public class LocationSuccessBean {

    public int LocationType;       //定位类型
    public double Longitude;       //经度
    public double Latitude;        //纬度
    public float Accuracy;     //精度
    public String Provider;    //提供者
    public float Speed;        //速度
    public float Bearing;      //角度
    public int Satellites;     //星数
    public String Country;     //国家
    public String Province;    //省
    public String City;        //市
    public String CityCode;    //城市编码
    public String District;    //区
    public String AdCode;      //区域码
    public String Address;     //地址
    public String PoiName;     //兴趣点
    public String LocationTime; //定位时间
    public boolean isWifiAble;  //WIFI开关
    public String GPSStatus;      //GPS状态
    public int GPSSatellites;    //GPS星数
    public String CallbackTime;  //回调时间

    @Override
    public String toString() {
        return "LocationSuccessBean{" +
                "LocationType=" + LocationType +
                ", Longitude=" + Longitude +
                ", Latitude=" + Latitude +
                ", Accuracy=" + Accuracy +
                ", Provider='" + Provider + '\'' +
                ", Speed=" + Speed +
                ", Bearing=" + Bearing +
                ", Satellites=" + Satellites +
                ", Country='" + Country + '\'' +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", CityCode='" + CityCode + '\'' +
                ", District='" + District + '\'' +
                ", AdCode='" + AdCode + '\'' +
                ", Address='" + Address + '\'' +
                ", PoiName='" + PoiName + '\'' +
                ", LocationTime='" + LocationTime + '\'' +
                ", isWifiAble=" + isWifiAble +
                ", GPSStatus='" + GPSStatus + '\'' +
                ", GPSSatellites=" + GPSSatellites +
                ", CallbackTime='" + CallbackTime + '\'' +
                '}';
    }
}
