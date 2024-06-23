package com.micheis.rxdemo;

import android.app.Application;

import com.micheis.rxkit.RxTools;

/**
 * ================================================
 *
 * @Description: 描述
 * @Author: wxianing
 * @Date: 2024/6/23 16:51
 * ================================================
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RxTools.init(this);
    }
}
