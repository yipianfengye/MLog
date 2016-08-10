package com.example.aaron.mlog;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.uuch.mlogLibrary.MLog;

/**
 * 测试日志
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public Activity mContext = null;

    public Button button1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        initView();

        initListener();
    }

    /**
     * 初始化组件
     */
    private void initView() {
        button1 = (Button) findViewById(R.id.button1);
    }

    /**
     * 初始化组件事件监听
     */
    private void initListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MLog.v("this is a v msg!!!");
                MLog.d("this is a d msg!!!");
                MLog.i("this is a i msg!!!");
                MLog.w("this is a w msg!!!");
                MLog.e("this is a e msg!!!");
            }
        });
    }

}
