package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.microprocessorsSubject;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.stldSubject;


public class SEM5 extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Activity a = this;
    String stream;

    Button ada, adaLab, se, seLab, java, javaLab, comm, commLab, lab1, im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it5);

        stream = getIntent().getStringExtra("Stream");


        a.setTitle(stream + ": " + ImportantStrings.sem5sub);
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

        lab1.setVisibility(View.GONE);

        setSubject();
    }

    public void setSubject(){
        String cs       = "Control Systems",
               dsd      = "Digital System Design",
               digiComm = "Digital Communication",
               pe       = "Power Electronics",
               snt      = "Sensors & Transducers",
               seminar  = "Seminar",
               software = "Software Training",
               mms      = "Management of Manufacturing Systems";

        switch (stream){
            case "CSE":
                comm.setText(digiComm);
                commLab.setText(digiComm + " Lab");
                break;

            case "ECE":
                ada.setText(dsd + " (M)");
                adaLab.setText(dsd + " Lab");

                comm.setText(digiComm + " (M)");
                commLab.setText(digiComm + " Lab");

                java.setText(cs + " (M)");
                javaLab.setText(cs + " Lab");

                se.setText(microprocessorsSubject + " (M)");
                seLab.setText(microprocessorsSubject + " Lab");
//                 im & skills
                break;

            case "EEE":
                ada.setText(pe + " (M)");
                adaLab.setText(pe + " Lab");

                java.setText(snt + " (M)");
                javaLab.setText(snt + " Lab");

                se.setText(stldSubject + " (M)");
                seLab.setText(stldSubject + " Lab");

                lab1.setVisibility(View.VISIBLE);
                lab1.setOnClickListener(this);
                lab1.setText("Electrical & Electronic Workshop (M) (NUES)");
                break;

            case "CE":
                String geo = "Geotechnical & Foundation Engineering",
                       water  = "Wastewater Engineering & Reuse";

                ada.setText(geo + " (M)");
                adaLab.setText(geo + " Lab");

                java.setText("Engineering Hydrology (M)");

                se.setText("Advanced Structural Analysis");

                comm.setText(water);
                commLab.setText(String.format("%s Lab", water));

                javaLab.setText(String.format("%s on Civil Engineering projects/Visits/Case Studies", seminar));

                seLab.setText(software);

                im.setText("Design of Steel Structure (M)");
                break;

            case "EE":
//                stld, comm, pe, sns, im
                String sns = "Signals & Systems";

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Electrical Workshop (M) (NUES)");
                comm.setText(comm.getText() + " (M)");

                ada.setText(pe + " (M)");
                adaLab.setText(pe + " Lab");

                comm.setText(comm.getText() + " (M)");

                se.setText(stldSubject);
                seLab.setText(stldSubject + " Lab");

                java.setText(sns);
                javaLab.setText(sns + " Lab");
                break;

            case "ME":
                String ht   = "Heat Transfer",
                       dom  = "Dynamics of Machines",
                       md_i = "Machine Design-I";

                ada.setText(ht + " (M)");
                adaLab.setText(ht + " Lab");

                java.setText(dom + " (M)");
                javaLab.setText(dom + " Lab");

                comm.setText(cs);
                commLab.setText(cs+" Lab");

                se.setText(md_i);
                seLab.setText(md_i + " Lab");

                im.setText(mms);
                break;

            case "MAE":
                String htice = "Heat Transfer & I.C. Engines",
                       mctd  = "Metal Cutting & Tool Design",
                       met   = "Metrology";

                ada.setText(htice + " (M)");
                adaLab.setText(htice + " Lab");

                java.setText(mctd + " (M)");
                javaLab.setText(mctd + " Lab");

                comm.setText(cs);
                commLab.setText(cs + " Lab");

                se.setText(met + " (M)");
                seLab.setText(met + " Lab");

                im.setText(mms);
                break;

            case "MT":
                String mqa = "Metrology & Quality Control",
                       dsp = "Digital Signal Processing";

                ada.setText(mqa);
                adaLab.setText(mqa + " Lab");

                se.setText(dsp + " (M)");
                seLab.setText(dsp + " Lab");

                java.setText(snt + " (M)");
                javaLab.setText(snt + " Lab");

                comm.setText(pe + " & Drives (M)");
                commLab.setText(pe + " & Drives Lab");

                im.setText("Machine Element Design (M)");
                break;

            case "ICE":
                String ii = "Industrial Instrumentation",
                       oopj = "Object Oriented Programming using JAVA";

                ada.setText(dsd + " (M)");
                adaLab.setText(dsd + " Lab");

                comm.setText(ii + " (M)");
                commLab.setText(ii + " Lab");

                java.setText(oopj);
                javaLab.setText(oopj + " Lab");

                se.setText(microprocessorsSubject+ " (M)");
                seLab.setText(microprocessorsSubject+" Lab");
                break;

            case "TE":
                String cnc = "CNC Machining & Programming",
                       jfg =  "Jigs, Fixture & Gauge Design";

                ada.setText(cnc + " (M)");
                adaLab.setText(cnc + " Lab");

                comm.setText(cs + " (M)");
                commLab.setText(cs + " Lab");

                java.setText(jfg + " (M)");
                javaLab.setText(jfg + " Lab");

                se.setText("Plastic Technology");
                seLab.setVisibility(View.GONE);

                im.setText("Production Planning & Control");
                break;

            case "ENE":
                String envo = "Environmental";

                ada.setText("Design of Structures");
                adaLab.setText("Structure Design Lab");

                comm.setText("Biochemical Processes in Wastewater Treatment (M)");

                commLab.setText("Material Testing Lab");

                java.setText("Hydrology & Drainage Engineering (M)");

                javaLab.setText(String.format("%s on Environmental Engg projects/ Visits/ Case Studies (NUES)", seminar));

                se.setText(String.format("%s Instrumentation (M)", envo));

                seLab.setText(String.format("%s Modelling / %s (NUES)", envo, software));

                im.setText("Water Supply & Sewage System (M)");
                break;

            case "PE":
//                Not applicable due to electives
                break;
        }
    }


    public void setControl_ECE(){
        intent.putExtra("Subject", "Control-ECE").putExtra("Sem", "ECE5").putExtra("Book", Urls.controlBook);
    }

    public void setCSLab_ECE(){
        intent.putExtra("Subject", "CSLab-ECE").putExtra("Sem", "ECE5").putExtra("Book", Urls.controlBook);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.ada:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        putExtraCustom(intent, "ADA", "5", Urls.adaBook);
                        break;
                    case "CE":
                        putExtraCustom(intent, "GFE","CE5", "");
                        break;
                    case "ECE":
                    case "ICE":
                        putExtraCustom(intent, "DSD", "ECE5", "");
                        break;
                    case "EE":
                    case "EEE":
                        putExtraCustom(intent, "PE", "EE5", "");
                        break;
                    case "MT":
                        putExtraCustom(intent, "MQC", "MT5",Urls.mqcBook);
                        break;
                    case "MAE":
                        putExtraCustom(intent, "HTICE", "MAE5", Urls.hticeBook);
                        break;
                    case "ME":
                        putExtraCustom(intent, "HT", "ME5", "");
                        break;
                    case "ENE":
                        putExtraCustom(intent, "DoS", "ENE5", "");
                        break;
                    case "TE":
                        putExtraCustom(intent, "CNC", "TE5", "");
                        break;
                }
                break;

            case R.id.adaLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        putExtraCustom(intent, "ADALab", "5", Urls.adaBook);
                        break;
                    case "CE":
                        putExtraCustom(intent, "GFELab","CE5", "");
                        break;
                    case "ECE":
                    case "ICE":
                        putExtraCustom(intent, "DSDLab", "ECE5", "");
                        break;
                    case "EE":
                    case "EEE":
                        putExtraCustom(intent, "PELab", "EE5", "");
                        break;
                    case "MT":
                        putExtraCustom(intent, "MQCLab", "MT5",Urls.mqcBook);
                        break;
                    case "MAE":
                        putExtraCustom(intent, "HTICELab", "MAE5", Urls.hticeBook);
                        break;
                    case "ME":
                        putExtraCustom(intent, "HTLab", "ME5", "");
                        break;
                    case "ENE":
                        putExtraCustom(intent, "SDLab", "ENE5", "");
                        break;
                    case "TE":
                        putExtraCustom(intent, "CNCLab", "TE5", "");
                        break;
                }
                break;

            case R.id.comm:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "EE":
                        intent.putExtra("Subject", "CommSys").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CSE":
                    case "ECE":
                        intent.putExtra("Subject", "DigiComm").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CE":
                        intent.putExtra("Subject", "WER").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "MAE":
                    case "TE":
                        setControl_ECE();
                        break;
                    case "MT":
                        intent.putExtra("Subject", "PED").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        intent.putExtra("Subject", "II").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "BPWT").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.commLab:
                switch (stream) {
                    case "IT":
                    case "EEE":
                    case "EE":
                        intent.putExtra("Subject", "CommSysLab").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CSE":
                    case "ECE":
                        intent.putExtra("Subject", "DigiCommLab").putExtra("Sem", "5")
                                .putExtra("Book", "");
                        break;
                    case "CE":
                        intent.putExtra("Subject", "WERLab").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "MAE":
                    case "TE":
                       setCSLab_ECE();
                       break;
                    case "MT":
                        intent.putExtra("Subject", "PEDLab").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        intent.putExtra("Subject", "IILab").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "MTLab").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.java:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        intent.putExtra("Subject", "JAVA").putExtra("Sem", "5")
                                .putExtra("Book", Urls.javaBook);
                        break;
                    case "CE":
                        intent.putExtra("Subject", "Hydrology").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                        setControl_ECE();
                        break;
                    case "EE":
                        intent.putExtra("Subject", "SnS").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MT":
                        intent.putExtra("Subject", "SnT-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MAE":
                        intent.putExtra("Subject", "MCTD").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                    case "ME":
                        intent.putExtra("Subject", "DoM").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        intent.putExtra("Subject", "OOPJ").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "HDE").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        intent.putExtra("Subject", "JFG").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.javaLab:
                String seminar = "Seminar";
                switch (stream) {
                    case "IT":
                    case "CSE":
                        intent.putExtra("Subject", "JAVALab").putExtra("Sem", "5")
                                .putExtra("Book", Urls.javaBook);
                        break;
                    case "CE":
                        intent.putExtra("Subject", seminar).putExtra("Sem", "CE5")
                                .putExtra("Book", "NA");
                        break;
                    case "ECE":
                        setCSLab_ECE();
                        break;
                    case "EE":
                        intent.putExtra("Subject", "SnSLab").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MT":
                        intent.putExtra("Subject", "SnTLab-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case "MAE":
                        intent.putExtra("Subject", "MCTDLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                    case "ME":
                        intent.putExtra("Subject", "DoMLab").putExtra("Sem", "ME5")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        intent.putExtra("Subject", "OOPJLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", "");
                        break;
                    case "ENE":
                        intent.putExtra("Subject", seminar).putExtra("Sem", "ENE5")
                                .putExtra("Book", "NA");
                        break;
                    case "TE":
                        intent.putExtra("Subject", "JFGLab").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.se:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         intent.putExtra("Subject", "SE").putExtra("Sem", "5")
                                 .putExtra("Book", Urls.seBook);
                         break;
                    case "EEE":
                    case "EE":
                        intent.putExtra("Subject", "STLD").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "CE":
                        intent.putExtra("Subject", "SA-II").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                    case "ICE":
                        intent.putExtra("Subject", "Micro-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        intent.putExtra("Subject", "DSP-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        intent.putExtra("Subject", "Metrology").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "ME":
                        intent.putExtra("Subject", "MD-I").putExtra("Sem", "ME5")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "EI").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        intent.putExtra("Subject", "Plastic").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.seLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        intent.putExtra("Subject", "SELab").putExtra("Sem", "5")
                                .putExtra("Book", Urls.seBook);
                        break;
                    case "EEE":
                    case "EE":
                        intent.putExtra("Subject", "STLDLab").putExtra("Sem", "EE5")
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case "CE":
                        intent.putExtra("Subject", "Software").putExtra("Sem", "CE5")
                                .putExtra("Book", "NA");
                        break;
                    case "ECE":
                    case "ICE":
                        intent.putExtra("Subject", "MicroLab-ECE").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        intent.putExtra("Subject", "DSPLab-MT").putExtra("Sem", "MT5")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        intent.putExtra("Subject", "MetrologyLab").putExtra("Sem", "ECE5")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "ME":
                        intent.putExtra("Subject", "MDLab-I").putExtra("Sem", "ME5")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "Training").putExtra("Sem", "ENE5")
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
                        intent.putExtra("Subject", "IM").putExtra("Sem", "5")
                                .putExtra("Book", Urls.imBook);
                        break;
                    case "CE":
                        intent.putExtra("Subject", "Steel").putExtra("Sem", "CE5")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        intent.putExtra("Subject", "MED").putExtra("Sem", "MT5")
                                .putExtra("Book", Urls.machineElementDesignBook);
                        break;
                    case "MAE":
                    case "ME":
                        intent.putExtra("Subject", "MMS").putExtra("Sem", "MAE5")
                                .putExtra("Book", Urls.managementBook);
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "WS").putExtra("Sem", "ENE5")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        intent.putExtra("Subject", "PPC").putExtra("Sem", "TE5")
                                .putExtra("Book", "");
                        break;
                }
                break;

//            Common to all
            case R.id.skills:
                putExtraCustom(intent, "Skills", "5", Urls.skillsBook);
                break;
            case R.id.skillsLab:
                putExtraCustom(intent, "SkillsLab", "5", Urls.skillsBook);
                break;

//            Extra Lab
            case R.id.lab1:
                switch (stream){
                    case "EE":
                        putExtraCustom(intent, "Workshop", "EE5", "NA");
                        break;
                }
                break;
        }
        try {
            intent.putExtra("SubjectName",((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
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