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
    Intent i = new Intent();

    SubAndCode sac;

    Button am_iii, cgmm, cgmmLab, cns, cnsLab, ds, dsLab, fcs, stld, stldLab,
           buttons[] = new Button[6], pb[] = new Button[6];


    String stream;


    String itTSub[] = {"Applied Mathematics–III", "Circuits & Systems", "Computer Graphics & Multimedia",
                   "Data Structures (M)", "Foundation of Computer Science (M)", "Switching Theory & Logic Design" },
           itPSub[] = {"Circuits & Systems Lab", "Computer Graphics & Multimedia Lab",
                   "Data Structures Lab", "Switching Theory & Logic Design Lab" },
           itTCode[] = {"AM-III", "CnS", "CGMM", "DS", "FCS", "STLD"},
           itPCode[] = {"CnSLab", "CGMMLab", "DSLab", "STLDLab"};


    String eceTSub[] = {"Applied Mathematics–III", "Analog Electronics-I (M)", "Electronic Instruments & Measurements (M)",
                   "Data Structures", "Signals & Systems", "Switching Theory & Logic Design (M)"},
           ecePSub[] = {"Analog Electronics-I Lab", "Data Structures Lab", "Signals & Systems Lab",
                   "Electronic Instruments & Measurements Lab", itPSub[3]},
           eceTCode[] = {"Applied Mathematics–III", "AE-I", "EIM", "DS", "SnS", "STLD"},
           ecePCode[] = {"AELab-I", "DSLab", "EIMLab", "SnSLab", "STLDLab"};


    String iceTSub[] = {"Applied Mathematics–III", "Circuits & Systems", "Sensors & Transducers (M)",
                   "Data Structures", "Basics of Measurements (M)", "Switching Theory & Logic Design (M)"},
           icePSub[] = {"Circuits & Systems Lab", "Sensors & Transducers Lab (M)",
                   "Data Structures Lab", "Switching Theory & Logic Design Lab"},
           iceTCode[] = {itTCode[0], "CnS", "SnT", "DS", "BoM", "STLD"},
           icePCode[] = {"CnSLab", "SnTLab", "DSLab", "STLDLab"};


    String maeTSub[] = {"Fluid Mechanics (M)", "Thermal Science (M)", "Strength of Materials (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", "Electrical Machines"},
           maePSub[] = {"Fluid Mechanics Lab", "Strength of Materials Lab",
                   "Machine Drawing Lab", "Electrical Machines Lab"},
           maeTCode[] = {"Fluid", "TS", "SoM", "PT", "MSM", "EM"},
           maePCode[] = {"FluidLab", "SoMLab", "MDLab", "EMLab"};


    String meTSub[] = {"Numerical Analysis & Statistical Techniques (M)", "Electrical Machines", "Thermal Science (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", "Strength of Materials-I (M)"},
           mePSub[] = {" Numerical Analysis & Statistical Techniques Lab", "Electrical Machines Lab",
                   "Production Technology Lab", "Strength of Materials-I Lab", "Machine Drawing Lab"},
           meTCode[] = {"NAST", "EM", "TS", "PT", "MSM", "SoM-I"},
           mePCode[] = {"NASTLab", "EMLab", "PTLab", "SoMLab-I", "MDLab"};


    String mtTSub[] = {"Switching Theory & Logic Design (M)", "Numerical Analysis & Statistical Techniques (M)", "Measurements & Instrumentation",
                   "Material Science & Metallurgy (M)", "Fluid Mechanics", "Mechanics of Solids"},
           mtPSub[] = {"Switching Theory & Logic Design Lab", "Numerical analysis & Statistical Techniques Lab",
                   "Measurements & Instrumentation Lab", "Mechanics of Solids & Fluid Lab"},
           mtTCode[] = {""},
           mtPCode[] = {""};


    String peTSub[] = {"Material Science & Metallurgy", "Circuits & Systems (M)", "Thermodynamics for Power Engineers (M)",
                   "Strength of Materials & Theory of Machines", "Analog Electronics", "Electrical Machines (M)"},
           pePSub[] = {"Thermodynamics for Power Engineers Lab", "Strength of Materials & Theory of Machines Lab",
                   "Analog Electronics Lab", "Electrical Machines Lab"},
           peTCode[] = {"MSM", "CnS", "TPE", "SMTM", "AE", "EM"},
           pePCode[] = {"TPELab", "SMTMLab", "AELab", "EMLab"};


    String teTSub[] = {"Electrical Machines", "Numerical Analysis & Statistical Techniques (M)", "Production Technology (M)",
                   "Material Science & Metallurgy", "Fluid Mechanics", "Mechanics of Solids"},
           tePSub[] = {"Electrical Machines Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Mechanics of Solids & Fluids Lab", "Machine Drawing Lab"},
           teTCode[] = {"EM", "NAST", "PT", "MSM", "Fluid", "MoS"},
           tePCode[] = {"EMLab", "NASTLab", "MSFLab", "MDLab"};


    String eneTSub[] = {"Building Materials & Construction", "Fluid Mechanics (M)", "Environmental Chemistry & Microbiology (M)",
                   "Numerical Analysis & Statistical Techniques (M)", "Strength of Material", "Surveying"},
           enePSub[] = {"Fluid Mechanics Lab", "Water & Wastewater Analysis Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Surveying Lab", "Civil Engineering Drawing using CAD Lab"},
           eneTCode[] = {"BMC", "Fluid", "ECM", "NAST", "SoM", "Surveying"},
           enePCode[] = {"FluidLab", "WWALab", "NASTLab", "SurveyingLab", "CAD"},


           eeTSub[] = {"Applied Mathematics–III", "Analog Electronics", "Materials in Electrical Systems (M)",
                   "Data Structures", "Circuits & Systems (M)", "Electrical Machines-I (M)"},
           eePSub[] = {"Analog Electronics Lab", "Data Structures Lab", "Circuits & Systems Lab",
                   "Electrical Machines-I Lab", "Scientific Computing Lab"},
           eeTCode[] = {itTCode[0], "AE", "MES", "DS", "CnS", "EM-I"},
           eePCode[] = {"AELab", "DSLab", "CnSLab", "EMLab-I", "SCLab"},


           eeeTSub[] = {"Applied Mathematics–III", "Analog Electronics-I", "Materials in Electrical Systems (M)",
                   "Data Structures", "Circuits & Systems (M)", "Electrical Machines-I (M)"},
           eeePSub[] = {"Analog Electronics-I Lab", "Data Structures Lab", "Circuits & Systems Lab",
                   "Electrical Machines-I Lab"},
           eeeTCode[] = {itTCode[0], "AE-I", "MES", "DS", "CnS", "EM-I"},
           eeePCode[] = {"AE-I", "DSLab", "CnSLab", "EMLab-I"},


           ceTSub[] = {"Building Materials & Construction", "Fluid Mechanics (M)", "Engineering Geology",
                   "Numerical Analysis & Statistical Techniques", "Strength of Material (M)", "Surveying (M)"},
           cePSub[] = {"Fluid Mechanics Lab", "Geology & Building Material Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Surveying Lab", "Civil Engineering Drawing using CAD Lab"},
           ceTCode[] = {"BMC", "Fluid", "Geology", "NAST", "Strength", "Surveying"},
           cePCode[] = {"FluidLab", "GeoLab", "NASTLab", "SurveyingLab", "CAD"};



    public SubAndCode setSubAndCode(String stream){
        SubAndCode subAndCode = null;
        switch(stream){
            case "IT":
            case "CSE": subAndCode = new SubAndCode(itTSub, itTCode, itPSub, itPCode);
                break;
            case "ME":  subAndCode = new SubAndCode(meTSub, meTCode, mePSub, mePCode);
                break;
            case "CE":  subAndCode = new SubAndCode(ceTSub, ceTCode, cePSub, cePCode);
                break;
            case "ECE": subAndCode = new SubAndCode(eceTSub, eceTCode, ecePSub, ecePCode);
                break;
            case "EEE": subAndCode = new SubAndCode(eeeTSub, eeeTCode, eeePSub, eeePCode);
                break;
            case "EE":  subAndCode = new SubAndCode(eeTSub, eeTCode, eePSub, eePCode);
                break;
            case "MAE": subAndCode = new SubAndCode(maeTSub, maeTCode, maePSub, maePCode);
                break;
            case "ICE": subAndCode = new SubAndCode(iceTSub, iceTCode, icePSub, icePCode);
                break;
            case "ENE": subAndCode = new SubAndCode(eneTSub, eneTCode, enePSub, enePCode);
                break;
            case "MT":  subAndCode = new SubAndCode(mtTSub, mtTCode, mtPSub, mtPCode);
                break;
            case "PE":  subAndCode = new SubAndCode(peTSub, peTCode, pePSub, pePCode);
                break;
            case "TE":  subAndCode = new SubAndCode(teTSub, teTCode, tePSub, tePCode);
                break;
        }
        return subAndCode;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 3rd Semester Subjects");


        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        am_iii = buttons[0] = (Button)findViewById(R.id.am_iii);
        cgmm   = buttons[1] = (Button)findViewById(R.id.cgmm);
        cns    = buttons[2] = (Button)findViewById(R.id.cns);
        ds     = buttons[3] = (Button)findViewById(R.id.ds);
        fcs    = buttons[4] = (Button)findViewById(R.id.fcs);
        stld   = buttons[5] = (Button)findViewById(R.id.stld);

        cgmmLab = pb[0] = (Button)findViewById(R.id.cgmmLab);
        cnsLab  = pb[1] = (Button)findViewById(R.id.cnsLab);
        dsLab   = pb[2] = (Button)findViewById(R.id.dsLab);
        stldLab = pb[3] = (Button)findViewById(R.id.stldLab);

        pb[4] = (Button)findViewById(R.id.lab1);
        pb[5] = (Button)findViewById(R.id.lab2);

        pb[4].setVisibility(View.INVISIBLE);
        pb[5].setVisibility(View.INVISIBLE);


        sac = setSubAndCode(stream);

        for(int i = 0; i < 6; i++ ) {
            buttons[i].setText(sac.tsub[i]);
            buttons[i].setOnClickListener(this);
            pb[i].setOnClickListener(this);
        }

        for (int i = 0; i < sac.psub.length; i++){
            if(sac.psub.length == 5)
                pb[4].setVisibility(View.VISIBLE);
            else if(sac.psub.length == 6) {
                pb[4].setVisibility(View.VISIBLE);
                pb[5].setVisibility(View.VISIBLE);
            }
            pb[i].setText(sac.psub[i]);
        }

    }


    @Override
    public void onClick(View v) {

//        switch (v.getId()) {
//            case R.id.am_iii:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                    case "EEE":
//                    case "ICE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ENE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "BMC").putExtra("Sem", "CE3");
//                        break;
//                }
////                if(am_iii.getText().equals(itTSub[0]))  // AM-III
////                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III").putExtra("Sem", "3");
////                else i = new Intent(this, Syllabus.class).putExtra("Subject", sac.tcode[0]).putExtra("Sem", stream + "3");
//                    break;
//
//            case R.id.cgmm:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMM").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ENE":
//                    case "MAE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Fluid").putExtra("Sem", "CE3");
//                        break;
//                    case "ECE":
//                    case "EEE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE-I").putExtra("Sem", "3");
//                        break;
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.cns:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "EEE":
//                    case "ICE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnS").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Geology").putExtra("Sem", "CE3");
//                        break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIM").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.ds:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                    case "EEE":
//                    case "ICE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DS").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ME":
//                    case "MAE":
//                    case "TE":
//                    case "ENE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAST").putExtra("Sem", "CE3");
//                        break;
//                }
//                break;
//
//            case R.id.fcs:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FCS").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ENE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Strength").putExtra("Sem", "CE3");                        break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnS").putExtra("Sem", "3");
//                        break;
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MES").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.stld:
//                switch (stream){
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                    case "ICE":
//                         i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD").putExtra("Sem", "3").putExtra("SubjectName", "Switching Theory & Logic Design");
//                         break;
//                    case "CE":
//                    case "ENE":
//                         i = new Intent(this, Syllabus.class).putExtra("Subject", "Surveying").putExtra("Sem", "CE3");
//                         break;
//                    case "EE":
//                    case "EEE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EM-I").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.cgmmLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMMLab").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ENE":
//                    case "MAE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FluidLab").putExtra("Sem", "CE3");
//                        break;
//                    case "ECE":
//                    case "EEE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab-I").putExtra("Sem", "3");
//                        break;
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.cnsLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "EEE":
//                    case "ICE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnSLab").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "GeoLab").putExtra("Sem", "CE3");
//                        break;
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIMLab").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.dsLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                    case "EEE":
//                    case "ICE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DSLab").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ME":
//                    case "MAE":
//                    case "TE":
//                    case "ENE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NASTLab").putExtra("Sem", "CE3");
//                        break;
//                }
//                break;
//
//            case R.id.stldLab:
//                switch (stream) {
//                    case "IT":
//                    case "CSE":
//                    case "ECE":
//                    case "ICE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                    case "ENE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyingLab").putExtra("Sem", "CE3");
//                        break;
//                    case "EEE":
//                    case "EE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab-I").putExtra("Sem", "3");
//                        break;
//                }
//                break;
//
//            case R.id.lab1:
//                switch (stream){
//                    case "ECE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnSLab").putExtra("Sem", "3");
//                        break;
//                    case "CE":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CAD").putExtra("Sem", "CE3");
//                        break;
//                }
//                break;
//        }


//        if(v == buttons[0]){
//            if(buttons[0].getText().equals(itTSub[0]))
//                i = new Intent().putExtra("Subject", itTCode[0]).putExtra("Sem","3");
//            else if(buttons[0].getText().equals(ceTSub[0]))
//                i = new Intent().putExtra("Subject", ceTCode[0]).putExtra("Sem","CE3");
//        }
//
//        if(sac.tsub == itTSub && sac.psub == itPSub){
//            for(int j = 1; j < 6; j++)
//                if(v == buttons[j])
//                    i = new Intent().putExtra("Subject", itTCode[j]).putExtra("Sem","3");
//            for(int j = 0; j < sac.psub.length; j++)
//                if(v == pb[j])
//                    i = new Intent().putExtra("Subject", itPCode[j]).putExtra("Sem","3");
//        }
//
//        else {//
//            for (int j = 1; j < 6; j++)
//                if (v == buttons[j])
//                    i = new Intent().putExtra("Subject", itTCode[j]).putExtra("Sem", stream + "3");
//            for (int j = 0; j < sac.psub.length; j++)
//                if (v == pb[j])
//                    i = new Intent().putExtra("Subject", itPCode[j]).putExtra("Sem", stream + "3");
//        }


        if(v.getId() == R.id.am_iii){
            switch (stream) {
                case "IT":
                case "CSE":
                case "EE":
                case "ECE":
                case "EEE":
                case "PE":
                case "ICE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III").putExtra("Sem", "3");
                    break;
            }
        }

        String subjectName = ((Button)v).getText().toString();

        switch (stream) {
            case "IT":
            case "CSE":
            case "EE":
            case "ECE":
            case "EEE":
            case "PE":
            case "ICE":
                switch (subjectName) {
//                    IT, CSE, ECE, EEE, EE, ICE
//                    case "Applied Mathematics-III":
//                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-III").putExtra("Sem", "3");
//                        break;

                    case "Data Structures":
                    case "Data Structures (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DS").putExtra("Sem", "3");
                        break;
                    case "Data Structures Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "DSLab").putExtra("Sem", "3");
                        break;

                    case "Circuits & Systems":
                    case "Circuits & Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnS").putExtra("Sem", "3");
                        break;
                    case "Circuits & Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CnSLab").putExtra("Sem", "3");
                        break;

                    case "Computer Graphics & Multimedia":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMM").putExtra("Sem", "3");
                        break;
                    case "Computer Graphics & Multimedia Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CGMMLab").putExtra("Sem", "3");
                        break;

                    case "Foundation of Computer Science (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FCS").putExtra("Sem", "3");
                        break;

                    case "Switching Theory & Logic Design":
                    case "Switching Theory & Logic Design (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD").putExtra("Sem", "3");
                        break;
                    case "Switching Theory & Logic Design Lab":
                    case "Switching Theory & Logic Design Lab (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab").putExtra("Sem", "3");
                        break;

//                    ECE, EEE, EE
                    case "Analog Electronics-I":
                    case "Analog Electronics-I (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE-I").putExtra("Sem", "3");
                        break;
                    case "Analog Electronics":
                    case "Analog Electronics (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AE").putExtra("Sem", "3");
                        break;
                    case "Analog Electronics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab").putExtra("Sem", "3");
                        break;
                    case "Analog Electronics-I Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AELab-I").putExtra("Sem", "3");
                        break;

                    case "Materials in Electrical Systems":
                    case "Materials in Electrical Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MES").putExtra("Sem", "3");
                        break;

                    case "Electrical Machines-I":
                    case "Electrical Machines-I (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EM-I").putExtra("Sem", "3");
                        break;
                    case "Electrical Machines-I Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab-I").putExtra("Sem", "3");
                        break;

                    case "Scientific Computing Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SCLab").putExtra("Sem", "3");
                        break;

                    case "Electronic Instruments & Measurements":
                    case "Electronic Instruments & Measurements (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIM").putExtra("Sem", "3");
                        break;
                    case "Electronic Instruments & Measurements Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EIMLab").putExtra("Sem", "3");
                        break;

                    case "Signals & Systems":
                    case "Signals & Systems (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnS").putExtra("Sem", "3");
                        break;
                    case "Signals & Systems Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnSLab").putExtra("Sem", "3");
                        break;

//                    ICE
                    case "Sensors & Transducers (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnT").putExtra("Sem", "3");
                        break;
                    case "Sensors & Transducers Lab (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SnTLab").putExtra("Sem", "3");
                        break;

                    case "Basics of Measurements (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "BoM").putExtra("Sem", "3");
                        break;

//                     PE
                    case "Thermodynamics for Power Engineers (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "TPE").putExtra("Sem", "3");
                        break;
                    case "Thermodynamics for Power Engineers Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "TPELab").putExtra("Sem", "3");
                        break;

                    case "Strength of Materials & Theory of Machines":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SMTM").putExtra("Sem", "3");
                        break;
                    case "Strength of Materials & Theory of Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SMTMLab").putExtra("Sem", "3");
                        break;

                    case "Material Science & Metallurgy":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MSM").putExtra("Sem", "3");
                        break;

                    case "Electrical Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EM").putExtra("Sem", "3");
                        break;
                    case "Electrical Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab").putExtra("Sem", "3");
                        break;
                }
                break;

            case "CE":
            case "ENE":
                switch ((String) ((Button) v).getText()) {
                    case "Building Materials & Construction":
                    case "Building Materials & Construction (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "BMC").putExtra("Sem", "CE3");
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Fluid").putExtra("Sem", "CE3");
                        break;
                    case "Fluid Mechanics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FluidLab").putExtra("Sem", "CE3");
                        break;

                    case "Engineering Geology":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Geology").putExtra("Sem", "CE3");
                        break;
                    case "Geology & Building Material Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "GeoLab").putExtra("Sem", "CE3");
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case  "Numerical Analysis & Statistical Techniques(M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAST").putExtra("Sem", "CE3");
                        break;
                    case  "Numerical Analysis & Statistical Techniques Lab":
                    case  "Numerical Analysis & Statistical Techniques Lab (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NASTLab").putExtra("Sem", "CE3");
                        break;

                    case "Surveying":
                    case "Surveying (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Surveying").putExtra("Sem", "CE3");
                        break;
                    case "Surveying Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SurveyingLab").putExtra("Sem", "CE3");
                        break;

                    case "Civil Engineering Drawing using CAD Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "CAD").putExtra("Sem", "CE3");
                        break;

                    case "Strength of Material":
                    case "Strength of Material (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Strength").putExtra("Sem", "CE3");
                        break;

//                    ENE
                    case "Environmental Chemistry & Microbiology (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "ECM").putExtra("Sem", "CE3");
                        break;
                    case "Water & Wastewater Analysis Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "WWALab").putExtra("Sem", "CE3");
                        break;
                }

            case "ME":
            case "MAE":
            case "TE":
            case "MT":
                switch ((String)((Button)v).getText()){

                    case "Electrical Machines":
                    case "Electrical Machines (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EM").putExtra("Sem", "ME3");
                        break;
                    case "Electrical Machines Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab").putExtra("Sem", "ME3");
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case "Numerical Analysis & Statistical Techniques (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NAST").putExtra("Sem", "ME3");
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "NASTLab").putExtra("Sem", "ME3");
                        break;

//                    ME
                    case "Strength of Materials-I (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SoM-I").putExtra("Sem", "ME3");
                        break;
                    case "Strength of Materials-I Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SoMLab-I").putExtra("Sem", "ME3");
                        break;

//                    MAE
                    case "Strength of Materials (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SoM-MAE").putExtra("Sem", "ME3");
                        break;
                    case "Strength of Materials Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "SoMLab-I").putExtra("Sem", "ME3");
                        break;

                    case "Production Technology (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "PT").putExtra("Sem", "ME3");
                        break;
                    case "Production Technology Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "PTLab").putExtra("Sem", "ME3");
                        break;

                    case "Thermal Science (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "TS").putExtra("Sem", "ME3");
                        break;

                    case "Machine Drawing Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MDLab").putExtra("Sem", "ME3");
                        break;

//                    MAE
                    case "Material Science & Metallurgy":
                    case "Material Science & Metallurgy (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MSM").putExtra("Sem", "ME3");
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FM").putExtra("Sem", "ME3");
                        break;
                    case "Fluid Mechanics Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FMLab").putExtra("Sem", "ME3");
                        break;

//                     TE
                    case "Mechanics of Solids":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MoS").putExtra("Sem", "ME3");
                        break;
                    case "Mechanics of Solids & Fluids Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MSFLab").putExtra("Sem", "ME3");
                        break;

//                    MT
                    case "Measurements & Instrumentation":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MnI").putExtra("Sem", "ME3");
                        break;
                    case "Measurements & Instrumentation Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MnILab").putExtra("Sem", "ME3");
                        break;

                    case "Switching Theory & Logic Design (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLD").putExtra("Sem", "3");
                        break;
                    case "Switching Theory & Logic Design Lab":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "STLDLab").putExtra("Sem", "3");
                        break;
                }
                break;
        }

        try{
            i.putExtra("SubjectName", ((Button)v).getText().toString());
            if(i != null)
               startActivity(i);
        }
        catch (Exception e){e.printStackTrace();}
    }
}
