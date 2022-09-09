package top.txwgoogol.designpattern.mvi;

/**
 * View: Activity 和xml文件，与其他模式中的View的概念相同。
 * Intent: 定义数据操作，将数据传到Model的唯一来源。
 * ViewModel: 存储视图状态，负责处理表现逻辑，并将ViewState设置给可观察数据容器
 * ViewState: 一个数据类，包含页面状态和对应的数据。
 * 特点：
 * 唯一可信源：数据只有一个来源（ViewModel）,与MVVM思想相同
 * 单向数据流：状态向下流动，事件向上流动。
 * 响应式：ViewState包含页面当前状态和数据，View通过订阅ViewState就可以完成页面刷新。相比于 MVVM 是新的特性。
 */
public class MVI {
}
