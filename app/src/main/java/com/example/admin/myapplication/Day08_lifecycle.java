package com.example.admin.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Day08_lifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day08_lifecycle);

        Toast.makeText(this, "onCreate호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop호출", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestory호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause호출", Toast.LENGTH_SHORT).show();
        saveScore();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume호출", Toast.LENGTH_SHORT).show();
        loadScore();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onReStart호출", Toast.LENGTH_SHORT).show();
    }

    private void saveScore(){
        SharedPreferences pref = getSharedPreferences("gostop", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("score", 1000);
        editor.commit();
    }

    private void loadScore(){
        SharedPreferences pref = getSharedPreferences("gostop", Activity.MODE_PRIVATE);
        int score = pref.getInt("score", 0);
        Toast.makeText(getApplicationContext(), "score: " + score, Toast.LENGTH_SHORT).show();
    }

}
