package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Day18_Wiget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day18__wiget);

        Day18_MulticheckBox multicheckBox = (Day18_MulticheckBox)findViewById(R.id.multicheck18);
        multicheckBox.setOnMultiChangeListener(new Day18_MulticheckBox.OnMultiChangeListener() {
            @Override
            public void onMultiChanged(boolean isFirstChecked, boolean isSecondChecked) {
                Toast.makeText(getApplicationContext(), "첫번째 체크 : " + isFirstChecked +
                        ", " + "두번째 체크 : " + isSecondChecked, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
