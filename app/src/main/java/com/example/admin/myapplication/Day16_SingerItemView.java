package com.example.admin.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 2016-12-23.
 */

public class Day16_SingerItemView extends LinearLayout {

    TextView viewAge;
    TextView viewName;

    public Day16_SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_day16_singer_item, this, true);

        viewAge = (TextView)findViewById(R.id.ageTextview16);
        viewName = (TextView)findViewById(R.id.nameTextview16);
    }

    public void setAge(String age) {
        viewAge.setText(age);
    }

    public void setName(String name) {
        viewName.setText(name);
    }

}
