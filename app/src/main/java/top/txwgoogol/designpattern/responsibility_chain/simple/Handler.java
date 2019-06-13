package top.txwgoogol.designpattern.responsibility_chain.simple;

/**
 * 抽象处理者
 * 声明一个请求处理的方法，并在其中保持一个对下一个处理节点Handler对象的引用。
 * Created by txwgoogol on 2018/1/10.
 */
public abstract class Handler {

    public Handler success;//下一节点的处理者

    /**
     * 请求处理
     *
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);

}
