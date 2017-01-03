package com.example.admin.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Day20_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day20__view);

        LinearLayout layout = (LinearLayout)findViewById(R.id.container20);
        Day20_MyView view = new Day20_MyView(this);
        view.setBackgroundColor(Color.CYAN);
        layout.addView(view);

    }
}
