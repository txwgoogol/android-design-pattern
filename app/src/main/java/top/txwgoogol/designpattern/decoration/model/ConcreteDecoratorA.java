package top.txwgoogol.designpattern.decoration.model;

/**
 * 装饰着具体实现类
 * Created by txwgoogol on 2018/2/2.
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        //装饰方法A和B既可在父类调用也可在之后调用
        super.operate();
        operateA();
    }

    /**
     * 自定义的装饰方法A
     */
    public void operateA(){
        System.out.println("装饰方法A具体逻辑");
    }

    /**
     * 自定义的装饰方法B
     */
    public void operateB(){
        System.out.println("装饰方法B具体逻辑");
    }

}
