package com.micheis.rxkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import com.micheis.rxkit.interfaces.OnSimpleListener;

/**
 * ================================================
 *
 * @Description: 描述
 * @Author: wxianing
 * @Date: 2024/6/23 16:51
 * ================================================
 */
public class RxTools {

    private static Context mContext;

    public static void init(Context context) {
        mContext = context.getApplicationContext();
    }

    public static Context getContext() {
        if (mContext != null) {
            return mContext;
        }
        throw new NullPointerException("请先调用init()方法");
    }

    /**
     * 延迟执行任务
     *
     * @param delayTime        延迟时间
     * @param onSimpleListener 监听
     */
    public static void delayToDo(long delayTime, final OnSimpleListener onSimpleListener) {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            onSimpleListener.doSomething();
        }, delayTime);
    }

    /**
     * 倒计时
     *
     * @param textView 控件
     * @param waitTime 倒计时总时长
     * @param interval 倒计时的间隔时间
     * @param hint     倒计时完毕时显示的文字
     */
    public static void countDown(final TextView textView, long waitTime, long interval, final String hint) {
        textView.setEnabled(false);
        android.os.CountDownTimer timer = new android.os.CountDownTimer(waitTime, interval) {

            @SuppressLint("DefaultLocale")
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(String.format("剩下 %d S", millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                textView.setEnabled(true);
                textView.setText(hint);
            }
        };
        timer.start();
    }

}
