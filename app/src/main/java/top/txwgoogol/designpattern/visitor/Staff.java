package top.txwgoogol.designpattern.visitor;

import java.util.Random;

import top.txwgoogol.designpattern.visitor.model.Visitor;

/**
 * 员工基类
 * Created by txwgoogol on 2018/1/20.
 */
public abstract class Staff {

    public String name;
    //员工kpi
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
