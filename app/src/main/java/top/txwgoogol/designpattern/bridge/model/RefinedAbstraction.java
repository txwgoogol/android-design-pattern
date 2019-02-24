package top.txwgoogol.designpattern.bridge.model;

/**
 * 抽象部分的子类
 * Created by txwgoogol on 2018/2/6.
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor mImplementor) {
        super(mImplementor);
    }

    //对父类抽象部分中的方法进行扩展
    public void refinedOperation() {
        System.out.println("对Abstraction中的方法进行扩展");
    }

}
