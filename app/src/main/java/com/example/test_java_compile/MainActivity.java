package com.example.test_java_compile;

import android.webkit.WebView;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected WebView myWeb;
//    @override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Находим наш браузер */
        myWeb= (WebView) findViewById(R.id.webView);

        /* Настраиваем наш браузер */
        myWeb.getSettings().setUseWideViewPort(true);
        myWeb.setInitialScale(1);
        myWeb.getSettings().setJavaScriptEnabled(true);

        /* Загружаем страничку */
        myWeb.loadUrl("file:///android_asset/index.html");

    }

}