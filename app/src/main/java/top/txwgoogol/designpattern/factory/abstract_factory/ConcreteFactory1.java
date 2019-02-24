package top.txwgoogol.designpattern.factory.abstract_factory;

/**
 * 具体工厂类1
 * Created by txwgoogol on 2018/1/7.
 */
public class ConcreteFactory1 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductA createProductB() {
        return new ConcreteProductB1();
    }

}
