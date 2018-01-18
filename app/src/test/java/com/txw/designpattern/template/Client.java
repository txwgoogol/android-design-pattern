package com.txw.designpattern.template;

import com.txw.designpattern.template.model.AbstractComputer;
import com.txw.designpattern.template.model.CoderComputer;
import com.txw.designpattern.template.model.MilitaryComputer;

import org.junit.Test;

/**
 * 模版模式测试类
 * Created by txw on 2018/1/12.
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
