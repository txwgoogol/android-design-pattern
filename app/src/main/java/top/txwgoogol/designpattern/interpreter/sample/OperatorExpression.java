package top.txwgoogol.designpattern.interpreter.sample;

/**
 * 运算符抽象解释器 为所有运算符号解释器共性的提取
 * Created by txwgoogol on 2018/1/11.
 */
public class OperatorExpression extends ArithmeticExpression {

    //声明两个成员变量存储运算符号两边的数字解释器
    protected ArithmeticExpression exp1, exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpret() {
        return 0;
    }

}
