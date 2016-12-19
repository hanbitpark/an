package com.example.admin.myapplication;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Day12_WebView extends AppCompatActivity {
    private WebView mWebView;
    private WebSettings mWebsetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day12__web_view);

        mWebView = (WebView)findViewById(R.id.webview12);
        //클릭시 새창안뜨게 셋팅 필수
        mWebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = mWebView.getSettings();
        //자바스크립트 허용
        webSettings.setJavaScriptEnabled(true);

    }

    public void onButton12Clicked(View v){
        mWebView.loadUrl("file:///android_asset/sample.html");
    }
}
