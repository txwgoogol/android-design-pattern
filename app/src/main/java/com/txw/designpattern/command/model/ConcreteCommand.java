package com.txw.designpattern.command.model;

/**
 * 具体命令类
 * Created by txw on 2018/1/12.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;//持有一个对接受者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者相关方法来执行具体的逻辑
        receiver.action();
    }

}
