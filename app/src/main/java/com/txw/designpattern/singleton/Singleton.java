package com.txw.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式
 *
 * @author txw
 * @date 2017/11/8.
 */
public class Singleton {

    private static Singleton mInstance = null;

    public Singleton() {
    }

    public void doSomething() {
        System.out.print("do sth.");
    }

    //-------- 懒汉模式 start--------
    //声明一个静态对象，在用户第一次调用getInstance时进行初始化.
    //优点：单例只有在使用时才会被实例化，一定程度节省资源
    //缺点：第一次加载需要及时实例话，反应稍慢，最大的问题是每次调用getInstance都进行同步，造成不必要的同步开销。
    //总结：不建议使用！
    public static synchronized Singleton getInstance1() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }
    //-------- 懒汉模式 end--------

    //-------- Double Check Lock（DCL模式）实现单例 start--------
    //特点：mInstance进行两次非空判断，第一层为了不必要的同步，第二层为了在null的情况下创建实例
    //优点：资源利用率高，第一次执行getInstance 时单例对象会被实例化，效率高
    //缺点：第一次加载反应慢，也由于java内存模型的原因偶尔失败。
    //总结：DCL是使用最多的单例实现方式，能够在需要时才被实例化单例对象，并且能在多数场景下保证单例对象的唯一性。
    public static Singleton getInstance2() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    //-------- Double Check Lock（DCL模式）实现单例 end--------

    //-------- 静态内部类单例模式 start--------
    //第一次加载的时候不会初始化mInstance，只有在第一次调用Singleton的getInstance的时候才会导致mInstance初始化
    //优点：第一次调用getInstance方法会导致虚拟机加载SingletonHolder类，
    //这种方式不仅确保线程安全，也能保证单例对象的唯一性，同时也能延迟单例的实例化
    public static Singleton getInstance3() {
        return SingleHolder.mInstance;
    }

    private static class SingleHolder {
        private static final Singleton mInstance = new Singleton();
    }
    //-------- 静态内部类单例模式 end--------

    //-------- 枚举单例模式 start--------
    //优点默认枚举实例的创建是线程安全的，并却在任何情况下都是一个单例。
    public enum SingletonEnum {
        INSTANCE;

        public void doSomething() {
            System.out.println("do sth.");
        }
    }
    //-------- 静态内部类单例模式 end--------

}