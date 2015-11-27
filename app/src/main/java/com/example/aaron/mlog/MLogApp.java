package com.example.aaron.mlog;

import android.app.Application;

import com.example.aaron.library.MLog;

/**
 * Created by aaron on 15/11/27.
 */
public class MLogApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化日志框架
        MLog.init(true);
    }
}

