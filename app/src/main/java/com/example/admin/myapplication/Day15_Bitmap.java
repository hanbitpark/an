package com.example.admin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by admin on 2016-12-22.
 */

public class Day15_Bitmap extends Button {

    public Day15_Bitmap(Context context) {
        super(context);
        init();
    }

    public Day15_Bitmap(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        super.setBackgroundResource(R.drawable.ic_arrow_drop_down_black_24dp);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        if(action == MotionEvent.ACTION_DOWN){
            setBackgroundResource(R.drawable.ic_arrow_drop_down_circle_black_24dp);
        }else if(action == MotionEvent.ACTION_UP){
            setBackgroundResource(R.drawable.ic_arrow_drop_down_black_24dp);
        }
        return true;
    }
}
