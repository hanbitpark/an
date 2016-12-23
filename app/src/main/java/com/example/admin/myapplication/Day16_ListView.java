package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Day16_ListView extends AppCompatActivity {

    String[] names = {"소녀시대", "걸스데이", "씨스타"};
    String[] age = {"11", "12", "13"};

    ListView listView;
    SingerAdapter singerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day16__list_view);

        listView = (ListView)findViewById(R.id.listview16);
        singerAdapter = new SingerAdapter();

        singerAdapter.addItem(new Day16_ListView_SingerItem(names[0], age[0]));
        singerAdapter.addItem(new Day16_ListView_SingerItem(names[1], age[1]));
        singerAdapter.addItem(new Day16_ListView_SingerItem(names[2], age[2]));

        listView.setAdapter(singerAdapter);



    }

    class SingerAdapter extends BaseAdapter{

        ArrayList<Day16_ListView_SingerItem> items = new ArrayList<Day16_ListView_SingerItem>();


        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Day16_ListView_SingerItem item){
            items.add(item);
        }
        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
//            TextView textView = new TextView(getApplicationContext());
//            textView.setText(names[position]);
//            textView.setTextSize(50.0f);

            Day16_SingerItemView view =  null;

            if(convertView == null){
                view = new Day16_SingerItemView(getApplicationContext());
            }else{

                view = (Day16_SingerItemView)convertView;
            }

            Day16_ListView_SingerItem curItem = items.get(position);
            view.setName(curItem.getName());
            view.setAge(curItem.getAge());
            return view;
        }


    }
}
