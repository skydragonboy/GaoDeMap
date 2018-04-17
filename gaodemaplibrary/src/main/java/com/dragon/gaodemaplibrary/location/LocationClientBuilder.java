package com.dragon.gaodemaplibrary.location;

import android.content.Context;

import com.amap.api.location.AMapLocationClientOption;

/**
 * Created by dragon on 2018/4/16.
 */

public class LocationClientBuilder {

    Context context;
    private LocationListener locationListener;
    private AMapLocationClientOption.AMapLocationMode aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    private boolean GpsFirst = false;
    private int HttpTimeOut = 30000;
    private int Interval = 2000;
    private boolean NeedAddress = true;
    private boolean OnceLocation = false;
    private boolean OnceLocationLatest = false;
    AMapLocationClientOption.AMapLocationProtocol aMapLocationProtocol = AMapLocationClientOption.AMapLocationProtocol.HTTP;
    private boolean SensorEnable = false;
    private boolean WifiScan = true;
    private boolean LocationCacheEnable = true;

    public LocationClientBuilder setContext(Context context){
        this.context = context;
        return this;
    }

    public LocationClientBuilder setaMapLocationMode(AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.aMapLocationMode = aMapLocationMode;
        return this;
    }

    public LocationClientBuilder setLocationListener(LocationListener locationListener) {
        this.locationListener = locationListener;
        return this;
    }

    public LocationClientBuilder setGpsFirst(boolean gpsFirst) {
        GpsFirst = gpsFirst;
        return this;
    }

    public LocationClientBuilder setHttpTimeOut(int httpTimeOut) {
        HttpTimeOut = httpTimeOut;
        return this;
    }

    public LocationClientBuilder setInterval(int interval) {
        Interval = interval;
        return this;
    }

    public LocationClientBuilder setNeedAddress(boolean needAddress) {
        NeedAddress = needAddress;
        return this;
    }

    public LocationClientBuilder setOnceLocation(boolean onceLocation) {
        OnceLocation = onceLocation;
        return this;
    }

    public LocationClientBuilder setOnceLocationLatest(boolean onceLocationLatest) {
        OnceLocationLatest = onceLocationLatest;
        return this;
    }

    public LocationClientBuilder setaMapLocationProtocol(AMapLocationClientOption.AMapLocationProtocol aMapLocationProtocol) {
        this.aMapLocationProtocol = aMapLocationProtocol;
        return this;
    }

    public LocationClientBuilder setSensorEnable(boolean sensorEnable) {
        SensorEnable = sensorEnable;
        return this;
    }

    public LocationClientBuilder setWifiScan(boolean wifiScan) {
        WifiScan = wifiScan;
        return this;
    }

    public LocationClientBuilder setLocationCacheEnable(boolean locationCacheEnable) {
        LocationCacheEnable = locationCacheEnable;
        return this;
    }

    public LocationClient build(){
        return new LocationClient(
                context,
                locationListener,
                aMapLocationMode,
                GpsFirst,
                HttpTimeOut,
                Interval,
                NeedAddress,
                OnceLocation,
                OnceLocationLatest,
                aMapLocationProtocol,
                SensorEnable,
                WifiScan,
                LocationCacheEnable
                );
    }

}
