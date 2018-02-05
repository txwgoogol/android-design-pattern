package com.txw.designpattern.appearance.model;

/**
 * Created by txw on 2018/2/5.
 */
public class SamsungCream implements Camera {

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }


}
