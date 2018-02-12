package com.txw.designpattern.builder;

/**
 * Builder模式   抽象Builder类
 * 使用场景
 * 1. 相同的方法，不同的执行顺序，产生不同的时间结果。
 * 2. 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果不相同。
 * 3. 产品类非常复杂，或者产品类中的调用顺序不同产生不同的作用。
 * 4. 当初始化一个特别复杂，如参数过多，却很多参数都有默认值时。
 * 优点：1. 良好的封装性，使用建造者可以是客户端不必知道产品内部组成的细节。
 *      2. 建造者独立，容易拓展。
 * 缺点：产生多余的Builder对象以及Director对象，消耗内存。
 *
 * @author txw
 * @date 2017/11/8.
 */
public abstract class Builder {

    //设置注解
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String board);

    //设置操作系统
    public abstract void buildOS();

    //创建Computer
    public abstract Computer create();

}
