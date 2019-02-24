package com.txw.designpattern.prototype;

import org.junit.Test;

import top.txwgoogol.designpattern.prototype.WordDocument;

/**
 * 简单的原型模式
 * Created by txwgoogol on 2018/1/4.
 */
public class Client {

    /**
     * 简单的原型模式
     */
    @Test
    public void main() {
        //构建文档对象
        WordDocument originDoc = new WordDocument();
        //编辑文档，添加图片
        originDoc.setText("这是一篇文档");
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        //修改文档副本，不会影响原始文档
        doc2.setText("这是修改过的Doc2文本");
        doc2.showDocument();

        originDoc.showDocument();
    }

    /**
     * 浅拷贝
     */
    @Test
    public void main1() {
        //构建文档对象
        WordDocument originDoc = new WordDocument();
        //编辑文档，添加图片
        originDoc.setText("这是一篇文档");
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        //修改文档副本，不会影响原始文档
        doc2.setText("这是修改过的Doc2文本");
        doc2.addImages("呵呵.jpg");
        doc2.showDocument();

        originDoc.showDocument();
    }

}
