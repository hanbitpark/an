package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by admin on 2016-12-16.
 */


public class Day11_GestureDetector extends GestureDetector.SimpleOnGestureListener {

    TextView textView, textView2;
    static Context mContext;



    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
    textView = (TextView)((Activity)mContext).findViewById(R.id.textView7);
//        textView = (TextView)((Activity)mContext).findViewById(R.id.textView7);
        textView.setText("onFling호출됨 : " + velocityX + " , " + velocityY);
        return super.onFling(e1, e2, velocityX, velocityY);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//        textView2 = (TextView)((Activity)mContext).findViewById(R.id.textView7);
        textView.setText("onScroll호출됨 : " + distanceX + " , " + distanceY);

        return super.onScroll(e1, e2, distanceX, distanceY);
    }


}

