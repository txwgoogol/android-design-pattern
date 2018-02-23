package com.txw.designpattern.mvp;

import okhttp3.OkHttpClient;

/**
 * 网络请求
 * Created by txw on 2018/2/13.
 */
public class AppClient {

    //构建OkHttpClient.Builder
    OkHttpClient.Builder builder = new OkHttpClient.Builder();

    private static final OkHttpClient mOkHttpClient = new OkHttpClient();

    public static OkHttpClient getInstance() {
        return mOkHttpClient;
    }

}