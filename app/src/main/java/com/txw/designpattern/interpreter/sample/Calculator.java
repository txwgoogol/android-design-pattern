package com.txw.designpattern.interpreter.sample;

import java.util.Stack;

/**
 * 处理与解释相关的一些业务
 * Created by txw on 2018/1/11.
 */
public class Calculator {

    //声明一个Stack栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> mExpressions = new Stack<ArithmeticExpression>();

    public Calculator(String expressions) {
        //声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;
        //根据空格分割表达式字符串
        String[] elements = expressions.split(" ");
        for (int i = 0; i < elements.length; i++) {
            /**
             * 判断运算符号
             */
            switch (elements[i].charAt(0)) {
                case '+': //如果是加号
                    //则将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpressions.pop();
                    //同时将元算符号数组下标下一个元素构成为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造为一个数字解释器
                    mExpressions.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-': //如果是加号
                    //则将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpressions.pop();
                    //同时将元算符号数组下标下一个元素构成为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造为一个数字解释器
                    mExpressions.push(new SubtractionExpression(exp1, exp2));
                    break;
                default://如果为数字
                    mExpressions.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 计算结构
     *
     * @return 最终的计算结构
     */
    public int calculate() {
        return mExpressions.pop().interpret();
    }

}
