package com.txw.designpattern.responsibility_chain.package1;

/**
 * 请求者2
 * Created by txw on 2018/1/10.
 */
public class Request3 extends AbstractRequest{

    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }

}
