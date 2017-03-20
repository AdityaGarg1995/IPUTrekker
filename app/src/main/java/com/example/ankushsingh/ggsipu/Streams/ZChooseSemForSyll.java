package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;

public class ZChooseSemForSyll extends AppCompatActivity implements View.OnClickListener {


//    WebView webView;

    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse2);

        stream = getIntent().getStringExtra("Stream");
        final Activity activity = this;
        activity.setTitle(stream + ": Choose Semester");

//        Button buttons[] = new Button[8];
        findViewById(R.id.c1).setOnClickListener(this);
        findViewById(R.id.c2).setOnClickListener(this);
        findViewById(R.id.c3).setOnClickListener(this);
        findViewById(R.id.c4).setOnClickListener(this);
        findViewById(R.id.c5).setOnClickListener(this);
        findViewById(R.id.c6).setOnClickListener(this);
        findViewById(R.id.c7).setOnClickListener(this);
        findViewById(R.id.c8).setOnClickListener(this);

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
//        getMenuInflater().inflate(R.menu.refresh_menu, menu);
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

            case R.id.c1:
                try{ startActivity(new Intent(this, SEM1Syllabus.class)); }
                catch (Exception e){e.printStackTrace();}
                break;
            case R.id.c2:
                try{ startActivity(new Intent(this, SEM2Syllabus.class)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c3:
                try{ startActivity(new Intent(this, IT3.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c4:
                try{ startActivity(new Intent(this, IT4.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c5:
                try {
                    if (stream.equals("PE"))
                        startActivity(new Intent(this, SEM5_PE.class).putExtra("Stream", stream));
                    else
                        startActivity(new Intent(this, IT5.class).putExtra("Stream", stream));
                }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c6:
                try {
                    switch (stream) {
                        case "CE":
                        case "ENE":
                            startActivity(new Intent(this, SEM6_CEnENE.class).putExtra("Stream", stream));
                            break;
                        case "PE":
                            startActivity(new Intent(this, SEM6_PE.class));
                            break;
                        default:
                            startActivity(new Intent(this, IT6.class).putExtra("Stream", stream));
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c7:
                try {
                    switch (stream) {
                        case "IT":
                        case "ECE":
                        case "EE":
                        case "EEE":
                        case "ICE":
                        case "MAE":
                        case "ME":
                        case "MT":
                        case "PE":
                        case "TE":
                        case "CE":
                        case "ENE":
                            startActivity(new Intent(this, IT7.class).putExtra("Stream", stream));
                            break;
                        case "CSE":
                            startActivity(new Intent(this, CSE.class).putExtra("Sem", "7"));
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c8:
                try {
                    switch (stream) {
                        case "IT":
                        case "ECE":
                        case "EE":
                        case "EEE":
                        case "ICE":
                        case "MAE":
                        case "ME":
                        case "MT":
                        case "PE":
                        case "TE":
                        case "CE":
                        case "ENE":
                            startActivity(new Intent(this, IT8.class).putExtra("Stream", stream));
                            break;
                        case "CSE":
                            startActivity(new Intent(this, CSE.class).putExtra("Sem", "8"));
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
                break;

        }

    }
}
