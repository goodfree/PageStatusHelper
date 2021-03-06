package com.smartcity.commonbase.widget.pagestatus.imp;

import android.view.View;
import android.view.ViewGroup;

import com.smartcity.commonbase.widget.pagestatus.LayoutParams;
import com.smartcity.commonbase.widget.pagestatus.ViewUtils;

/**
 * Author: YuJunKui
 * Time:2017/12/8 10:57
 * Tips:
 */

public class LinearLayoutViewStatusImp  extends ViewGroupViewStatusImp {

    @Override
    public void addStatusView(View bindView, View addView, LayoutParams params) {

        ViewGroup parent = (ViewGroup) bindView.getParent();

        if (parent.indexOfChild(addView) == -1) {

            ViewGroup.MarginLayoutParams layoutParams = new ViewGroup.MarginLayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            if (params.centerInParent) {

                //获取addview宽高
                int[] addViewMetrics = ViewUtils.getViewMetrics(addView);
                int width = addViewMetrics[0];
                int height = addViewMetrics[1];

                //获取bindview宽高
                int[] bindViewMetrics = ViewUtils.getViewMetrics(bindView);
                int parentWidth = bindViewMetrics[0];
                int parentHeight = bindViewMetrics[1];


                int left = (parentWidth - width) / 2;
                int top = (parentHeight - height) / 2;
                addView.setPadding(left, top, left, top);

            } else {

                addView.setPadding(params.paddingLeft, params.paddingTop, params.paddingRight, params.paddingBottom);
            }

            parent.addView(addView, layoutParams);

        }
        bindView.setVisibility(View.GONE);
        addView.setVisibility(View.VISIBLE);
    }

}
