package com.txw.designpattern.factory.abstract_factory;

/**
 * 抽象工厂模式
 * 一个对象有相同的约束时可以使用抽象工厂模式。
 * Android、iOS、Window Phone 下都有短信软件和拨号软，两者都属于Software然间范畴，
 * 但是他们的操作系统平台不一样，即便是同一家公司出品的软件，其代码的实现逻辑也是不同的，
 * 这时候就要考虑使用抽象工厂方法实现Android、iOS、Window Phone下的短信软件和拨号软件。
 * 优点：接口与实现分离，客户端使用抽象工厂创建需要的对象，客户端不需要知道具体的实现是谁，客户端面向产品的编程而已，
 * 使其从具体的产品实现中解耦，同时基于接口与实现分离，是抽象工厂方法模式在切换产品类是更加灵活、容易。
 * 缺点：类文件爆炸式增加，不容易拓展新的产品类，因为每增加一个产品类就需要修改抽象工厂，所有具体工厂类均会被修改。
 * @author txw
 * @date 2017/11/8.
 */
public abstract class AbstractFactory {

    /**
     * 创建产品类A的方法
     *
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品类B的方法
     *
     * @return 产品B对象
     */
    public abstract AbstractProductA createProductB();

}
