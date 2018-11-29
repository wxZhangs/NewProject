package com.android.wx.news;

import com.wxzhang.tools.base.BaseHttpResult;
import com.wxzhang.tools.http.HttpService;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by wxZhang on 2018/11/29.
 */

public interface HttpUrl extends HttpService {
    //帮助
    @Headers({"Content-type:application/json"})
    @POST("My/helps")
    Observable<BaseHttpResult<List<HelpDataBean>>> getHelpList(@Body RequestBody requestBody);


}
