package top.txwgoogol.designpattern.observer.model;

import java.util.Observable;

/**
 * 开发技术前线，这个网站是被观察者角色，当它有更新时所有的观察者（这里是程序员）都会收到通知。
 * Created by txwgoogol on 2018/1/13.
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        //标识状态或内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }

}
