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


//4th sem
public class IT4 extends AppCompatActivity implements View.OnClickListener {

    Intent i;
    Activity a = this;
    String stream;

    Button am_iv, amLab, control, csLab, dbms, dbmsLab, toc, oops, oopsLab, coa, coaLab, lab1,
           button[] = new Button[6], pb[] = new Button[6];

    String em = "Electrical Machines",
           cs = "Control Systems",
           ae_ii = "Analog Electronics–II",
           switching = "Switching Theory & Logic Design",
           fm = "Fluid Mechanics";


    String eceTSub[] = {"Applied Mathematics–IV", "Communication Systems (M)", ae_ii,
                   "Network Analysis & Synthesis (M)", "Electromagnetic Field Theory", "Computer Organization & Architecture"},
           ecePSub[] = {"Applied Mathematics Lab", "Communication System Lab", "Network Analysis & Synthesis Lab",
                   ae_ii+" Lab", "Linux Programming & Administration Lab", ""},

           eeeTSub[] = {em+"-II (M)", ae_ii+" (M)", "Power System–I (M)",
                   "Electrical & Electronics Measuring Instruments", "Electromagnetic Field Theory", cs+" (M)"},
           eeePSub[] = {em+"-II Lab", ae_ii+" Lab", "Power System-I Lab",
                   "Electrical & Electronics Measuring Instruments Lab", cs+" Lab", ""},

           eeTSub[] = {em+"-II (M)", cs+" (M)", "Power System–I (M)",
                   "Electrical Measuring Instruments & Transducers (M)", "Electromagnetic Field Theory", "Thermodynamics"},
           eePSub[] = {em+"-II Lab", cs+ " Lab",
                   "Power System-I Lab (M)", "Electrical Measuring Instruments & Transducers Lab", "", ""},

           peTSub[] = {"Power Generation Engineering (M)", "Energy Conversion (M)", "Heat & Mass Transfer",
                   fm, switching, cs+" (M)"},
           pePSub[] = {"Heat & Mass Transfer Lab", fm+" Lab", switching+" Lab",
                   cs+" Lab", "", ""},

           mtTSub[] = {"Organizational Behaviour", "Kinematics & Dynamics of Machinery (M)", "Signals & Systems (M)",
                   cs+" (M)", "Thermal science", "Hydraulics & Pneumatics (M)"},
           mtPSub[] = {"Kinematics & Dynamics of Machinery Lab", "Signals & Systems Lab",
                   cs+" Lab", "Hydraulics & Pneumatics Lab", "", ""},

           maeTSub[] = {" Numerical Analysis & Statistical Techniques", "Fluid Systems", "Theory of Machines (M)",
                   "Manufacturing Machines (M)", "Measurements & Instrumentation", switching+" (M)"},
           maePSub[] = {"Numerical Analysis & Statistical Techniques Lab", "Fluid Systems Lab", "Theory of Machines Lab",
                   "Manufacturing Machines Lab", switching+" Lab", ""},

           meTSub[] = {" Kinematics of Machines (M)", "Strength of Materials-II (M)", "Manufacturing Machines (M)",
                   "Measurements & Instrumentation", "I.C Engines & Gas Turbine", fm+" (M)"},
           mePSub[] = {"Kinematics of Machines Lab", "Strength of Materials Lab-II",
                   "Manufacturing Machines Lab", "I.C. Engines & Gas Turbine Lab", fm+" Lab", ""},

           teTSub[] = {"Theory of Machines (M)", "Metal Forming (M)", "Machine Tools (M)",
                   "Machine Element Design", "Thermal Science", "Metrology & Quality Assurance (M)"},
           tePSub[] = {"Theory of Machine Lab", "Machine Tools Lab", "Machine Element Design Lab",
                   "Metrology & Quality Assurance Lab", "", ""},

           eneTSub[] = {"Physico-Chemical Treatment Processes (M)", "Structural Engineering", "Environmental Hydraulics (M)",
                   "Introduction to Environmental Legislations (M)", "Geotechnical Engineering", "Air & Noise Pollution (M)"},
           enePSub[] = {"Water Engineering Design & Drawing Lab", "Structure Lab", "Environmental Hydraulics Lab",
                   "Air & Noise Pollution Monitoring & Design Lab", "Seminar (NUES)", ""},

           iceTSub[] = {"Measurements & Instrumentation (M)", cs+" (M)", "Power Electronics",
                   "Theory & Applications of Integrated Circuits (M)", "Electrical Machines", "Communication Systems"},
           icePSub[] = {"Measurements & Instrumentation Lab (M)", cs+" Lab (M)", "Power Electronics Lab",
                   "Theory & Applications of Integrated Circuits Lab (M)", "Electrical Machines Lab", ""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 4th Semester Subjects");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        am_iv    = button[0] = (Button)findViewById(R.id.am_iv);
        control  = button[1] = (Button)findViewById(R.id.control);
        dbms     = button[2] = (Button)findViewById(R.id.dbms);
        oops     = button[3] = (Button)findViewById(R.id.oops);
        toc      = button[4] = (Button)findViewById(R.id.toc);
        coa      = button[5] = (Button)findViewById(R.id.coa);

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
        i = new Intent(this, Syllabus.class);
        String subjectName = ((Button)v).getText().toString();

        switch (stream){
            case "IT":
                switch (v.getId()){
                    case R.id.am_iv:  i.putExtra("Subject", "AM-IV").putExtra("Sem", "4")
                            .putExtra("Book", Urls.amBook);
                        break;
                    case R.id.amLab:  i.putExtra("Subject", "AMLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.amBook);
                        break;

                    case R.id.dbms:   i.putExtra("Subject", "DBMS").putExtra("Sem", "4")
                            .putExtra("Book", Urls.dbmsBook);
                        break;
                    case R.id.dbmsLab:i.putExtra("Subject", "DBMSLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.dbmsBook);
                        break;

                    case R.id.coa:    i.putExtra("Subject", "COA").putExtra("Sem", "4")
                            .putExtra("Book", Urls.coaBook);
                        break;
                    case R.id.coaLab: i.putExtra("Subject", "COALab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.coaBook);
                        break;

                    case R.id.oops:   i.putExtra("Subject", "OOPS").putExtra("Sem", "4")
                            .putExtra("Book", Urls.oopsBook);
                        break;
                    case R.id.oopsLab:i.putExtra("Subject", "OOPSLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.oopsBook);
                        break;

                    case R.id.toc:    i.putExtra("Subject", "TOC").putExtra("Sem", "4")
                            .putExtra("Book", Urls.tocBook);
                        break;

                    case R.id.control:i.putExtra("Subject", "Control").putExtra("Sem", "4")
                            .putExtra("Book", Urls.controlBook);
                        break;
                    case R.id.csLab:  i.putExtra("Subject", "CSLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.controlBook);
                        break;
                }
                break;
            case "CSE":
                switch (v.getId()){
                    case R.id.am_iv:  i.putExtra("Subject", "AM-IV").putExtra("Sem", "4")
                            .putExtra("Book", Urls.amBook);
                        break;
                    case R.id.amLab:  i.putExtra("Subject", "AMLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.amBook);
                        break;

                    case R.id.dbms:   i.putExtra("Subject", "DBMS").putExtra("Sem", "4")
                            .putExtra("Book", Urls.dbmsBook);
                        break;
                    case R.id.dbmsLab:i.putExtra("Subject", "DBMSLab").putExtra("Sem", "4")
                            .putExtra("Book",Urls.dbmsBook);
                        break;

                    case R.id.coa:    i.putExtra("Subject", "COA").putExtra("Sem", "4")
                            .putExtra("Book", Urls.coaBook);
                        break;
                    case R.id.coaLab: i.putExtra("Subject", "Linux").putExtra("Sem", "4")
                            .putExtra("Book", Urls.coaBook);
                        break;

                    case R.id.oops:   i.putExtra("Subject", "OOPS").putExtra("Sem", "4")
                            .putExtra("Book", Urls.oopsBook);
                        break;
                    case R.id.oopsLab:i.putExtra("Subject", "OOPSLab").putExtra("Sem", "4")
                            .putExtra("Book", Urls.oopsBook);
                        break;

                    case R.id.toc:    i.putExtra("Subject", "TOC").putExtra("Sem", "4")
                            .putExtra("Book", Urls.tocBook);
                        break;

                    case R.id.control:i.putExtra("Subject", "Comm").putExtra("Sem", "4")
                            .putExtra("Book", "");
                        break;
                    case R.id.csLab:  i.putExtra("Subject", "CommLab").putExtra("Sem", "4")
                            .putExtra("Book", "");
                        break;
                }
                break;

            case "CE":
                switch (v.getId()){
                    case R.id.am_iv:  i.putExtra("Subject", "Concrete")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;
                    case R.id.amLab:  i.putExtra("Subject", "CementLab")
                            .putExtra("Sem", "4").putExtra("Book", "");
                        break;

                    case R.id.dbms:   i.putExtra("Subject", "SA")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;
                    case R.id.dbmsLab:i.putExtra("Subject", "SALab")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;

                    case R.id.coa:    i.putExtra("Subject", "Hydraulics")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;
                    case R.id.coaLab: i.putExtra("Subject", "HydraulicsLab")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;

                    case R.id.oops:   i.putExtra("Subject", "Survey-II")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;
                    case R.id.oopsLab:i.putExtra("Subject", "SurveyLab-II")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;

                    case R.id.toc:    i.putExtra("Subject", "Water")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;

                    case R.id.control:i.putExtra("Subject", "Soil")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;

                    case R.id.csLab:  i.putExtra("Subject", "Seminar")
                            .putExtra("Sem", "CE4").putExtra("Book", "");
                        break;
                }
                break;

            case "ECE":
                switch (subjectName){
                    case "Applied Mathematics-IV":
                        i.putExtra("Subject", "AM-IV").putExtra("Sem", "4")
                        .putExtra("Book", Urls.amBook);
                        break;
                    case "Applied Mathematics-IV Lab":
                        i.putExtra("Subject", "AMLab").putExtra("Sem", "4")
                                .putExtra("Book", Urls.amBook);
                        break;

                    case "Communication Systems (M)":
                        i.putExtra("Subject", "Comm").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                    case "Communication Systems Lab":
                        i.putExtra("Subject", "CommLab").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case "Computer Organization & Architecture":
                        i.putExtra("Subject", "COA").putExtra("Sem", "4")
                                .putExtra("Book", Urls.coaBook);
                        break;
                    case "Linux Programming & Administration Lab":
                        i.putExtra("Subject", "Linux").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case "Network Analysis & Synthesis (M)":
                        i.putExtra("Subject", "NAS").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                    case "Network Analysis & Synthesis Lab":
                        i.putExtra("Subject", "NASLab").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case "Analog Electronics–II":
                        i.putExtra("Subject", "AE-II").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                    case "Analog Electronics–II Lab":
                        i.putExtra("Subject", "AELab-II").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case "Electromagnetic Field Theory":
                        i.putExtra("Subject", "EMFT").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case "EEE":
            case "EE":
                switch (subjectName){
//                    Common
                    case "Electrical Machines-II (M)":
                        i.putExtra("Subject", "EM-II").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                    case "Electrical Machines-II lab":
                        i.putExtra("Subject", "EM-II").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

                    case "Power Systems-I (M)":
                        i.putExtra("Subject", "PS-I").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                    case "Power Systems-I Lab":
                    case "Power Systems-I Lab (M)":
                        i.putExtra("Subject", "PSLab-I").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

                    case "Control Systems (M)":
                        i.putExtra("Subject", "Control").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "Control Systems Lab":
                        i.putExtra("Subject", "ControlLab").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;

                    case "Electromagnetic Field Theory":
                        i.putExtra("Subject", "EMFT").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

//                    EEE
                    case "Analog Electronics–II (M)":
                        i.putExtra("Subject", "AE-II").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                    case "Analog Electronics–II Lab":
                        i.putExtra("Subject", "AELab-II").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

                    case "Electrical & Electronics Measuring Instruments":
                        i.putExtra("Subject", "EEMI").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                    case "Electrical & Electronics Measuring Instruments Lab":
                        i.putExtra("Subject", "EEMILab").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

//                    EE
                    case "Electrical Measuring Instruments & Transducers (M)":
                        i.putExtra("Subject", "EMIT").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                    case "Electrical Measuring Instruments & Transducers Lab":
                        i.putExtra("Subject", "EMITLab").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;

                    case "Thermodynamics":
                        i.putExtra("Subject", "Thermo").putExtra("Sem", "EEE4")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case "PE":
                switch (subjectName){
                    case "Power Generation Engineering (M)":
                        i.putExtra("Subject", "PGE").putExtra("Sem", "PE4")
                                .putExtra("Book", "");
                        break;

                    case "Energy Conversion (M)":
                        i.putExtra("Subject", "EC").putExtra("Sem", "PE4")
                                .putExtra("Book", "");
                        break;

                    case "Control Systems (M)":
                        i.putExtra("Subject", "Control").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "Control Systems Lab":
                        i.putExtra("Subject", "CSLab").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;

                    case "Heat & Mass Transfer":
                        i.putExtra("Subject", "HMTE").putExtra("Sem", "PE4")
                                .putExtra("Book", "");
                        break;
                    case "Heat & Mass Transfer Lab":
                        i.putExtra("Subject", "HMTLab").putExtra("Sem", "PE4")
                                .putExtra("Book", "");
                        break;

                    case "Fluid":
                        i.putExtra("Subject", "Fluid").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Lab":
                        i.putExtra("Subject", "FluidLab").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;

                    case "Switching Theory & Logic Design":
                        i.putExtra("Subject", "STLD").putExtra("Sem", "PE4")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                        i.putExtra("Subject", "STLDLab").putExtra("Sem", "PE4")
                                .putExtra("Book", Urls.stldBook);
                        break;
                }
                break;

            case "MAE":
                switch (subjectName) {
                    case "Switching Theory & Logic Design (M)":
                        i.putExtra("Subject", "STLD").putExtra("Sem", "PE4")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                    case "Switching Theory & Logic Design Lab (M)":
                        i.putExtra("Subject", "STLDLab").putExtra("Sem", "PE4")
                                .putExtra("Book", Urls.stldBook);
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                        i.putExtra("Subject", "NASTLab").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.amBook);
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                        i.putExtra("Subject", "NASTLab").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.amBook);
                        break;

                    case "Fluid Systems":
                        i.putExtra("Subject", "FS").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;
                    case "Fluid Systems Lab":
                        i.putExtra("Subject", "FSLab").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;

                    case "Theory of Machines (M)":
                        i.putExtra("Subject", "ToM").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;
                    case "Theory of Machines Lab":
                        i.putExtra("Subject", "ToMLab").putExtra("Sem", "MAE4")
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;

                    case "Manufacturing Machines (M)":
                        i.putExtra("Subject", "MM").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;
                    case "Manufacturing Machines Lab":
                        i.putExtra("Subject", "MLab").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;

                    case "Measurements & Instrumentation":
                        i.putExtra("Subject", "MnI").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.mniBook);
                        break;
                }
                break;

            case "ME":
                switch (subjectName){
                    case "Manufacturing Machines (M)":
                        i.putExtra("Subject", "MM").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;
                    case "Manufacturing Machines Lab":
                        i.putExtra("Subject", "MLab").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;

                    case "Measurements & Instrumentation":
                        i.putExtra("Subject", "MnI").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.mniBook);
                        break;

                    case "Fluid":
                        i.putExtra("Subject", "Fluid").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Lab":
                        i.putExtra("Subject", "FluidLab").putExtra("Sem", "ME4")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;

                    case "IC Engines & Gas Turbines":
                        i.putExtra("Subject", "ICGT").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;
                    case "IC Engines & Gas Turbines Lab":
                        i.putExtra("Subject", "ICGTLab").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;

                    case "Kinematics of Machines (M)":
                        i.putExtra("Subject", "KoM").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;
                    case "Kinematics of Machines Lab":
                        i.putExtra("Subject", "KoMLab").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;

                    case "Strength of Materials-II (M)":
                        i.putExtra("Subject", "SoM-II").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;
                    case "Strength of Materials-II Lab":
                        i.putExtra("Subject", "SoMLab-II").putExtra("Sem", "ME4")
                                .putExtra("Book", "");
                        break;

                }
                break;

            case "MT":
                switch (subjectName){
                    case "Control Systems (M)":
                        i.putExtra("Subject", "Control").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "Control Systems Lab":
                        i.putExtra("Subject", "CSLab").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;

                    case "Kinematics & Dynamics of Machinery (M)":
                        i.putExtra("Subject", "KDM").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.kinematicsBook);
                        break;
                    case "Kinematics & Dynamics of Machinery Lab":
                        i.putExtra("Subject", "KDMLab").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.kinematicsBook);
                        break;

                    case "Hydraulics & Pneumatics (M)":
                        i.putExtra("Subject", "HnP").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.hydraulicsNPneumaticsBook);
                        break;
                    case "Hydraulics & Pneumatics Lab":
                        i.putExtra("Subject", "HnPLab").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.hydraulicsNPneumaticsBook);
                        break;

                    case "Signals & Systems (M)":
                        i.putExtra("Subject", "SnS-MT").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "Signals & Systems Lab":
                        i.putExtra("Subject", "SnS-MT").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.snsBook);
                        break;

                    case "Organizational Behaviour":
                        i.putExtra("Subject", "OB").putExtra("Sem", "MT4")
                                .putExtra("Book", "");
                        break;

                    case "Thermal science":
                        i.putExtra("Subject", "TS-TE").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.thermalScienceBook);
                        break;
                }
                break;

            case "TE":
                switch (subjectName){
                    case "Theory of Machines (M)":
                        i.putExtra("Subject", "ToM").putExtra("Sem", "TE4")
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;
                    case "Theory of Machines Lab":
                        i.putExtra("Subject", "ToMLab").putExtra("Sem", "TE4")
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;

                    case "Metal Forming (M)":
                        i.putExtra("Subject", "MF").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;

                    case "Machine Element Design":
                        i.putExtra("Subject", "MED").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;
                    case "Machine Element Design Lab":
                        i.putExtra("Subject", "MEDLab").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;

                    case "Machine Tools (M)":
                        i.putExtra("Subject", "MT").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;
                    case "Machine Tools Lab":
                        i.putExtra("Subject", "MTLab").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;

                    case "Metrology & Quality Assurance (M)":
                        i.putExtra("Subject", "MQA").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;
                    case "Metrology & Quality Assurance Lab":
                        i.putExtra("Subject", "MQALab").putExtra("Sem", "TE4")
                                .putExtra("Book", "");
                        break;

                    case "Thermal Science":
                        i.putExtra("Subject", "TS-TE").putExtra("Sem", "MT4")
                                .putExtra("Book", Urls.thermalScienceBook);
                        break;
                }
                break;

            case "ENE":
                switch (subjectName){
                    case "Physico-Chemical Treatment Processes (M)":
                        i.putExtra("Subject", "PCTP").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Air & Noise Pollution (M)":
                        i.putExtra("Subject", "ANP").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;
                    case "Air & Noise Pollution Monitoring & Design Lab":
                        i.putExtra("Subject", "ANPLab").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Engineering Hydraulics (M)":
                        i.putExtra("Subject", "EH").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;
                    case "Engineering Hydraulics Lab":
                        i.putExtra("Subject", "EHLab").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Structural Engineering":
                        i.putExtra("Subject", "SE-ENE").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;
                    case "Structural Engineering Lab":
                        i.putExtra("Subject", "SE-ENE").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Introduction to Environmental Legislations (M)":
                        i.putExtra("Subject", "IEL").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Geotechnical Engineering":
                        i.putExtra("Subject", "GE").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;

                    case "Seminar (NUES)":
                        i.putExtra("Subject", "Seminar").putExtra("Sem", "ENE4")
                                .putExtra("Book", "NA");
                        break;

                    case "Water Engineering Design & Drawing Lab":
                        i.putExtra("Subject", "WEDLab").putExtra("Sem", "ENE4")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case "ICE":
                switch (subjectName){
                    case "Control Systems (M)":
                        i.putExtra("Subject", "Control").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;
                    case "Control Systems Lab":
                        i.putExtra("Subject", "CSLab").putExtra("Sem", "4")
                                .putExtra("Book", Urls.controlBook);
                        break;

                    case "Power Electronics":
                        i.putExtra("Subject", "PE").putExtra("Sem", "ICE4")
                                .putExtra("Book", "");
                        break;
                    case "Power Electronics Lab":
                        i.putExtra("Subject", "PELab").putExtra("Sem", "ICE4")
                                .putExtra("Book", "");
                        break;

                    case "Theory & Applications of Integrated Circuits (M)":
                        i.putExtra("Subject", "TAIC").putExtra("Sem", "ICE4")
                                .putExtra("Book", "");
                        break;
                    case "Theory & Applications of Integrated Circuits Lab":
                        i.putExtra("Subject", "TAICLab").putExtra("Sem", "ICE4")
                                .putExtra("Book", "");
                        break;

                    case "Electrical Machines":
                        i.putExtra("Subject", "EM-ICE").putExtra("Sem", "ICE4")
                                .putExtra("Book", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines Lab":
                        i.putExtra("Subject", "EMLab-ICE").putExtra("Sem", "ICE4")
                                .putExtra("Book", Urls.electricalMachineBook);
                        break;

                    case "Measurements & Instrumentation (M)":
                        i.putExtra("Subject", "MnI-ICE").putExtra("Sem", "ICE4")
                                .putExtra("Book", Urls.mniBook);
                        break;
                    case "Measurements & Instrumentation Lab":
                        i.putExtra("Subject", "MnILab-ICE").putExtra("Sem", "ICE4")
                                .putExtra("Book", Urls.mniBook);
                        break;

                    case "Communication Systems":
                        i.putExtra("Subject", "Comm-ICE").putExtra("Sem", "ICE4")
                                .putExtra("Book", "");
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
