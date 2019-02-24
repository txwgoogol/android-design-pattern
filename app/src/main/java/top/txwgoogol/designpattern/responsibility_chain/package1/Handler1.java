package top.txwgoogol.designpattern.responsibility_chain.package1;

/**
 * 处理者1
 * Created by txwgoogol on 2018/1/10.
 */
public class Handler1 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequestLevel());
    }

}
