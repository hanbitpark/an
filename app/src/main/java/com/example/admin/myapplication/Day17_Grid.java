package com.example.admin.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Day17_Grid extends AppCompatActivity {

    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day17__grid);

        grid = (GridView)findViewById(R.id.grid17);

        SingerAdapter adapter = new SingerAdapter();
        grid.setAdapter(adapter);



    }

    class SingerAdapter extends BaseAdapter{

        String[] names={"소녀시대", "걸그룹", "여자그룹"};

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return names[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView view2 = new TextView(getApplicationContext());
            view2.setText(names[i]);
            view2.setTextSize(50.0f);
            view2.setTextColor(Color.BLACK);

            return view2;
        }
    }
}
