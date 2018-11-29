package com.wxzhang.tools.base;


import com.wxzhang.tools.mvp.IModel;
import com.wxzhang.tools.mvp.IPresenter;
import com.wxzhang.tools.mvp.IView;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * Created by wxZhang
 *
 */

public abstract class BasePresenter<V extends IView> implements IPresenter {
    private WeakReference actReference;
    protected V iView;

    public abstract HashMap<String, IModel> getiModelMap();

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

    /**
     * @param models
     * @return 添加多个model, 如有需要
     */
    public abstract HashMap<String, IModel> loadModelMap(IModel... models);

}
