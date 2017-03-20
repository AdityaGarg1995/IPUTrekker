package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;

public class SEM1Syllabus extends AppCompatActivity implements View.OnClickListener {

//    Button button1,button2,button3,button4,button5,button6,button7,button8;


   Activity a = this;
   Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);

        findViewById(R.id.am_i).setOnClickListener(this);
        findViewById(R.id.ap_i).setOnClickListener(this);
        findViewById(R.id.ap_iLab).setOnClickListener(this);
        findViewById(R.id.chem).setOnClickListener(this);
        findViewById(R.id.chemLab).setOnClickListener(this);
        findViewById(R.id.egLab).setOnClickListener(this);
        findViewById(R.id.et).setOnClickListener(this);
        findViewById(R.id.etLab).setOnClickListener(this);
        findViewById(R.id.foc).setOnClickListener(this);
        findViewById(R.id.focLab).setOnClickListener(this);
        findViewById(R.id.hvpe_i).setOnClickListener(this);
        findViewById(R.id.mp).setOnClickListener(this);
        findViewById(R.id.mpLab).setOnClickListener(this);

        a.setTitle("1st Semester Subjects");


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.am_i:
               i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-I");
                break;
            case R.id.ap_i:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AP-I");
                break;
            case R.id.ap_iLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "APLab-I");
                break;
            case R.id.chem:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "Chem");
                break;
            case R.id.chemLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ChemLab");
                break;
            case R.id.egLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EGLab");
                break;
            case R.id.et:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ET");
                break;
            case R.id.etLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ETLab");
                break;
            case R.id.foc: i = new Intent(this, Syllabus.class).putExtra("Subject", "FoC");
                break;
            case R.id.focLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "FoCLab");
                break;
            case R.id.hvpe_i: i = new Intent(this, Syllabus.class).putExtra("Subject", "HVPE");
                break;
            case R.id.mp: i = new Intent(this, Syllabus.class).putExtra("Subject", "MP");
                break;
            case R.id.mpLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "MPLab");
                break;
        }
        try {
            i.putExtra("Sem", "1").putExtra("SubjectName", ((Button)v).getText().toString());
            startActivity(i);
        }catch (Exception e){e.printStackTrace();}

    }

}