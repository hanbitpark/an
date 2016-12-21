package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class Day13_PageSliding extends AppCompatActivity {

    LinearLayout slidingPanel;
    Button button;
    Animation traslateLeftAnim;
    Animation traslateRightAnim;
    //페이지가 닫혔다
    boolean isPageOpen = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day13__page_sliding);

        traslateLeftAnim = AnimationUtils.loadAnimation(this, R.anim.translate_left);
        traslateRightAnim = AnimationUtils.loadAnimation(this, R.anim.translate_right);

        traslateLeftAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setText("닫기");
                isPageOpen = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        traslateRightAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setText("열기");
                isPageOpen = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        slidingPanel = (LinearLayout)findViewById(R.id.slidingPanel13);
        button = (Button)findViewById(R.id.button13);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //열기
                if(isPageOpen) {
                    slidingPanel.setVisibility(View.VISIBLE);
                    slidingPanel.startAnimation(traslateLeftAnim);
                }else{ //닫기
                    slidingPanel.setVisibility(View.GONE);
                    slidingPanel.startAnimation(traslateRightAnim);
                }
            }
        });
    }
}
