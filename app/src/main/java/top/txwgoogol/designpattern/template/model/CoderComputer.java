package top.txwgoogol.designpattern.template.model;

/**
 * 程序演的计算机
 * Created by txwgoogol on 2018/1/18.
 */
public class CoderComputer extends AbstractComputer{

    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户名和密码验证就可以了");
    }

}
