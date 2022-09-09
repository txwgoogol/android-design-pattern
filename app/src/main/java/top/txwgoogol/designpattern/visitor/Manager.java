package top.txwgoogol.designpattern.visitor;

import java.util.Random;

import top.txwgoogol.designpattern.visitor.model.Visitor;

/**
 * 经理类型
 * Created by txwgoogol on 2018/1/20.
 */
public class Manager extends Staff {

    private int products;//产品数量

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }


}
