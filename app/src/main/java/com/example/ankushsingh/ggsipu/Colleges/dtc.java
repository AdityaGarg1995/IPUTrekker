package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class dtc extends AppCompatActivity {

    public WebView webView;


//    Departments
    public String cse = "http://delhitechnicalcampus.ac.in/b-tech/cse/",
           ece = "http://delhitechnicalcampus.ac.in/b-tech/ece/",
           eee = "http://delhitechnicalcampus.ac.in/b-tech/eee/",
           mae = "http://delhitechnicalcampus.ac.in/b-tech/mae/",
           civil = "http://delhitechnicalcampus.ac.in/b-tech/cve/",
           applied_sciences = "http://delhitechnicalcampus.ac.in/b-tech/applied-sciences-department/";

//    Placements


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dite);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.dtc);
    }
}