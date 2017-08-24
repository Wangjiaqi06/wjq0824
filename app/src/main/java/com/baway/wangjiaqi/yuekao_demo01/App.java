package com.baway.wangjiaqi.yuekao_demo01;

import android.app.Application;

/**
 * Created by admin on 2017/8/24.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //应用开始就设置全局捕获异常器没有设置就会用系统默认的
        CauchExceptionHandler.getInstance().setDefaultUnCachExceptionHandler();
    }
}
