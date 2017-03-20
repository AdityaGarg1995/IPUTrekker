package com.example.ankushsingh.ggsipu.Colleges;



import android.app.Activity;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class aiactr extends AppCompatActivity {


    WebView webView;
    Activity a = this;


    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void WebViewSettings(WebView webView){

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        webView.setWebChromeClient(new WebChromeClient());

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_BACK)) {

            if (webView.canGoBack())
                webView.goBack();
            else finish();

            return true;

        }
        return super.onKeyDown(keyCode, event);

    }


    private void setCollege(String college){

        switch (college){

            case "AIACTR" : webView.loadUrl(Urls.aiactr);
//                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
//                CustomTabsIntent customTabsIntent = builder.build();
//                builder.setToolbarColor(Color.RED);
//                customTabsIntent.launchUrl(this, Uri.parse(Urls.aiactr));
//                webView.loadUrl("https://drive.google.com/file/d/0B0QBCOtMbl-vU1AzN2RJOWJod3M/view?usp=sharing");
                webView.loadUrl(Urls.aiactr);
                break;

            case "Amity School of Education": webView.loadUrl(Urls.amity);
                break;

            case "BVPCOE": webView.loadUrl(Urls.bvp);
                break;

            case "Ch.BP Govt Engg College": webView.loadUrl(Urls.bp);
                break;

            case "BPIT": webView.loadUrl(Urls.bpit);
                break;

            case "DITE": webView.loadUrl(Urls.dite);
                break;

            case "Delhi Technical Campus": webView.loadUrl(Urls.dtc);
                break;

            case "GTBIT": webView.loadUrl(Urls.gtbit);
                break;

            case "HMRITM": webView.loadUrl(Urls.hmr);
                break;

            case "GBPant College of Engg": webView.loadUrl(Urls.gbp);
                break;

            case "JIMS": webView.loadUrl(Urls.jims);
                break;

            case "MAIT": webView.loadUrl(Urls.mait);
                break;

            case "MSIT": webView.loadUrl(Urls.msit);
                break;

            case "NIEC": webView.loadUrl(Urls.niec);
                break;

            case "NPTI": webView.loadUrl(Urls.npti);
                break;

        }
        a.setTitle(college);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactr);

        setupActionBar();

        webView = (WebView)findViewById(R.id.a);
        WebViewSettings(webView);

        setCollege(getIntent().getStringExtra("College"));

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.refresh_menu, menu);

        if(Build.VERSION.SDK_INT < 21)
            menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp));
        else  menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp, null));

        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar automatically handles clicks on the Home/Up button, specified a parent activity in AndroidManifest.xml.
        if(item.getItemId() == R.id.refresh){
            webView.loadUrl(webView.getUrl());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
