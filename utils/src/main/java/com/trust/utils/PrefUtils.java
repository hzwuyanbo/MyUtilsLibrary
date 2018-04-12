package com.trust.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Description: 专门访问和设置SharePreference的工具类, 保存和配置一些设置信息
 * Copyright  : Copyright (c) 2017
 * Company    : 中睿泽农
 * Author     : rondo
 * Date       : 2017/6/27 17:39
 */
public class PrefUtils {

    private static final String SHARE_PREFS_NAME = "config";

    //在SharePreference中存储boolean值
    public static void setBoolean(Context context, String key, boolean value) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        pref.edit().putBoolean(key, value).commit();
    }

    //从SharePreference中取出boolean值
    public static boolean getBoolean(Context context, String key, boolean defaultValue) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        return pref.getBoolean(key, defaultValue);
    }

    //在SharePreference中存储String
    public static void setString(Context context, String key, String value) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        pref.edit().putString(key, value).commit();
    }

    //从SharePreference中取出String
    public static String getString(Context context, String key, String defaultValue) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        return pref.getString(key, defaultValue);
    }

    //在SharePreference中存储Int
    public static void setInt(Context context, String key, int value) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        pref.edit().putInt(key, value).commit();
    }

    //从SharePreference中取出Int
    public static int getInt(Context context, String key, int defaultValue) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        return pref.getInt(key, defaultValue);
    }

    //在SharePreference中存储Long
    public static void setLong(Context context, String key, long value) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        pref.edit().putLong(key, value).commit();
    }

    //从SharePreference中取出Long
    public static long getLong(Context context, String key, long defaultValue) {

        SharedPreferences pref = context.getSharedPreferences(SHARE_PREFS_NAME, Context.MODE_PRIVATE);

        return pref.getLong(key, defaultValue);
    }


}
