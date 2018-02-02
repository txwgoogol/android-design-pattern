package com.txw.designpattern.decoration.model;

import org.junit.Test;

/**
 * 测试类
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //构造被装饰者的组件对象
        Component component = new ConcreteComponent();
        //根据组件对象构造装饰者A并调用，此时相当于给组件A对象增加装饰者A的功能方法
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();

        //根据组件对象构造装饰者B并调用，此时相当于给组件B对象增加装饰者A的功能方法
        Decorator decoratorB = new ConcreteDecoratorA(component);
        decoratorB.operate();
    }

}
