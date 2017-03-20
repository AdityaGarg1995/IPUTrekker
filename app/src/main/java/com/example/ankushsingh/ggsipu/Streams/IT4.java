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

    Button am_iv, amLab, control, csLab, dbms, dbmsLab, toc, oops, oopsLab, coa, coaLab, lab1,
           button[] = new Button[6], pb[] = new Button[6];


    String eceTSub[] = {"Applied Mathematics–IV", "Communication Systems (M)", "Analog Electronics–II",
                   "Network Analysis & Synthesis (M)", "Electromagnetic Field Theory", "Computer Organization & Architecture"},
           ecePSub[] = {"Applied Mathematics Lab", "Communication System Lab", "Network Analysis & Synthesis Lab",
                   "Analog Electronics–II Lab", "Linux Programming & Administration Lab", ""},

           eeeTSub[] = {"Electrical Machines-II (M)", "Analog Electronics–II (M)", "Power System–I (M)",
                   "Electrical & Electronics Measuring Instruments", "Electromagnetic Field Theory", "Control Systems (M)"},
           eeePSub[] = {"Electrical Machines-II Lab", "Analog Electronics-II Lab", "Power System-I Lab",
                   "Electrical & Electronics Measuring Instruments Lab", "Control Systems Lab", ""},

           eeTSub[] = {"Electrical Machines-II (M)", "Control Systems (M)", "Power System–I (M)",
                   "Electrical Measuring Instruments & Transducers (M)", "Electromagnetic Field Theory", "Thermodynamics"},
           eePSub[] = {"Electrical Machines-II Lab", "Control Systems Lab",
                   "Power System-I Lab (M)", "Electrical Measuring Instruments & Transducers Lab", "", ""},

           peTSub[] = {"Power Generation Engineering (M)", "Energy Conversion (M)", "Heat & Mass Transfer",
                   "Fluid Mechanics", "Switching Theory & Logic Design", "Control Systems (M)"},
           pePSub[] = {"Heat & Mass Transfer Lab", "Fluid Mechanics Lab", "Switching Theory & Logic Design Lab",
                   "Control Systems Lab", "", ""},

           mtTSub[] = {"Organizational Behaviour", "Kinematics & Dynamics of Machinery (M)", "Signals & Systems (M)",
                   "Control Systems (M)", "Thermal science", "Hydraulics & Pneumatics (M)"},
           mtPSub[] = {"Kinematics & Dynamics of Machinery Lab", "Signals & Systems Lab",
                   "Control Systems Lab", "Hydraulics & Pneumatics Lab", "", ""},

           maeTSub[] = {" Numerical Analysis & Statistical Techniques", "Fluid Systems", "Theory of Machines (M)",
                   "Manufacturing Machines (M)", "Measurements & Instrumentation", "Switching Theory & Logic Design (M)"},
           maePSub[] = {"Numerical Analysis & Statistical Techniques Lab", "Fluid Systems Lab", "Theory of Machines Lab",
                   "Manufacturing Machines Lab", "Switching Theory & Logic Design Lab", ""},

           meTSub[] = {" Kinematics of Machines (M)", "Strength of Materials-II (M)", "Manufacturing Machines (M)",
                   "Measurements & Instrumentation", "I.C Engines & Gas Turbine", "Fluid Mechanics (M)"},
           mePSub[] = {"Kinematics of Machines Lab", "Strength of Material Lab-II",
                   "Manufacturing Machines Lab", "I.C. Engines & Gas Turbine Lab", "Fluid Mechanics Lab", ""},

           teTSub[] = {"Theory of Machines (M)", "Metal Forming (M)", "Machine Tools (M)",
                   "Machine Element Design", "Thermal Science", "Metrology & Quality Assurance (M)"},
           tePSub[] = {"Theory of Machine Lab", "Machine Tools Lab", "Machine Element Design Lab",
                   "Metrology & Quality Assurance Lab", "", ""},

           eneTSub[] = {"Physico-Chemical Treatment Processes (M)", "Structural Engineering", "Environmental Hydraulics (M)",
                   "Introduction to Environmental Legislations (M)", "Geotechnical Engineering", "Air & Noise Pollution (M)"},
           enePSub[] = {"Water Engineering Design & Drawing Lab", "Structure Lab", "Environmental Hydraulics Lab",
                   "Air & Noise Pollution Monitoring & Design Lab", "Seminar (NUES)", ""},

           iceTSub[] = {"Measurements & Instrumentation (M)", "Control Systems (M)", "Power Electronics",
                   "Theory & Applications of Integrated Circuits (M)", "Electrical Machines", "Communication Systems"},
           icePSub[] = {"Measurements & Instrumentation Lab (M)", "Control Systems Lab (M)", "Power Electronics Lab",
                   "Theory & Applications of Integrated Circuits Lab (M)", "Electrical Machines Lab", ""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4);

//        IT, CSE, ECE, EEE, EE, CE
        stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 4th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        am_iv    = button[0] = (Button) findViewById(R.id.am_iv);
        control  = button[1] = (Button)findViewById(R.id.control);
        dbms     = button[2] = (Button)findViewById(R.id.dbms);
        oops     = button[3] = (Button)findViewById(R.id.oops);
        toc      = button[4] = (Button)findViewById(R.id.toc);
        coa      = button[5] = (Button) findViewById(R.id.coa);

        amLab    = pb[0] = (Button)findViewById(R.id.amLab);
        csLab    = pb[1] = (Button)findViewById(R.id.csLab);
        dbmsLab  = pb[2] = (Button)findViewById(R.id.dbmsLab);
        oopsLab  = pb[3] = (Button)findViewById(R.id.oopsLab);
        coaLab   = pb[4] = (Button)findViewById(R.id.coaLab);
        lab1     = pb[5] = (Button)findViewById(R.id.lab1);

        for(int i = 0; i < 6; i++) {
            button[i].setOnClickListener(this);
            pb[i].setOnClickListener(this);
        }
        lab1.setVisibility(View.INVISIBLE);

        setSubject(stream);

    }


    public void setSubject(String stream){

        switch (stream) {

            case "IT":
                dbms.setText("Database Management Systems (M)");
                coa.setText("Computer Organization & Architecture (M)");
                toc.setText("Theory of Computation (M)");
                break;

            case "CSE":
                dbms.setText("Database Management Systems (M)");
                coa.setText("Computer Organization & Architecture (M)");
                toc.setText("Theory of Computation (M)");
                control.setText("Communication Systems");
                csLab.setText("Communication Systems Lab");
                break;

            case "ECE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eceTSub[i]);
                    if(!ecePSub[i].equals("")){
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "EEE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eeeTSub[i]);
                    if(!eeePSub[i].equals("")){
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "EE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eeTSub[i]);
                    if(!eePSub[i].equals("")) {
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "PE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(peTSub[i]);
                    if(!pePSub[i].equals("")) {
                        pb[i].setText(pePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "MT":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(mtTSub[i]);
                    if(!mtPSub[i].equals("")) {
                        pb[i].setText(mtPSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "MAE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(maeTSub[i]);
                    if(!maePSub[i].equals("")) {
                        pb[i].setText(maePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "ME":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(meTSub[i]);
                    if(!mePSub[i].equals("")) {
                        pb[i].setText(mePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "TE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(teTSub[i]);
                    if(!tePSub[i].equals("")) {
                        pb[i].setText(tePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "ICE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(iceTSub[i]);
                    if(!icePSub[i].equals("")) {
                        pb[i].setText(icePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "ENE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eneTSub[i]);
                    if(!enePSub[i].equals("")) {
                        pb[i].setText(enePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.INVISIBLE);
                }
                break;

            case "CE":

                am_iv.setText("Design of Concrete Structure (M)");
                amLab.setText("Cement and Concrete Testing Lab");

                coa.setText("Hydraulics & Hydraulic Machines (M)");
                coaLab.setText("Hydraulics & Hydraulic Machines Lab");

                control.setText("Soil Mechanics (M)");

                csLab.setText("Seminar");

                dbms.setText("Structural Analysis (M)");
                dbmsLab.setText("Structural Analysis Lab");

                oops.setText("Advanced Surveying");
                oopsLab.setText("Advanced Surveying Lab");

                toc.setText("Water Engineering");

                break;
        }

    }


    @Override
    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.am_iv:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-IV").putExtra("Sem", "4");
//                    break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Concrete").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", am_iv.getText());
//                break;
//
//            case R.id.amLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AMLab").putExtra("Sem", "4");
//                    break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CementLab").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", amLab.getText());
//                break;
//
//            case R.id.coa:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "COA").putExtra("Sem", "4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Hydraulics").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", coa.getText());
//
//            case R.id.coaLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                         i = new Intent(this, Syllabus.class).putExtra("Subject", "COALab").putExtra("Sem", "4");
//                         break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Linux").putExtra("Sem", "Ece4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "HydraulicsLab").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", coaLab.getText());
//                break;
//
//            case R.id.dbms:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS").putExtra("Sem", "4");
//                        break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE-II").putExtra("Sem", "Ece4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SA").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", dbms.getText());
//                break;
//
//            case R.id.dbmsLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                         i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS").putExtra("Sem", "4");
//                         break;
//                    case "ECE":
//                         i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab-II").putExtra("Sem", "Ece4");
//                         break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SALab").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", dbmsLab.getText());
//                break;
//
//            //  Control/Comm Systems
//            case R.id.control:
//                switch (stream) {
//                    case "IT":
//                    case "EEE":
//                    case "ICE":
//                    case "PE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Control").putExtra("Sem", "4");
//                        break;
//                    case "CSE":
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Comm").putExtra("Sem", "4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Soil").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", control.getText());
//                break;
//
//            case R.id.csLab:
//                switch (stream) {
//                    case "IT":
//                    case "EEE":
//                    case "ICE":
//                    case "PE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CSLab").putExtra("Sem", "4");
//                    case "CSE":
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CommLab").putExtra("Sem", "4");
//                         break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar").putExtra("Sem", "Civil4");
//                    break;
//                }
//                i.putExtra("SubjectName", csLab.getText());
//                break;
//
//            case R.id.oops:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPS").putExtra("Sem", "4");
//                         break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAS").putExtra("Sem", "Ece4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Survey-II").putExtra("Sem", "Civil4");
//                        break;
//                }
//                i.putExtra("SubjectName", oops.getText());
//                break;
//
//            case R.id.oopsLab:
//                switch (stream) {
//                case "IT":
//                case "CSE":
//                    i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPSLab").putExtra("Sem", "4");
//                    break;
//                case "ECE":
//                    i = new Intent(this, Syllabus.class).putExtra("Subject", "NASLab").putExtra("Sem", "Ece4");
//                    break;
//                case "CE":
//                    i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyLab-II").putExtra("Sem", "Civil4");
//                    break;
//                }
//                i.putExtra("SubjectName", oopsLab.getText());
//                break;
//
//            case R.id.toc:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "TOC").putExtra("Sem", "4");
//                        break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMFT").putExtra("Sem", "Ece4");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Water").putExtra("Sem", "Civil4");
//                        break;
//                }
//                break;
//
//            case R.id.lab1:
//                switch (stream){ }
//                break;
//        }

        String subjectName = ((Button)v).getText().toString();

        switch (stream){
            case "IT":
                switch (v.getId()){
                    case R.id.am_iv:  i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-IV").putExtra("Sem", "4");
                        break;
                    case R.id.amLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "AMLab").putExtra("Sem", "4");
                        break;
                    case R.id.dbms:   i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS").putExtra("Sem", "4");
                        break;
                    case R.id.dbmsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMSLab").putExtra("Sem", "4");
                        break;
                    case R.id.coa:    i = new Intent(this, Syllabus.class).putExtra("Subject", "COA").putExtra("Sem", "4");
                        break;
                    case R.id.coaLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "COALab").putExtra("Sem", "4");
                        break;
                    case R.id.oops:   i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPS").putExtra("Sem", "4");
                        break;
                    case R.id.oopsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPSLab").putExtra("Sem", "4");
                        break;
                    case R.id.toc:    i = new Intent(this, Syllabus.class).putExtra("Subject", "TOC").putExtra("Sem", "4");
                        break;

                    case R.id.control:i = new Intent(this, Syllabus.class).putExtra("Subject", "Control").putExtra("Sem", "4");
                        break;
                    case R.id.csLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "CSLab").putExtra("Sem", "4");
                        break;
                }
                break;
            case "CSE":
                switch (v.getId()){
                    case R.id.am_iv:  i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-IV").putExtra("Sem", "4");
                        break;
                    case R.id.amLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "AMLab").putExtra("Sem", "4");
                        break;
                    case R.id.dbms:   i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMS").putExtra("Sem", "4");
                        break;
                    case R.id.dbmsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "DBMSLab").putExtra("Sem", "4");
                        break;
                    case R.id.coa:    i = new Intent(this, Syllabus.class).putExtra("Subject", "COA").putExtra("Sem", "4");
                        break;
                    case R.id.coaLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "Linux").putExtra("Sem", "4");
                        break;
                    case R.id.oops:   i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPS").putExtra("Sem", "4");
                        break;
                    case R.id.oopsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "OOPSLab").putExtra("Sem", "4");
                        break;
                    case R.id.toc:    i = new Intent(this, Syllabus.class).putExtra("Subject", "TOC").putExtra("Sem", "4");
                        break;

                    case R.id.control:i = new Intent(this, Syllabus.class).putExtra("Subject", "Comm").putExtra("Sem", "4");
                        break;
                    case R.id.csLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "CommLab").putExtra("Sem", "4");
                        break;
                }
                break;

            case "CE":
                switch (v.getId()){
                    case R.id.am_iv:  i = new Intent(this, Syllabus.class).putExtra("Subject", "Concrete")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.amLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "CementLab")
                            .putExtra("Sem", "4");
                        break;
                    case R.id.dbms:   i = new Intent(this, Syllabus.class).putExtra("Subject", "SA")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.dbmsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "SALab")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.coa:    i = new Intent(this, Syllabus.class).putExtra("Subject", "Hydraulics")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.coaLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "HydraulicsLab")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.oops:   i = new Intent(this, Syllabus.class).putExtra("Subject", "Survey-II")
                            .putExtra("Sem", "CE4");
                        break;
                    case R.id.oopsLab:i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyLab-II")
                            .putExtra("Sem", "CE4");
                        break;

                    case R.id.toc:    i = new Intent(this, Syllabus.class).putExtra("Subject", "Water")
                            .putExtra("Sem", "CE4");
                        break;

                    case R.id.control:i = new Intent(this, Syllabus.class).putExtra("Subject", "Soil")
                            .putExtra("Sem", "CE4");
                        break;

                    case R.id.csLab:  i = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar")
                            .putExtra("Sem", "CE4");
                        break;
                }
                break;

            case "ECE":
                switch (subjectName){
                    case "Applied Mathematics-IV":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-IV").putExtra("Sem", "4");
                        break;
                    case "Applied Mathematics-IV Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "AMLab").putExtra("Sem", "4");
                        break;

                    case "Communication Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Comm").putExtra("Sem", "4");
                        break;
                    case "Communication Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "CommLab").putExtra("Sem", "4");
                        break;

                    case "Computer Organization & Architecture":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "COA").putExtra("Sem", "4");
                        break;
                    case "Linux Programming & Administration Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Linux").putExtra("Sem", "4");
                        break;

                    case "Network Analysis & Synthesis (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "NAS").putExtra("Sem", "4");
                        break;
                    case "Network Analysis & Synthesis Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "NASLab").putExtra("Sem", "4");
                        break;

                    case "Analog Electronics–II":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "AE-II").putExtra("Sem", "4");
                        break;
                    case "Analog Electronics–II Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "AELab-II").putExtra("Sem", "4");
                        break;

                    case "Electromagnetic Field Theory":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EMFT").putExtra("Sem", "4");
                        break;
                }
                break;

            case "EEE":
            case "EE":
                switch (subjectName){
//                    Common
                    case "Electrical Machines-II (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EM-II").putExtra("Sem", "EEE4");
                        break;
                    case "Electrical Machines-II lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EM-II").putExtra("Sem", "EEE4");
                        break;

                    case "Power Systems-I (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PS-I").putExtra("Sem", "EEE4");
                        break;
                    case "Power Systems-I Lab":
                    case "Power Systems-I Lab (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PSLab-I").putExtra("Sem", "EEE4");
                        break;

                    case "Control Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Control").putExtra("Sem", "4");
                        break;
                    case "Control Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ControlLab").putExtra("Sem", "4");
                        break;

                    case "Electromagnetic Field Theory":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EMFT").putExtra("Sem", "EEE4");
                        break;

//                    EEE
                    case "Analog Electronics–II (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "AE-II").putExtra("Sem", "EEE4");
                        break;
                    case "Analog Electronics–II Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "AELab-II").putExtra("Sem", "EEE4");
                        break;

                    case "Electrical & Electronics Measuring Instruments":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EEMI").putExtra("Sem", "EEE4");
                        break;
                    case "Electrical & Electronics Measuring Instruments Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EEMILab").putExtra("Sem", "EEE4");
                        break;

//                    EE
                    case "Electrical Measuring Instruments & Transducers (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EMIT").putExtra("Sem", "EEE4");
                        break;
                    case "Electrical Measuring Instruments & Transducers Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EMITLab").putExtra("Sem", "EEE4");
                        break;

                    case "Thermodynamics":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Thermo").putExtra("Sem", "EEE4");
                        break;
                }
                break;

            case "PE":
                switch (subjectName){
                    case "Power Generation Engineering (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PGE").putExtra("Sem", "PE4");
                        break;

                    case "Energy Conversion (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EC").putExtra("Sem", "PE4");
                        break;

                    case "Control Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Control").putExtra("Sem", "4");
                        break;
                    case "Control Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "CSLab").putExtra("Sem", "4");
                        break;

                    case "Heat & Mass Transfer":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "HMTE").putExtra("Sem", "PE4");
                        break;
                    case "Heat & Mass Transfer Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "HMTLab").putExtra("Sem", "PE4");
                        break;

                    case "Fluid":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Fluid").putExtra("Sem", "ME4");
                        break;
                    case "Fluid Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "FluidLab").putExtra("Sem", "ME4");
                        break;

                    case "Switching Theory & Logic Design":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "STLD").putExtra("Sem", "PE4");
                        break;
                    case "Switching Theory & Logic Design Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "STLDLab").putExtra("Sem", "PE4");
                        break;
                }
                break;

            case "MAE":
                switch (subjectName) {
                    case "Switching Theory & Logic Design (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "STLD").putExtra("Sem", "PE4");
                        break;
                    case "Switching Theory & Logic Design Lab":
                    case "Switching Theory & Logic Design Lab (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "STLDLab").putExtra("Sem", "PE4");
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "NASTLab").putExtra("Sem", "MAE4");
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "NASTLab").putExtra("Sem", "MAE4");
                        break;

                    case "Fluid Systems":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "FS").putExtra("Sem", "MAE4");
                        break;
                    case "Fluid Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "FSLab").putExtra("Sem", "MAE4");
                        break;

                    case "Theory of Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ToM").putExtra("Sem", "MAE4");
                        break;
                    case "Theory of Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ToMLab").putExtra("Sem", "MAE4");
                        break;

                    case "Manufacturing Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MM").putExtra("Sem", "ME4");
                        break;
                    case "Manufacturing Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MLab").putExtra("Sem", "ME4");
                        break;

                    case "Measurements & Instrumentation":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MnI").putExtra("Sem", "ME4");
                        break;
                }
                break;

            case "ME":
                switch (subjectName){
                    case "Manufacturing Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MM").putExtra("Sem", "ME4");
                        break;
                    case "Manufacturing Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MLab").putExtra("Sem", "ME4");
                        break;

                    case "Measurements & Instrumentation":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MnI").putExtra("Sem", "ME4");
                        break;

                    case "Fluid":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Fluid").putExtra("Sem", "ME4");
                        break;
                    case "Fluid Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "FluidLab").putExtra("Sem", "ME4");
                        break;

                    case "IC Engines & Gas Turbines":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ICGT").putExtra("Sem", "ME4");
                        break;
                    case "IC Engines & Gas Turbines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ICGTLab").putExtra("Sem", "ME4");
                        break;

                    case "Kinematics of Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "KoM").putExtra("Sem", "ME4");
                        break;
                    case "Kinematics of Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "KoMLab").putExtra("Sem", "ME4");
                        break;

                    case "Strength of Materials-II (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SoM-II").putExtra("Sem", "ME4");
                        break;
                    case "Strength of Materials-II Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SoMLab-II").putExtra("Sem", "ME4");
                        break;

                }
                break;

            case "MT":
                switch (subjectName){
                    case "Control Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Control").putExtra("Sem", "4");
                        break;
                    case "Control Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "CSLab").putExtra("Sem", "4");
                        break;

                    case "Kinematics & Dynamics of Machinery (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "KDM").putExtra("Sem", "MT4");
                        break;
                    case "Kinematics & Dynamics of Machinery Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "KDMLab").putExtra("Sem", "MT4");
                        break;

                    case "Hydraulics & Pneumatics (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "HnP").putExtra("Sem", "MT4");
                        break;
                    case "Hydraulics & Pneumatics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "HnPLab").putExtra("Sem", "MT4");
                        break;

                    case "Signals & Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SnS-MT").putExtra("Sem", "MT4");
                        break;
                    case "Signals & Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SnS-MT").putExtra("Sem", "MT4");
                        break;

                    case "Organizational Behaviour":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "OB").putExtra("Sem", "MT4");
                        break;

                    case "Thermal science":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "TS-TE").putExtra("Sem", "MT4");
                        break;
                }
                break;

            case "TE":
                switch (subjectName){
                    case "Theory of Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ToM").putExtra("Sem", "TE4");
                        break;
                    case "Theory of Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ToMLab").putExtra("Sem", "TE4");
                        break;

                    case "Metal Forming (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MF").putExtra("Sem", "TE4");
                        break;

                    case "Machine Element Design":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MED").putExtra("Sem", "TE4");
                        break;
                    case "Machine Element Design Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MEDLab").putExtra("Sem", "TE4");
                        break;

                    case "Machine Tools (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MT").putExtra("Sem", "TE4");
                        break;
                    case "Machine Tools Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MTLab").putExtra("Sem", "TE4");
                        break;

                    case "Metrology & Quality Assurance (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MQA").putExtra("Sem", "TE4");
                        break;
                    case "Metrology & Quality Assurance Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MQALab").putExtra("Sem", "TE4");
                        break;

                    case "Thermal Science":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "TS-TE").putExtra("Sem", "MT4");
                        break;
                }
                break;

            case "ENE":
                switch (subjectName){
                    case "Physico-Chemical Treatment Processes (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PCTP").putExtra("Sem", "ENE4");
                        break;

                    case "Air & Noise Pollution (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ANP").putExtra("Sem", "ENE4");
                        break;
                    case "Air & Noise Pollution Monitoring & Design Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "ANPLab").putExtra("Sem", "ENE4");
                        break;

                    case "Engineering Hydraulics (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EH").putExtra("Sem", "ENE4");
                        break;
                    case "Engineering Hydraulics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EHLab").putExtra("Sem", "ENE4");
                        break;

                    case "Structural Engineering":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SE-ENE").putExtra("Sem", "ENE4");
                        break;
                    case "Structural Engineering Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "SE-ENE").putExtra("Sem", "ENE4");
                        break;

                    case "Introduction to Environmental Legislations (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "IEL").putExtra("Sem", "ENE4");
                        break;

                    case "Geotechnical Engineering":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "GE").putExtra("Sem", "ENE4");
                        break;

                    case "Seminar (NUES)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Seminar").putExtra("Sem", "ENE4");
                        break;

                    case "Water Engineering Design & Drawing Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "WEDLab").putExtra("Sem", "ENE4");
                        break;
                }
                break;

            case "ICE":
                switch (subjectName){
                    case "Control Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Control").putExtra("Sem", "4");
                        break;
                    case "Control Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "CSLab").putExtra("Sem", "4");
                        break;

                    case "Power Electronics":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PE").putExtra("Sem", "ICE4");
                        break;
                    case "Power Electronics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "PELab").putExtra("Sem", "ICE4");
                        break;

                    case "Theory & Applications of Integrated Circuits (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "TAIC").putExtra("Sem", "ICE4");
                        break;
                    case "Theory & Applications of Integrated Circuits Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "TAICLab").putExtra("Sem", "ICE4");
                        break;

                    case "Electrical Machines":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EM-ICE").putExtra("Sem", "ICE4");
                        break;
                    case "Electrical Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "EMLab-ICE").putExtra("Sem", "ICE4");
                        break;

                    case "Measurements & Instrumentation (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MnI-ICE").putExtra("Sem", "ICE4");
                        break;
                    case "Measurements & Instrumentation Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "MnILab-ICE").putExtra("Sem", "ICE4");
                        break;

                    case "Communication Systems":
                        i = new Intent(this, Syllabus.class).putExtra("Sem", "Comm-ICE").putExtra("Sem", "ICE4");
                        break;
                }
                break;
        }

        try {
            i.putExtra("SubjectName", subjectName);
            if (i != null)
                startActivity(i);
        }
        catch (Exception e){e.printStackTrace();}
    }

}
