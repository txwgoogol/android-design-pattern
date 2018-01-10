package com.txw.designpattern.responsibility_chain.simple;

/**
 * 具体的处理者2
 * Created by txw on 2018/1/10.
 */
public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
            return;
        }else {
            success.handleRequest(condition);
        }
    }

}
