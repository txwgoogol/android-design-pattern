package com.txw.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * 在程序的初始，将多种单例类型注入到一个统一管理的类中，在使用key获取对象对应的类型对象。
 * 管理多种类新的单例，并在使用的时可以通过统一的接口进行获取操作，降低用户的成本，对用户隐藏了具体实现，降低耦合度。
 * Created by txw on 2018/1/2.
 */
public class SingletonManger {

    private static Map<String, Object> objectMap = new HashMap<String, Object>();

    public SingletonManger() {
    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }

}
