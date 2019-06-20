package top.txwgoogol.designpattern.mvp;

import android.util.Log;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by txwgoogol on 2018/2/13.
 */
public class WeatherPresenter implements WeatherContact.Presenter {

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
            public void onResponse(@NotNull Call<Weather> call, @NotNull Response<Weather> response) {
                Log.d("TAG", "body=========" + new Gson().toJson(response.body()));
                mWeatherView.success(response.body());
                mWeatherView.hide();
            }

            @Override
            public void onFailure(@NotNull Call<Weather> call, @NotNull Throwable t) {
                mWeatherView.failure();
            }
        });

        /*
        ApiClient.getInstance().create(ApiStore.class).loadDataByRetrofitRes("101190201").enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NotNull Call<ResponseBody> call, @NotNull Response<ResponseBody> response) {
                Log.d("TAG", "body=========" + new Gson().toJson(response.body()));
//                mWeatherView.success(response.body());
                mWeatherView.hide();
            }

            @Override
            public void onFailure(@NotNull Call<ResponseBody> call, @NotNull Throwable t) {
                mWeatherView.failure();
            }
        });
        */

    }

}