package com.example.admin.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by admin on 2017-01-02.
 */

public class Day19_MyView extends View {
    private static final String TAG = Day19_MyView.class.getSimpleName();
    float curX1, curX2, curY1, curY2;
    float oldX1, oldX2, oldY1, oldY2;
    float diffx1, diffy1;
    Bitmap bitmap;
    Canvas mCanvas;
    Paint mPaint;
    Bitmap mBitmap;

    public Day19_MyView(Context context) {
        super(context);

        init(context);
    }

    public Day19_MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context){
        Resources resources = context.getResources();
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.beach);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        int pointerCount = event.getPointerCount();

        curX1 = event.getX(0);
        curY1 = event.getY(0);

        if(pointerCount > 1) {
            curX2 = event.getX(1);
            curY2 = event.getY(1);
        }

        if(action == MotionEvent.ACTION_DOWN){
            Log.d(TAG, "손가락 눌렸습니다. : " + pointerCount + ", " + curX1 + ", " + curY1 + ", " + curX2 + ", " + curY2);
        }else if(action == MotionEvent.ACTION_MOVE){
            Log.d(TAG, "손가락 움직였습니다. : " + pointerCount + ", " + curX1 + ", " + curY1 + ", " + curX2 + ", " + curY2);

            diffx1 = curX1;
            diffy1 = curY1;

            redraw();

        }else if(action == MotionEvent.ACTION_UP){
            Log.d(TAG, "손가락 떼졌습니다. : " + pointerCount + ", " + curX1 + ", " + curY1 + ", " + curX2 + ", " + curY2);
        }

        oldX1 = curX1;
        oldY1 = curY1;
        oldX2 = curX2;
        oldY2 = curY2;

        return true;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        if(w>0 && h>0){
            newImage(w,h);
            redraw();
        }

    }

    private void newImage(int w, int h){
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas();
        mCanvas.setBitmap(mBitmap);
    }

    private void redraw(){
        mCanvas.drawColor(Color.WHITE);
        mCanvas.drawBitmap(bitmap, diffx1, diffy1, mPaint);

        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(mBitmap != null){
            canvas.drawBitmap(mBitmap, 0, 0, null);
        }
    }
}
