package top.txwgoogol.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import top.txwgoogol.designpattern.mvc.model.MVCActivity;
//import top.txwgoogol.designpattern.mvp.model.MVPActivity;

/**
 * 设计模式
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public class MainActivity extends AppCompatActivity {

    private Button designPattern;
    private Button mvc;
    private Button mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        designPattern = findViewById(R.id.design_pattern);
        mvc = findViewById(R.id.mvc);
        mvp = findViewById(R.id.mvp);

        mvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MVCActivity.class));
            }
        });
        mvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, MVPActivity.class));
            }
        });

    }

}