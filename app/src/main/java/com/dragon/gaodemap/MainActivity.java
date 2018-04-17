package com.dragon.gaodemap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dragon.gaodemaplibrary.location.LocationClient;
import com.dragon.gaodemaplibrary.location.LocationErrorBean;
import com.dragon.gaodemaplibrary.location.LocationListener;
import com.dragon.gaodemaplibrary.location.LocationSuccessBean;
import com.google.gson.Gson;
import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LocationClient mLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mLocationClient != null) {
            mLocationClient.destroyLocation();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1: {
                if (mLocationClient == null) {
                    mLocationClient = LocationClient.builder()
                            .setContext(this)
                            .setLocationListener(new LocationListener() {
                                @Override
                                public void LocationSuccess(LocationSuccessBean bean) {
//                                    Gson gson = new Gson();
//                                    Logger.json(gson.toJson(bean));
                                    Log.e("aaa",bean.toString());
                                }

                                @Override
                                public void LocationError(LocationErrorBean bean) {
                                    Gson gson = new Gson();
                                    Logger.json(gson.toJson(bean));
                                }

                                @Override
                                public void LocationError() {

                                }
                            })
                            .build()
                            .initLocation()
                            .startLocation();
                }
                break;
            }
            case R.id.button2: {
                if (mLocationClient != null) {
                    mLocationClient.stopLocation();
                }
                break;
            }
        }
    }
}
