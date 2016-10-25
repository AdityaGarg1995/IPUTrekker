package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class bvp extends AppCompatActivity {

    public WebView webView;


//    Departments
    String ice = "http://ice.bvcoend.ac.in/",
           cse = "http://cse.bvcoend.ac.in/",
           eee = "http://eee.bvcoend.ac.in/",
           it = "http://it.bvcoend.ac.in/",
           ece = "http://ece.bvcoend.ac.in/";

//    Placements
    String placements = "http://bvcoend.ac.in/site/home/index/82?Page=T%20&%20P";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvp);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.bvp);
    }
}
