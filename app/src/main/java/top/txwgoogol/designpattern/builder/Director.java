package top.txwgoogol.designpattern.builder;

/**
 * Director类，负责构造Computer
 * Created by txwgoogol on 2018/1/3.
 */
public class Director {

    Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    //构建对象
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }

}
