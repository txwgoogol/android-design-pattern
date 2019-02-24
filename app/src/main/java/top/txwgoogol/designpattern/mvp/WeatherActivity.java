package top.txwgoogol.designpattern.mvp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.txwgoogol.designpattern.R;

import static com.bumptech.glide.util.Preconditions.checkNotNull;

/**
 * 主界面
 * Created by txwgoogol on 2018/2/13.
 */
public class WeatherActivity extends AppCompatActivity implements WeatherContact.View {

    @BindView(R.id.ok_http)
    Button okHttp;
    @BindView(R.id.tv)
    TextView tv;

    private ProgressDialogEx mProgressDialogEx;
    private WeatherContact.Presenter mPresenter;
    private WeatherPresenter mWeatherPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);

        mProgressDialogEx = new ProgressDialogEx(this);
        mWeatherPresenter = new WeatherPresenter(this);
    }

    @OnClick(R.id.ok_http)
    public void onViewClicked() {
        mPresenter.start();
    }

    @Override
    public void loading() {
        mProgressDialogEx.showProgressDialog();
    }

    @Override
    public void hide() {
        mProgressDialogEx.dismissProgressDialog();
    }

    @Override
    public void success(Weather weather) {
        dataSuccess(weather);
    }

    @Override
    public void failure() {
        mProgressDialogEx.dismissProgressDialog();
    }

    @Override
    public void setPresenter(WeatherContact.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    //填充数据
    private void dataSuccess(Weather model) {
        Weather.WeatherinfoBean weatherinfo = model.getWeatherinfo();
        String showData = getResources().getString(R.string.city) + weatherinfo.getCity()
                + getResources().getString(R.string.wd) + weatherinfo.getWD()
                + getResources().getString(R.string.ws) + weatherinfo.getWS()
                + getResources().getString(R.string.time) + weatherinfo.getTime();
        tv.setText(showData);
    }

}