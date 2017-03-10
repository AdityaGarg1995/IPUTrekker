package com.example.ankushsingh.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


import com.example.ankushsingh.ggsipu.Streams.CIVIL;
import com.example.ankushsingh.ggsipu.Streams.CSE;
import com.example.ankushsingh.ggsipu.Streams.ECE;
import com.example.ankushsingh.ggsipu.Streams.EE;
import com.example.ankushsingh.ggsipu.Streams.EEE;
import com.example.ankushsingh.ggsipu.Streams.ENVO;
import com.example.ankushsingh.ggsipu.Streams.ICE;
import com.example.ankushsingh.ggsipu.Streams.IT;
import com.example.ankushsingh.ggsipu.Streams.MAE;
import com.example.ankushsingh.ggsipu.Streams.ME;
import com.example.ankushsingh.ggsipu.Streams.MECH;
import com.example.ankushsingh.ggsipu.Streams.POWER;
import com.example.ankushsingh.ggsipu.Streams.TOOL;


public class StreamActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[] b = new ImageButton[13];


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


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.cse: startActivity(new Intent(this, CSE.class));
                break;
            case R.id.ece: startActivity(new Intent(this, ECE.class));
                break;
            case R.id.it: startActivity(new Intent(this, IT.class));
                break;
            case R.id.mae: startActivity(new Intent(this, MAE.class));
                break;
            case R.id.eee: startActivity(new Intent(this, EEE.class));
                break;
            case R.id.civil: startActivity(new Intent(this, CIVIL.class));
                break;
            case R.id.power: startActivity(new Intent(this, POWER.class));
                break;
            case R.id.ee: startActivity(new Intent(this, EE.class));
                break;
            case R.id.me: startActivity(new Intent(this, ME.class));
                break;
            case R.id.ice: startActivity(new Intent(this, ICE.class));
                break;
            case R.id.mech: startActivity(new Intent(this, MECH.class));
                break;
            case R.id.envo: startActivity(new Intent(this, ENVO.class));
                break;
            case R.id.tool: startActivity(new Intent(this, TOOL.class));
                break;
        }


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main2_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.home){
            startActivity(new Intent(StreamActivity.this, HomeActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.colleges){
            startActivity(new Intent(StreamActivity.this, CollegeActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.streams)
            // Do nothing
            return true;


        else if(item.getItemId() == R.id.result){
            startActivity(new Intent(StreamActivity.this, logo.class).putExtra("Task", StreamNames.task2));
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}