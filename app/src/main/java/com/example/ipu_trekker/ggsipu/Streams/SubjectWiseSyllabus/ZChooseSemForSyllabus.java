package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ipu_trekker.ggsipu.R;

public class ZChooseSemForSyllabus extends AppCompatActivity implements View.OnClickListener {

    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it2);

        stream = getIntent().getStringExtra("Stream");
        final Activity activity = this;
        activity.setTitle(stream + ": Choose Semester");

        findViewById(R.id.c1).setOnClickListener(this);
        findViewById(R.id.c2).setOnClickListener(this);
        findViewById(R.id.c3).setOnClickListener(this);
        findViewById(R.id.c4).setOnClickListener(this);
        findViewById(R.id.c5).setOnClickListener(this);
        findViewById(R.id.c6).setOnClickListener(this);
        findViewById(R.id.c7).setOnClickListener(this);
        findViewById(R.id.c8).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c1:
                try{ startActivity(new Intent(this, SEM1.class)); }
                catch (Exception e){e.printStackTrace();}
                break;
            case R.id.c2:
                try{ startActivity(new Intent(this, SEM2.class)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c3:
                try{ startActivity(new Intent(this, SEM3.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c4:
                try{ startActivity(new Intent(this, SEM4.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c5:
                try {
                    switch (stream) {
                        case "PE":
                            startActivity(new Intent(this, SEM5_PE.class));
                            break;
                        default:
                            startActivity(new Intent(this, SEM5.class).putExtra("Stream", stream));
                            break;
                    }
                }  catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c6:
                try {
                    switch (stream) {
                        case "CE":
                        case "ENE":
                            startActivity(new Intent(this, SEM6_CEnENE.class).putExtra("Stream", stream));
                            break;
                        case "PE":
                            startActivity(new Intent(this, SEM6_PE.class));
                            break;
                        default:
                            startActivity(new Intent(this, SEM6.class).putExtra("Stream", stream));
                            break;
                    }
                } catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c7:
                try {
                    switch (stream) {
                        case "IT":
                        case "TE":
                        case "MAE":
                        case "CSE":
                            startActivity(new Intent(this, SEM7_ITnCSEnTEnMAE.class).putExtra("Stream", stream));
                            break;
                        case "ECE":
                            startActivity(new Intent(this, SEM7_ECE.class));
                            break;
                        case "EE":
                        case "EEE":
                            startActivity(new Intent(this, SEM7_EEEnEE.class).putExtra("Stream", stream));
                            break;
                        case "CE":
                            startActivity(new Intent(this, SEM7_CE.class).putExtra("Stream", stream));
                            break;
                        case "PE":
                            startActivity(new Intent(this, SEM7_PE.class).putExtra("Stream", stream));
                            break;
                        case "ENE":
                            startActivity(new Intent(this, SEM7_ENE.class).putExtra("Stream", stream));
                            break;
                        case "MT":
                            startActivity(new Intent(this, SEM7_MT.class).putExtra("Stream", stream));
                            break;
                        case "ICE":
                            startActivity(new Intent(this, SEM7_ICE.class).putExtra("Stream", stream));
                            break;
                        case "ME":
                            startActivity(new Intent(this, SEM7_ME.class).putExtra("Stream", stream));
                            break;
                    }
                }  catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c8:
                try {
                    switch (stream) {
                        case "IT":
                        case "ME":
                        case "TE":
                            startActivity(new Intent(this, SEM8_ITnTEnME.class).putExtra("Stream", stream));
                            break;
                        case "CSE":
                            startActivity(new Intent(this, SEM8_CSE.class));
                            break;
                        case "ECE":
                            startActivity(new Intent(this, SEM8_ECE.class));
                            break;
                        case "EE":
                        case "EEE":
                            startActivity(new Intent(this, SEM8_EEEnEE.class).putExtra("Stream", stream));
                            break;
                        case "PE":
                        case "MT":
                            startActivity(new Intent(this, SEM8_PEnMT.class).putExtra("Stream", stream));
                            break;
                        case "CE":
                            startActivity(new Intent(this, SEM8_CE.class).putExtra("Stream", stream));
                            break;
                        case "ENE":
                            startActivity(new Intent(this, SEM8_ENE.class).putExtra("Stream", stream));
                            break;
                        case "ICE":
                        case "MAE":
                            startActivity(new Intent(this, SEM8_MAEnICE.class).putExtra("Stream", stream));
                            break;}
                }  catch (Exception e){e.printStackTrace();}
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