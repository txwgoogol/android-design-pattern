package com.txw.designpattern.terminator.model;

/**
 * 具体同事A
 * Created by txw on 2018/1/21.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB 将信息递交给中介者处理");
    }

}