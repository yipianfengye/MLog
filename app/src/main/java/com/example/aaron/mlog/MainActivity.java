package com.example.aaron.mlog;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.aaron.library.MLog;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public Activity mContext = null;

    public TextView title = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        title = (TextView) findViewById(R.id.title);
        title.setOnClickListener(new View.OnClickListener() {
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
