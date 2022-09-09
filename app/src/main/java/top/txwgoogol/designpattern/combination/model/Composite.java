package top.txwgoogol.designpattern.combination.model;

import java.util.ArrayList;
import java.util.List;

import top.txwgoogol.designpattern.combination.Combination;

/**
 * 具体枝干节点
 * Created by txwgoogol on 2018/1/23.
 */
public class Composite extends Combination {

    //存储器节点的容器
    private List<Combination> combinations = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (combinations != null) {
            for (Combination combination : combinations) {
                combination.doSomething();
            }
        }
    }

    /**
     * 添加子节点
     *
     * @param child 子节点
     */
    public void addChild(Combination child) {
        combinations.add(child);
    }

    /**
     * 移除子节点
     *
     * @param child 子节点
     */
    public void removeChild(Combination child) {
        combinations.remove(child);
    }

    /**
     * 获取子节点
     *
     * @param index 子节点
     */
    public Combination getChildren(int index) {
        return combinations.get(index);
    }

}