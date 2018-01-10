package com.txw.designpattern.responsibility_chain.package1;

/**
 * 处理者1
 * Created by txw on 2018/1/10.
 */
public class Handler3 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3 handle request:" + request.getRequestLevel());
    }

}
