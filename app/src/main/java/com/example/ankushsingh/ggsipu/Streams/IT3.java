package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;

// 3rd sem
public class IT3 extends AppCompatActivity implements View.OnClickListener {

    Activity a = this;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 3rd Semester Subjects");


        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        findViewById(R.id.am_iii).setOnClickListener(this);
        findViewById(R.id.stld).setOnClickListener(this);
        findViewById(R.id.stldLab).setOnClickListener(this);
        findViewById(R.id.ds).setOnClickListener(this);
        findViewById(R.id.dsLab).setOnClickListener(this);
        findViewById(R.id.cgmm).setOnClickListener(this);
        findViewById(R.id.cgmmLab).setOnClickListener(this);
        findViewById(R.id.cns).setOnClickListener(this);
        findViewById(R.id.cnsLab).setOnClickListener(this);
        findViewById(R.id.fcs).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.am_iii:  i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III")
                                                                   .putExtra("Sem", "3")
                                                                   .putExtra("SubjectName", "Applied Mathematics-III");
                break;

            case R.id.cgmm:   i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMM")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName", "Computer Graphics & Multimedia");
                break;

            case R.id.stld:   i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName","Switching Theory & Logic Design");
                break;

            case R.id.ds:     i = new Intent(this, Syllabus.class).putExtra("Subject", "DS")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName","Data Structures");
                break;

            case R.id.cns:    i = new Intent(this, Syllabus.class).putExtra("Subject", "CnS")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName","Circuits & Systems");
                break;

            case R.id.fcs:    i = new Intent(this, Syllabus.class).putExtra("Subject", "FCS")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName","Foundation of Computer Science");
                break;

            case R.id.dsLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "DSLab")
                                                                  .putExtra("Sem", "3")
                                                                  .putExtra("SubjectName","Data Structures Lab");
                break;

            case R.id.cnsLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "CnSLab")
                                                                   .putExtra("Sem", "3")
                                                                   .putExtra("SubjectName","Circuits & Systems Lab");
                break;

            case R.id.cgmmLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMMLab")
                                                                   .putExtra("Sem", "3")
                                                                   .putExtra("SubjectName", "Computer Graphics & Multimedia Lab");
                break;

            case R.id.stldLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab")
                                                                   .putExtra("Sem", "3")
                                                                   .putExtra("SubjectName","Switching Theory & Logic Design Lab");
                break;

        }

        if(i != null)
            startActivity(i);


    }
}
