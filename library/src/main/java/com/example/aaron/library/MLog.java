package com.example.aaron.library;

import android.util.Log;

/**
 * Created by aaron on 15/11/27.
 * 模仿logger，创建自己的日志操作类
 */
public class MLog {
    public static final String TAG = MLog.class.getSimpleName();
    /**
     * 控制变量，是否显示log日志
     */
    public static boolean isShowLog = false;
    public static String defaultMsg = "";
    public static final int V = 1;
    public static final int D = 2;
    public static final int I = 3;
    public static final int W = 4;
    public static final int E = 5;

    /**
     *  初始化控制变量
     * @param isShowLog
     */
    public static void init(boolean isShowLog) {
        MLog.isShowLog = isShowLog;
    }

    /**
     * 初始化控制变量和默认日志
     * @param isShowLog
     * @param defaultMsg
     */
    public static void init(boolean isShowLog, String defaultMsg) {
        MLog.isShowLog = isShowLog;
        MLog.defaultMsg = defaultMsg;
    }

    public static void v() {
        llog(V, null, defaultMsg);
    }

    public static void v(Object obj) {
        llog(V, null, obj);
    }

    public static void v(String tag, Object obj) {
        llog(V, tag, obj);
    }

    public static void d() {
        llog(D, null, defaultMsg);
    }

    public static void d(Object obj) {
        llog(D, null, obj);
    }

    public static void d(String tag, Object obj) {
        llog(D, tag, obj);
    }

    public static void i() {
        llog(I, null, defaultMsg);
    }

    public static void i(Object obj) {
        llog(I, null, obj);
    }

    public static void i(String tag, String obj) {
        llog(I, tag, obj);
    }

    public static void w() {
        llog(W, null, defaultMsg);
    }

    public static void w(Object obj) {
        llog(W, null, obj);
    }

    public static void w(String tag, Object obj) {
        llog(W, tag, obj);
    }

    public static void e() {
        llog(E, null, defaultMsg);
    }

    public static void e(Object obj) {
        llog(E, null, obj);
    }

    public static void e(String tag, Object obj) {
        llog(E, tag, obj);
    }



    /**
     * 执行打印方法
     * @param type
     * @param tagStr
     * @param obj
     */
    public static void llog(int type, String tagStr, Object obj) {
        String msg;
        if (!isShowLog) {
            return;
        }

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        int index = 4;
        String className = stackTrace[index].getFileName();
        String methodName = stackTrace[index].getMethodName();
        int lineNumber = stackTrace[index].getLineNumber();

        String tag = (tagStr == null ? className : tagStr);
        methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ (").append(className).append(":").append(lineNumber).append(")#").append(methodName).append(" ] ");

        if (obj == null) {
            msg = "Log with null Object";
        } else {
            msg = obj.toString();
        }
        if (msg != null) {
            stringBuilder.append(msg);
        }

        String logStr = stringBuilder.toString();

        switch (type) {
            case V:
                Log.v(tag, logStr);
                break;
            case D:
                Log.d(tag, logStr);
                break;
            case I:
                Log.i(tag, logStr);
                break;
            case W:
                Log.w(tag, logStr);
                break;
            case E:
                Log.e(tag, logStr);
                break;
        }
    }
}
