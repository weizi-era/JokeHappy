package com.zjw.jokehappy

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.databinding.ViewDataBinding
import me.hgj.jetpackmvvm.base.activity.BaseVmDbActivity
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel

abstract class BaseActivity<VM:BaseViewModel, DB:ViewDataBinding>:BaseVmDbActivity<VM, DB>() {
    /**
     * 当前Activity绑定的视图布局Id abstract修饰供子类实现
     */
    abstract override fun layoutId(): Int
    /**
     * 当前Activityc创建后调用的方法 abstract修饰供子类实现
     */
    abstract override fun initView(savedInstanceState: Bundle?)

    /**
     * 创建liveData数据观察
     */
    abstract override fun createObserver()

    /**
     * 打开等待框 在这里实现你的等待框展示
     */
    override fun showLoading(message: String) {

    }

    /**
     * 关闭等待框 在这里实现你的等待框关闭
     */
    override fun dismissLoading() {

    }

}