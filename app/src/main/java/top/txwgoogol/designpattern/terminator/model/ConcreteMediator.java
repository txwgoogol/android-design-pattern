package top.txwgoogol.designpattern.terminator.model;

/**
 * 具体中介者
 * Created by txwgoogol on 2018/1/21.
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }

}
