package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class mait extends AppCompatActivity {

    public WebView webView;

    public static final int MAIT_DEPARTMENTS = 5;
    public static final int MAIT_RANK = 2;

    //Departments
    public String cse = "http://cse.mait.ac.in/",
           it = "http://www.mait.ac.in/index.php?option=com_content&view=article&id=47&Itemid=138&lang=en",
           mae = "http://www.mait.ac.in/index.php?option=com_content&view=article&id=53&Itemid=139&lang=en",
           eee = "http://eee.mait.ac.in/",
           ece = "http://ece.mait.ac.in/";


    // Placements
    public String p2010_14 = "http://mait.ac.in/pdf/2010-14.pdf",
           p2009_13 = "http://mait.ac.in/pdf/2009-13.pdf",
           p2008_12 = "http://mait.ac.in/pdf/2008-12.pdf",
           p2007_11 = "http://mait.ac.in/pdf/2007-11.pdf",
           p2006_10 = "http://mait.ac.in/pdf/2006-10.pdf",
           p2005_09 = "http://mait.ac.in/pdf/2005-09.pdf",
           p2004_08 = "http://mait.ac.in/pdf/2004-08.pdf",
           p2003_07 = "http://mait.ac.in/pdf/2003-07.pdf",
           p2002_06 = "http://mait.ac.in/pdf/2002-06.pdf",
           p2001_05 = "http://mait.ac.in/pdf/2001-05.pdf",
           p2000_04 = "http://mait.ac.in/pdf/2000-04.pdf";

//  Academic Calendar
    String acadcal = "http://www.mait.ac.in/pdf/acadcal2016-17.pdf";


    String itmait = "itmait.hpage.co.in";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mait);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.mait);
    }
}

