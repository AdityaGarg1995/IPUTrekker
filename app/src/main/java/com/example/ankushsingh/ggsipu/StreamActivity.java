package com.example.ankushsingh.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.ankushsingh.ggsipu.Streams.IT;
import com.example.ankushsingh.ggsipu.Streams.ZCodes;


public class StreamActivity extends AppCompatActivity implements View.OnClickListener {

//    ImageButton[] b = new ImageButton[13];

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
            case R.id.cse:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","CSE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.ece:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","ECE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.it:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","IT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.mae:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","MAE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.eee:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","EEE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.civil:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","CE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.power:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","PE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.ee:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","EE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.me:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","ME")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.ice:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","ICE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.mech:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","MT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.envo:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","ENE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.tool:
                try{ startActivity(new Intent(this, IT.class).putExtra("StreamCode","TE")); }
                catch (Exception e){e.printStackTrace();}
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
//            case R.id.home:
//                startActivity(new Intent(StreamActivity.this, HomeActivity.class));
//                return true;
//
//            case R.id.colleges:
//                startActivity(new Intent(StreamActivity.this, CollegeActivity.class));
//                return true;
//
//            case R.id.result:
//                startActivity(new Intent(StreamActivity.this, logo.class).putExtra("Task", StreamNames.task2));
//                return true;
            case R.id.ncc:
                startActivity(new Intent(StreamActivity.this, ZCodes.class).putExtra("Task", "NCC"));
                return true;

            case R.id.codes:
                startActivity(new Intent(StreamActivity.this, ZCodes.class).putExtra("Task", "Codes"));
                return true;

        }

        return super.onOptionsItemSelected(item);

    }
}