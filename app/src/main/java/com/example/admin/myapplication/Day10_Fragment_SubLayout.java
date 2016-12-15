package com.example.admin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class Day10_Fragment_SubLayout extends LinearLayout {


    public Day10_Fragment_SubLayout(Context context) {
        super(context);

        init(context);
    }

    public Day10_Fragment_SubLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context mContext){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_day10__fragment__sub_layout, this, true);

    }
}
