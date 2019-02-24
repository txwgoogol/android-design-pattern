package top.txwgoogol.designpattern.appearance.model;

/**
 * Created by txwgoogol on 2018/2/5.
 */
public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCream();

    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        System.out.println("--> 视频聊天接通中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }

}
