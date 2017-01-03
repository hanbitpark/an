package com.example.admin.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by admin on 2017-01-03.
 */

public class Day21_PaintBoard extends View {

    Context mContext;
    Paint paint;
    Canvas mCanvas;
    Bitmap mBitmap;
    float oldx, oldy, curx, cury;

    public Day21_PaintBoard(Context context) {
        super(context);

        init(context);

    }

    public Day21_PaintBoard(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        mContext = context;
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(mBitmap != null){
            canvas.drawBitmap(mBitmap, 0, 0, null);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();

        curx = event.getX();
        cury = event.getY();

        if(action == MotionEvent.ACTION_DOWN){

        }else if(action == MotionEvent.ACTION_MOVE){
            mCanvas.drawLine(oldx, oldy, curx, cury, paint);

        }else if(action == MotionEvent.ACTION_UP){

        }

        //무조건 새로 그려준다다
        invalidate();

        oldx = curx;
        oldy = cury;

        return super.onTouchEvent(event);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        if(w>0 && h>0) {
            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas();
            mCanvas.setBitmap(mBitmap);
        }
        super.onSizeChanged(w, h, oldw, oldh);
    }
}
