package top.txwgoogol.designpattern.command.sample;

/**
 * 请求者类 命令由按钮发起
 * Created by txwgoogol on 2018/1/12.
 */
public class Buttons {

    private LeftCommand leftCommand;//向左移动的命令对象引用
    private RightCommand rightCommand;//向右移动的命令对象引用
    private FallCommand fallCommand;//快速落下的命令对象引用
    private TransformCommand transformCommand;//旋转的命令对象引用

    /**
     * 设置向左移动的命令对象
     *
     * @param leftCommand 向左移动的命令对象
     */
    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    /**
     * 设置向右移动的命令对象
     *
     * @param rightCommand 向左移动的命令对象
     */
    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    /**
     * 设置快速落下的命令对象
     *
     * @param fallCommand 向左移动的命令对象
     */
    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    /**
     * 设置变换形状的命令对象
     *
     * @param transFormCommand 向左移动的命令对象
     */
    public void setTransFormCommand(TransformCommand transFormCommand) {
        this.transformCommand = transFormCommand;
    }

    /**
     * 按下按钮向左移动
     */
    public void toLeft() {
        leftCommand.execute();
    }

    /**
     * 按下按钮向右移动
     */
    public void toRight() {
        rightCommand.execute();
    }

    /**
     * 按下按钮快速落下
     */
    public void fall() {
        fallCommand.execute();
    }

    /**
     * 按下按钮改变形状
     */
    public void transform() {
        transformCommand.execute();
    }
}
