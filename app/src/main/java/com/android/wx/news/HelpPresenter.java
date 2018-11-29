package com.android.wx.news;


import com.android.wx.news.model.HelpMoudel;
import com.wxzhang.tools.base.BasePresenter;
import com.wxzhang.tools.mvp.IModel;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/5/31.
 */

public class HelpPresenter extends BasePresenter<HelpActivity> implements HelpContract.HelpPresenter {
    @Override
    public void getHelpData(String token, String page, String size) {
        ((HelpMoudel) getiModelMap().get("help")).getHelpData(token, page, size, new HelpMoudel.HelpResult() {
            @Override
            public void SuccessResult(List<HelpDataBean> beanList) {
                getIView().HelpSuccess(beanList);
            }

            @Override
            public void FailResult(String fail) {
                getIView().HelpFail(fail);
            }
        });
    }

    @Override
    public HashMap<String, IModel> getiModelMap() {
        return loadModelMap(new HelpMoudel());
    }

    @Override
    public HashMap<String, IModel> loadModelMap(IModel... models) {
        HashMap<String, IModel> maps = new HashMap<>();
        maps.put("help", models[0]);
        return maps;
    }
}
