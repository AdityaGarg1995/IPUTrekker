package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class niit extends AppCompatActivity {

    public WebView webView;

    public final int NIEC_DEPARTMENTS = 7;


//    Departments ------------ ME Department Unavailable
    String cse = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_computer_science/",
           it = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_information_technology/",
           ece = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_electronics_and_communication/",
           eee = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_electrical_and_electronics/",
           mae = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_mechanical_and_automation/",
           civil = "http://www.niecdelhi.ac.in/faculty_of_engineering/department_of_civil/",
           applied_sciences = "http://www.niecdelhi.ac.in/faculty_of_engineering/ash/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niit);

        webView = (WebView)findViewById(R.id.a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(Urls.niec);
    }
}
