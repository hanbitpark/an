package com.example.admin.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by admin on 2016-12-12.
 */

public class Day09_MySMSService extends Service{

    private static final String TAG = "mytagservice";

    public Day09_MySMSService(){

    }

    @Override
    public void onCreate() {
        Log.d(TAG, "oncreate 호출");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommnad 호출");

        if(intent != null){
            String command = intent.getStringExtra("command");
            if(command != null){
                if(command.equals("start")){
                    PrintThread thread = new PrintThread();
                    thread.start();
                }
            }

        }
        return super.onStartCommand(intent, flags, startId);
    }

    class PrintThread extends Thread{
        @Override
        public void run() {
            for(int i =0; i<100 ; i++){
                Log.d(TAG, "#"+ i + "서비스에서 반복됨");
//                Toast.makeText(Day09_MySMSService.this, i, Toast.LENGTH_SHORT).show();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
