package top.txwgoogol.designpattern.terminator.model;

/**
 * 抽象同事
 * Created by txwgoogol on 2018/1/21.
 */
public abstract class Colleague {

    protected Mediator mediator; //中介者对象

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事角色的具体行为，由子类实现
     */
    public abstract void action();

}
