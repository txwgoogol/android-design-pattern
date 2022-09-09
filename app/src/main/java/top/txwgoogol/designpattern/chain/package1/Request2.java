package top.txwgoogol.designpattern.chain.package1;

/**
 * 请求者2
 * Created by txwgoogol on 2018/1/10.
 */
public class Request2 extends AbstractRequest{

    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }

}
