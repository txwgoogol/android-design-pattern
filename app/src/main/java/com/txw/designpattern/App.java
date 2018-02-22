package com.txw.designpattern;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by txw on 2018/2/22.
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化OkGo
        OkGo.getInstance().init(this);
    }

}
