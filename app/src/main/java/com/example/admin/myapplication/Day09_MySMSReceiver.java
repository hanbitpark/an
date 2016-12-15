package com.example.admin.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import java.util.Date;

public class Day09_MySMSReceiver extends BroadcastReceiver {
    private static final String TAG = "MySMSReceiver";



    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "SMSReceiver호출");


        Intent myIntent = new Intent(context, Day09_service.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(myIntent);

//        if("android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())){
//            Bundle bundle = intent.getExtras();
//            Object messages[] = (Object[])bundle.get("pdus");
//            SmsMessage smsMessage[] = new SmsMessage[messages.length];
//
//            for(int i=0; i<messages.length; i++){
//                // PDU 포맷으로 되어 있는 메시지를 복원합니다.
//                smsMessage[i] = SmsMessage.createFromPdu((byte[])messages[i]);
//            }
//
//            // SMS 수신 시간 확인
//            Date curDate = new Date(smsMessage[0].getTimestampMillis());
//            Log.d("문자 수신 시간", curDate.toString());
//
//            // SMS 발신 번호 확인
//            String origNumber = smsMessage[0].getOriginatingAddress();
//
//            // SMS 메시지 확인
//            String message = smsMessage[0].getMessageBody().toString();
//            Log.d("문자 내용", "발신자 : "+origNumber+", 내용 : " + message);
//
//        }
    }
}
