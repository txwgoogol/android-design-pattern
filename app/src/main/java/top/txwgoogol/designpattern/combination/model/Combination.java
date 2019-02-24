package top.txwgoogol.designpattern.combination.model;

/**
 * 组合模式定义：将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * 表示对象的部分-整体层次结构时。
 * 从一个整体中能够独立出来部分模块或功能的场景
 * <p>
 * 抽象跟节点
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public abstract class Combination {

    protected String name;//节点名

    public Combination(String name) {
        this.name = name;
    }

    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();

}