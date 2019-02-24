package top.txwgoogol.designpattern.mvp;

/**
 * 视图和模型的关联纽带
 * Created by txwgoogol on 2018/2/13.
 */
public interface WeatherContact {

    interface View extends BaseView<Presenter> {

        void loading();

        void hide();

        void success(Weather weather);

        void failure();

    }

    interface Presenter extends BasePresenter {

    }

}