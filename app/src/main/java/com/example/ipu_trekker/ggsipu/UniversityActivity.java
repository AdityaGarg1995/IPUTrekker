package com.example.ipu_trekker.ggsipu;

import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class UniversityActivity extends AppCompatActivity {

    public WebView webView;
    Activity activity = this;


    public void load(String url){
        webView.loadUrl(url);
    }

    public void setTask(String task){

        if(task.equals(ImportantStrings.task1))
            try {
                load(Urls.ipu);
            }catch (Exception e){e.printStackTrace();}

        else if(task.equals(ImportantStrings.task2))
            try {
                load(Urls.result);
            }catch (Exception e){e.printStackTrace();}

        else {
            try {
                load("");
                Toast.makeText(getApplicationContext(), "Error: No Url to load", Toast.LENGTH_LONG).show();
            }catch (Exception e){e.printStackTrace();}
        }
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


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.refresh_menu, menu);

        if(Build.VERSION.SDK_INT < 21)
            menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp));
        else menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp, null));

        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.refresh){
            load(webView.getUrl());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void WebViewSettings(WebView webView){

        WebSettings settings = webView.getSettings();

        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);

        // Enable responsive layout
        settings.setUseWideViewPort(true);
        // Zoom out if the content width is greater than the width of the veiwport
        settings.setLoadWithOverviewMode(true);


        webView.setWebChromeClient(new WebChromeClient());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactr);

        webView = (WebView) findViewById(R.id.a);
        WebViewSettings(webView);


        String task = getIntent().getStringExtra("Task");
        activity.setTitle(task);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                int keyCode = KeyEvent.KEYCODE_0;
                if(webView.canGoBack() && keyCode == KeyEvent.KEYCODE_BACK){
                   webView.goBack();
                   return true;
                }
                else if(webView.canGoForward() && keyCode == KeyEvent.KEYCODE_FORWARD){
                    webView.goForward();
                    return true;
                }
                return super.shouldOverrideKeyEvent(view, event);
            }

        });
        setTask(task);
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