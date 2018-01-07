package com.txw.designpattern.factory.abstract_factory;

/**
 * 具体工厂类2
 * Created by txw on 2018/1/7.
 */
public class ConcreteFactory2 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductA createProductB() {
        return new ConcreteProductB2();
    }

}
