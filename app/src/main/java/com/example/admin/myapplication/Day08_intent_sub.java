package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day08_intent_sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day08_intent_sub);

        Intent intent = getIntent();
        if(intent != null){
            String name = intent.getStringExtra("name");
            int age = intent.getIntExtra("age", 0);

            Day08_Person person = (Day08_Person)intent.getSerializableExtra("person");
            person.getPerson();
            person.getAge();


        }

    }
}
