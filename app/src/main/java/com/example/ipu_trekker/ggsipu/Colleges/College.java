package com.example.ipu_trekker.ggsipu.Colleges;



import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Urls;

public class College extends AppCompatActivity {

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

        String url = "";
        switch (college){

            case "AIACTR" :
                url = Urls.aiactr;
//                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
//                CustomTabsIntent customTabsIntent = builder.build();
//                builder.setToolbarColor(Color.RED);
//                customTabsIntent.launchUrl(this, Uri.parse(Urls.aiactr));
//                webView.loadUrl("https://drive.google.com/file/d/0B0QBCOtMbl-vU1AzN2RJOWJod3M/view?usp=sharing");
//                webView.loadUrl(Urls.aiactr);
                break;

            case "Amity School of Education":
                url = Urls.amity;
                break;

            case "BVPCOE":
                url = Urls.bvp;
                break;

            case "Ch.BP Govt Engg College":
                url = Urls.bp;
                break;

            case "BPIT":
                url = Urls.bpit;
                break;

            case "DITE":
                url = Urls.dite;
                break;

            case "Delhi Technical Campus":
                url = Urls.dtc;
                break;

            case "GTBIT":
                url = Urls.gtbit;
                break;

            case "HMRITM":
                url = Urls.hmr;
                break;

            case "GBPant College of Engg":
                url = Urls.gbp;
                break;

            case "JIMS":
                url = Urls.jims;
                break;

            case "MAIT":
                url = Urls.mait;
                break;

            case "MSIT":
                url = Urls.msit;
                break;

            case "NIEC":
                url = Urls.niec;
                break;

            case "NPTI":
                url = Urls.npti;
                break;
        }
        try{
            webView.loadUrl(url);
            a.setTitle(college);
        } catch (Exception e){e.printStackTrace();}
    }


    private static final int PROGRESS = 0x1;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactr);

        setupActionBar();

        webView = (WebView)findViewById(R.id.a);
        WebViewSettings(webView);

//        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar1);
//        while (progressBar.getProgress() < 100)
//           progressBar.incrementProgressBy(10);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//              while (mProgressStatus<100){
//
//              }
//            }
//        }).start();

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
            try{
                webView.loadUrl(webView.getUrl());
            }catch (Exception e){e.printStackTrace();}
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}