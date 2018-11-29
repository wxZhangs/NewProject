package com.wxzhang.tools;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2018/11/28.
 */

public class ToolApplication extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }

}
