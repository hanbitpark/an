package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Day11_MyEvent_Listener extends AppCompatActivity {

    TextView textView;
    GestureDetector detector;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day11__my_event__listener);

        textView = (TextView)findViewById(R.id.textView7);
        Button button = (Button)findViewById(R.id.button7);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("버튼이 클릭되었습니다.");
//            }
//        });

        button.setOnTouchListener(new View.OnTouchListener() {


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    textView.setText("손가락이 눌렸습니다.");
                }else if(event.getAction() == MotionEvent.ACTION_UP)
                    textView.setText("손가락이 떼졌습니다.");
                return false;
            }
        });


//        detector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener(){
//            @Override
//            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//                textView.
//                return super.onScroll(e1, e2, distanceX, distanceY);
//            }
//
//            @Override
//            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//                return super.onFling(e1, e2, velocityX, velocityY);
//            }
//        });

        textView = (TextView)findViewById(R.id.textView7);

        detector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
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
        });


//        detector = new GestureDetector(this, new Day11_GestureDetector());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (detector != null){

            return detector.onTouchEvent(event);
        }else{

            return super.onTouchEvent(event);
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "onBackPressed()호출됨", Toast.LENGTH_SHORT).show();
        return;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(this, "가로방향", Toast.LENGTH_SHORT).show();
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "세로방향", Toast.LENGTH_SHORT).show();
        }
    }
}
