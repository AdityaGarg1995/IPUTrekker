package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;



public class IT5 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;
    String stream;

    Button ada, adaLab, se, seLab, java, javaLab, comm, commLab, lab1, im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it5);

        stream = getIntent().getStringExtra("Stream");


        a.setTitle(stream + ": 5th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        findViewById(R.id.skills).setOnClickListener(this);
        findViewById(R.id.skillsLab).setOnClickListener(this);


        ada     = (Button)findViewById(R.id.ada);
        adaLab  = (Button)findViewById(R.id.adaLab);
        java    = (Button)findViewById(R.id.java);
        javaLab = (Button)findViewById(R.id.javaLab);
        se      = (Button)findViewById(R.id.se);
        seLab   = (Button)findViewById(R.id.seLab);
        comm    = (Button)findViewById(R.id.comm);
        commLab = (Button)findViewById(R.id.commLab);
        im = (Button)findViewById(R.id.im);
        lab1    = (Button)findViewById(R.id.lab1);


        ada.setOnClickListener(this);
        adaLab.setOnClickListener(this);
        java.setOnClickListener(this);
        javaLab.setOnClickListener(this);
        se.setOnClickListener(this);
        comm.setOnClickListener(this);
        commLab.setOnClickListener(this);
        seLab.setOnClickListener(this);
        im.setOnClickListener(this);

        lab1.setVisibility(View.INVISIBLE);


        setSubject(stream);


    }


    public void setSubject(String stream){

        switch (stream){
            case "CSE":
                comm.setText("Digital Communication");
                commLab.setText("Digital Communication Lab");
                break;

            case "ECE":

                ada.setText("Digital System Design (M)");
                adaLab.setText("Digital System Design Lab");

                comm.setText("Digital Communication (M)");
                commLab.setText("Digital Communication Lab");

                java.setText("Control Systems (M)");
                javaLab.setText("Control Systems Lab");

                se.setText("Microprocessors and Microcontrollers (M)");
                seLab.setText("Microprocessors and Microcontrollers Lab");

//                 im & skills
                break;

            case "EEE":

                ada.setText("Power Electronics (M)");
                adaLab.setText("Power Electronics Lab");

                java.setText("Sensors & Transducers (M)");
                javaLab.setText("Sensors & Transducers Lab");

                se.setText("Switching Theory & Logic Design (M)");
                seLab.setText("Switching Theory & Logic Design Lab");

                lab1.setVisibility(View.VISIBLE);
                lab1.setOnClickListener(this);
                lab1.setText("Electrical & Electronic Workshop");

                break;

            case "CE":

                ada.setText("Geotechnical and Foundation Engineering");
                adaLab.setText("Geotechnical and Foundation Engineering Lab");

                java.setText("Engineering Hydrology");

                se.setText("Advanced Structural Analysis");

                comm.setText("Wastewater Engineering and Reuse");
                commLab.setText("Wastewater Engineering and Reuse Lab");

                javaLab.setText("Seminar on Civil Engineering projects/Visits/Case Studies");

                seLab.setText("Software Training");

                im.setText("Design of Steel Structure");

                break;

            case "EE":

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Electrical Workshop (NUES)");
                comm.setText(comm.getText() + " (M)");

                break;
        }


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ada:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "ADA")
                            .putExtra("Sem", "5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "GFE")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DSD")
                                .putExtra("Sem", "Ece5");
                        break;

                }
                break;

            case R.id.adaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "ADALab")
                            .putExtra("Sem", "5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "GFELab")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DSDLab")
                                .putExtra("Sem", "Ece5");
                        break;
                }
                break;


            case R.id.comm:

                if(stream.equals("IT")
                        || stream.equals("EEE")
                        || stream.equals("EE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","CommSys")
                            .putExtra("Sem","5");

                else if(stream.equals("CSE")
                        || stream.equals("ECE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","DigiComm")
                            .putExtra("Sem","5");

                else if(stream.equals("CE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "WER")
                            .putExtra("Sem", "Civil5");

                else if (stream.equals("ME")){
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "Control")
                            .putExtra("Sem", "4");
                }
                break;


            case R.id.commLab:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CommSysLab")
                                .putExtra("Sem", "5");
                        break;
                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DigiCommLab")
                                .putExtra("Sem", "5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "WERLab")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ME":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CSLab")
                                .putExtra("Sem", "4");
                        break;
                }
                break;

            case R.id.im:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                    case "EEE":
                    case "ICE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "IM")
                                .putExtra("Sem", "5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Steel")
                                .putExtra("Sem", "Civil5");
                        break;
                }
                break;

            case R.id.se:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "SE")
                                 .putExtra("Sem", "5");
                         break;
                    case "EEE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD")
                                .putExtra("Sem", "Ee5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SA-II")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Micro")
                                .putExtra("Sem", "6");
                        break;
                }
                break;

            case R.id.seLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SELab")
                                .putExtra("Sem", "5");
                        break;
                    case "EEE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab")
                                .putExtra("Sem", "Ee5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Software")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MicroLab")
                                .putExtra("Sem", "6");
                        break;
                }
                break;


            case R.id.java:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "JAVA")
                                .putExtra("Sem", "5");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Hydrology")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Control")
                                .putExtra("Sem", "4");
                        break;
                }
                break;

            case R.id.javaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "JAVALab")
                                 .putExtra("Sem", "5");
                         break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar")
                                .putExtra("Sem", "Civil5");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CSLab")
                                .putExtra("Sem", "4");
                        break;
                }
                break;



            case R.id.skills:    i = new Intent(this,Syllabus.class).putExtra("Subject","Skills")
                    .putExtra("Sem","5");
                break;

            case R.id.skillsLab: i = new Intent(this,Syllabus.class).putExtra("Subject","SkillsLab")
                    .putExtra("Sem","5");
                break;


//            Extra Lab
            case R.id.lab1:
                switch (stream){
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Workshop")
                                .putExtra("Sem", "Ee5");
                        break;
                }
                break;

        }

        i.putExtra("SubjectName",((Button)v).getText());
        if(i != null)
            startActivity(i);

    }
}
