package com.txw.designpattern.bridge.model;

/**
 * 实现部分具体的实现一
 * Created by txw on 2018/2/6.
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
       System.out.println("具体的实现A");
    }

}
