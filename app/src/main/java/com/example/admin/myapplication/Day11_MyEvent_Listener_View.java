package com.example.admin.myapplication;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by admin on 2016-12-16.
 */

public class Day11_MyEvent_Listener_View extends View {

    private static final String TAG = Day11_MyEvent_Listener_View.class.getSimpleName();

    public Day11_MyEvent_Listener_View(Context context) {
        super(context);
    }

    public Day11_MyEvent_Listener_View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            Log.d(TAG, "손가락이 눌렸습니다.");
        }else if(event.getAction() == MotionEvent.ACTION_UP)
            Log.d(TAG, "손가락이 떼졌습니다");
        else if(event.getAction() == MotionEvent.ACTION_MOVE)
            Log.d(TAG,"손가락이 움직이고 있습니다");
        return true;
    }


}
