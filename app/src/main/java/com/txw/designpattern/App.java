package com.txw.designpattern;

import android.app.Application;

/**
 * Created by txw on 2018/2/22.
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //这里做一些全局的初始化
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
