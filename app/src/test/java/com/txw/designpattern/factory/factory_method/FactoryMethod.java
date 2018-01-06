package com.txw.designpattern.factory.factory_method;

import org.junit.Test;

/**
 * 客户类
 * Created by txw on 2018/1/6.
 */
public class FactoryMethod {

    @Test
    public void main1(){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }

    @Test
    public void main2(){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProductB.class);
        product.method();
    }
}
