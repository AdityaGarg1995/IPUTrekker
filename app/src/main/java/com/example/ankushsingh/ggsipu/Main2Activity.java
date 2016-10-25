package com.example.ankushsingh.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.ankushsingh.ggsipu.Settings.SettingsActivity;
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

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[]b = new ImageButton[13];
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b[0] = (ImageButton)findViewById(R.id.cse);
        b[1] = (ImageButton)findViewById(R.id.ece);
        b[2] = (ImageButton)findViewById(R.id.it);
        b[3] = (ImageButton)findViewById(R.id.eee);
        b[4] = (ImageButton)findViewById(R.id.mae);
        b[5] = (ImageButton)findViewById(R.id.civil);
        b[6] = (ImageButton)findViewById(R.id.power);
        b[7] = (ImageButton)findViewById(R.id.ee);
        b[8] = (ImageButton)findViewById(R.id.me);
        b[9] = (ImageButton)findViewById(R.id.ice);
        b[10] = (ImageButton)findViewById(R.id.mech);
        b[11] = (ImageButton)findViewById(R.id.envo);
        b[12] = (ImageButton)findViewById(R.id.tool);



        for(int i = 0; i <= 12; i++)
            b[i].setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.cse:
                startActivity(new Intent(this,CSE.class));
                break;

            case R.id.ece:
                startActivity(new Intent(this,ECE.class));
                break;

            case R.id.it:
                startActivity(new Intent(this,IT.class));
                break;

            case R.id.mae:
                startActivity(new Intent(this,MAE.class));
                break;

            case R.id.eee:
                startActivity(new Intent(this,EEE.class));
                break;

            case R.id.civil:
                startActivity(new Intent(this,CIVIL.class));
                break;

            case R.id.power:
                startActivity(new Intent(this,POWER.class));
                break;

            case R.id.ee:
                startActivity(new Intent(this,EE.class));
                break;

            case R.id.me:
                startActivity(new Intent(this,ME.class));
                break;

            case R.id.ice:
                startActivity(new Intent(this,ICE.class));
                break;

            case R.id.mech:
                startActivity(new Intent(this,MECH.class));
                break;

            case R.id.envo:
                startActivity(new Intent(this,ENVO.class));
                break;

            case R.id.tool:
                startActivity(new Intent(this,TOOL.class));
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

        if(item.getItemId() == R.id.exit){
            System.exit(0);
            return true;
        }


        else if(item.getItemId() == R.id.home){
            startActivity(new Intent(Main2Activity.this, HomeActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.colleges){
            startActivity(new Intent(Main2Activity.this, MainActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.streams){
            // Do nothing
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}