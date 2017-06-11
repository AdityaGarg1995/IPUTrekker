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

public class IT6 extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Activity a = this;
    String stream;

    Button lab1, button[] = new Button[10];

    SubjectQuadruplet[] mSubjectQuadruplet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it6);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 6th Semester Subjects");
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
        lab1.setVisibility(View.INVISIBLE);
        lab1.setOnClickListener(this);

        mSubjectQuadruplet = new SubjectQuadruplet[10];
        mSubjectQuadruplet[0] = new SubjectQuadruplet("CD", "6",
                "Compiler Design (M)", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("OS", "6",
                "Operating Systems (M)", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("DCN", "6",
                "Data Communication & Networks (M)",
                Urls.dcnBook);
        mSubjectQuadruplet[3] = new SubjectQuadruplet("Web", "6",
                "Web Engineering", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("AI", "6",
                "Artificial Intelligence", "");
        mSubjectQuadruplet[5] = new SubjectQuadruplet("Micro", "6",
                "Microprocessor & Microcontroller",
                Urls.microBook);

        mSubjectQuadruplet[6] = new SubjectQuadruplet("OSLab", "6",
                "Operating Systems (Linux Programming & Administration) Lab", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("DCNLab", "6",
                "Data Communication & Networks Lab",
                Urls.dcnBook);
        mSubjectQuadruplet[8] = new SubjectQuadruplet("WebLab", "6",
                "Web Engineering Lab", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("MicroLab", "6",
                "Microprocessor & Microcontroller Lab",
                Urls.microBook);

        setSubject(stream);

        for(int i = 0; i < 10; i++) {
            button[i].setOnClickListener(this);
            button[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }
    }

 public void setSubject(String stream){
        switch (stream){
            case "IT":
                break;
            case "CSE":
                mSubjectQuadruplet[2] = new SubjectQuadruplet("CN", "6", "Computer Networks (M)", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("CNLab", "6", "Computer Networks Lab", "");
                break;

            case "EEE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PS-II", "ECE6",
                        "Power System-II (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Energy", "ECE6",
                        "Utilization of Electrical Energy & Electric Traction (M)", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", "ECE6",
                        "Digital Signal Processing", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("VLSI-ECE", "ECE6",
                        "VLSI Design", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("Micro", "6",
                        "Microprocessor & Microcontroller",
                        Urls.microBook);
                mSubjectQuadruplet[5] = new SubjectQuadruplet("PSP", "ECE6",
                        "Power Station Practice", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PSLab-II", "ECE6",
                        "Power System-II Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("EnergyLab", "ECE6",
                        "Utilization of Electrical Energy & Electric Traction Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("VLSILab-ECE", "ECE6",
                        "VLSI Design Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("MicroLab", "6",
                        "Microprocessor & Microcontroller Lab",
                        Urls.microBook);
                break;

            case "ECE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MWE", "ECE6",
                        "Microwave Engineering (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("InfoTheory-ECE", "ECE6",
                        "Information Theory & Coding", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", "ECE6",
                        "Digital Signal Processing (M)", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("VLSI-ECE", "ECE6",
                        "VLSI Design (M)", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("DCN", "6",
                        "Data Communication & Networks (M)",
                        Urls.dcnBook);
                mSubjectQuadruplet[5] = new SubjectQuadruplet("AWP", "ECE6",
                        "Antenna & Wave Propagation", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MWELab", "ECE6",
                        "Microwave Engineering Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("VLSILab", "ECE6",
                        "VLSI Design Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("DSPLab-ECE", "ECE6",
                        "Digital Signal Processing Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("DCNLab", "6",
                        "Data Communication & Networks Lab",
                        Urls.dcnBook);
                break;

            case "EE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PS-II", "ECE6",
                        "Power System-II (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Energy", "ECE6",
                        "Utilization of Electrical Energy & Electric Traction (M)", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("ACDC", "ECE6",
                        "EHV AC & HVDC Transmissions", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("EM-III", "ECE6",
                        "Electrical Machine–III (M)", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("Micro", "6",
                        "Microprocessor & Microcontroller",
                        Urls.microBook);
                mSubjectQuadruplet[5] = new SubjectQuadruplet("PSP", "ECE6",
                        "Power Station Practice", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PSLab-II", "ECE6",
                        "Power System-II Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("EnergyLab", "ECE6",
                        "Utilization of Electrical Energy & Electric Traction Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("EMLab-III", "ECE6",
                        "Electrical Machine–III Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("MicroLab", "6",
                        "Microprocessor & Microcontroller Lab",
                        Urls.microBook);
                break;

            case "MT":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MMS", "MT6",
                        "Management of Manufacturing System", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Manufacturing-MT", "MT6",
                        "Manufacturing Technology", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("PLC-MT", "MT6",
                        "Programmable Logic Controller & SCADA (M)", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("CIM", "MT6",
                        "Computer Integrated Manufacturing (M)", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("Auto", "MT6",
                        "Automotive Electronics", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("Micro-MT", "MT6",
                        "Microprocessor & Microcontroller",
                        Urls.microBook);

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PLCLab-MT", "MT6",
                        "Programmable Logic Controller & SCADA Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("CIMLab", "MT6",
                        "Computer Integrated Manufacturing Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("AutoLab", "MT6",
                        "Automotive Electronics Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("MicroLab-MT", "MT6",
                        "Microprocessor & Microcontroller Lab",
                        Urls.microBook);
                break;

            case "ICE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PHI", "ICE6",
                        "Pneumatic & Hydraulic Instrumentation (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Process", "ICE6",
                        "Process Control (M)", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DSP-ECE", "ECE6",
                        "Digital Signal Processing", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("Analytical", "ICE6",
                        "Analytical Instrumentation", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("Micro", "6",
                        "Modern Control Systems (M)", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("DCN", "6",
                        "Data Communication & Networks (M)",
                        Urls.dcnBook);

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PHILab", "ICE6",
                        "Pneumatic & Hydraulic Instrumentation Lab (M)", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("ProcessLab", "ICE6",
                        "Process Control Lab (M)", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("DSPLab-ECE", "ECE6",
                        "Digital Signal Processing Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("MCSLab", "ICE6",
                        "Modern Control Systems Lab (M)", "");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Data Communication & Networks Lab");
                break;

            case "MAE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MD-MAE", "MAE6",
                        "Machine Design (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Automobile", "MAE6",
                        "Automobile Engineering",
                        Urls.automobileEngineeringBook);
                mSubjectQuadruplet[2] = new SubjectQuadruplet("DCN", "6",
                        "Data Communication & Networks (M)",
                        Urls.dcnBook);
                mSubjectQuadruplet[3] = new SubjectQuadruplet("OR", "MAE6",
                        "Operations Research",
                        Urls.operationResearchBook);
                mSubjectQuadruplet[4] = new SubjectQuadruplet("RAC-MAE", "6",
                        "Refrigeration & Air Conditioning (M)", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("Micro", "6",
                        "Microprocessor & Microcontroller (M)",
                        Urls.microBook);

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MDLab-MAE", "MAE6",
                        "Machine Design Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("AutomobileLab", "MAE6",
                        "Automobile Engg Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("DCNLab", "6",
                        "Data Communication & Networks Lab",
                        Urls.dcnBook);
                mSubjectQuadruplet[9] = new SubjectQuadruplet("RACLab-MAE", "MAE6",
                        "Refrigeration & Air Conditioning Lab" , "");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText( "Microprocessor & Microcontroller Lab");

                break;

            case "ME":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("MD-II", "ME6",
                        "Machine Design-II (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("MCTD-ME", "ME6",
                        "Metal Cutting & Tool Design (M)", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("FS-ME", "ME6",
                        "Fluid Systems", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("RAC-MAE", "6",
                        "Refrigeration & Air Conditioning (M)", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("OB-ME", "ME6",
                        "Organizational Behaviour", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("Metrology", "ME6",
                        "Metrology", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("MDLab-II", "ME6",
                        "Machine Design-II Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("MCTDLab-ME", "ME6",
                        "Metal Cutting & Tool Design Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("FSLab-ME", "ME6",
                        "Fluid Systems Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("RACLab-MAE", "MAE6",
                        "Refrigeration & Air Conditioning Lab", "");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Metrology Lab");
                break;

            case "TE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PTD1", "TE6",
                        "Press Tool Design–I (M)", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("MCTD-ME", "ME6",
                        "Metal Cutting & Tool Design (M)", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("Mould1", "TE6",
                        "Mould Design-I (M)", "");
                mSubjectQuadruplet[3] = new SubjectQuadruplet("LM", "TE6",
                        "Layered Manufacturing", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("FEM-TE", "TE6",
                        "Finite Element Method", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("TQM-TE", "6",
                        "Total Quality Management", "");

                mSubjectQuadruplet[6] = new SubjectQuadruplet("PTDLab1", "TE6",
                        "Press Tool Design–I Lab", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("MCTDLab-ME", "ME6",
                        "Metal Cutting & Tool Design Lab", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("MouldLab1", "TE6",
                        "Mould Design-I Lab", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("FEMLab-TE", "TE6",
                        "Finite Element Method Lab", "");
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
                intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                        .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                        .putExtra("Book", mSubjectQuadruplet[i].getBook());

        if(v == lab1) {
            switch (stream) {
                case "ICE":
                    intent.putExtra("Subject", "DCNLab").putExtra("Sem", "6")
                          .putExtra("Book", Urls.dcnBook);
                    break;
                case "MAE":
                    intent.putExtra("Subject", "MicroLab").putExtra("Sem", "6")
                          .putExtra("Book", Urls.microBook);
                    break;
                case "ME":
                    intent.putExtra("Subject", "MetrologyLab").putExtra("Sem", "ME6")
                          .putExtra("Book", "");
                    break;
                }
            }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}