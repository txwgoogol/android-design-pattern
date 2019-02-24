package com.txw.designpattern.iterator;

import top.txwgoogol.designpattern.iterator.model.Aggregate;
import top.txwgoogol.designpattern.iterator.model.ConcreteAggregate;
import top.txwgoogol.designpattern.iterator.model.Iterator;

import org.junit.Test;

/**
 * 迭代器测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio \n");
        a.add("SM");
        a.add("Brother");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
