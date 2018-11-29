package com.wxzhang.tools.base;


import com.wxzhang.tools.http.Http;
import com.wxzhang.tools.http.HttpService;
import com.wxzhang.tools.mvp.IModel;

/**
 * Created by wxZhang
 *
 */

public class BaseModel implements IModel {
    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = Http.getHttpService();
    }

}
