package com.fuicuiedu.idedemo.interview_tuisong;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //极光推送初始化
        JPushInterface.init(this);
        //极光推送调试模式（开启）
        JPushInterface.setDebugMode(true);
    }
}
