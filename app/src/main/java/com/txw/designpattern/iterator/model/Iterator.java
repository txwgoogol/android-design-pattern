package com.txw.designpattern.iterator.model;

/**
 * 迭代器模式
 * 使用场景：遍历一个容器的对象时
 * 优点：
 * 支持以不同方式遍历一个容器对象，也可以有多个遍历，弱化容器类与遍历算法之间的关系。
 * 缺点：
 * 文件类的增加
 * 迭代器接口 定义访问遍历元素接口
 *
 * @author txw
 * @date 2017/11/8.
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     *
     * @return true 表示有 false 表示没有
     */
    boolean hasNext();

    /**
     * 返回当前元素并将位置移至下一位
     *
     * @return
     */
    T next();
}
