package com.android.wx.news;


import java.util.List;

/**
 * Created by Administrator on 2018/5/31.
 */

public class HelpContract {
    public interface HelpView{
        void HelpSuccess(List<HelpDataBean> helpDataBeanList);
        void HelpFail(String fail);
    }

    public interface HelpPresenter{
        void getHelpData(String token, String page, String size);
    }
}
