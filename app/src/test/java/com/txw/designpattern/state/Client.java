package com.txw.designpattern.state;

import org.junit.Test;

import top.txwgoogol.designpattern.state.TvController;

/**
 * 状态模式测试类
 * Created by txwgoogol on 2018/1/9.
 */
public class Client {

    @Test
    public void main() {
        TvController tvController = new TvController();
        //设置开机状态
        tvController.powerOn();
        //下一个频道
        tvController.nextChannel();
        //调高音量
        tvController.turnUp();
        //设置关机状态
        tvController.powerOff();
        //调低音量，此时已经无效不再打印信息
        tvController.turnDown();
    }

}
