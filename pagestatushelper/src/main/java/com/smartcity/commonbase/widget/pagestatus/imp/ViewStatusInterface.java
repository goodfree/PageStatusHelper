package com.smartcity.commonbase.widget.pagestatus.imp;

import android.view.View;

import com.smartcity.commonbase.widget.pagestatus.LayoutParams;

/**
 * Author: YuJunKui
 * Time:2017/12/8 10:55
 * Tips:
 */

public interface ViewStatusInterface {


    void addStatusView(View bindView, View addView, LayoutParams params);

    void showContentView(View bindView, View addView);

}
