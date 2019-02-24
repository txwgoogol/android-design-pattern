package com.txw.designpattern.factory.abstract_factory;

import org.junit.Test;

import top.txwgoogol.designpattern.factory.abstract_factory.AbstractFactory;
import top.txwgoogol.designpattern.factory.abstract_factory.ConcreteFactory1;

/**
 * Created by txwgoogol on 2018/1/7.
 */
public class Client {

    @Test
    public void main(){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.createProductA().method();
    }

}
