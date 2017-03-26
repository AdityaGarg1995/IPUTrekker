package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

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


           eceTSub[] = {"Applied Mathematics–III", "Analog Electronics-I (M)", "Electronic Instruments & Measurements (M)",
                   "Data Structures", "Signals & Systems", "Switching Theory & Logic Design (M)"},
           ecePSub[] = {"Analog Electronics-I Lab", "Data Structures Lab", "Signals & Systems Lab",
                   "Electronic Instruments & Measurements Lab", itPSub[3]},


           iceTSub[] = {"Applied Mathematics–III", "Circuits & Systems", "Sensors & Transducers (M)",
                   "Data Structures", "Basics of Measurements (M)", "Switching Theory & Logic Design (M)"},
           icePSub[] = {"Circuits & Systems Lab", "Sensors & Transducers Lab (M)",
                   "Data Structures Lab", "Switching Theory & Logic Design Lab"},


           maeTSub[] = {"Fluid Mechanics (M)", "Thermal Science (M)", "Strength of Materials (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", "Electrical Machines"},
           maePSub[] = {"Fluid Mechanics Lab", "Strength of Materials Lab",
                   "Machine Drawing Lab", "Electrical Machines Lab"},


           meTSub[] = {"Numerical Analysis & Statistical Techniques (M)", "Electrical Machines", "Thermal Science (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", "Strength of Materials-I (M)"},
           mePSub[] = {" Numerical Analysis & Statistical Techniques Lab", "Electrical Machines Lab",
                   "Production Technology Lab", "Strength of Materials-I Lab", "Machine Drawing Lab"},

           mtTSub[] = {"Switching Theory & Logic Design (M)", "Numerical Analysis & Statistical Techniques (M)", "Measurements & Instrumentation",
                   "Material Science & Metallurgy (M)", "Fluid Mechanics", "Mechanics of Solids"},
           mtPSub[] = {"Switching Theory & Logic Design Lab", "Numerical analysis & Statistical Techniques Lab",
                   "Measurements & Instrumentation Lab", "Mechanics of Solids & Fluid Lab"},


           peTSub[] = {"Material Science & Metallurgy", "Circuits & Systems (M)", "Thermodynamics for Power Engineers (M)",
                   "Strength of Materials & Theory of Machines", "Analog Electronics", "Electrical Machines (M)"},
           pePSub[] = {"Thermodynamics for Power Engineers Lab", "Strength of Materials & Theory of Machines Lab",
                   "Analog Electronics Lab", "Electrical Machines Lab"},


           teTSub[] = {"Electrical Machines", "Numerical Analysis & Statistical Techniques (M)", "Production Technology (M)",
                   "Material Science & Metallurgy", "Fluid Mechanics", "Mechanics of Solids"},
           tePSub[] = {"Electrical Machines Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Mechanics of Solids & Fluids Lab", "Machine Drawing Lab"},


           eneTSub[] = {"Building Materials & Construction", "Fluid Mechanics (M)", "Environmental Chemistry & Microbiology (M)",
                   "Numerical Analysis & Statistical Techniques (M)", "Strength of Material", "Surveying"},
           enePSub[] = {"Fluid Mechanics Lab", "Water & Wastewater Analysis Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Surveying Lab", "Civil Engineering Drawing using CAD Lab"},


           eeTSub[] = {"Applied Mathematics–III", "Analog Electronics", "Materials in Electrical Systems (M)",
                   "Data Structures", "Circuits & Systems (M)", "Electrical Machines-I (M)"},
           eePSub[] = {"Analog Electronics Lab", "Data Structures Lab", "Circuits & Systems Lab",
                   "Electrical Machines-I Lab", "Scientific Computing Lab"},


           eeeTSub[] = {"Applied Mathematics–III", "Analog Electronics-I", "Materials in Electrical Systems (M)",
                   "Data Structures", "Circuits & Systems (M)", "Electrical Machines-I (M)"},
           eeePSub[] = {"Analog Electronics-I Lab", "Data Structures Lab", "Circuits & Systems Lab",
                   "Electrical Machines-I Lab"},


           ceTSub[] = {"Building Materials & Construction", "Fluid Mechanics (M)", "Engineering Geology",
                   "Numerical Analysis & Statistical Techniques", "Strength of Material (M)", "Surveying (M)"},
           cePSub[] = {"Fluid Mechanics Lab", "Geology & Building Material Lab", "Numerical Analysis & Statistical Techniques Lab",
                   "Surveying Lab", "Civil Engineering Drawing using CAD Lab"};



    public SubAndCode setSubAndCode(String stream){
        SubAndCode subAndCode = null;
        switch(stream){
            case "IT":
            case "CSE": subAndCode = new SubAndCode(itTSub, itPSub);
                break;
            case "ME":  subAndCode = new SubAndCode(meTSub, mePSub);
                break;
            case "CE":  subAndCode = new SubAndCode(ceTSub, cePSub);
                break;
            case "ECE": subAndCode = new SubAndCode(eceTSub, ecePSub);
                break;
            case "EEE": subAndCode = new SubAndCode(eeeTSub, eeePSub);
                break;
            case "EE":  subAndCode = new SubAndCode(eeTSub, eePSub);
                break;
            case "MAE": subAndCode = new SubAndCode(maeTSub, maePSub);
                break;
            case "ICE": subAndCode = new SubAndCode(iceTSub, icePSub);
                break;
            case "ENE": subAndCode = new SubAndCode(eneTSub, enePSub);
                break;
            case "MT":  subAndCode = new SubAndCode(mtTSub, mtPSub);
                break;
            case "PE":  subAndCode = new SubAndCode(peTSub, pePSub);
                break;
            case "TE":  subAndCode = new SubAndCode(teTSub, tePSub);
                break;
        }
        return subAndCode;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

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
        pb[4].setVisibility(View.INVISIBLE);

        sac = setSubAndCode(stream);

        for(int i = 0; i < 6; i++ ) {
            buttons[i].setText(sac.tsub[i]);
            buttons[i].setOnClickListener(this);
        }
        for(int i = 0; i < 5; i++ ) {
            pb[i].setOnClickListener(this);
        }

        for (int i = 0; i < sac.psub.length; i++){
            if(sac.psub.length == 5)
                pb[4].setVisibility(View.VISIBLE);
            pb[i].setText(sac.psub[i]);
        }
    }


    @Override
    public void onClick(View v) {
        i  = new Intent(this, Syllabus.class);
        if(v.getId() == R.id.am_iii){
            switch (stream) {
                case "IT":
                case "CSE":
                case "EE":
                case "ECE":
                case "EEE":
                case "PE":
                case "ICE":
                    i.putExtra("Subject", "AM-III").putExtra("Sem", "3") .putExtra("Book", Urls.amBook);
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
                    case "Data Structures":
                    case "Data Structures (M)":
                        i.putExtra("Subject", "DS").putExtra("Sem", "3").putExtra("Book", Urls.dsBook);
                        break;
                    case "Data Structures Lab":
                        i.putExtra("Subject", "DSLab").putExtra("Sem", "3").putExtra("Book", Urls.dsBook);
                        break;

                    case "Circuits & Systems":
                    case "Circuits & Systems (M)":
                        i.putExtra("Subject", "CnS").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Circuits & Systems Lab":
                        i.putExtra("Subject", "CnSLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Computer Graphics & Multimedia":
                        i.putExtra("Subject", "CGMM").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Computer Graphics & Multimedia Lab":
                        i.putExtra("Subject", "CGMMLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Foundation of Computer Science (M)":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "FCS").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Switching Theory & Logic Design":
                    case "Switching Theory & Logic Design (M)":
                        i.putExtra("Subject", "STLD").putExtra("Sem", "3").putExtra("Book", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                    case "Switching Theory & Logic Design Lab (M)":
                        i.putExtra("Subject", "STLDLab").putExtra("Sem", "3").putExtra("Book", Urls.stldBook);
                        break;

//                    ECE, EEE, EE
                    case "Analog Electronics-I":
                    case "Analog Electronics-I (M)":
                        i.putExtra("Subject", "AE-I").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Analog Electronics":
                    case "Analog Electronics (M)":
                        i.putExtra("Subject", "AE").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Analog Electronics Lab":
                        i.putExtra("Subject", "AELab").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Analog Electronics-I Lab":
                        i.putExtra("Subject", "AELab-I").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Materials in Electrical Systems":
                    case "Materials in Electrical Systems (M)":
                        i.putExtra("Subject", "MES").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Electrical Machines-I":
                    case "Electrical Machines-I (M)":
                        i.putExtra("Subject", "EM-I").putExtra("Sem", "3").putExtra("Book", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines-I Lab":
                        i.putExtra("Subject", "EMLab-I").putExtra("Sem", "3").putExtra("Book", Urls.electricalMachineBook);
                        break;

                    case "Scientific Computing Lab":
                        i.putExtra("Subject", "SCLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Electronic Instruments & Measurements":
                    case "Electronic Instruments & Measurements (M)":
                        i.putExtra("Subject", "EIM").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Electronic Instruments & Measurements Lab":
                        i.putExtra("Subject", "EIMLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Signals & Systems":
                    case "Signals & Systems (M)":
                        i.putExtra("Subject", "SnS").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Signals & Systems Lab":
                        i.putExtra("Subject", "SnSLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

//                    ICE
                    case "Sensors & Transducers (M)":
                        i.putExtra("Subject", "SnT").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Sensors & Transducers Lab (M)":
                        i.putExtra("Subject", "SnTLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Basics of Measurements (M)":
                        i.putExtra("Subject", "BoM").putExtra("Sem", "3").putExtra("Book", "");
                        break;

//                     PE
                    case "Thermodynamics for Power Engineers (M)":
                        i.putExtra("Subject", "TPE").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Thermodynamics for Power Engineers Lab":
                        i.putExtra("Subject", "TPELab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Strength of Materials & Theory of Machines":
                        i.putExtra("Subject", "SMTM").putExtra("Sem", "3").putExtra("Book", "");
                        break;
                    case "Strength of Materials & Theory of Machines Lab":
                        i.putExtra("Subject", "SMTMLab").putExtra("Sem", "3").putExtra("Book", "");
                        break;

                    case "Material Science & Metallurgy":
                        i.putExtra("Subject", "MSM").putExtra("Sem", "3").putExtra("Book", Urls.msmBook);
                        break;

                    case "Electrical Machines (M)":
                        i.putExtra("Subject", "EM").putExtra("Sem", "3").putExtra("Book", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines Lab":
                        i.putExtra("Subject", "EMLab").putExtra("Sem", "3").putExtra("Book", Urls.electricalMachineBook);
                        break;
                }
                break;

            case "CE":
            case "ENE":
                switch ((String) ((Button) v).getText()) {
                    case "Building Materials & Construction":
                    case "Building Materials & Construction (M)":
                        i.putExtra("Subject", "BMC").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        i.putExtra("Subject", "Fluid").putExtra("Sem", "CE3")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Mechanics Lab":
                        i.putExtra("Subject", "FluidLab").putExtra("Sem", "CE3")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;

                    case "Engineering Geology":
                        i.putExtra("Subject", "Geology").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                    case "Geology & Building Material Lab":
                        i.putExtra("Subject", "GeoLab").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case  "Numerical Analysis & Statistical Techniques(M)":
                        i.putExtra("Subject", "NAST").putExtra("Sem", "CE3").putExtra("Book", Urls.amBook);
                        break;
                    case  "Numerical Analysis & Statistical Techniques Lab":
                    case  "Numerical Analysis & Statistical Techniques Lab (M)":
                        i.putExtra("Subject", "NASTLab").putExtra("Sem", "CE3").putExtra("Book", Urls.amBook);
                        break;

                    case "Surveying":
                    case "Surveying (M)":
                        i.putExtra("Subject", "Surveying").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                    case "Surveying Lab":
                        i.putExtra("Subject", "SurveyingLab").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;

                    case "Civil Engineering Drawing using CAD Lab":
                        i.putExtra("Subject", "CAD").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;

                    case "Strength of Material":
                    case "Strength of Material (M)":
                        i.putExtra("Subject", "Strength").putExtra("Sem", "CE3").putExtra("Book", Urls.strengthOfMaterialBook);
                        break;

//                    ENE
                    case "Environmental Chemistry & Microbiology (M)":
                        i.putExtra("Subject", "ECM").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                    case "Water & Wastewater Analysis Lab":
                        i.putExtra("Subject", "WWALab").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                }

            case "ME":
            case "MAE":
            case "TE":
            case "MT":
                switch ((String)((Button)v).getText()){
                    case "Electrical Machines":
                    case "Electrical Machines (M)":
                        i.putExtra("Subject", "EM").putExtra("Sem", "ME3").putExtra("Book", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines Lab":
                        i.putExtra("Subject", "EMLab").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.electricalMachineBook);
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case "Numerical Analysis & Statistical Techniques (M)":
                        i.putExtra("Subject", "NAST").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.amBook);
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                        i.putExtra("Subject", "NASTLab").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.amBook);
                        break;

//                    ME
                    case "Strength of Materials-I (M)":
                        i.putExtra("Subject", "SoM-I").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.strengthOfMaterialBook);
                        break;
                    case "Strength of Materials-I Lab":
                        i.putExtra("Subject", "SoMLab-I").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.strengthOfMaterialBook);
                        break;

//                    MAE
                    case "Strength of Materials (M)":
                        i.putExtra("Subject", "SoM-MAE").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.strengthOfMaterialBook);
                        break;
                    case "Strength of Materials Lab":
                        i.putExtra("Subject", "SoMLab-I").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.strengthOfMaterialBook);
                        break;

                    case "Production Technology (M)":
                        i.putExtra("Subject", "PT").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.productionTechnologyBook);
                        break;
                    case "Production Technology Lab":
                        i.putExtra("Subject", "PTLab").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.productionTechnologyBook);
                        break;

                    case "Thermal Science (M)":
                        i.putExtra("Subject", "TS").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.thermalScienceBook);
                        break;

                    case "Machine Drawing Lab":
                        i.putExtra("Subject", "MDLab").putExtra("Sem", "ME3")
                                .putExtra("Book", "");
                        break;

//                    MAE
                    case "Material Science & Metallurgy":
                    case "Material Science & Metallurgy (M)":
                        i.putExtra("Subject", "MSM").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.msmBook);
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        i.putExtra("Subject", "FM").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Mechanics Lab":
                        i.putExtra("Subject", "FMLab").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;

//                     TE
                    case "Mechanics of Solids":
                        i.putExtra("Subject", "MoS").putExtra("Sem", "ME3")
                                .putExtra("Book", "");
                        break;
                    case "Mechanics of Solids & Fluids Lab":
                        i.putExtra("Subject", "MSFLab").putExtra("Sem", "ME3")
                                .putExtra("Book", "");
                        break;

//                    MT
                    case "Measurements & Instrumentation":
                        i.putExtra("Subject", "MnI").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.mniBook);
                        break;
                    case "Measurements & Instrumentation Lab":
                        i.putExtra("Subject", "MnILab").putExtra("Sem", "ME3")
                                .putExtra("Book", Urls.mniBook);
                        break;

                    case "Switching Theory & Logic Design (M)":
                        i.putExtra("Subject", "STLD").putExtra("Sem", "3")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                        i.putExtra("Subject", "STLDLab").putExtra("Sem", "3")
                                .putExtra("Book", Urls.stldBook);
                        break;
                }
                break;
        }
        try{
            i.putExtra("SubjectName", ((Button)v).getText().toString());
            if(i != null)
               startActivity(i);
        }catch (Exception e){e.printStackTrace();}
    }
}
