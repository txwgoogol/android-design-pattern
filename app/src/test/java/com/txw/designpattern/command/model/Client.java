package com.txw.designpattern.command.model;

import org.junit.Test;

/**
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //构造一个接受对象
        Receiver receiver = new Receiver();
        //根据接收者对象构造一个具体命令
        Command command = new ConcreteCommand(receiver);
        //根据具体对象构造命令对象
        Invoker invoker = new Invoker(command);
        //执行请求方法
        invoker.action();
    }

}
