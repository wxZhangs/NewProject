package com.wxzhang.tools.base;



import com.wxzhang.tools.exception.ApiException;

import rx.Subscriber;


/**
 * Created by wxZhang
 */

public abstract class BaseSubscriber<T> extends Subscriber<T> {

    @Override
    public void onError(Throwable e) {
        ApiException apiException = (ApiException) e;
        onError(apiException);
    }


    /**
     * @param e 错误的一个回调
     */
    protected abstract void onError(ApiException e);

}
