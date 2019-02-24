package top.txwgoogol.designpattern.command.sample;

/**
 * 具体命令执行者 向右移的命令类
 * Created by txwgoogol on 2018/1/12.
 */
public class RightCommand implements Command {

    //持有一个接收者俄罗斯方块对象的引用
    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        //调用游戏里的具体方法执行操作
        tetrisMachine.toRight();
    }

}
