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
        /**
         * 这样写是使用OkGO内部默认初始化的OkHttpClient来进行网络请求，
         * 包含了基本的log打印，超时时间和https相关的配置，
         * 但是建议还是自己配置好OkHttpClient传给OkGo比较好，
         * 详细自定义OkHttpClient的方法就是配置原生的OkHttp的方法，
         * 建议的一些配置如下，都是可选的，如果需要你就加，不需要就别加了。
         */
        //初始化OkGo
        OkGo.getInstance().init(this);
    }

}
