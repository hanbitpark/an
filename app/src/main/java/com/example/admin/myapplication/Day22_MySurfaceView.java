package com.example.admin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by admin on 2017-01-04.
 */

public class Day22_MySurfaceView extends SurfaceView {

    Context mContext;
    SurfaceHolder holder;

    public Day22_MySurfaceView(Context context) {
        super(context);

        init(context);
    }

    public Day22_MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        mContext = context;
        holder = getHolder();
    }


}
