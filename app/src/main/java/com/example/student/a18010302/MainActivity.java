package com.example.student.a18010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
     WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.webView);
        //wv.setWebViewClient(new WebViewClient()); //使用內建web 服務
        wv.setWebChromeClient(new WebChromeClient()); //使用內建webChrome 服務
        wv.getSettings().setJavaScriptEnabled(true);//使用JavaScript服務
         wv.loadUrl("http://www.youtobe.com");// url
         wv.loadData("<div style=\"position:relative;height:0;padding-bottom:56.21%\"><iframe src=\"https://www.youtube.com/embed/QVLEeOzNP4Y?ecver=2\" style=\"position:absolute;width:100%;height:100%;left:0\" width=\"641\" height=\"360\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe></div>", "text/html; charset=UTF-8", null);
         //
    }
}
