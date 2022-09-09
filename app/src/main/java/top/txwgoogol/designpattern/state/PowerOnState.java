package top.txwgoogol.designpattern.state;

/**
 * 开机状态，此时在触发开机功能不做任何操作
 * Created by txwgoogol on 2018/1/9.
 */
public class PowerOnState implements State {

    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }

}