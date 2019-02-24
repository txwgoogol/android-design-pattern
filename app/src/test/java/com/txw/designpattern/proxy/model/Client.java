package com.txw.designpattern.proxy.model;

import org.junit.Test;

import top.txwgoogol.designpattern.proxy.model.ProxySubject;
import top.txwgoogol.designpattern.proxy.model.RealSubject;

/**
 * 代理模式测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //构造一个真是的主题对象
        RealSubject realSubject = new RealSubject();
        //通过真是主题的对象构造一个代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理相关的方法
        proxySubject.visit();
    }

}
