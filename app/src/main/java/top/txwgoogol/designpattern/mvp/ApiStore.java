package top.txwgoogol.designpattern.mvp;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 接口
 * Created by txwgoogol on 2018/2/13.
 */
public interface ApiStore {

    //加载天气
    @GET("adat/sk/{cityId}.html")
    Call<Weather> loadDataByRetrofit(@Path("cityId") String cityId);

    @GET("adat/sk/{cityId}.html")
    Call<ResponseBody> loadDataByRetrofitRes(@Path("cityId") String cityId);
}