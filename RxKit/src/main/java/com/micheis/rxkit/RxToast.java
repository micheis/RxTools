package com.micheis.rxkit;

import android.widget.Toast;

/**
 * ================================================
 *
 * @Description: 描述
 * @Author: wxianing
 * @Date: 2024/6/23 16:51
 * ================================================
 */
public class RxToast {
    public static void show(String message) {
        Toast.makeText(RxTools.getContext(), message, Toast.LENGTH_LONG).show();
    }
}
