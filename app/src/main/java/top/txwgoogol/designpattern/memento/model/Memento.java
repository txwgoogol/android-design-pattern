package top.txwgoogol.designpattern.memento.model;

/**
 * 备忘录模式 -- 编程中的"后悔药"
 * 在不破坏封装的条件下，通过备忘录对象存储另外一个对象内部状态的快照，
 * 在将来合适的上海发这个对象还原到存储起来的状态。
 * 使用场景
 * 1. 需要保存一个对象在某一时刻状态或部分状态
 * 2. 如果用一个接口让其他对象得到这些状态，将会暴露对象的实现细节破话对象的封装性，
 * 一个对象不希望外界直接访问其内部状态，通过中间对象可以简介访问内部状态。
 * 优点：
 * 1. 给用户提供可一种可以恢复状态的机制，可以使用用户能够比较方便的回到某个历史的状态。
 * 2. 实现了信息的封装，使得用户不需要关状态的细节。
 * 缺点：
 * 消耗资源，如果成员变量过多，势必造成占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public class Memento {

    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memento{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }

}
