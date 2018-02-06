package com.txw.designpattern.bridge.model;

/**
 * 抽象部分实现
 * Created by txw on 2018/2/6.
 */
public abstract class Abstraction {

    private Implementor mImplementor; //声明一个私有成员变量引用 实现部分的对象

    /**
     * 通过实现部分对象的引用构造抽象部分的对象
     *
     * @param mImplementor 实现部分对象引用
     */
    public Abstraction(Implementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    /**
     * 通过调用实现部分具体的方法实现具体的功能
     */
    public void operation() {
        mImplementor.operationImpl();
    }

}
