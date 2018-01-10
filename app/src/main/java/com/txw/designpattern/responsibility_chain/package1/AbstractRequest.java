package com.txw.designpattern.responsibility_chain.package1;

/**
 * 抽象请求着
 * Created by txw on 2018/1/10.
 */
public abstract class AbstractRequest {

    private Object obj; //处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     *
     * @return
     */
    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    public abstract int getRequestLevel();

}
