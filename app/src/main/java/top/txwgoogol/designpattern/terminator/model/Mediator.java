package top.txwgoogol.designpattern.terminator.model;

/**
 * 抽象中介者
 * Created by txwgoogol on 2018/1/21.
 */
public abstract class Mediator {

    protected ConcreteColleagueA concreteColleagueA; //具体同事A
    protected ConcreteColleagueB concreteColleagueB; //具体同事B

    public void setColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    /**
     * 抽象中介方法、子类实现
     */
    public abstract void method();

}