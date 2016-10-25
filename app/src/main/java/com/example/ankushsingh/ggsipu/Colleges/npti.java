package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class npti extends AppCompatActivity {

    public WebView webView;


//    Placements
    String p2002 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/2nd_batch_2002.pdf",
           p2003 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/3rd_batch_2003.pdf",
           p2004 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/4th_batch_2004.pdf",
           p2005 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/5th_batch_2005.pdf",
           p2006 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/6th_batch_2006.pdf",
           p2007 = "http://www.nptidelhi.net/uploads/5/4/0/2/5402438/7th_batch_2007.pdf";


    String courses = "http://www.nptidelhi.net/courses-offered--admissions.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npti);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.npti);
    }
}