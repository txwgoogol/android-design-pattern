package top.txwgoogol.designpattern.mvp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txwgoogol on 2018/2/13.
 */
public class WeatherPresenter implements WeatherContact.Presenter{

    private WeatherContact.View mWeatherView;

    public WeatherPresenter(WeatherContact.View view) {
        this.mWeatherView = view;
        mWeatherView.setPresenter(this);
    }

    @Override
    public void start() {
        mWeatherView.loading();
        ApiClient.getInstance().create(ApiStore.class).loadDataByRetrofit("101190201").enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                mWeatherView.success(response.body());
                mWeatherView.hide();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                mWeatherView.failure();
            }
        });
    }

}