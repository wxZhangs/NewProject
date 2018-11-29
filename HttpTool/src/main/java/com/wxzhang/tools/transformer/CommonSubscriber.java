package com.wxzhang.tools.transformer;

import android.content.Context;
import android.util.Log;

import com.wxzhang.tools.base.BaseSubscriber;
import com.wxzhang.tools.exception.ApiException;
import com.wxzhang.tools.utils.NetworkUtil;


public abstract class CommonSubscriber<T> extends BaseSubscriber<T> {

    private Context context;

    public CommonSubscriber(Context context) {
        this.context = context;
    }

    private static final String TAG = "CommonSubscriber";

    @Override
    public void onStart() {

        if (!NetworkUtil.isNetworkAvailable(context)) {
            Log.e(TAG, "网络不可用");
        } else {
            Log.e(TAG, "网络可用");
        }
    }



    @Override
    protected void onError(ApiException e) {
        Log.e(TAG, "错误信息为 " + "code:" + e.code + "   message:" + e.message);
    }

    @Override
    public void onCompleted() {
        Log.e(TAG, "获取成功");
    }

}
