package com.example.admin.myapplication;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Day13_ViewPager extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day13__view_pager);

        viewPager = (ViewPager)findViewById(R.id.pager13);

        MyAdapter myAdapter = new MyAdapter();
        viewPager.setAdapter(myAdapter);

    }

    class MyAdapter extends PagerAdapter{

        String[] names = {"수지", "배수영", "김연아"};

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(0);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View)object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LinearLayout linearLayout = new LinearLayout(getApplicationContext());
            linearLayout.setOrientation(LinearLayout.VERTICAL);

            TextView textView = new TextView(getApplicationContext());
            textView.setText(names[position]);
            textView.setTextColor(Color.rgb(200,0,0));

            textView.setTextSize(40, 0f);

            linearLayout.addView(textView);

            container.addView(linearLayout);

            return linearLayout;
        }
    }
    public void onButton13Clicked(View v){
        viewPager.setCurrentItem(1);
    }
}
