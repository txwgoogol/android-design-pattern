package top.txwgoogol.designpattern.command.model;

/**
 * 接收者类
 * 负责具体实施或执行一个请求，执行具体逻辑的角色。
 * Created by txwgoogol on 2018/1/12.
 */
public class Receiver {

    /**
     * 真正执行具体逻辑的方法
     */
    public void action() {
        System.out.println("执行具体操作");
    }

}
