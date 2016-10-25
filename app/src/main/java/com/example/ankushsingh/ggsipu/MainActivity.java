package com.example.ankushsingh.ggsipu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.ankushsingh.ggsipu.Colleges.aiactr;
import com.example.ankushsingh.ggsipu.Colleges.amity;
import com.example.ankushsingh.ggsipu.Colleges.bp;
import com.example.ankushsingh.ggsipu.Colleges.bpit;
import com.example.ankushsingh.ggsipu.Colleges.bvp;
import com.example.ankushsingh.ggsipu.Colleges.dite;
import com.example.ankushsingh.ggsipu.Colleges.dtc;
import com.example.ankushsingh.ggsipu.Colleges.gbp;
import com.example.ankushsingh.ggsipu.Colleges.gtbit;
import com.example.ankushsingh.ggsipu.Colleges.hmr;
import com.example.ankushsingh.ggsipu.Colleges.jims;
import com.example.ankushsingh.ggsipu.Colleges.mait;
import com.example.ankushsingh.ggsipu.Colleges.msit;
import com.example.ankushsingh.ggsipu.Colleges.niit;
import com.example.ankushsingh.ggsipu.Colleges.npti;
import com.example.ankushsingh.ggsipu.Settings.SettingsActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[] b = new ImageButton[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b[0] = (ImageButton)findViewById(R.id.aiactr);
        b[1] = (ImageButton)findViewById(R.id.amity);
        b[2] = (ImageButton)findViewById(R.id.bpit);
        b[3] = (ImageButton)findViewById(R.id.bvp);
        b[4] = (ImageButton)findViewById(R.id.bp);
        b[5] = (ImageButton)findViewById(R.id.dite);
        b[6] = (ImageButton)findViewById(R.id.dtc);
        b[7] = (ImageButton)findViewById(R.id.gbp);
        b[8] = (ImageButton)findViewById(R.id.gtbit);
        b[9] = (ImageButton)findViewById(R.id.hmr);
        b[10] = (ImageButton)findViewById(R.id.jims);
        b[11] = (ImageButton)findViewById(R.id.mait);
        b[12] = (ImageButton)findViewById(R.id.msit);
        b[13] = (ImageButton)findViewById(R.id.niit);
        b[14] = (ImageButton)findViewById(R.id.npti);

        for(int i=0;i<15;i++)
            b[i].setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.aiactr:
                startActivity(new Intent(this,aiactr.class));
                break;

            case R.id.amity:
                startActivity(new Intent(this,amity.class));
                break;

            case R.id.bpit:
                startActivity(new Intent(this,bpit.class));
                break;

            case R.id.bvp:
                startActivity(new Intent(this,bvp.class));
                break;

            case R.id.bp:
                startActivity(new Intent(this,bp.class));
                break;

            case R.id.dite:
                startActivity(new Intent(this,dite.class));
                break;

            case R.id.dtc:
                startActivity(new Intent(this,dtc.class));
                break;

            case R.id.gbp:
                startActivity(new Intent(this,gbp.class));
                break;

            case R.id.gtbit:
                startActivity(new Intent(this,gtbit.class));
                break;

            case R.id.hmr:
                startActivity(new Intent(this,hmr.class));
                break;

            case R.id.jims:
                startActivity(new Intent(this,jims.class));
                break;

            case R.id.mait:
                startActivity(new Intent(this,mait.class));
                break;

            case R.id.msit:
                startActivity(new Intent(this,msit.class));
                break;

            case R.id.niit:
                startActivity(new Intent(this,niit.class));
                break;

            case R.id.npti:
                startActivity(new Intent(this,npti.class));
                break;


        }

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar automatically handles clicks on the Home/Up button, if you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.exit){
            System.exit(0);
            return true;
        }


        else if(item.getItemId() == R.id.home){
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            return true;
        }

        else if(item.getItemId() == R.id.colleges){
            // Do nothing
            return true;
        }

        else if(item.getItemId() == R.id.streams){
            startActivity(new Intent(MainActivity.this, Main2Activity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);

    }


}