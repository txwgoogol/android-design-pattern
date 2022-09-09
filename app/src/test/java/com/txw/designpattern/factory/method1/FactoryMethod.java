package com.txw.designpattern.factory.method1;

import org.junit.Test;

import top.txwgoogol.designpattern.factory.factory_method.ConcreteFactory;
import top.txwgoogol.designpattern.factory.factory_method.ConcreteProductB;
import top.txwgoogol.designpattern.factory.factory_method.Factory;
import top.txwgoogol.designpattern.factory.factory_method.Product;

/**
 * 客户类
 * Created by txwgoogol on 2018/1/6.
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
