package com.example.admin.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Day10_Fragment extends AppCompatActivity {

    PlaceholderFragment fragment1;
    Day10_MenuFragment fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day10__fragment);


        fragment1 = new PlaceholderFragment();
        fragment2 = new Day10_MenuFragment();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container2, fragment1)
                    .commit();
        }

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

    public void onButton4Clicked(View v){
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.container2, fragment2)
                .commit();

    }

    public void onButton5Clicked(View v){
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.container2, fragment1)
                .commit();
    }


    public static class PlaceholderFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_day10__fragment_main, container, false);
            return rootView;
        }
    }



}
