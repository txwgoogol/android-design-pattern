package com.txw.designpattern.adapter;

import com.txw.designpattern.adapter.objectmodel.VoltAdapter;

import org.junit.Test;

/**
 * 对象适配器模式测试类
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + voltAdapter.getVolt5());
        System.out.println("输出电压：" + voltAdapter.getVolt220());
    }


}
