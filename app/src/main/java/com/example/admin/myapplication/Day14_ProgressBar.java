package com.example.admin.myapplication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Day14_ProgressBar extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day14__progress_bar);
        progressBar = (ProgressBar)findViewById(R.id.progressBar14);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar14);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("설정된값 : " +progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        textView = (TextView)findViewById(R.id.textView14);

    }

    //옵션메뉴 띄우기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.day14_menu_main, menu);
        return true;
    }


    //옵션메뉴
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }else if(id == R.id.action_search){
            Toast.makeText(getApplicationContext(), "검색이 선택되었습니다", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onButton14Clicked(View v){
        progressBar.setProgress(50);
    }

    public void onButton14_1Clicked(View v){
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("진행상태");
        dialog.setMessage("데이터를 확인중....");
        dialog.show();
    }
}
