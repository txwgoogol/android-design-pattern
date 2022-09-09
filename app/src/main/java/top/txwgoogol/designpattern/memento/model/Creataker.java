package top.txwgoogol.designpattern.memento.model;

import top.txwgoogol.designpattern.memento.Memento;

/**
 * 负责管理Memento
 * Created by txwgoogol on 2018/1/14.
 */
public class Creataker {

    Memento mMemento; //备忘录

    /**
     * 存档
     *
     * @param memento
     */
    public void archive(Memento memento) {
        this.mMemento = memento;
    }

    /**
     * 获取存档
     *
     * @return
     */
    public Memento getMemento() {
        return mMemento;
    }

}
