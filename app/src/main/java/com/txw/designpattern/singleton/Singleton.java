package com.txw.designpattern.singleton;

/**
 * 单例模式
 *
 * @author txw
 * @date 2017/11/8.
 */
public class Singleton {

    //-------- 懒汉模式 start--------
    //声明一个静态对象，在用户第一次调用getInstance时进行初始化.
    //优点：单例只有在使用时才会被实例化，一定程度节省资源
    //缺点：第一次加载需要及时实例话，反应稍慢，最大的问题是每次调用getInstance都进行同步，造成不必要的同步开销。
    //总结：不建议使用！
    private static Singleton mInstance = null;

    public Singleton() {
    }

    public void doSomething() {
        System.out.print("do sth.");
    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    //-------- 懒汉模式 end--------

}