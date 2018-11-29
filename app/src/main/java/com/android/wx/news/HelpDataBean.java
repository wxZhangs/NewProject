package com.android.wx.news;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/30.
 */

public class HelpDataBean implements Serializable {

    /**
     * id : 2
     * post_title : 保护账号有妙招
     * post_excerpt : 一步教你如何开启设备保护
     * smeta : http://wx.bianguo.com.cn/water/data/upload/portal/20180530/5b0e426241106.png
     */

    private String id;
    private String post_title;
    private String post_excerpt;
    private String smeta;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_excerpt() {
        return post_excerpt;
    }

    public void setPost_excerpt(String post_excerpt) {
        this.post_excerpt = post_excerpt;
    }

    public String getSmeta() {
        return smeta;
    }

    public void setSmeta(String smeta) {
        this.smeta = smeta;
    }

    @Override
    public String toString() {
        return "HelpDataBean{" +
                "id='" + id + '\'' +
                ", post_title='" + post_title + '\'' +
                ", post_excerpt='" + post_excerpt + '\'' +
                ", smeta='" + smeta + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
