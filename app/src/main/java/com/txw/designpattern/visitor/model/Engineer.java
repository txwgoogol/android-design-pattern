package com.txw.designpattern.visitor.model;

import java.util.Random;

/**
 * 工程师
 * Created by txw on 2018/1/20.
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
