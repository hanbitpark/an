package com.example.admin.myapplication;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Day09_service extends AppCompatActivity {

    int i = 2;
    String d = "abd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day09_service);
        Log.d("value int i= ", "i값" + i);

//        Button button = (Button)findViewById(R.id.button3);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("value string d = ", d);
//
//                Intent intent = new Intent(getApplicationContext(), Day09_MySMSService.class);
//                intent.putExtra("command", "start");
//                startService(intent);
//
//            }
//        });


//        BroadcastReceiver myReceiver = new Day09_MySMSReceiver();
//        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
//        registerReceiver(myReceiver, intentFilter);
//        Log.d("onCreate", "브로드캐스트리시버 등록");
////        intentFilter.addAction();

    }
}
