package top.txwgoogol.designpattern.state;

/**
 * 关机状态，此时只有开机功能是有效的
 * Created by txwgoogol on 2018/1/9.
 */
public class PowerOffState implements State{

    @Override
    public void nextChannel() {

    }

    @Override
    public void preChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
