package com.txw.designpattern.decoration.model;

/**
 * 组件具体实现类
 * Created by txw on 2018/2/2.
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        //具体逻辑
        System.out.println("具体逻辑");
    }

}
