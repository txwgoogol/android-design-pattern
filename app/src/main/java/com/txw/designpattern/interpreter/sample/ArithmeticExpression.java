package com.txw.designpattern.interpreter.sample;

/**
 * 抽象的算术运算解释器 为所有解释器共性的提取
 * Created by txw on 2018/1/11.
 */
public abstract class ArithmeticExpression {

    /**
     * 抽象的解释器方法
     * 具体的解析逻辑由具体的子类实现
     *
     * @return 解析得到的具体的值
     */
    public abstract int interpret();

}