package com.txw.designpattern.mvp;

/**
 * MVP模式 MVP是MVC的演化版本，MVP全称Model-View-Presenter
 * 优点：MVP能够有效的降低View的复杂性，避免业务逻辑被塞进View中，使得View变成一个混乱的"大泥坑"
 * MVP模式接触View和Model的耦合，同时又带来良好的可拓展性、可测试性，保证系统的整体性和灵活性。
 * 对于简单的应用MVP稍显麻烦，各式各样的接口与概念，使应用充斥着零散的接口，但是对于复杂的应用来说，MVP是一种良好的架构模式，
 * 能够非常好的组织应用结构，使应用变得灵活。
 * MVP模式分离显示和逻辑层，他们之间通过接口进行通信，降低耦合。
 * MVP模式让UI洁面和数据分离，使应用分为3层，可以对这3个层次进行独立的单元测试。
 * 可以让我们从Activity、Fragment等View角色分离大部分代码，使得每个类型的代码量大幅度减少，指责单一，便于维护。
 *
 * @author txw
 * @date 2017/11/8.
 */
public class MVP {
}
