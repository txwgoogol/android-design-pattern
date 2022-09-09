package top.txwgoogol.designpattern.memento;

/**
 * 使命召唤游戏（数据模型可能不太合理，这里只做简单的演示）
 * Created by txwgoogol on 2018/1/14.
 */
public class CallOfDuty {

    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    //玩游戏
    public void play() {
        System.out.println("玩游戏:" + String.format("第%d关", mCheckpoint) + "奋战杀敌中");
        mLifeValue = 10;
        System.out.println("进度升级啦！");
        mCheckpoint++;
        System.out.println("达到:" + String.format("第%d关", mCheckpoint));
    }

    //退出游戏
    public void quit() {
        System.out.println("----------------");
        System.out.println("退出前的游戏属性:" + this.toString());
        System.out.println("退出游戏");
        System.out.println("----------------");
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mCheckpoint = mCheckpoint;
        memento.mLifeValue = mLifeValue;
        memento.mWeapon = mWeapon;
        return memento;
    }

    /**
     * 恢复游戏
     *
     * @param memento
     */
    public void restore(Memento memento) {
        this.mCheckpoint = memento.mCheckpoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;
        System.out.println("恢复后的游戏属性:" + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }

}