package com.zhxh.mvpframework.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zhxh.mvpframework.view.BaseMvpView;

/**
 * @author zhuxh
 * @date 2017/11/17
 * @description 所有Presenter的基类，并不强制实现这些方法，有需要在重写
 */
public class BaseMvpPresenter<V extends BaseMvpView> {

    /**
     * V层view
     */
    private V mView;

    /**
     * Presenter被创建后调用
     *
     * @param savedState 被意外销毁后重建后的Bundle
     */
    public void onCreatePresenter(@Nullable Bundle savedState) {
        Log.e("matrix-mvp","P onCreatePresenter = ");
    }


    /**
     * 绑定View
     */
    public void onAttachMvpView(V mvpView) {
        mView = mvpView;
        Log.e("matrix-mvp","P onResume");
    }

    /**
     * 解除绑定View
     */
    public void onDetachMvpView() {
        mView = null;
        Log.e("matrix-mvp","P onDetachMvpView = ");
    }

    /**
     * Presenter被销毁时调用
     */
    public void onDestroyPresenter() {
        Log.e("matrix-mvp","P onDestroy = ");
    }

    /**
     * 在Presenter意外销毁的时候被调用，它的调用时机和Activity、Fragment、View中的onSaveInstanceState
     * 时机相同
     *
     * @param outState
     */
    public void onSaveInstanceState(Bundle outState) {
        Log.e("matrix-mvp","P onSaveInstanceState = ");
    }

    /**
     * 获取V层接口View
     *
     * @return 返回当前MvpView
     */
    public V getMvpView() {
        return mView;
    }
}
