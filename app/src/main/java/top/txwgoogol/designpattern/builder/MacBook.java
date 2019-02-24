package top.txwgoogol.designpattern.builder;

/**
 * 具体的Computer类，MacBook
 * Created by txwgoogol on 2018/1/3.
 */
public class MacBook extends Computer {

    public MacBook() {
    }

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }

}
