package top.txwgoogol.designpattern.adapter.objectmodel;

import top.txwgoogol.designpattern.adapter.FiveVolt;
import top.txwgoogol.designpattern.adapter.Volt220;

/**
 * 对象适配器模式
 * Created by txwgoogol on 2018/2/1.
 */
public class VoltAdapter implements FiveVolt {

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
