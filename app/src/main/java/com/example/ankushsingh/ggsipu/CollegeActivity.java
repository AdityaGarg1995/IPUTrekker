package com.example.ankushsingh.ggsipu;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.ankushsingh.ggsipu.Colleges.aiactr;


public class CollegeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[] b = new ImageButton[15];

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


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.aiactr:  startActivity(new Intent(this,aiactr.class).putExtra("College", "AIACTR"));
                break;
            case R.id.amity:   startActivity(new Intent(this,aiactr.class).putExtra("College","Amity School of Education"));
                break;
            case R.id.bpit:    startActivity(new Intent(this,aiactr.class).putExtra("College", "BPIT"));
                break;
            case R.id.bvp:     startActivity(new Intent(this,aiactr.class).putExtra("College", "BVPCOE"));
                break;
            case R.id.bp:      startActivity(new Intent(this,aiactr.class).putExtra("College", "Ch.BP Govt Engg College"));
                break;
            case R.id.dite:    startActivity(new Intent(this,aiactr.class).putExtra("College", "DITE"));
                break;
            case R.id.dtc:     startActivity(new Intent(this,aiactr.class).putExtra("College", "Delhi Technical Campus"));
                break;
            case R.id.gbp:     startActivity(new Intent(this,aiactr.class).putExtra("College", "GBPant College of Engg"));
                break;
            case R.id.gtbit:   startActivity(new Intent(this,aiactr.class).putExtra("College", "GTBIT"));
                break;
            case R.id.hmr:     startActivity(new Intent(this,aiactr.class).putExtra("College", "HMRITM"));
                break;
            case R.id.jims:    startActivity(new Intent(this,aiactr.class).putExtra("College", "JIMS"));
                break;
            case R.id.mait:    startActivity(new Intent(this,aiactr.class).putExtra("College", "MAIT"));
                break;
            case R.id.msit:    startActivity(new Intent(this,aiactr.class).putExtra("College", "MSIT"));
                break;
            case R.id.niit:    startActivity(new Intent(this,aiactr.class).putExtra("College", "NIEC"));
                break;
            case R.id.npti:    startActivity(new Intent(this,aiactr.class).putExtra("College", "NPTI"));
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
        // The action bar automatically handles clicks on the Home/Up button, if you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.home){
            startActivity(new Intent(CollegeActivity.this,HomeActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.colleges)
            // Do nothing
            return true;


        else if(item.getItemId() == R.id.streams){
            startActivity(new Intent(CollegeActivity.this,StreamActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.result){
            startActivity(new Intent(CollegeActivity.this,logo.class).putExtra("Task",StreamNames.task2));
            return true;
        }

        return super.onOptionsItemSelected(item);

    }


}