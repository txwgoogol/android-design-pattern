package com.txw.designpattern.singleton;

import org.junit.Test;

import top.txwgoogol.designpattern.singleton.Singleton;
import top.txwgoogol.designpattern.singleton.SingletonManger;

/**
 * 单例模式测试
 * Created by txwgoogol on 2018/1/3.
 */
public class SingletonTest {

    @Test
    public void main() {
        Singleton.getInstance1();
        System.out.println("===================");
        Singleton.getInstance2();
        System.out.println("===================");
        Singleton.getInstance3();
        System.out.println("===================");
        System.out.println(Singleton.SingletonEnum.INSTANCE);
    }

    @Test
    public void test(){
        SingletonManger singletonManger = new SingletonManger();
        singletonManger.registerService("String","Object");

        singletonManger.getService("String");
    }

}
