package top.txwgoogol.designpattern.iterator.model;

/**
 * 容器接口 提供创建具体迭代器角色接口
 * Created by txwgoogol on 2018/1/17.
 */
public interface Aggregate<T> {

    /**
     * 添加一个元素
     *
     * @param obj 元素对象
     */
    void add(T obj);

    /**
     * 移除一个元素
     *
     * @param obj 元素对象
     */
    void remove(T obj);

    /**
     * 获取容器迭代器
     *
     * @return 迭代对象
     */
    Iterator<T> iterator();
}
