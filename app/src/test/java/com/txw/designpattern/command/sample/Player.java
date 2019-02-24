package com.txw.designpattern.command.sample;

import org.junit.Test;

import top.txwgoogol.designpattern.command.sample.Buttons;
import top.txwgoogol.designpattern.command.sample.FallCommand;
import top.txwgoogol.designpattern.command.sample.LeftCommand;
import top.txwgoogol.designpattern.command.sample.RightCommand;
import top.txwgoogol.designpattern.command.sample.TetrisMachine;
import top.txwgoogol.designpattern.command.sample.TransformCommand;

/**
 * Created by txwgoogol on 2018/1/12.
 */
public class Player {

    @Test
    public void main() {
        //创建俄罗斯方块游戏对象
        TetrisMachine tetrisMachine = new TetrisMachine();
        //根据游戏构造四种命令
        LeftCommand leftCommand = new LeftCommand(tetrisMachine);
        RightCommand rightCommand = new RightCommand(tetrisMachine);
        FallCommand fallCommand = new FallCommand(tetrisMachine);
        TransformCommand transformCommand = new TransformCommand(tetrisMachine);
        //按钮可以执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransFormCommand(transformCommand);
        //具体按下的按钮
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.toRight();
    }

}
