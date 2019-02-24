package top.txwgoogol.designpattern.interpreter;

/**
 * 抽象表达式
 * Created by txwgoogol on 2018/1/11.
 */
public abstract class AbstractExpression {

    /**
     * 抽象的解析方法
     *
     * @param ctx 上下文环境对象
     */
    public abstract void interpret(Context ctx);
}
