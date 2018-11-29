package com.android.wx.news;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.TextView;


import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.wxzhang.tools.base.BaseActivity;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/5/29.
 * 帮助
 */

public class HelpActivity extends BaseActivity<HelpPresenter> implements HelpAdapter.OnClickItemListener, HelpContract.HelpView {

    @Bind(R.id.recycleview_ids)
    RecyclerView recycleviewIds;
    @Bind(R.id.recycleview_refresh)
    SmartRefreshLayout smartRefreshLayout;
    HelpAdapter adapter;
    List<HelpDataBean> list = new LinkedList<>();
    private int page = 0;

    @Override
    protected HelpPresenter loadPresenter() {
        return new HelpPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recycleview;
    }

    @Override
    protected void initView() {
//        titlebarTextview.setText("帮助");
    }

    @Override
    protected void initData() {
        mPresenter.getHelpData("", String.valueOf(page), "10");
        adapter = new HelpAdapter(list,this);
        recycleviewIds.setLayoutManager(new LinearLayoutManager(this));
        recycleviewIds.setAdapter(adapter);
        adapter.setOnClickItemListener(this);
    }


//    @OnClick(R.id.titlebar_backs)
//    public void onViewClicked() {
//        finish();
//    }

    @Override
    public void setOnItemClick(int position) {
//        startActivity(new Intent(this,WebViewActivity.class).putExtra("url",list.get(position).getUrl()));
    }

    @Override
    public void HelpSuccess(List<HelpDataBean> helpDataBeanList) {
        if (helpDataBeanList != null) {
            list.addAll(helpDataBeanList);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void HelpFail(String fail) {
//        showDialog(fail,false);
    }
}
