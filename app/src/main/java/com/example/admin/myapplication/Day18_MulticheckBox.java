package com.example.admin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

/**
 * Created by admin on 2017-01-02.
 */

public class Day18_MulticheckBox extends LinearLayout {

    public interface OnMultiChangeListener{
        public void onMultiChanged(boolean isFirstChecked, boolean isSecondChecked);

    }

    OnMultiChangeListener listener;

    public void setOnMultiChangeListener(OnMultiChangeListener lsnr){
        listener = lsnr;
    }

    CheckBox checkBox, checkBox2;

    public Day18_MulticheckBox(Context context) {
        super(context);

        init(context);
    }

    public Day18_MulticheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_day18_multicheckbox, this, true);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(listener != null){
                    listener.onMultiChanged(isChecked, checkBox2.isChecked());
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(listener != null){
                    listener.onMultiChanged(checkBox.isChecked(), isChecked);
                }
            }
        });
    }
}
