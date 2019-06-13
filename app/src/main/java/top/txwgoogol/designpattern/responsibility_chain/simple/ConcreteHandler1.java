package top.txwgoogol.designpattern.responsibility_chain.simple;

/**
 * 具体的处理者1
 * 对请求进行处理，如果不能处理则将该请求给下一个节点的处理对象。
 * Created by txwgoogol on 2018/1/10.
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled");
            //return;
        } else {
            success.handleRequest(condition);
        }
    }

}
