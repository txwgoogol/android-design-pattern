package com.txw.designpattern.builder;

/**
 * 具体的Builder类，MacBookBuilder
 * Created by txw on 2018/1/3.
 */
public class MacBookBuilder extends Builder {

    private Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String board) {
        mComputer.setDisplay(board);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }

}
