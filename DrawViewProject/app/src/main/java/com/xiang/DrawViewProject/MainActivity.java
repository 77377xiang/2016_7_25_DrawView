package com.xiang.DrawViewProject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout root = (LinearLayout) findViewById(R.id.root);
        DrawView draw = new DrawView(this);
       //设置组件最小宽高
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        //给布局添加控件
        root.addView(draw);
    }
}
