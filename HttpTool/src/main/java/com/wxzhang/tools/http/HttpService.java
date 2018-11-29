package com.wxzhang.tools.http;


import com.wxzhang.tools.base.BaseHttpResult;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by wxZhang
 * 网络请求的接口都在这里
 */

public interface HttpService {
    String BASE_URL = "http://wx.bianguo.com.cn/water/index.php/Api/";
     String SHOP_URL = "http://z-wx.bianguo.com.cn/jingshui/Api/";

    //登录接口
//    @FormUrlEncoded
//    @POST("demo/login")
//    Observable<> login(@Field("userName") String username, @Field
//            ("passWord") String pwd);



}
