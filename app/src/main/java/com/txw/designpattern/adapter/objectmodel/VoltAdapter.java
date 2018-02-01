package com.txw.designpattern.adapter.objectmodel;

import com.txw.designpattern.adapter.FiveVolt;
import com.txw.designpattern.adapter.Volt220;

/**
 * 对象适配器模式
 * Created by txw on 2018/2/1.
 */
public class VoltAdapter implements FiveVolt{

    private Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }

}
