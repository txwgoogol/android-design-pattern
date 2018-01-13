package com.txw.designpattern.observer.model;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 * Created by txw on 2018/1/13.
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Hi " + name + ", DevTechFrontier 更新啦，内容：" + o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
