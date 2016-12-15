package com.example.admin.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Day09_MyDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day09__my_dialog);
    }

    public void onButton3Clicked(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("안내 타이틀");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("예", new dialogpositivie());

        AlertDialog dialog = builder.create();
        dialog.show();
//        builder.setNegativeButton("아니요", this);
    }

    class dialogpositivie implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(getApplicationContext(), "예누르셧습니다.", Toast.LENGTH_LONG);

        }
    }

}
