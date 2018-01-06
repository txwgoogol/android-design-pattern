package com.txw.designpattern.factory.factory_method;

/**
 * 抽象工厂类
 * Created by txw on 2018/1/6.
 */
public abstract class Factory {

    /**
     * 抽象工厂方法
     * 具体产生什么由子类实现
     *
     * @return 具体的产品对象
     */
    public abstract Product createProduct();

    /**
     * 抽象工厂方法
     * 具体产生什么由子类实现
     *
     * @param clz clz产品对象类型
     * @param <T> 范型
     * @return 具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
