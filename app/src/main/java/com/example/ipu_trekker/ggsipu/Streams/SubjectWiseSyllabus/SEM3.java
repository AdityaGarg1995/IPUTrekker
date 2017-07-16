package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.amSubject;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.lab;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.mandatory;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.stldSubject;


// 3rd sem
public class SEM3 extends AppCompatActivity implements View.OnClickListener {

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
           buttons[] = new Button[6],
           pb[] = new Button[6];


    String stream;

//    Commonly occurring subjects strings
    final String am3       = amSubject + "-III",
                 data      = "Data Structures",
                 nast      = "Numerical Analysis & Statistical Techniques",
                 circuits  = "Circuits & Systems",
                 ae        = "Analog Electronics",
                 em        = "Electrical Machines",
                 som       = "Strength of Materials";


//    IT
    final String graphics = "Computer Graphics & Multimedia";
    String itTSub[] = {am3, circuits, graphics, data+mandatory, "Foundation of Computer Science (M)", stldSubject },
           itPSub[] = {circuits+lab, graphics+lab, data+lab, stldSubject+lab};


//    ECE
    final String eim = "Electronic Instruments & Measurements",
                 sns = "Signals & Systems" ;
    String eceTSub[] = {am3, ae+"-I"+mandatory, eim+mandatory, data, sns, stldSubject+mandatory},
           ecePSub[] = {ae+"-I"+lab, data+lab, sns+lab, eim+lab, stldSubject+lab};


//    ICE
    final String snt = "Sensors & Transducers";
    String iceTSub[] = {am3, circuits, snt+mandatory, data, "Basics of Measurements (M)", stldSubject+mandatory},
           icePSub[] = {circuits+lab, snt+lab+mandatory, data+lab, stldSubject+lab};


//    MAE, ME, MT, PE, TE
    final String ts      = "Thermal Science",
                 proTech = "Production Technology",
                 mdl     = "Machine Drawing Lab",
                 mni     = "Measurements & Instrumentation",
                 tpe     = "Thermodynamics for Power Engineers",
                 fm      = "Fluid Mechanics",
                 tom     = "Theory of Machines",
                 mos     = "Mechanics of Solids",
                 msm     = "Material Science & Metallurgy",

                 mosAndFluidsLab = mos+" & Fluids"+lab,
                 somAndTom = som+" & "+tom,
                 nast_m = nast+mandatory;
    String maeTSub[] = {fm+mandatory, ts+mandatory, som+mandatory, proTech+mandatory, msm, em},
           maePSub[] = {fm+lab, som+lab, mdl, em+lab},

           meTSub[] = {nast_m, em, ts+mandatory, proTech+mandatory, msm, som+"-I"+mandatory},
           mePSub[] = {nast+lab, em+lab, proTech+lab, som+"-I"+lab, mdl},

           mtTSub[] = {stldSubject+mandatory, nast_m, mni, msm+mandatory, fm, mos},
           mtPSub[] = {stldSubject+lab, nast+lab, mni+lab, mosAndFluidsLab},

           peTSub[] = {msm, circuits+mandatory, tpe+mandatory, somAndTom, ae, em+mandatory},
           pePSub[] = {tpe+lab, somAndTom+lab, ae+lab, em+lab},

           teTSub[] = {em, nast_m, proTech+mandatory, msm, fm, mos},
           tePSub[] = {em+lab, nast+lab, mosAndFluidsLab, mdl};


//    ENE, EE, EEE, CE
    final String survey = "Surveying",
                 mes    = "Materials in Electrical Systems",
                 bmc    = "Building Materials & Construction",
                 cadLab = "Civil Engineering Drawing using CAD Lab",
                 em_i_m = em+"-I"+mandatory,
                 em_i_lab = em+"-I"+lab;
    String eneTSub[] = {bmc, fm+mandatory, "Environmental Chemistry & Microbiology (M)", nast+mandatory, som, survey},
           enePSub[] = {fm+lab, "Water & Wastewater Analysis Lab", nast+lab, survey+lab, cadLab},


           eeTSub[] = {am3, ae, mes+mandatory, data, circuits+mandatory, em_i_m},
           eePSub[] = {ae+lab, data+lab, circuits+lab, em_i_lab, "Scientific Computing Lab"},


           eeeTSub[] = {am3, ae+"-I", mes+mandatory, data, circuits+mandatory, em_i_m},
           eeePSub[] = {ae+"-I"+lab, data+lab, circuits+lab, em_i_lab},


           ceTSub[] = {bmc, fm + mandatory, "Engineering Geology", nast, som+mandatory, survey+mandatory},
           cePSub[] = {fm+lab, "Geology & Building Material Lab", nast+lab, survey+lab, cadLab};



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
        a.setTitle(stream + ": " + ImportantStrings.sem3sub);

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
        pb[4].setVisibility(View.GONE);

        sac = setSubAndCode(stream);

        for(int i = 0; i < 6; i++ ) {
            buttons[i].setText(sac.tsub[i]);
            buttons[i].setOnClickListener(this);
        }
        for(int i = 0; i < 5; i++ )
            pb[i].setOnClickListener(this);


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
                    putExtraCustom(intent, "AM-III", "3", Urls.amBook);
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
                    case data:
                    case data+mandatory: putExtraCustom(intent, "DS", Urls.dsBook);
                        break;
                    case data+lab: putExtraCustom(intent, "DSLab", Urls.dsBook);
                        break;

                    case circuits:
                    case circuits+mandatory: putExtraCustom(intent, "CnS", "");
                        break;
                    case circuits+lab: putExtraCustom(intent, "CnSLab", "");
                        break;

                    case graphics: putExtraCustom(intent, "CGMM", "");
                        break;
                    case graphics+lab: putExtraCustom(intent, "CGMMLab", "");
                        break;

                    case "Foundation of Computer Science (M)": putExtraCustom(intent, "FCS", "");
                        break;

                    case stldSubject:
                    case stldSubject+mandatory: putExtraCustom(intent, "STLD", Urls.stldBook);
                        break;
                    case stldSubject+lab:
                    case stldSubject+lab+mandatory: putExtraCustom(intent, "STLDLab", Urls.stldBook);
                        break;

//                    ECE, EEE, EE
                    case ae+"-I":
                    case ae+"-I"+mandatory: putExtraCustom(intent, "AE-I", "");
                        break;
                    case ae:
                    case ae+mandatory: putExtraCustom(intent, "AE", "");
                        break;
                    case ae+lab: putExtraCustom(intent, "AELab", "");
                        break;
                    case ae+"-I"+lab: putExtraCustom(intent, "AELab-I", "");
                        break;

                    case mes:
                    case mes+mandatory: putExtraCustom(intent, "MES", "");
                        break;

                    case em+"-I":
                    case em+"-I"+mandatory: putExtraCustom(intent, "EM-I", Urls.electricalMachineBook);
                        break;
                    case em+"-I"+lab: putExtraCustom(intent, "EMLab-I", Urls.electricalMachineBook);
                        break;

                    case "Scientific Computing Lab": putExtraCustom(intent, "SCLab","");
                        break;

                    case eim:
                    case eim+mandatory: putExtraCustom(intent, "EIM","");
                        break;
                    case eim+lab: putExtraCustom(intent, "EIMLab", "");
                        break;

                    case sns:
                    case sns+mandatory: putExtraCustom(intent, "SnS", Urls.snsBook);
                        break;
                    case sns+lab:  putExtraCustom(intent, "SnSLab", Urls.snsBook);
                        break;

//                    ICE
                    case snt+mandatory: putExtraCustom(intent, "SnT", "");
                        break;
                    case snt+lab+mandatory: putExtraCustom(intent, "SnTLab", "");
                        break;

                    case "Basics of Measurements (M)": putExtraCustom(intent, "BoM", "");
                        break;

//                     PE
                    case tpe+mandatory: putExtraCustom(intent, "TPE", "");
                        break;
                    case tpe+lab: putExtraCustom(intent, "TPELab", "");
                        break;

                    case som+" & " + tom: putExtraCustom(intent, "SMTM", "");
                        break;
                    case som+" & " + tom + lab: putExtraCustom(intent, "SMTMLab", "");
                        break;

                    case msm: putExtraCustom(intent, "MSM", Urls.msmBook);
                        break;

                    case em+mandatory: putExtraCustom(intent, "EM", Urls.electricalMachineBook);
                        break;
                    case em+lab: putExtraCustom(intent, "EMLab", Urls.electricalMachineBook);
                        break;
                }
                intent.putExtra("Sem", "3");
                break;

            case "CE":
            case "ENE":
                switch ((String) ((Button) v).getText()) {
                    case bmc:
                    case bmc+mandatory: putExtraCustom(intent, "BMC", "");
                        break;

                    case fm:
                    case fm+mandatory: putExtraCustom(intent, "Fluid", Urls.fluidMechanicsBook);
                        break;
                    case fm+lab: putExtraCustom(intent, "FluidLab", Urls.fluidMechanicsBook);
                        break;

                    case "Engineering Geology": putExtraCustom(intent, "Geology", "");
                        break;
                    case "Geology & Building Material Lab":  putExtraCustom(intent, "GeoLab", "");
                        break;

                    case nast:
                    case nast+mandatory: putExtraCustom(intent, "NAST", Urls.amBook);
                        break;
                    case nast+lab:
                    case nast+lab+mandatory: putExtraCustom(intent, "NASTLab", Urls.amBook);
                        break;

                    case survey:
                    case survey+mandatory: putExtraCustom(intent, survey, "");
                        break;
                    case survey+lab: putExtraCustom(intent, survey+"Lab", "");
                        break;

                    case cadLab: putExtraCustom(intent, "CAD", "");
                        break;

                    case som:
                    case som+mandatory: putExtraCustom(intent, "Strength", Urls.strengthOfMaterialBook);
                        break;

//                    ENE
                    case "Environmental Chemistry & Microbiology (M)": putExtraCustom(intent, "ECM", "");
                        break;
                    case "Water & Wastewater Analysis Lab": putExtraCustom(intent, "WWALab", "");
                        break;
                }
                intent.putExtra("Sem", "CE3");
                break;

            case "ME":
            case "MAE":
            case "TE":
            case "MT":
                switch ((String)((Button)v).getText()){
                    case em:
                    case em+mandatory: putExtraCustom(intent, "EM", "ME3", Urls.electricalMachineBook);
                        break;
                    case em+lab: putExtraCustom(intent, "EMLab", "ME3", Urls.electricalMachineBook);
                        break;

                    case nast:
                    case nast+mandatory: putExtraCustom(intent, "NAST", "ME3", Urls.amBook);
                        break;
                    case nast+lab: putExtraCustom(intent, "NASTLab", "ME3", Urls.amBook);
                        break;

//                    ME
                    case som+"-I"+mandatory:
                        putExtraCustom(intent, "SoM-I", "ME3", Urls.strengthOfMaterialBook);
                        break;
                    case som+"-I"+lab:
                    case som+lab:  //MAE
                        putExtraCustom(intent, "SoMLab-I", "ME3", Urls.strengthOfMaterialBook);
                        break;

//                    MAE
                    case som+mandatory: putExtraCustom(intent, "SoM-MAE", "ME3", Urls.strengthOfMaterialBook);
                        break;

                    case proTech+mandatory: putExtraCustom(intent, "PT", "ME3", Urls.productionTechnologyBook);
                        break;
                    case proTech+lab: putExtraCustom(intent, "PTLab", "ME3", Urls.productionTechnologyBook);
                        break;

                    case ts+mandatory: putExtraCustom(intent, "TS", "ME3", Urls.thermalScienceBook);
                        break;

                    case mdl: putExtraCustom(intent, "MDLab", "ME3", "");
                        break;

//                    MAE
                    case msm:
                    case msm+mandatory: putExtraCustom(intent, "MSM", "ME3", Urls.msmBook);
                        break;

                    case fm:
                    case fm+mandatory: putExtraCustom(intent, "FM", "ME3", Urls.fluidMechanicsBook);
                        break;
                    case fm+lab: putExtraCustom(intent, "FMLab", "ME3", Urls.fluidMechanicsBook);
                        break;

//                     TE
                    case mos: putExtraCustom(intent, "MoS", "ME3", "");
                        break;
                    case mos+" & Fluids"+lab: putExtraCustom(intent, "MSFLab", "ME3", "");
                        break;

//                    MT
                    case mni: putExtraCustom(intent, "MnI", "ME3", Urls.mniBook);
                        break;
                    case mni+lab: putExtraCustom(intent, "MnILab", "ME3", Urls.mniBook);
                        break;

                    case stldSubject+mandatory: putExtraCustom(intent, "STLD", "3", Urls.stldBook);
                        break;
                    case stldSubject+lab: putExtraCustom(intent, "STLDLab", "3", Urls.stldBook);
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

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}