package com.android.wx.news.model;

import android.support.annotation.NonNull;

import com.android.wx.news.HelpDataBean;
import com.google.gson.Gson;
import com.wxzhang.tools.ToolApplication;
import com.wxzhang.tools.base.BaseModel;
import com.wxzhang.tools.exception.ApiException;
import com.wxzhang.tools.transformer.CommonSubscriber;
import com.wxzhang.tools.transformer.CommonTransformer;

import java.util.HashMap;
import java.util.List;

import okhttp3.RequestBody;

/**
 * Created by Administrator on 2018/5/31.
 */

public class HelpMoudel extends BaseModel {

    public void getHelpData(@NonNull String token, @NonNull String page, @NonNull String size, @NonNull final HelpResult result){
        if (result==null)
            throw  new RuntimeException("result不能为空");
        Gson gson = new Gson();
        HashMap<String,String> maps = new HashMap<>();
        maps.put("token",token);
        maps.put("page",page);
        maps.put("size",size);
        String StringEntity = gson.toJson(maps);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json"),StringEntity);
//        httpService.getHelpList(body)
//                .compose(new CommonTransformer<List<HelpDataBean>>())
//                .subscribe(new CommonSubscriber<List<HelpDataBean>>(ToolApplication.getContext()) {
//                    @Override
//                    public void onNext(List<HelpDataBean> beanList) {
//                        result.SuccessResult(beanList);
//                    }
//
//                    @Override
//                    protected void onError(ApiException e) {
//                        super.onError(e);
//                        result.FailResult(e.message);
//                    }
//                });
    }

    public interface HelpResult{
        void SuccessResult(List<HelpDataBean> beanList);
        void FailResult(String fail);
    }

}
