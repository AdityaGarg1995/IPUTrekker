package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;

public class ZChooseSemForSyll extends AppCompatActivity implements View.OnClickListener {

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
                try{ startActivity(new Intent(this, SEM1Syllabus.class)); }
                catch (Exception e){e.printStackTrace();}
                break;
            case R.id.c2:
                try{ startActivity(new Intent(this, SEM2Syllabus.class)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c3:
                try{ startActivity(new Intent(this, IT3.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c4:
                try{ startActivity(new Intent(this, IT4.class).putExtra("Stream",stream)); }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c5:
                try {
                    switch (stream) {
                        case "PE":
                            startActivity(new Intent(this, SEM5_PE.class).putExtra("Stream", stream));
                            break;
                        default:
                            startActivity(new Intent(this, IT5.class).putExtra("Stream", stream));
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
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
                            startActivity(new Intent(this, IT6.class).putExtra("Stream", stream));
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c7:
                try {
                    switch (stream) {
                        case "IT":
                        case "ME":
                        case "MT":
                        case "TE":
                        case "MAE":
                            startActivity(new Intent(this, IT7.class).putExtra("Stream", stream));
                            break;
                        case "CSE":
                            startActivity(new Intent(this, SEM7_CSE.class));
                            break;
                        case "ECE":
                            startActivity(new Intent(this, SEM7_ECE.class));
                            break;
                        case "EE":
                            startActivity(new Intent(this, SEM7_EEEnEE.class).putExtra("Stream", stream));
                            break;
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
                        case "ICE":
                            break;
                    }
                }
                catch (Exception e){e.printStackTrace();}
                break;

            case R.id.c8:
                try {
                    switch (stream) {
                        case "IT":
                        case "ICE":
                        case "MAE":
                        case "ME":
                        case "MT":
                        case "TE":
                            startActivity(new Intent(this, IT8.class).putExtra("Stream", stream));
                            break;
                        case "CSE":
                            startActivity(new Intent(this, SEM8_CSE.class));
                            break;
                        case "ECE":
                            startActivity(new Intent(this, SEM8_ECE.class));
                            break;
                        case "EE":
                            startActivity(new Intent(this, SEM8_EEEnEE.class).putExtra("Stream", stream));
                            break;
                        case "EEE":
                            startActivity(new Intent(this, SEM8_EEEnEE.class).putExtra("Stream", stream));
                            break;
                        case "PE":
                            startActivity(new Intent(this, SEM8_EEEnEE.class).putExtra("Stream", stream));
                            break;
                        case "CE":
                            startActivity(new Intent(this, SEM8_CE.class).putExtra("Stream", stream));
                            break;
                        case "ENE":
                            startActivity(new Intent(this, SEM8_ENE.class).putExtra("Stream", stream));
                            break;}
                }
                catch (Exception e){e.printStackTrace();}
                break;

        }

    }
}
