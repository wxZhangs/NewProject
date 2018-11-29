package com.wxzhang.tools.base;


import com.wxzhang.tools.mvp.IModel;
import com.wxzhang.tools.mvp.IPresenter;
import com.wxzhang.tools.mvp.IView;

import java.lang.ref.WeakReference;

/**
 * Created by wxZhang
 * 17:21
 *
 */

public abstract class OtherPresenter<M extends IModel, V extends IView> implements IPresenter {
    private WeakReference actReference;
    protected V iView;
    protected M iModel;

    public M getiModel() {
        iModel = loadModel(); //使用前先进行初始化
        return iModel;
    }

    @Override
    public void attachView(IView iView) {
        actReference = new WeakReference(iView);
    }

    @Override
    public void detachView() {
        if (actReference != null) {
            actReference.clear();
            actReference = null;
        }
    }

    @Override
    public V getIView() {
        return (V) actReference.get();
    }

    public abstract M loadModel();
}
