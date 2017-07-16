package com.example.ipu_trekker.ggsipu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        findViewById(R.id.university).setOnClickListener(this);
        findViewById(R.id.colleges).setOnClickListener(this);
        findViewById(R.id.streams).setOnClickListener(this);
        findViewById(R.id.result).setOnClickListener(this);
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
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void activityStart(String task){
        try{
            startActivity(new Intent(this, UniversityActivity.class).putExtra("Task", task));
        } catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.university:
                activityStart(ImportantStrings.task1);
                break;

            case R.id.colleges:
                try{
                    startActivity(new Intent(this, CollegeActivity.class));
                } catch (Exception e){e.printStackTrace();}
                break;

            case R.id.streams:
                try{
                    startActivity(new Intent(this, StreamActivity.class));
                } catch (Exception e){e.printStackTrace();}
                break;

            case R.id.result:
                activityStart(ImportantStrings.task2);
                break;
        }
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