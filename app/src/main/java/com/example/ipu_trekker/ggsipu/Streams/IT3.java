package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;


// 3rd sem
public class IT3 extends AppCompatActivity implements View.OnClickListener {

    public static class SubAndCode {
        String tsub[], psub[];
        public SubAndCode(String tsub[], String psub[]){
            this.tsub = tsub;
            this.psub = psub;
        }
    }

    Activity a = this;
    Intent intent = new Intent();

    SubAndCode sac;

    Button am_iii, cgmm, cgmmLab, cns, cnsLab, ds, dsLab, fcs, stld, stldLab,
           buttons[] = new Button[6], pb[] = new Button[6];


    String stream,

//    Commonly occurring subjects strings
           am3 = "Applied Mathematics-III",
           data = "Data Structures",
           switching = "Switching Theory & Logic Design",
           nast = "Numerical Analysis & Statistical Techniques",
           circuits = "Circuits & Systems",
           ae = "Analog Electronics",
           fm = "Fluid Mechanics",
           em = "Electrical Machines",
           som = "Strength of Materials";


    String itTSub[] = {am3, circuits, "Computer Graphics & Multimedia",
                   data+" (M)", "Foundation of Computer Science (M)", switching },
           itPSub[] = {circuits+" Lab", "Computer Graphics & Multimedia Lab",
                   data+" Lab", switching+" Lab" },


           eceTSub[] = {am3, ae+"-I (M)", "Electronic Instruments & Measurements (M)",
                   data, "Signals & Systems", switching+" (M)"},
           ecePSub[] = {ae+"-I Lab", data+" Lab", "Signals & Systems Lab",
                   "Electronic Instruments & Measurements Lab", switching+" Lab"},


           iceTSub[] = {am3, circuits, "Sensors & Transducers (M)",
                   data, "Basics of Measurements (M)", switching+" (M)"},
           icePSub[] = {circuits+" Lab", "Sensors & Transducers Lab (M)",
                   data+" Lab", switching+" Lab"},


           maeTSub[] = {fm+" (M)", "Thermal Science (M)", som+" (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", em},
           maePSub[] = {fm+" Lab", som+" Lab",
                   "Machine Drawing Lab", em+" Lab"},


           meTSub[] = {nast+" (M)", em, "Thermal Science (M)",
                   "Production Technology (M)", "Material Science & Metallurgy", som+"-I (M)"},
           mePSub[] = {nast+" Lab", em+" Lab",
                   "Production Technology Lab", som+"-I Lab", "Machine Drawing Lab"},

           mtTSub[] = {switching+" (M)", nast+" (M)", "Measurements & Instrumentation",
                   "Material Science & Metallurgy (M)", fm, "Mechanics of Solids"},
           mtPSub[] = {switching+" Lab", nast+" Lab",
                   "Measurements & Instrumentation Lab", "Mechanics of Solids & Fluid Lab"},


           peTSub[] = {"Material Science & Metallurgy", circuits+" (M)", "Thermodynamics for Power Engineers (M)",
                   som+" & Theory of Machines", ae, em+" (M)"},
           pePSub[] = {"Thermodynamics for Power Engineers Lab", som+" & Theory of Machines Lab",
                   ae+" Lab", em+" Lab"},


           teTSub[] = {em, nast+" (M)", "Production Technology (M)",
                   "Material Science & Metallurgy", fm, "Mechanics of Solids"},
           tePSub[] = {em+" Lab", nast+" Lab", "Mechanics of Solids & Fluids Lab", "Machine Drawing Lab"},


           eneTSub[] = {"Building Materials & Construction", fm+" (M)", "Environmental Chemistry & Microbiology (M)",
                   nast+" (M)", "Strength of Material", "Surveying"},
           enePSub[] = {fm+" Lab", "Water & Wastewater Analysis Lab", nast+" Lab",
                   "Surveying Lab", "Civil Engineering Drawing using CAD Lab"},


           eeTSub[] = {am3, ae, "Materials in Electrical Systems (M)",
                   data, circuits+" (M)", em+"-I (M)"},
           eePSub[] = {ae+" Lab", data+" Lab", circuits+" Lab", em+"-I Lab", "Scientific Computing Lab"},


           eeeTSub[] = {am3, ae+"-I", "Materials in Electrical Systems (M)",
                   data, circuits+" (M)", em+"-I (M)"},
           eeePSub[] = {ae+"-I Lab", data+" Lab", circuits+" Lab", em+"-I Lab"},


           ceTSub[] = {"Building Materials & Construction", fm+" (M)", "Engineering Geology",
                   nast, "Strength of Material (M)", "Surveying (M)"},
           cePSub[] = {fm+" Lab", "Geology & Building Material Lab", nast+" Lab",
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


    public void putExtraCustom(String subject, String sem, String book){
        intent.putExtra("Subject", subject).putExtra("Sem", sem).putExtra("Book", book);
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
        intent = new Intent(this, Syllabus.class);
        if(v == am_iii){
            switch (stream) {
                case "IT":
                case "CSE":
                case "EE":
                case "ECE":
                case "EEE":
                case "PE":
                case "ICE":
                    putExtraCustom("AM-III", "3", Urls.amBook);
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
                        putExtraCustom("DS", "3", Urls.dsBook);
                        break;
                    case "Data Structures Lab":
                        putExtraCustom("DSLab", "3", Urls.dsBook);
                        break;

                    case "Circuits & Systems":
                    case "Circuits & Systems (M)":
                        putExtraCustom("CnS", "3", "");
                        break;
                    case "Circuits & Systems Lab":
                        putExtraCustom("CnSLab", "3", "");
                        break;

                    case "Computer Graphics & Multimedia":
                        putExtraCustom("CGMM", "3", "");
                        break;
                    case "Computer Graphics & Multimedia Lab":
                        putExtraCustom("CGMMLab", "3", "");
                        break;

                    case "Foundation of Computer Science (M)":
                        putExtraCustom("FCS", "3", "");
                        break;

                    case "Switching Theory & Logic Design":
                    case "Switching Theory & Logic Design (M)":
                        putExtraCustom("STLD", "3", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                    case "Switching Theory & Logic Design Lab (M)":
                        putExtraCustom("STLDLab", "3", Urls.stldBook);
                        break;

//                    ECE, EEE, EE
                    case "Analog Electronics-I":
                    case "Analog Electronics-I (M)":
                        putExtraCustom("AE-I", "3", "");
                        break;
                    case "Analog Electronics":
                    case "Analog Electronics (M)":
                        putExtraCustom("AE", "3", "");
                        break;
                    case "Analog Electronics Lab":
                        putExtraCustom("AELab", "3", "");
                        break;
                    case "Analog Electronics-I Lab":
                        putExtraCustom("AELab-I", "3", "");
                        break;

                    case "Materials in Electrical Systems":
                    case "Materials in Electrical Systems (M)":
                        putExtraCustom("MES", "3", "");
                        break;

                    case "Electrical Machines-I":
                    case "Electrical Machines-I (M)":
                        putExtraCustom("EM-I", "3", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines-I Lab":
                        putExtraCustom("EMLab-I", "3", Urls.electricalMachineBook);
                        break;

                    case "Scientific Computing Lab":
                        putExtraCustom("SCLab", "3", "");
                        break;

                    case "Electronic Instruments & Measurements":
                    case "Electronic Instruments & Measurements (M)":
                        putExtraCustom("EIM", "3", "");
                        break;
                    case "Electronic Instruments & Measurements Lab":
                        putExtraCustom("EIMLab", "3", "");
                        break;

                    case "Signals & Systems":
                    case "Signals & Systems (M)":
                        putExtraCustom("SnS", "3", Urls.snsBook);
                        break;
                    case "Signals & Systems Lab":
                        putExtraCustom("SnSLab", "3", Urls.snsBook);
                        break;

//                    ICE
                    case "Sensors & Transducers (M)":
                        putExtraCustom("SnT", "3", "");
                        break;
                    case "Sensors & Transducers Lab (M)":
                        putExtraCustom("SnTLab", "3", "");
                        break;

                    case "Basics of Measurements (M)":
                        putExtraCustom("BoM", "3", "");
                        break;

//                     PE
                    case "Thermodynamics for Power Engineers (M)":
                        putExtraCustom("TPE", "3", "");
                        break;
                    case "Thermodynamics for Power Engineers Lab":
                        putExtraCustom("TPELab", "3", "");
                        break;

                    case "Strength of Materials & Theory of Machines":
                        putExtraCustom("SMTM", "3", "");
                        break;
                    case "Strength of Materials & Theory of Machines Lab":
                        putExtraCustom("SMTMLab", "3", "");
                        break;

                    case "Material Science & Metallurgy":
                        putExtraCustom("MSM", "3", Urls.msmBook);
                        break;

                    case "Electrical Machines (M)":
                        putExtraCustom("EM", "3", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines Lab":
                        putExtraCustom("EMLab", "3", Urls.electricalMachineBook);
                        break;
                }
                break;

            case "CE":
            case "ENE":
                switch ((String) ((Button) v).getText()) {
                    case "Building Materials & Construction":
                    case "Building Materials & Construction (M)":
                        putExtraCustom("BMC", "CE3", "");
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        putExtraCustom("Fluid", "CE3", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Mechanics Lab":
                        putExtraCustom("FluidLab", "CE3", Urls.fluidMechanicsBook);
                        break;

                    case "Engineering Geology":
                        putExtraCustom("Geology", "CE3", "");
                        break;
                    case "Geology & Building Material Lab":
                        putExtraCustom("GeoLab", "CE3", "");
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case "Numerical Analysis & Statistical Techniques(M)":
                        putExtraCustom("NAST", "CE3", Urls.amBook);
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                    case "Numerical Analysis & Statistical Techniques Lab (M)":
                        putExtraCustom("NASTLab", "CE3", Urls.amBook);
                        break;

                    case "Surveying":
                    case "Surveying (M)":
                        putExtraCustom("Surveying", "CE3", "");
                        break;
                    case "Surveying Lab":
                        putExtraCustom("SurveyingLab", "CE3", "");
                        break;

                    case "Civil Engineering Drawing using CAD Lab":
                        putExtraCustom("CAD", "CE3", "");
                        break;

                    case "Strength of Material":
                    case "Strength of Material (M)":
                        putExtraCustom("Strength", "CE3", Urls.strengthOfMaterialBook);
                        break;

//                    ENE
                    case "Environmental Chemistry & Microbiology (M)":
                        intent.putExtra("Subject", "ECM").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                    case "Water & Wastewater Analysis Lab":
                        intent.putExtra("Subject", "WWALab").putExtra("Sem", "CE3").putExtra("Book", "");
                        break;
                }

            case "ME":
            case "MAE":
            case "TE":
            case "MT":
                switch ((String)((Button)v).getText()){
                    case "Electrical Machines":
                    case "Electrical Machines (M)":
                        putExtraCustom("EM", "ME3", Urls.electricalMachineBook);
                        break;
                    case "Electrical Machines Lab":
                        putExtraCustom("EMLab", "ME3", Urls.electricalMachineBook);
                        break;

                    case "Numerical Analysis & Statistical Techniques":
                    case "Numerical Analysis & Statistical Techniques (M)":
                        putExtraCustom("NAST", "ME3", Urls.amBook);
                        break;
                    case "Numerical Analysis & Statistical Techniques Lab":
                        putExtraCustom("NASTLab", "ME3", Urls.amBook);
                        break;

//                    ME
                    case "Strength of Materials-I (M)":
                        putExtraCustom("SoM-I", "ME3", Urls.strengthOfMaterialBook);
                        break;
                    case "Strength of Materials-I Lab":
                        putExtraCustom("SoMLab-I", "ME3", Urls.strengthOfMaterialBook);
                        break;

//                    MAE
                    case "Strength of Materials (M)":
                        putExtraCustom("SoM-MAE", "ME3", Urls.strengthOfMaterialBook);
                        break;
                    case "Strength of Materials Lab":
                        putExtraCustom("SoMLab-I", "ME3", Urls.strengthOfMaterialBook);
                        break;

                    case "Production Technology (M)":
                        putExtraCustom("PT", "ME3", Urls.productionTechnologyBook);
                        break;
                    case "Production Technology Lab":
                        putExtraCustom("PTLab", "ME3", Urls.productionTechnologyBook);
                        break;

                    case "Thermal Science (M)":
                        putExtraCustom("TS", "ME3", Urls.thermalScienceBook);
                        break;

                    case "Machine Drawing Lab":
                        putExtraCustom("MDLab", "ME3", "");
                        break;

//                    MAE
                    case "Material Science & Metallurgy":
                    case "Material Science & Metallurgy (M)":
                        putExtraCustom("MSM", "ME3", Urls.msmBook);
                        break;

                    case "Fluid Mechanics":
                    case "Fluid Mechanics (M)":
                        putExtraCustom("FM", "ME3", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Mechanics Lab":
                        putExtraCustom("FMLab", "ME3", Urls.fluidMechanicsBook);
                        break;

//                     TE
                    case "Mechanics of Solids":
                        putExtraCustom("MoS", "ME3", "");
                        break;
                    case "Mechanics of Solids & Fluids Lab":
                        putExtraCustom("MSFLab", "ME3", "");
                        break;

//                    MT
                    case "Measurements & Instrumentation":
                        putExtraCustom("MnI", "ME3", Urls.mniBook);
                        break;
                    case "Measurements & Instrumentation Lab":
                        putExtraCustom("MnILab", "ME3", Urls.mniBook);
                        break;

                    case "Switching Theory & Logic Design (M)":
                        putExtraCustom("STLD", "3", Urls.stldBook);
                        break;
                    case "Switching Theory & Logic Design Lab":
                        putExtraCustom("STLDLab", "3", Urls.stldBook);
                        break;
                }
                break;
        }
        try{
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if(intent != null)
               startActivity(intent);
        }catch (Exception e){e.printStackTrace();}
    }
}