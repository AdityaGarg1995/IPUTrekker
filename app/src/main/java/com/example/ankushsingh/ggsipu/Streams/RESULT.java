package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Streams.IT3;
import com.example.ankushsingh.ggsipu.Streams.IT4;
import com.example.ankushsingh.ggsipu.Streams.IT5;
import com.example.ankushsingh.ggsipu.Streams.IT6;
import com.example.ankushsingh.ggsipu.Streams.IT7;
import com.example.ankushsingh.ggsipu.Streams.IT8;

public class RESULT extends AppCompatActivity implements View.OnClickListener {


//    WebView webView;

    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse2);

//        webView = (WebView)findViewById(R.id.a);

//        WebSettings settings = webView.getSettings();
//        settings.setJavaScriptEnabled(true);
//        settings.setBuiltInZoomControls(true);
//        settings.setSupportMultipleWindows(true);
//        settings.setJavaScriptCanOpenWindowsAutomatically(true);


        stream = getIntent().getStringExtra("Stream");
        final Activity activity = this;
        activity.setTitle(stream + ": Choose Semester");

//        webView.setWebChromeClient(new WebChromeClient() {
//            public void onProgressChanged(WebView view, int progress) {
//                // Activities and WebViews measure progress with different scales.
//                // The progress meter will automatically disappear when we reach 100%
//                view = webView;
//                activity.setProgress(progress * 1000);
//            }
//        });
//
//        webView.setWebViewClient(new WebViewClient(){


//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });
//        webView.loadUrl("https://ipuresult.com/");

        Button buttons[] = new Button[8];
        buttons[0] = (Button)findViewById(R.id.c1);
        buttons[1] = (Button)findViewById(R.id.c2);
        buttons[2] = (Button)findViewById(R.id.c3);
        buttons[3] = (Button)findViewById(R.id.c4);
        buttons[4] = (Button)findViewById(R.id.c5);
        buttons[5] = (Button)findViewById(R.id.c6);
        buttons[6] = (Button)findViewById(R.id.c7);
        buttons[7] = (Button)findViewById(R.id.c8);

        for(int i = 0; i < 8; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText("For " + (i+1) + " Semester");
        }

    }


//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//
//        if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_BACK) {
//
//            if (webView.canGoBack())
//                webView.goBack();
//            else finish();
//
//            return true;
//
//        }
//
//        return super.onKeyDown(keyCode, event);
//
//    }


//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
//
//        if(Build.VERSION.SDK_INT < 21)
//            menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp));
//        else menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_sync_black_24dp, null));
//
//        return true;
//    }


//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here.
//        // The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in AndroidManifest.xml.
//
//        if(item.getItemId() == R.id.home){
////            webView.loadUrl(webView.getUrl());
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//
//    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.c1: startActivity(new Intent(this, CIVIL2.class));
                break;
            case R.id.c2: startActivity(new Intent(this, CSE2.class));
                break;
            case R.id.c3: startActivity(new Intent(this, IT3.class).putExtra("Stream",stream));
                break;
            case R.id.c4: startActivity(new Intent(this, IT4.class).putExtra("Stream",stream));
                break;
            case R.id.c5: startActivity(new Intent(this, IT5.class).putExtra("Stream",stream));
                break;
            case R.id.c6: startActivity(new Intent(this, IT6.class).putExtra("Stream",stream));
                break;
            case R.id.c7: startActivity(new Intent(this, IT7.class).putExtra("Stream",stream));
                break;
            case R.id.c8: startActivity(new Intent(this, IT8.class).putExtra("Stream",stream));
                break;
        }

    }
}
