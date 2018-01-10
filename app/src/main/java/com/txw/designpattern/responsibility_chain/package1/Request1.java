package com.txw.designpattern.responsibility_chain.package1;

/**
 * 请求者1
 * Created by txw on 2018/1/10.
 */
public class Request1 extends AbstractRequest{

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }

}
