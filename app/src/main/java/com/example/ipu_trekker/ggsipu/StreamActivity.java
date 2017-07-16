package com.example.ipu_trekker.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.ipu_trekker.ggsipu.Streams.StreamMenuActivity;
import com.example.ipu_trekker.ggsipu.Streams.ZCodes;


public class StreamActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.cse)  .setOnClickListener(this);
        findViewById(R.id.ece)  .setOnClickListener(this);
        findViewById(R.id.it)   .setOnClickListener(this);
        findViewById(R.id.eee)  .setOnClickListener(this);
        findViewById(R.id.mae)  .setOnClickListener(this);
        findViewById(R.id.civil).setOnClickListener(this);
        findViewById(R.id.power).setOnClickListener(this);
        findViewById(R.id.ee)   .setOnClickListener(this);
        findViewById(R.id.me)   .setOnClickListener(this);
        findViewById(R.id.ice)  .setOnClickListener(this);
        findViewById(R.id.mech) .setOnClickListener(this);
        findViewById(R.id.envo) .setOnClickListener(this);
        findViewById(R.id.tool) .setOnClickListener(this);
    }


    public void activityStart(String streamCode){
        try{ startActivity(new Intent(this, StreamMenuActivity.class).putExtra("StreamCode", streamCode)); }
        catch (Exception e){e.printStackTrace();}
    }

    public void startCodes(String code){
        try { startActivity(new Intent(StreamActivity.this, ZCodes.class).putExtra("Task", code)); }
        catch (Exception e) {e.printStackTrace();}
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.cse:
                activityStart("CSE");
                break;

            case R.id.ece:
                activityStart("ECE");
                break;

            case R.id.it:
                activityStart("IT");
                break;

            case R.id.mae:
                activityStart("MAE");
                break;

            case R.id.eee:
                activityStart("EEE");
                break;

            case R.id.civil:
                activityStart("CE");
                break;

            case R.id.power:
                activityStart("PE");
                break;

            case R.id.ee:
                activityStart("EE");
                break;

            case R.id.me:
                activityStart("ME");
                break;

            case R.id.ice:
                activityStart("ICE");
                break;

            case R.id.mech:
                activityStart("MT");
                break;

            case R.id.envo:
                activityStart("ENE");
                break;

            case R.id.tool:
                activityStart("TE");
                break;
        }
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_streams_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.ncc:
                startCodes("NCC");
                return true;

            case R.id.codes:
                startCodes("Codes");
                return true;

            case R.id.codes2:
                startCodes("Codes2");
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