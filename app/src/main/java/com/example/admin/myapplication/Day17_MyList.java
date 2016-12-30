package com.example.admin.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class Day17_MyList extends ListActivity {

    String[] names = {"소녀시대", "걸스데이", "애프터스쿨"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names));

    }
}
