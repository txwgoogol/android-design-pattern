package top.txwgoogol.designpattern.visitor.model;

import top.txwgoogol.designpattern.visitor.Engineer;
import top.txwgoogol.designpattern.visitor.Manager;

/**
 * 访问者模式 定义：封装一些作用于某种数据结构中的各种元素的操作，它可以不改变这个数据结构的前提下定义左右于这些元素的系的操作。
 * 使用场景
 * 1. 对象结构比较稳定，但经常需要在次对象结构上定义新的操作
 * 2. 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免这些操作"污染"这些对象的类，也不希望在增加新操作时候修改这个类。
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public interface Visitor {

    //访问工程师类型
    public void visit(Engineer engineer);

    //访问经历类型
    public void visit(Manager manager);

}