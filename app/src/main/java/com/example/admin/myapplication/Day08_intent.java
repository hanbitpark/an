package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Day08_intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day08_intent);

        Intent intent = new Intent(this, Day08_intent_sub.class);
        intent.putExtra("name", "me");
        intent.putExtra("age", 10);

        Day08_Person person = new Day08_Person("걸스데이", 21);
        intent.putExtra("person", person);

        startActivity(intent);

    }

}
