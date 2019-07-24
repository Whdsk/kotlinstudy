package com.example.kotlin.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.classic.common.MultipleStatusView
import pub.devrel.easypermissions.EasyPermissions

/**
 *  @author gaohangbo on 2019/7/24
 **/
abstract class BaseFragment: Fragment(), EasyPermissions.PermissionCallbacks {
    /**
     * 视图是否加载完毕
     */
    private var isViewPrepare = false

    /**
     * 数据是否加载过了
     */
    //成员变量
    private var hasLoadData=false

    /**
     * 多种状态的 View 的切换
     */
    protected var mLayoutStatusView: MultipleStatusView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(),null)

    }
    /**
     * 加载布局
     */
    @LayoutRes
    abstract fun getLayoutId(): Int





}