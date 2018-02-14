package com.txw.designpattern.mvp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.txw.designpattern.R;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 主界面
 * Created by txw on 2018/2/13.
 */
public class WeatherActivity extends AppCompatActivity {

    @BindView(R.id.ok_http)
    Button okHttp;
    @BindView(R.id.tv)
    TextView tv;

    private OkHttpClient mOkHttpClient;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    tv.setText(msg.obj.toString());
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ok_http)
    public void onViewClicked() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                okRun();
            }
        }).start();
    }

    //执行亲求
    private void okRun() {
        mOkHttpClient = new OkHttpClient();

        final Request request = new Request.Builder().url("http://publicobject.com/helloworld.txt").build();

        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    Message message = Message.obtain();
                    message.what = 1;
                    message.obj = response.body().string();
                    handler.sendMessage(message);
                }
            }
        });
    }

}