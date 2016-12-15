package com.example.admin.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.util.Log;

public class Day09_MyPhoneReceiver extends BroadcastReceiver {

    public static final String TAG = "PHONE STATE";
    private static String mLastState;

    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG,"onReceive()");

        /**
         * http://mmarvick.github.io/blog/blog/lollipop-multiple-broadcastreceiver-call-state/
         * 2번 호출되는 문제 해결
         */
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);


        if (state.equals(mLastState)) {
            return;

        } else {
            mLastState = state;

        }

        if(TelephonyManager.EXTRA_STATE_RINGING.equals(state)){

            Log.d("전화번호", state);

            String incomingnumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            final String phone_number = PhoneNumberUtils.formatNumber(incomingnumber);

            Intent serviceIntetent = new Intent(context, Day09_MyPhoneService.class);
            serviceIntetent.putExtra(Day09_MyPhoneService.EXTRA_CALL_NUMBER, phone_number);
            context.startService(serviceIntetent);
        }
    }
}
