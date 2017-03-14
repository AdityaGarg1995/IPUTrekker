package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;

import java.io.IOException;

import static com.example.ankushsingh.ggsipu.R.id.lab1;

// 3rd sem
public class IT3 extends AppCompatActivity implements View.OnClickListener {

    Activity a = this;
    Intent i;

    Button buttons[] = new Button[12];
    String files[], stream;


    String civilSubjects[] = {"Building Materials & Construction", "Fluid Mechanics", "Engineering Geology",
                              "Numerical Analysis & Statistical Techniques", "Strength of Material",
                              "Surveying", "Fluid Mechanics Lab", "Engineering Geology Lab",
                              "Numerical Analysis & Statistical Techniques Lab", "Surveying Lab",
                              "Civil Engineering Drawing using CAD Lab"},

           eceSubjects[] = {"Applied Mathematics-III", "Analog Electronics-I (M)", "Data Structures",
                            "Electronic Instruments & Measurements (M)", "Signals & Systems", "Switching Theory & Logic Design (M)",
                            "Analog Electronics Lab", "Data Structures Lab", "Signals & Systems Lab",
                            "Electronic Instruments & Measurements Lab", "Switching Theory & Logic Design Lab"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        stream = getIntent().getStringExtra("Stream");


        a.setTitle(stream + ": 3rd Semester Subjects");


        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        Button am_iii = buttons[0] = (Button)findViewById(R.id.am_iii),
               cgmm   = buttons[1] = (Button)findViewById(R.id.cgmm),
               cns    = buttons[2] = (Button)findViewById(R.id.cns),
               ds     = buttons[3] = (Button)findViewById(R.id.ds),
               fcs    = buttons[4] = (Button)findViewById(R.id.fcs),
               stld   = buttons[5] = (Button)findViewById(R.id.stld),

               cgmmLab = buttons[6] = (Button)findViewById(R.id.cgmmLab),
               cnsLab  = buttons[7] = (Button)findViewById(R.id.cnsLab),
               dsLab   = buttons[8] = (Button)findViewById(R.id.dsLab),
               stldLab = buttons[9] = (Button)findViewById(R.id.stldLab);

        buttons[10] = (Button)findViewById(lab1);
        buttons[10].setVisibility(View.INVISIBLE);

        buttons[11] = (Button)findViewById(R.id.lab2);
        buttons[11].setVisibility(View.INVISIBLE);


        for(int i = 0; i < 11; i++ )
           buttons[i].setOnClickListener(this);

        if(stream.equals("CE")){

//            buttons[11].setVisibility(View.VISIBLE);
            for(int i = 0; i < 11; i++ )
                buttons[i].setText(civilSubjects[i]);

        }


        else if(stream .equals("ECE")){

            buttons[10].setVisibility(View.VISIBLE);
            buttons[10].setOnClickListener(this);
            buttons[10].setText("Signals & Systems Lab");

            cgmm.setText("Analog Electronics-I (M)");
            cns.setText("Electronic Instruments & Measurements (M)");
            fcs.setText("Signals & Systems");
            stld.setText(stld.getText() + " (M)");

            cgmmLab.setText("Analog Electronics-I Lab");
            cnsLab.setText("Electronic Instruments & Measurements Lab");

        }

        else if(stream .equals("EEE")){

            buttons[10].setVisibility(View.VISIBLE);
            buttons[10].setOnClickListener(this);
            buttons[10].setText("Scientific Computing Lab");

            cgmm.setText("Analog Electronics-I");
            cgmmLab.setText("Analog Electronics-I Lab");

            stld.setText("Electrical Machines-I (M)");
            stldLab.setText("Electrical Machines-I Lab");

            fcs.setText("Materials in Electrical Systems (M)");

            cns.setText(cns.getText() + " (M)");


        }

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.am_iii:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Applied Mathematics-III");
                        break;
                    case "CE":
                    case "ENE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "BMC")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Building Materials & Construction");
                        break;


                }
                break;

            case R.id.cgmm:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMM")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Computer Graphics & Multimedia");
                        break;
                    case "CE":
                    case "ENE":
                    case "MAE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Fluid")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Fluid Mechanics");
                        break;
                    case "ECE":
                    case "EEE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", eceSubjects[1]);
                        break;
                }
                break;

            case R.id.cns:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnS")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Circuits & Systems");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Geology")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Engineering Geology");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIM")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", eceSubjects[3]);
                        break;
                }
                break;

            case R.id.ds:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DS")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Data Structures");
                        break;
                    case "CE":
                    case "ME":
                    case "MAE":
                    case "TE":
                    case "ENE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAST")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Numerical Analysis & Statistical Techniques");
                        break;
                }
                break;

            case R.id.fcs:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FCS")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Foundation of Computer Science");
                        break;
                    case "CE":
                    case "ENE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Strength")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Strength of Materials");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnS")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", "Signals & Systems");
                        break;
                }
                break;

            case R.id.stld:
                switch (stream){
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "ICE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD")
                                 .putExtra("Sem", "3")
                                 .putExtra("SubjectName", "Switching Theory & Logic Design");
                         break;
                    case "CE":
                    case "ENE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "Surveying")
                                 .putExtra("Sem", "Civil3")
                                 .putExtra("SubjectName", "Surveying");
                         break;
                }
                break;


            case R.id.cgmmLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMMLab")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Computer Graphics & Multimedia Lab");
                        break;
                    case "CE":
                    case "ENE":
                    case "MAE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FluidLab")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Fluid Mechanics Lab");
                        break;
                    case "ECE":
                    case "EEE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab-I")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", "Analog Electronics Lab-I");
                        break;
                }
                break;

            case R.id.cnsLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnSLab")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Circuits & Systems Lab");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "GeoLab")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Engineering Geology Lab");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIMLab")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", "Electronic Instruments & Measurements Lab");
                        break;
                }
                break;

            case R.id.dsLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DSLab")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Data Structures Lab");
                        break;
                    case "CE":
                    case "ME":
                    case "MAE":
                    case "TE":
                    case "ENE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NASTLab")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Numerical Analysis & Statistical Techniques Lab");
                        break;
                }
                break;


            case R.id.stldLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "ICE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab")
                                .putExtra("Sem", "3")
                                .putExtra("SubjectName", "Switching Theory & Logic Design Lab");
                        break;
                    case "CE":
                    case "ENE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyingLab")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Surveying Lab");
                        break;
                }
                break;

            case R.id.lab1:
                switch (stream){
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnSLab")
                                .putExtra("Sem", "Ece3")
                                .putExtra("SubjectName", "Signals & Systems Lab");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CAD")
                                .putExtra("Sem", "Civil3")
                                .putExtra("SubjectName", "Civil Engineering Drawing using CAD Lab");
                        break;
                }

                break;
        }

        if(i != null)
            startActivity(i);


    }
}
