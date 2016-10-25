package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class msit extends AppCompatActivity {

    public WebView webView;

    public final int MSIT_DEPARTMENTS = 4;


//    Placements
    String p2016 = "http://www.msit.in/ckeditor_assets/attachments/188/updated_pplacements_2016_sheet_xls_-_sheet1.pdf";


//    Departments
    String cse = "http://www.msit.in/pages/6",
           it = "http://www.msit.in/pages/8",
           eee = "http://www.msit.in/pages/9",
           ece = "http://www.msit.in/pages/7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msit);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.msit);
    }
}