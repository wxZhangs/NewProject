package com.wxzhang.tools.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.wxzhang.tools.mvp.IView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;


/**
 * Created by wxZhang on 2018/05/08.
 */

public abstract class BaseActivity<P extends BasePresenter> extends FragmentActivity implements
        IView {
    protected View view;
    protected Activity mContext;
    protected P mPresenter;
//    PermissionListener mListener;
//    protected SharePreferenceWater sharedata;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);

        setContentView(getView());
        ButterKnife.bind(this);
        mPresenter = loadPresenter();
        mContext = this;
//        sharedata = SharePreferenceWater.getInstance(mContext);
        initCommonData();
        initMaps(savedInstanceState);
        initView();
        initData();
    }

    protected abstract P loadPresenter();

    private void initCommonData() {

        if (mPresenter != null)
            mPresenter.attachView(this);
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    public void initMaps(Bundle savedInstanceState){}

    protected abstract void initData();


    /**
     * @return 显示的内容
     */
    public View getView() {
        view = View.inflate(this, getLayoutId(), null);
        return view;
    }


    /**
     * @param str 显示一个内容为str的toast
     */
    public void mToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
//        MobclickAgent.onResume(this);//session的统计
    }
    @Override
    protected void onPause() {
        super.onPause();
//        MobclickAgent.onPause(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.detachView();
    }

    //andrpoid 6.0 需要写运行时权限
//    protected void requestRuntimePermission(String[] permissions, PermissionListener listener) {
//
//        mListener = listener;
//        List<String> permissionList = new ArrayList<>();
//        for (String permission : permissions) {
//            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
//                permissionList.add(permission);
//            }
//        }
//        if (!permissionList.isEmpty()) {
//            ActivityCompat.requestPermissions(this, permissionList.toArray(new String[permissionList.size()]), 1);
//        } else {
//            mListener.onGranted();
//        }
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (isShouldHideInput(v, ev)) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
            return super.dispatchTouchEvent(ev);
        }
        // 必不可少，否则所有的组件都不会有TouchEvent了
        if (getWindow().superDispatchTouchEvent(ev)) {
            return true;
        }
        return onTouchEvent(ev);
    }

    public boolean isShouldHideInput(View v, MotionEvent event) {
        if (v != null && (v instanceof EditText)) {
            int[] leftTop = {0, 0};
            //获取输入框当前的location位置
            v.getLocationInWindow(leftTop);
            int left = leftTop[0];
            int top = leftTop[1];
            int bottom = top + v.getHeight();
            int right = left + v.getWidth();
            if (event.getX() > left && event.getX() < right
                    && event.getY() > top && event.getY() < bottom) {
                // 点击的是输入框区域，保留点击EditText的事件
                return false;
            } else {

                return true;
            }
        }
        return false;
    }
}

