package com.example.ankushsingh.ggsipu.Colleges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class dite extends AppCompatActivity {

    public WebView webView;


//    Departments
    String toolengineering = "http://dite.delhigovt.nic.in/b-tech.asp",
           mechatronics = "http://dite.delhigovt.nic.in/b-tech-mech.asp",
           toolAndDieMakingDiploma = "http://dite.delhigovt.nic.in/diploma.asp",
           mechanicalEngineeringDiploma = "http://dite.delhigovt.nic.in/diplomam.asp";



    String placements = "http://dite.delhigovt.nic.in/pdf/Placement%20Status%20%201st%20BATCH%20passout2012.pdf";



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
        webView.loadUrl(Urls.dite);
    }
}
