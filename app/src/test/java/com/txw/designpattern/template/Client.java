package com.txw.designpattern.template;

import top.txwgoogol.designpattern.template.model.AbstractComputer;
import top.txwgoogol.designpattern.template.model.CoderComputer;
import top.txwgoogol.designpattern.template.model.MilitaryComputer;

import org.junit.Test;

/**
 * 模版模式测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        AbstractComputer abstractComputer = new CoderComputer();
        abstractComputer.startUp();

        abstractComputer = new MilitaryComputer();
        abstractComputer.startUp();
    }

}
