package com.txw.designpattern.responsibility_chain.package1;

/**
 * 处理者2
 * Created by txw on 2018/1/10.
 */
public class Handler2 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2 handle request:" + request.getRequestLevel());
    }

}
