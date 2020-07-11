package com.example.blogmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
private WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);
         webview.loadUrl("https://www.bloggermayank.online");
    }
}
