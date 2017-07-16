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

import static com.example.ipu_trekker.ggsipu.ImportantStrings.lab;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.mandatory;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraSubjectQuadruplet;

public class SEM6 extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Activity a = this;
    String stream;

    Button lab1, button[] = new Button[10];

    SubjectQuadruplet[] mSubjectQuadruplet;


    String dcnSubject = "Data Communication & Networks",
           mnm        = "Microprocessors & Microcontrollers";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it6);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": " + ImportantStrings.sem6sub);
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        button[0] = (Button)findViewById(R.id.cd);
        button[1] = (Button)findViewById(R.id.os);
        button[2] = (Button) findViewById(R.id.dcn);
        button[3] = (Button)findViewById(R.id.web);
        button[4] = (Button)findViewById(R.id.ai);
        button[5] = (Button)findViewById(R.id.micro);
        button[6] = (Button)findViewById(R.id.osLab);
        button[7] = (Button) findViewById(R.id.dcnLab);
        button[8] = (Button)findViewById(R.id.webLab);
        button[9] = (Button)findViewById(R.id.microLab);

        lab1 = (Button)findViewById(R.id.lab1);
        lab1.setVisibility(View.GONE);
        lab1.setOnClickListener(this);


        String webEngg   = "Web Engineering",
               operating = "Operating Systems";

        mSubjectQuadruplet = new SubjectQuadruplet[10];
        mSubjectQuadruplet[0] = new SubjectQuadruplet("CD", "Compiler Design" + mandatory, "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("OS", operating + mandatory, "");
        mSubjectQuadruplet[2] = setDCN();
        mSubjectQuadruplet[3] = new SubjectQuadruplet("Web", webEngg, "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("AI", "Artificial Intelligence", "");
        mSubjectQuadruplet[5] = setMicroLab();

        mSubjectQuadruplet[6] = new SubjectQuadruplet("OSLab", operating+" (Linux Programming & Administration) Lab", "");
        mSubjectQuadruplet[7] = setDCNLab();
        mSubjectQuadruplet[8] = new SubjectQuadruplet("WebLab", webEngg+" Lab", "");
        mSubjectQuadruplet[9] = setMicroLab();

        setSubject(stream);

        for(int i = 0; i < 10; i++) {
            button[i].setOnClickListener(this);
            button[i].setText(mSubjectQuadruplet[i].getSubjectName());
            mSubjectQuadruplet[i].setSem("6");
        }

    }

    static String me6  = "ME6",
                  mae6 = "MAE6",
                  ice6 = "ICE6",
                  ece6 = "ECE6",
                  te6  = "TE6",
                  mt6  = "MT6";

    public SubjectQuadruplet setDCN(){
        return new SubjectQuadruplet("DCN", "6", dcnSubject, Urls.dcnBook);
    }
    public SubjectQuadruplet setDCNLab(){
        return new SubjectQuadruplet("DCNLab", "6", dcnSubject + lab, Urls.dcnBook);
    }


    public SubjectQuadruplet setMicro(){
        return new SubjectQuadruplet("Micro", "6", mnm, Urls.microBook);
    }
    public SubjectQuadruplet setMicroLab(){
        return new SubjectQuadruplet("MicroLab", "6", mnm+" Lab", Urls.microBook);
    }


    public SubjectQuadruplet setMCTD_ME(){
        return new SubjectQuadruplet("MCTD-ME", me6, "Metal Cutting & Tool Design" + mandatory, "");
    }
    public SubjectQuadruplet setMCTD_MELab(){
        return new SubjectQuadruplet("MCTDLab-ME", me6, "Metal Cutting & Tool Design" + lab, "");
    }


    private SubjectQuadruplet setRAC_MAE() {
        return new SubjectQuadruplet("RAC-MAE", mae6, "Refrigeration & Air Conditioning" + mandatory, "");
    }
    private SubjectQuadruplet setRACLab_MAE() {
        return new SubjectQuadruplet("RACLab-MAE", mae6, "Refrigeration & Air Conditioning" + lab, "");
    }


    public void setSubject(String stream){

       String   md_ii = "Machine Design-II",
                fs    = "Fluid Systems",
                ptd   = "Press Tool Design–I",
                mould = "Mould Design-I",
                fem   = "Finite Element Method",
                ps_ii = "Power System-II",
                ueeet = "Utilization of Electrical Energy & Electric Traction",
                dsp   = "Digital Signal Processing",
                vlsi  = "VLSI Design";

       switch (stream){
            case "IT":
                break;
            case "CSE":
                String cn = "Computer Networks";
                mSubjectQuadruplet[2] = new SubjectQuadruplet("CN", "6", cn+mandatory, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("CNLab", "6", cn+lab, "");
                break;

            case "EEE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PS-II", ece6, ps_ii+mandatory, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Energy", ece6, ueeet+mandatory, "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", ece6, dsp, "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("VLSI-ECE", ece6, vlsi, "");
                mSubjectQuadruplet[4] = setMicro();
                mSubjectQuadruplet[5] = new SubjectQuadruplet("PSP", ece6, "Power Station Practice", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PSLab-II", ece6, ps_ii+lab, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("EnergyLab", ece6, ueeet+lab, "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("VLSILab-ECE", ece6, vlsi+lab, "");
                mSubjectQuadruplet[9] = setMicroLab();
                break;

            case "ECE":
                String mwe = "Microwave Engineering";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MWE", ece6, mwe+mandatory, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("InfoTheory-ECE", ece6, "Information Theory & Coding", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", ece6, dsp+mandatory, "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("VLSI-ECE", ece6, vlsi+mandatory, "");
                mSubjectQuadruplet[4] = setDCN();
                mSubjectQuadruplet[5] = new SubjectQuadruplet("AWP", ece6, "Antenna & Wave Propagation", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MWELab", ece6, mwe+lab, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("VLSILab-ECE", ece6, vlsi+lab, "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("DSPLab-ECE", ece6, dsp+lab, "");
                mSubjectQuadruplet[9] = setDCNLab();
                break;

            case "EE":
                String em_iii = "Electrical Machine–III";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PS-II", ece6, ps_ii+mandatory, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Energy", ece6, ueeet+mandatory, "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("ACDC", ece6, "EHV AC & HVDC Transmissions", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("EM-III", ece6, em_iii+mandatory, "");
                mSubjectQuadruplet[4] = setMicro();
                mSubjectQuadruplet[5] = new SubjectQuadruplet("PSP", ece6, "Power Station Practice", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PSLab-II", ece6, ps_ii+lab, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("EnergyLab", ece6, ueeet+lab, "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("EMLab-III", ece6, em_iii+lab, "");
                mSubjectQuadruplet[9] = setMicroLab();
                break;

            case "MT":
                String plc  = "Programmable Logic Controller & SCADA",
                       cim  = "Computer Integrated Manufacturing",
                       auto = "Automotive Electronics";

                mSubjectQuadruplet[0] = new SubjectQuadruplet("MMS", mt6, "Management of Manufacturing System", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Manufacturing-MT", mt6, "Manufacturing Technology", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("PLC-MT", mt6, plc+mandatory, "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("CIM", mt6, cim+mandatory, "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("Auto", mt6, auto, "");
                mSubjectQuadruplet[5] = setMicro();

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PLCLab-MT", mt6, plc+lab, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("CIMLab", mt6, cim+lab, "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("AutoLab", mt6, auto+lab, "");
                mSubjectQuadruplet[9] = setMicroLab();
                break;

            case "ICE":
                String phi = "Pneumatic & Hydraulic Instrumentation",
                       pc  = "Process Control",
                       mcs = "Modern Control Systems",
                       ana = "Analytical";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PHI", ice6, phi+mandatory, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Process", ice6, pc+mandatory, "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", ece6, dsp, "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet(ana, ice6, ana+" Instrumentation", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("MCS", ice6, mcs+mandatory, "");
                mSubjectQuadruplet[5] = setDCN();

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PHILab", ice6, phi + lab + mandatory, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("ProcessLab", ice6, pc + lab + mandatory, "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("DSPLab-ECE", ece6, dsp + lab, "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("MCSLab", ice6, mcs + lab + mandatory, "");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText(dcnSubject+" Lab");
                break;

            case "MAE":
                String md      = "Machine Design",
                       autoEng = "Automobile Engineering",
                       auto2   = "Automobile";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MD-MAE", mae6, md+mandatory, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet(auto2, mae6, autoEng, Urls.automobileEngineeringBook);
                mSubjectQuadruplet[2] = setDCN();
                mSubjectQuadruplet[3] = new SubjectQuadruplet("OR", mae6, "Operations Research", Urls.operationResearchBook);
                mSubjectQuadruplet[4] = setRAC_MAE();
                mSubjectQuadruplet[5] = setMicro();

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MDLab-MAE", mae6, md+lab, "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet(auto2+"Lab", mae6, autoEng+lab, Urls.automobileEngineeringBook);
                mSubjectQuadruplet[8] = setDCNLab();
                mSubjectQuadruplet[9] = setRACLab_MAE();

                lab1.setVisibility(View.VISIBLE);
                lab1.setText( mnm+" Lab");

                break;

            case "ME":
                String met = "Metrology";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MD-II", me6, md_ii+mandatory, "");
                mSubjectQuadruplet[1] = setMCTD_ME();
                mSubjectQuadruplet[2] = new SubjectQuadruplet("FS-ME", me6, fs, "");
                mSubjectQuadruplet[3] = setRAC_MAE();
                mSubjectQuadruplet[4] = new SubjectQuadruplet("OB-ME", me6, "Organizational Behaviour", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet(met, me6, met, "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MDLab-II", me6, md_ii+lab, "");
                mSubjectQuadruplet[7] = setMCTD_MELab();
                mSubjectQuadruplet[8] = new SubjectQuadruplet("FSLab-ME", me6, fs+lab, "");
                mSubjectQuadruplet[9] = setRACLab_MAE();

                lab1.setVisibility(View.VISIBLE);
                lab1.setText(met+" Lab");
                break;

            case "TE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PTD1", te6, ptd+mandatory, "");
                mSubjectQuadruplet[1] = setMCTD_ME();
                mSubjectQuadruplet[2] = new SubjectQuadruplet("Mould1", te6, mould+mandatory, "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("LM", te6, "Layered Manufacturing", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("FEM-TE", te6, fem, "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("TQM-TE", "6", "Total Quality Management", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PTDLab1", te6, ptd+lab, "");
                mSubjectQuadruplet[7] = setMCTD_MELab();
                mSubjectQuadruplet[8] = new SubjectQuadruplet("MouldLab1", te6, mould+lab, "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("FEMLab-TE", te6, fem+lab, "");
                break;

            case "PE":
            case "ENE":
            case "CE":
//                NA due to electives
                break;
        }
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 10; i++)
            if(v == button[i])
                putExtraSubjectQuadruplet(intent, mSubjectQuadruplet[i]);

        if(v == lab1) {
            switch (stream) {
                case "ICE":
                    setDCNLab();
                    break;
                case "MAE":
                    setMicroLab();
                    break;
                case "ME":
                    putExtraCustom(intent, "MetrologyLab", me6, "");
                    break;
                }
            }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
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