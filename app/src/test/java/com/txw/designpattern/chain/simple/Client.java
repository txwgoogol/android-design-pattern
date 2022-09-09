package com.txw.designpattern.chain.simple;

import org.junit.Test;

import top.txwgoogol.designpattern.chain.simple.ConcreteHandler1;
import top.txwgoogol.designpattern.chain.simple.ConcreteHandler2;

/**
 * 责任链模式 客户类
 * Created by txwgoogol on 2018/1/10.
 */
public class Client {

    @Test
    public void main() {
        //构造一个ConcreteHandler1对象
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        //构造一个ConcreteHandler2对象
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        //设置handler1的下一个节点
        concreteHandler1.success = concreteHandler2;
        //设置handler2的下一个节点
        concreteHandler2.success = concreteHandler1;
        //处理请求
        concreteHandler1.handleRequest("ConcreteHandler2");
    }

}
