package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.StreamActivity;
import com.example.ankushsingh.ggsipu.Syllabus;


//4th sem
public class IT4 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;
    String stream;

    Button am_iv, amLab, control, csLab, dbms, dbmsLab, toc, oops, oopsLab, coa, coaLab, lab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4);


        stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 4th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        am_iv = (Button) findViewById(R.id.am_iv);
        amLab = (Button)findViewById(R.id.amLab);
        control = (Button)findViewById(R.id.control);
        csLab = (Button)findViewById(R.id.csLab);
        dbms = (Button)findViewById(R.id.dbms);
        dbmsLab = (Button)findViewById(R.id.dbmsLab);
        oops = (Button)findViewById(R.id.oops);
        oopsLab = (Button)findViewById(R.id.oopsLab);
        toc = (Button)findViewById(R.id.toc);
        coa = (Button) findViewById(R.id.coa);
        coaLab = (Button)findViewById(R.id.coaLab);
        lab1 = (Button)findViewById(R.id.lab1);


        am_iv.setOnClickListener(this);
        amLab.setOnClickListener(this);
        coa.setOnClickListener(this);
        coaLab.setOnClickListener(this);
        toc.setOnClickListener(this);
        oopsLab.setOnClickListener(this);
        csLab.setOnClickListener(this);    // IT, EEE
        dbms.setOnClickListener(this);
        control.setOnClickListener(this);  // IT, EEE
        dbmsLab.setOnClickListener(this);
        oops.setOnClickListener(this);
        lab1.setOnClickListener(this);

        lab1.setVisibility(View.INVISIBLE);


        if(stream.equals("CSE")){
            control.setText("Communication Systems");
            csLab.setText("Communication Systems Lab");
        }

        else if(stream.equals("ECE")){

            control.setText("Communication Systems");
            csLab.setText("Communication Systems Lab");

            dbms.setText("Analog Electronics-II");
            dbmsLab.setText("Analog Electronics-II Lab");

            oops.setText("Network Analysis and Synthesis (M)");
            oopsLab.setText("Network Analysis and Synthesis Lab");

            coaLab.setText("Linux Programming and Administration Lab");

            toc.setText("Electromagnetic Field Theory");

            control.setText(control.getText() + " (M)");

        }

        else if(stream.equals("EEE")) {

            am_iv.setText("Electrical Machines-II (M)");
            amLab.setText("Electrical Machines-II Lab");

            coa.setText("Power System–I (M)");
            coaLab.setText("Power System–I Lab");

            dbms.setText("Analog Electronics-II (M)");
            dbmsLab.setText("Analog Electronics-II Lab");

            oops.setText("Electrical and Electronics Measuring Instruments");
            oopsLab.setText("Electrical and Electronics Measuring Instruments Lab");

            toc.setText("Electromagnetic Field Theory");

        }

        else if(stream.equals("CE")){

            am_iv.setText("Design of Concrete Structure");
            amLab.setText("Cement and Concrete Testing Lab");

            coa.setText("Hydraulics and Hydraulic Machines");
            coaLab.setText("Hydraulics and Hydraulic Machines Lab");

            control.setText("Soil Mechanics");

            csLab.setText("Seminar");

            dbms.setText("Structural Analysis");
            dbmsLab.setText("Structural Analysis Lab");

            oops.setText("Advanced Surveying");
            oopsLab.setText("Advanced Surveying Lab");

            toc.setText("Water Engineering");

        }

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.am_iv:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-IV")
                                .putExtra("Sem", "4");
                    break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Concrete")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", am_iv.getText());
                break;

            case R.id.amLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AMLab")
                                .putExtra("Sem", "4");
                    break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CementLab")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", amLab.getText());
                break;

            case R.id.coa:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "COA")
                                .putExtra("Sem", "4");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Hydraulics")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", coa.getText());

            case R.id.coaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "COALab")
                                 .putExtra("Sem", "4");
                         break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Linux")
                                .putExtra("Sem", "Ece4");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "HydraulicsLab")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", coaLab.getText());
                break;

            case R.id.dbms:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS")
                                .putExtra("Sem", "4");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE-II")
                                .putExtra("Sem", "Ece4");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SA")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", dbms.getText());
                break;

            case R.id.dbmsLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS")
                            .putExtra("Sem", "4");
                         break;
                    case "ECE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab-II")
                            .putExtra("Sem", "Ece4");
                         break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SALab")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", dbmsLab.getText());
                break;

            //  Control/Comm Systems
            case R.id.control:

                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "ICE":
                    case "PE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Control")
                                .putExtra("Sem", "4");
                        break;

                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Comm")
                                .putExtra("Sem", "4");
                        break;

                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Soil")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", control.getText());
                break;

            case R.id.csLab:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "ICE":
                    case "PE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CSLab")
                                .putExtra("Sem", "4");

                    case "CSE":
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CommLab")
                                .putExtra("Sem", "4");
                         break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar")
                                .putExtra("Sem", "Civil4");

                    break;
                }
                i.putExtra("SubjectName", csLab.getText());
                break;

            case R.id.oops:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPS")
                                .putExtra("Sem", "4");
                         break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAS")
                                .putExtra("Sem", "Ece4");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Survey-II")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", oops.getText());
                break;

            case R.id.oopsLab:
                switch (stream) {
                case "IT":
                case "CSE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPSLab")
                            .putExtra("Sem", "4");
                    break;
                case "ECE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "NASLab")
                            .putExtra("Sem", "Ece4");
                    break;
                case "CE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyLab-II")
                            .putExtra("Sem", "Civil4");
                    break;
                }
                i.putExtra("SubjectName", oopsLab.getText());
                break;


            case R.id.toc:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "TOC")
                                .putExtra("Sem", "4");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMFT")
                                .putExtra("Sem", "Ece4");
                        break;
                    case "CE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Water")
                                .putExtra("Sem", "Civil4");
                        break;
                }
                i.putExtra("SubjectName", toc.getText());
                break;

            case R.id.lab1:
                switch (stream){

                }
                break;

        }

        if(i != null)
            startActivity(i);

    }
}
