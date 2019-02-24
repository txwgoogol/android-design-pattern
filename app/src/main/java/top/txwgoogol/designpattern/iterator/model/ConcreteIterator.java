package top.txwgoogol.designpattern.iterator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器类 实现迭代器接口，并记录遍历当前位置。
 * Created by txwgoogol on 2018/1/17.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }

}
