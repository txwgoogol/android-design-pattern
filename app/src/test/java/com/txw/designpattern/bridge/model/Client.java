package com.txw.designpattern.bridge.model;

import org.junit.Test;

import top.txwgoogol.designpattern.bridge.model.Abstraction;
import top.txwgoogol.designpattern.bridge.model.ConcreteImplementorA;
import top.txwgoogol.designpattern.bridge.model.ConcreteImplementorB;
import top.txwgoogol.designpattern.bridge.model.RefinedAbstraction;

/**
 * 测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {

        ConcreteImplementorA implementorA = new ConcreteImplementorA();
        //implementorA.operationImpl();

        ConcreteImplementorB implementorB = new ConcreteImplementorB();
        //implementorB.operationImpl();

        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        abstractionA.operation();

        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        abstractionB.operation();
    }

}
