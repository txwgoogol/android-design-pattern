package com.txw.designpattern.proxy.model;

/**
 * 代理类
 * Created by txw on 2018/1/22.
 */
public class ProxySubject extends Subject {

    private RealSubject mRealSubject;

    public ProxySubject(RealSubject realSubject) {
        this.mRealSubject = realSubject;
    }

    @Override
    public void visit() {
        //通过真是主题引用的对象调用真是主题中的逻辑方法
        mRealSubject.visit();
    }

}