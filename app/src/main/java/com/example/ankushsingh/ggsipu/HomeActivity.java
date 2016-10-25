package com.example.ankushsingh.ggsipu;




import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ankushsingh.ggsipu.Settings.SettingsActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button b1 = (Button) findViewById(R.id.university),
               b2 = (Button) findViewById(R.id.colleges),
               b3 = (Button) findViewById(R.id.streams);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_home_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in AndroidManifest.xml.

        if(item.getItemId() == R.id.exit){
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.university:
                startActivity(new Intent(HomeActivity.this, logo.class));
                break;

            case R.id.colleges:
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;

            case R.id.streams:
                startActivity(new Intent(HomeActivity.this, Main2Activity.class));
                break;

        }
    }
}
