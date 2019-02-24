package top.txwgoogol.designpattern.interpreter.sample;

/**
 * 数字解释器 仅仅为了解释数字
 * Created by txwgoogol on 2018/1/11.
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }

}