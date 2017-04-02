package com.example.ipu_trekker.ggsipu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.ipu_trekker.ggsipu.Colleges.aiactr;


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


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.aiactr:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "AIACTR")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.amity:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College","Amity School of Education")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.bpit:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "BPIT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.bvp:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "BVPCOE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.bp:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "Ch.BP Govt Engg College")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.dite:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "DITE")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.dtc:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "Delhi Technical Campus")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.gbp:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "GBPant College of Engg")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.gtbit:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "GTBIT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.hmr:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "HMRITM")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.jims:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "JIMS")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.mait:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "MAIT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.msit:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "MSIT")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.niit:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "NIEC")); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.npti:
                try{ startActivity(new Intent(this,aiactr.class).putExtra("College", "NPTI")); }
                catch (Exception e){e.printStackTrace();}
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

//        if(item.getItemId() == R.id.home){
//            startActivity(new Intent(CollegeActivity.this, HomeActivity.class));
//            return true;
//        }

//        else if(item.getItemId() == R.id.colleges)
//            // Do nothing
//            return true;

//       else if(item.getItemId() == R.id.streams){
//            startActivity(new Intent(CollegeActivity.this, StreamActivity.class));
//            return true;
//        }
//
//        else if(item.getItemId() == R.id.result){
//            startActivity(new Intent(CollegeActivity.this, logo.class).putExtra("Task", StreamNames.task2));
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}