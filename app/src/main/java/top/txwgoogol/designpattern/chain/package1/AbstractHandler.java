package top.txwgoogol.designpattern.chain.package1;

/**
 * 抽象处理者
 * Created by txwgoogol on 2018/1/10.
 */
public abstract class AbstractHandler {

    public AbstractHandler nextHandler;//下一个节点的处理者对象

    /**
     * 处理请求
     *
     * @param request 请求对象
     */
    public final void handleRequest(AbstractRequest request) {
        if (request.getRequestLevel() == getHandleLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("没有对象能处理这个请求");
            }
        }
    }

    /**
     * 获取处理者对象级别
     *
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的处理级别
     *
     * @param request 处理级别
     */
    protected abstract void handle(AbstractRequest request);

}