package top.txwgoogol.designpattern.mvvm;

/**
 * MVVM代表模型（Model）、视图（View）、视图模型（ViewModel）
 * 模型（Model）：它保存应用程序的数据。它不能直接与视图对话。通常，建议通过可观察对象将数据公开给ViewModel。
 * 视图（View）：它代表了应用程序的UI，没有任何应用程序逻辑。它观察ViewModel。
 * 视图模型（ViewModel）：它充当模型和视图之间的链接。它负责从模型转换数据。它向视图提供数据流。它还使用钩子或回调来更新视图。它将向模型请求数据。
 */
public class MVVM {
}
