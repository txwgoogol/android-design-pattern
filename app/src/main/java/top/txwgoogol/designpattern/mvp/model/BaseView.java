package top.txwgoogol.designpattern.mvp.model;

/**
 * 视图接口层，与视图进行数据传输的接口
 * Created by txwgoogol on 2018/2/13.
 */
public interface BaseView<T> {

    void setPresenter(T presenter);

}