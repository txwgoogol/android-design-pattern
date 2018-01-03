package com.txw.designpattern.builder;

/**
 * 计算机抽象类，即Product角色
 * Created by txw on 2018/1/3.
 */
public class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    //设置主板
    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    //设置显示器
    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    //设置操作系统
    public void setOS() {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }

}
