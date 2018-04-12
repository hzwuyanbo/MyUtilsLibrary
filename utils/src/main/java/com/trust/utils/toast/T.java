package com.trust.utils.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Description:自定义仿IOS Toast方法
 * Copyright  : Copyright (c) 2018
 * Company    : 中睿泽农
 * Author     : rondo
 * Date       : 2018/3/5 16:16
 */
public class T {
    public static TPrompt tPrompt;
    public static TPromptSuccess tPromptSuccess;
    public static TPromptError tPromptError;

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showMiddleToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPrompt == null) {
                tPrompt = new TPrompt(mContext);
            }
            tPrompt.showToast(msg);
        }
    }

    public static void showAnimSuccessToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPromptSuccess == null) {
                tPromptSuccess = new TPromptSuccess(mContext);
            }
            tPromptSuccess.showToast(msg);
        }
    }

    public static void showAnimErrorToast(Context mContext, String msg) {
        if (!isFastDoubleClick()) {
            if (tPromptError == null) {
                tPromptError = new TPromptError(mContext);
            }
            tPromptError.showToast(msg);
        }
    }

    protected static long lastClickTime;

    protected static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        if (time - lastClickTime < 500) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
