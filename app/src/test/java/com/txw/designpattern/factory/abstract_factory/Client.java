package com.txw.designpattern.factory.abstract_factory;

import org.junit.Test;

/**
 * Created by txw on 2018/1/7.
 */
public class Client {

    @Test
    public void main(){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.createProductA().method();
    }

}
