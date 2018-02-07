package com.txw.designpattern.mvc;

/**
 * MVC模式
 * 全称：Model-View-Controller （模型-视图-控制器）
 * 目的：将数据模型和视图分离，并以控制器作为连接两者的桥梁实现解耦。
 * MVC是一种框架模式而非设计模式，GOF把MVC看作是三种设计模式：观察者模式、策略模式和组合者模式的合体，核心在观察者模式，是一个基于发布/订阅的框架，
 * 优点：理解起来比较容易，技术含量不高，开发维护成本低易于修改和维护，耦合性不高，表现层和业务层分离实现各司其职
 * 缺点：定义不明确，理解MVC模式不容易。使用MVC模式需要精心计划，由于内部原理复杂，需要花费一些时间思考。
 * 使用MVC模式架构的工程，需要花费一些时间将MVC模式运用到应用中，由于Model和View要严格分离，给程序带来一定的测试困难。每个构建在使用前都需要彻底测试。
 * MVC模式将应用分为三个部件，所以同一个工程会增多很多文件。
 * 在MVC模式中，控制器Activity主要起到的作用是解耦，将视图View和Model进行分离，两者在Activity中进行绑定或完成其他逻辑。
 *
 * @author txw
 * @date 2017/11/8.
 */
public class MVC {
}