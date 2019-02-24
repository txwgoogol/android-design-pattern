package com.txw.designpattern.observer;

import top.txwgoogol.designpattern.observer.model.Coder;
import top.txwgoogol.designpattern.observer.model.DevTechFrontier;

import org.junit.Test;

/**
 * 观察者模式测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //被观察的角色
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        Coder coder = new Coder("mr.sample");
        //观察者
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");
        //将观察者注册到可观察对象的观察列表中
        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        //发布消息
        devTechFrontier.postNewPublication("新的一起开发技术前线周报发布啦！");
    }

}
