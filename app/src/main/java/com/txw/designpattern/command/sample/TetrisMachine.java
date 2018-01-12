package com.txw.designpattern.command.sample;

/**
 * 接收者角色 俄罗斯方块游戏
 * Created by txw on 2018/1/12.
 */
public class TetrisMachine {

    /**
     * 真正处理"像左"操作的逻辑代码
     */
    public void toLeft() {
        System.out.println("向左");
    }

    /**
     * 真正处理"像右"操作的逻辑代码
     */
    public void toRight() {
        System.out.println("向右");
    }

    /**
     * 真正处理"快速落下"操作的逻辑代码
     */
    public void fastToBottom() {
        System.out.println("快速落下");
    }

    /**
     * 真正处理"改变形状"操作的逻辑代码
     */
    public void transform() {
        System.out.println("改变形状");
    }

}
