package top.txwgoogol.designpattern.proxy.model;

/**
 * 实现抽象主题的真是主题类
 * Created by txwgoogol on 2018/1/22.
 */
public class RealSubject extends Subject {

    @Override
    public void visit() {
        //RealSubject 中 visit的具体逻辑
        System.out.println("Real subject");
    }

}
