package com.example.ipu_trekker.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.ipu_trekker.ggsipu.Colleges.College;
import com.example.ipu_trekker.ggsipu.Streams.ZCodes;


public class CollegeActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.aiactr).setOnClickListener(this);
        findViewById(R.id.amity) .setOnClickListener(this);
        findViewById(R.id.bpit)  .setOnClickListener(this);
        findViewById(R.id.bvp)   .setOnClickListener(this);
        findViewById(R.id.bp)    .setOnClickListener(this);
        findViewById(R.id.dite)  .setOnClickListener(this);
        findViewById(R.id.dtc)   .setOnClickListener(this);
        findViewById(R.id.gbp)   .setOnClickListener(this);
        findViewById(R.id.gtbit) .setOnClickListener(this);
        findViewById(R.id.hmr)   .setOnClickListener(this);
        findViewById(R.id.jims)  .setOnClickListener(this);
        findViewById(R.id.mait)  .setOnClickListener(this);
        findViewById(R.id.msit)  .setOnClickListener(this);
        findViewById(R.id.niit)  .setOnClickListener(this);
        findViewById(R.id.npti)  .setOnClickListener(this);
    }


    public void activityStart(String college){
        try{ startActivity(new Intent(this,College.class).putExtra("College", college)); }
        catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.aiactr:
                activityStart("AIACTR");
                break;

            case R.id.amity:
                activityStart("Amity School of Education");
                break;

            case R.id.bpit:
                activityStart("BPIT");
                break;

            case R.id.bvp:
                activityStart("BVPCOE");
                break;

            case R.id.bp:
                activityStart("Ch.BP Govt Engg College");
                break;

            case R.id.dite:
                activityStart("DITE");
                break;

            case R.id.dtc:
                activityStart("Delhi Technical Campus");
                break;

            case R.id.gbp:
                activityStart("GBPant College of Engg");
                break;

            case R.id.gtbit:
                activityStart("GTBIT");
                break;

            case R.id.hmr:
                activityStart("HMRITM");
                break;

            case R.id.jims:
                activityStart("JIMS");
                break;

            case R.id.mait:
                activityStart("MAIT");
                break;

            case R.id.msit:
                activityStart("MSIT");
                break;

            case R.id.niit:
                activityStart("NIEC");
                break;

            case R.id.npti:
                activityStart("NPTI");
                break;
        }
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_it3, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar automatically handles clicks on the Home/Up button, if you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.college){
            try {
                startActivity(new Intent(CollegeActivity.this, ZCodes.class).putExtra("Task", "College"));
            } catch (Exception e) {}
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