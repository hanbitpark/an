package com.example.admin.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class Day07_inflater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day07_inflater);
    }

    public void onButton1Cliecked(View v){
         LinearLayout container = (LinearLayout)findViewById(R.id.container);
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_day07_inflater_sub, container, true);

        //sub xml 작동 소스
        container.findViewById(R.id.button);
    }
}
