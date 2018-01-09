package com.txw.designpattern.state;

/**
 * 电视遥控器，类似于经典的状态模式中的Context
 * Created by txw on 2018/1/9.
 */
public class TvController implements PowerController {

    State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        state.nextChannel();
    }

    public void preChannel() {
        state.preChannel();
    }

    public void turnUp() {
        state.turnUp();
    }

    public void turnDown() {
        state.turnDown();
    }

}