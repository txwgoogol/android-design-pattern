package top.txwgoogol.designpattern.visitor;

import java.util.Random;

import top.txwgoogol.designpattern.visitor.model.Visitor;

/**
 * 工程师
 * Created by txwgoogol on 2018/1/20.
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师这一年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }

}
