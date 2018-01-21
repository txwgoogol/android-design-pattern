package com.txw.designpattern.terminator.model;

/**
 * 具体同事A
 * Created by txw on 2018/1/21.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA 将信息递交给中介者处理");
    }

}