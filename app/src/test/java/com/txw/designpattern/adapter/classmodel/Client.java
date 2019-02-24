package com.txw.designpattern.adapter.classmodel;

import org.junit.Test;

import top.txwgoogol.designpattern.adapter.classmodel.VoltAdapter;

/**
 * 类适配器模式测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压："+adapter.getVolt5());
    }

}
