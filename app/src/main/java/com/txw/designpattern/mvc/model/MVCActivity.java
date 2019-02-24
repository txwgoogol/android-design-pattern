package com.txw.designpattern.mvc.model;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.txw.designpattern.R;

/**
 * Android 中 MVC模式的简单实现
 * Created by txw on 2018/2/7.
 */
public class MVCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mvc);

        //设置视图层
        setData();
    }

    public void setData() {
        final ListView listView = new ListView(this);
        listView.setBackgroundColor(Color.WHITE);
        setContentView(listView);

        //获取数据
        final String[] data = getResources().getStringArray(R.array.data);
        //数据绑定
        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_mvc_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MVCActivity.this, data[i], Toast.LENGTH_SHORT).show();
                //Toast.makeText(MVCActivity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
