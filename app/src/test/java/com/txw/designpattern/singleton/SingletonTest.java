package com.txw.designpattern.singleton;

import org.junit.Test;

/**
 * 单例模式测试
 * Created by txw on 2018/1/3.
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

}
