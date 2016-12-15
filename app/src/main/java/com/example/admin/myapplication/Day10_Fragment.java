package com.example.admin.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class Day10_Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day10__fragment);

    }

    public void onButton2Clicked(View v){
//        LinearLayout container = (LinearLayout)findViewById(R.id.container);
//        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        inflater.inflate(R.layout.activity_day07_inflater_sub, container, true);
//
//        //sub xml 작동 소스
//        container.findViewById(R.id.button);

        Day10_Fragment_SubLayout subLayout = new Day10_Fragment_SubLayout(this);
        LinearLayout container = (LinearLayout)findViewById(R.id.container2);
        container.addView(subLayout);
    }


}
