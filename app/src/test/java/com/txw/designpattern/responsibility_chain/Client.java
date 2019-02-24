package com.txw.designpattern.responsibility_chain;

import top.txwgoogol.designpattern.responsibility_chain.package1.AbstractHandler;
import top.txwgoogol.designpattern.responsibility_chain.package1.AbstractRequest;
import top.txwgoogol.designpattern.responsibility_chain.package1.Handler1;
import top.txwgoogol.designpattern.responsibility_chain.package1.Handler2;
import top.txwgoogol.designpattern.responsibility_chain.package1.Handler3;
import top.txwgoogol.designpattern.responsibility_chain.package1.Request1;
import top.txwgoogol.designpattern.responsibility_chain.package1.Request2;
import top.txwgoogol.designpattern.responsibility_chain.package1.Request3;

import org.junit.Test;

/**
 * Created by txwgoogol on 2018/1/10.
 */
public class Client {

    @Test
    public void main() {
        //构造三个处理对象
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        //设置当前处理对象下一节点的初一对象
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
        //构造三个请求者对象
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");
        //总是从链式的首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }

}
