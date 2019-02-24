package top.txwgoogol.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式简单实用
 * 文档类型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 * Created by txwgoogol on 2018/1/4.
 */
public class WordDocument implements Cloneable {

    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("------------WordDocument------------");
    }

    /**
     * 浅拷贝
     * @return
     */
    /*
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    */

    /**
     * 克隆对象
     *
     * @return
     */
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //对mImages对象也调用clone函数，进行深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public List<String> getImages() {
        return mImages;
    }

    public void addImages(String img) {
        this.mImages.add(img);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("------------ Word content start ------------");
        System.out.print("mText=" + mText);
        System.out.print("mImage List \n");
        for (String image : mImages) {
            System.out.println("mImage name " + image);
        }
        System.out.println("------------ Word content end ------------");
    }

}
