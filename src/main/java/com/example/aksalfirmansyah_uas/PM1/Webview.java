package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.aksalfirmansyah_uas.R;

public class Webview extends AppCompatActivity {

    private WebView WebUnpamKu_Nky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebUnpamKu_Nky= new WebView(this);
        WebUnpamKu_Nky.getSettings().setJavaScriptEnabled(true); // enable javascript
        final Activity activity = this;
        WebUnpamKu_Nky.setWebViewClient (new WebViewClient());
        WebUnpamKu_Nky .loadUrl("https://informatika.unpam.ac.id/");
        setContentView(WebUnpamKu_Nky );
    }
}