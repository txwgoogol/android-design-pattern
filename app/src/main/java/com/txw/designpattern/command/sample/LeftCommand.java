package com.txw.designpattern.command.sample;

/**
 * 具体命令执行者 向左移的命令类
 * Created by txw on 2018/1/12.
 */
public class LeftCommand implements Command {

    //持有一个接收者俄罗斯方块对象的引用
    private TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        //调用游戏里的具体方法执行操作
        tetrisMachine.toLeft();
    }

}
