package com.txw.designpattern.memento;

import top.txwgoogol.designpattern.memento.model.CallOfDuty;
import top.txwgoogol.designpattern.memento.model.Creataker;

import org.junit.Test;

/**
 * 测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        //构建游戏对象
        CallOfDuty callOfDuty = new CallOfDuty();
        //打游戏
        callOfDuty.play();

        Creataker creataker = new Creataker();
        //游戏存档
        creataker.archive(callOfDuty.createMemento());

        //退出游戏
        callOfDuty.quit();

        CallOfDuty callOfDuty1 = new CallOfDuty();
        //恢复游戏
        callOfDuty1.restore(creataker.getMemento());

    }

}
