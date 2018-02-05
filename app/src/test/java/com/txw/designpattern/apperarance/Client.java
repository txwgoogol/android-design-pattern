package com.txw.designpattern.apperarance;

import com.txw.designpattern.appearance.model.MobilePhone;

import org.junit.Test;

/**
 * 测试类
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        MobilePhone nexus6 = new MobilePhone();
        //拍照
        nexus6.takePicture();
        //视频聊天
        nexus6.videoChat();

        nexus6.closeCamera();
    }

}
