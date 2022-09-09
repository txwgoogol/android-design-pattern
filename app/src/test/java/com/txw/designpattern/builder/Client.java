package com.txw.designpattern.builder;

import org.junit.Test;

import top.txwgoogol.designpattern.builder.Builder;
import top.txwgoogol.designpattern.builder.Director;
import top.txwgoogol.designpattern.builder.MacBookBuilder;

/**
 * Builder代码测试
 * Created by txwgoogol on 2018/1/3.
 */
public class Client {

    @Test
    public void main() {
        //构建器
        Builder builder = new MacBookBuilder();
        //Director
        Director pcDirector = new Director(builder);
        //封装构建过程，4核、2G内存、Mac系统
        pcDirector.construct("英特尔主板", "Retina显示器");
        //构建计算机，输出相关信息
        System.out.print("Computer Info : " + builder.create().toString());
    }

    //链式调用
    @Test
    public void builder() {}

}