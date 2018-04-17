package com.dragon.gaodemaplibrary.location;

/**
 * Created by dragon on 2018/4/16.
 */

public interface LocationListener {
    void LocationSuccess(LocationSuccessBean bean);
    void LocationError(LocationErrorBean bean);
    void LocationError();

}
