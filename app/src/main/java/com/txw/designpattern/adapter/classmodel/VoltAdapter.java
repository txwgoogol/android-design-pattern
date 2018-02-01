package com.txw.designpattern.adapter.classmodel;

import com.txw.designpattern.adapter.FiveVolt;
import com.txw.designpattern.adapter.Volt220;

/**
 * adapter角色，将220v 的电压转换成5v的电压
 * Created by txw on 2018/2/1.
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

    @Override
    public int getVolt5() {
        return 5;
    }

}
