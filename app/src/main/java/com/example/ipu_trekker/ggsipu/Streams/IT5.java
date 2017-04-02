package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;


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

//       Common to all
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
        im      = (Button)findViewById(R.id.im);
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

        setSubject();
    }

    public void setSubject(){
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

                se.setText("Microprocessors & Microcontrollers (M)");
                seLab.setText("Microprocessors & Microcontrollers Lab");
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
                lab1.setText("Electrical & Electronic Workshop (M) (NUES)");
                break;

            case "CE":
                ada.setText("Geotechnical & Foundation Engineering (M)");
                adaLab.setText("Geotechnical & Foundation Engineering Lab");

                java.setText("Engineering Hydrology (M)");

                se.setText("Advanced Structural Analysis");

                comm.setText("Wastewater Engineering & Reuse");
                commLab.setText("Wastewater Engineering & Reuse Lab");

                javaLab.setText("Seminar on Civil Engineering projects/Visits/Case Studies");

                seLab.setText("Software Training");

                im.setText("Design of Steel Structure (M)");
                break;

            case "EE":
//                stld, comm, pe, sns, im
                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Electrical Workshop (M) (NUES)");
                comm.setText(comm.getText() + " (M)");

                ada.setText("Power Electronics (M)");
                adaLab.setText("Power Electronics Lab");

                comm.setText(comm.getText() + " (M)");

                se.setText("Switching Theory & Logic Design");
                seLab.setText("Switching Theory & Logic Design Lab");

                java.setText("Signals & Systems");
                javaLab.setText("Signals & Systems Lab");
                break;

            case "ME":
                ada.setText("Heat Transfer (M)");
                adaLab.setText("Heat Transfer Lab");

                java.setText("Dynamics of Machines (M)");
                javaLab.setText("Dynamics of Machines Lab");

                comm.setText("Control Systems");
                commLab.setText("Control Systems Lab");

                se.setText("Machine Design-I");
                seLab.setText("Machine Design-I Lab");

                im.setText("Management of Manufacturing Systems");
                break;

            case "MAE":
                ada.setText("Heat Transfer & I. C. Engines (M)");
                adaLab.setText("Heat Transfer & I. C. Engines Lab");

                java.setText("Metal Cutting and Tool Design (M)");
                javaLab.setText("Metal Cutting and Tool Design Lab");

                comm.setText("Control Systems");
                commLab.setText("Control Systems Lab");

                se.setText("Metrology (M)");
                seLab.setText("Metrology Lab");

                im.setText("Management of Manufacturing Systems");
                break;

            case "MT":
                ada.setText("Metrology & Quality Control");
                adaLab.setText("Metrology & Quality Control Lab");

                se.setText("Digital Signal Processing (M)");
                seLab.setText("Digital Signal Processing Lab");

                java.setText("Sensors& Transducers (M)");
                javaLab.setText("Sensors & Transducers Lab");

                comm.setText("Power Electronics & Drives (M)");
                commLab.setText("Power Electronics & Drives Lab");

                im.setText("Machine Element Design (M)");
                break;

            case "ICE":
                ada.setText("Digital System Design (M)");
                adaLab.setText("Digital System Design Lab");

                comm.setText("Industrial Instrumentation (M)");
                commLab.setText("Industrial Instrumentation Lab");

                java.setText("Object Oriented Programming using JAVA");
                javaLab.setText("Object Oriented Programming using JAVA Lab");

                se.setText("Microprocessors & Microcontrollers (M)");
                seLab.setText("Microprocessors & Microcontrollers Lab");
                break;

            case "TE":
                ada.setText("CNC Machining & Programming (M)");
                adaLab.setText("CNC Machining & Programming Lab");

                comm.setText("Control Systems (M)");
                commLab.setText("Control Systems Lab");

                java.setText("Jigs, Fixture & Gauge Design (M)");
                javaLab.setText("Jigs, Fixture & Gauge Design Lab");

                se.setText("Plastic Technology");
                seLab.setVisibility(View.INVISIBLE);

                im.setText("Production Planning & Control");
                break;

            case "ENE":
                ada.setText("Design of Structures");
                adaLab.setText("Structure Design Lab");

                comm.setText("Biochemical Processes in Wastewater Treatment (M)");

                commLab.setText("Material Testing Lab");

                java.setText("Hydrology & Drainage Engineering (M)");

                javaLab.setText("Seminar on Environmental Engg projects/ Visits/ Case Studies (NUES)");

                se.setText("Environmental Instrumentation (M)");

                seLab.setText("Environmental Modelling / Software Training (NUES)");

                im.setText("Water Supply & Sewage System (M)");
                break;

            case "PE":
//                Not applicable due to electives
                break;
        }
    }

    @Override
    public void onClick(View v) {
        i = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.ada:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    i.putExtra("Subject", "ADA").putExtra("Sem", "5")
                            .putExtra("Book", Urls.adaBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "GFE").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                    case "ICE":
                        i.putExtra("Subject", "DSD").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "EE":
                    case "EEE":
                        i.putExtra("Subject", "PE").putExtra("Sem", "EE5")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "MQC").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "HTICE").putExtra("Sem", "MAE5")
                                .putExtra("Book", Urls.hticeBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "HT").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "DoS").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "CNC").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.adaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    i.putExtra("Subject", "ADALab").putExtra("Sem", "5")
                            .putExtra("Book", Urls.adaBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "GFELab").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                    case "ICE":
                        i.putExtra("Subject", "DSDLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "EE":
                    case "EEE":
                        i.putExtra("Subject", "PELab").putExtra("Sem", "EE5")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "MQCLab").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "HTICELab").putExtra("Sem", "MAE5")
                                .putExtra("Book", Urls.hticeBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "HTLab").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "SDLab").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "CNCLab").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.comm:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "CommSys").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CSE":
                    case "ECE":
                        i.putExtra("Subject", "DigiComm").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CE":
                        i.putExtra("Subject", "WER").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "MAE":
                    case "TE":
                        i.putExtra("Subject", "Control-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "PED").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "II").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "BPWT").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.commLab:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "CommSysLab").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CSE":
                    case "ECE":
                        i.putExtra("Subject", "DigiCommLab").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CE":
                        i.putExtra("Subject", "WERLab").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "MAE":
                    case "TE":
                        i.putExtra("Subject", "CSLab-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "PEDLab").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "IILab").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "MTLab").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.java:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "JAVA").putExtra("Sem", "5")
                                .putExtra("Book", Urls.javaBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "Hydrology").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                        i.putExtra("Subject", "Control-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "EE":
                        i.putExtra("Subject", "SnS").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "SnT-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MAE":
                        i.putExtra("Subject", "MCTD").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "DoM").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "OOPJ").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "HDE").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "JFG").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.javaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "JAVALab").putExtra("Sem", "5")
                                .putExtra("Book", Urls.javaBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "Seminar").putExtra("Sem", "CE5")
                                .putExtra("Book", "NA");
                        break;
                    case "ECE":
                        i.putExtra("Subject", "CSLab-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "EE":
                        i.putExtra("Subject", "SnSLab").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "SnTLab-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MAE":
                        i.putExtra("Subject", "MCTDLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "DoMLab").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "OOPJLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        i.putExtra("Subject", "Seminar").putExtra("Sem", "ENE5")
                                .putExtra("Book", "NA");
                        break;
                    case "TE":
                        i.putExtra("Subject", "JFGLab").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.se:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i.putExtra("Subject", "SE").putExtra("Sem", "5")
                                 .putExtra("Book", Urls.seBook);
                         break;
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "STLD").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "SA-II").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                    case "ICE":
                        i.putExtra("Subject", "Micro-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "DSP-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "Metrology").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "MD-I").putExtra("Sem", "ME5")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ENE":
                        i.putExtra("Subject", "EI").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "Plastic").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.seLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "SELab").putExtra("Sem", "5")
                                .putExtra("Book", Urls.seBook);
                        break;
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "STLDLab").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "Software").putExtra("Sem", "CE5")
                                .putExtra("Book", "NA");
                        break;
                    case "ECE":
                    case "ICE":
                        i.putExtra("Subject", "MicroLab-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "DSPLab-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "MetrologyLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "MDLab-I").putExtra("Sem", "ME5")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ENE":
                        i.putExtra("Subject", "Training").putExtra("Sem", "ENE5")
                                .putExtra("Book", "NA");
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
                        i.putExtra("Subject", "IM").putExtra("Sem", "5")
                                .putExtra("Book", Urls.imBook);
                        break;
                    case "CE":
                        i.putExtra("Subject", "Steel").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "MED").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.machineElementDesignBook);
                        break;
                    case "MAE":
                    case "ME":
                        i.putExtra("Subject", "MMS").putExtra("Sem", "MAE5")
                                .putExtra("Book", Urls.managementBook);
                        break;
                    case "ENE":
                        i.putExtra("Subject", "WS").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "PPC").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

//            Common to all
            case R.id.skills:    i.putExtra("Subject","Skills").putExtra("Sem","5")
                    .putExtra("Book", Urls.skillsBook);
                break;
            case R.id.skillsLab: i.putExtra("Subject","SkillsLab").putExtra("Sem","5")
                    .putExtra("Book", Urls.skillsBook);
                break;

//            Extra Lab
            case R.id.lab1:
                switch (stream){
                    case "EE":
                        i.putExtra("Subject", "Workshop").putExtra("Sem", "EE5")
                                .putExtra("Book", "NA");
                        break;
                }
                break;
        }
        try {
            i.putExtra("SubjectName",((Button)v).getText().toString());
            if (i != null)
                startActivity(i);
        } catch (Exception e){e.printStackTrace();}
    }
}