package com.txw.designpattern.combination.model;

import org.junit.Test;

import top.txwgoogol.designpattern.combination.model.Composite;
import top.txwgoogol.designpattern.combination.model.Leaf;

/**
 * 组合模式测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //创造一个根节点
        Composite root = new Composite("Root");
        //构造连个枝节点
        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");
        //构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        //将叶子即诶单添加至枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);
        //将枝干节点添加至跟节点
        root.addChild(branch1);
        root.addChild(branch2);
        //执行方法
        root.doSomething();
    }

}
