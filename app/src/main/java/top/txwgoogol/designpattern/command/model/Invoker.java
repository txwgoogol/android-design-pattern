package top.txwgoogol.designpattern.command.model;

/**
 * 请求者类
 * Created by txwgoogol on 2018/1/12.
 */
public class Invoker {

    //持有一个相对命令对象的引用
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        //调用具体的对象的相关方法，执行具体命令
        command.execute();
    }

}
