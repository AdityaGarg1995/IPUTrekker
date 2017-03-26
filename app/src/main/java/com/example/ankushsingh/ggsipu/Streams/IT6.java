package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class IT6 extends AppCompatActivity implements View.OnClickListener {

    Intent i;
    Activity a = this;
    String stream;

    Button ai, cd, dcn, dcnLab, micro, microLab, os, osLab, web, webLab, lab1,
           button[] = new Button[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it6);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 6th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        dcn      = button[0] = (Button) findViewById(R.id.dcn);
        dcnLab   = button[1] = (Button) findViewById(R.id.dcnLab);
        ai       = button[2] = (Button)findViewById(R.id.ai);
        cd       = button[3] = (Button)findViewById(R.id.cd);
        micro    = button[4] = (Button)findViewById(R.id.micro);
        microLab = button[5] = (Button)findViewById(R.id.microLab);
        os       = button[6] = (Button)findViewById(R.id.os);
        osLab    = button[7] = (Button)findViewById(R.id.osLab);
        web      = button[8] = (Button)findViewById(R.id.web);
        webLab   = button[9] = (Button)findViewById(R.id.webLab);
        lab1     = button[10] = (Button)findViewById(R.id.lab1);

        lab1.setVisibility(View.INVISIBLE);

        for(int i = 0; i < 11; i++)
            button[i].setOnClickListener(this);

        setSubject(stream);
    }


    public void setSubject(String stream){
        switch (stream){
            case "IT":
                dcn.setText(dcn.getText() + " (M)");
                break;

            case "CSE":
                dcn.setText("Computer Networks (M)");
                dcnLab.setText("Computer Networks Lab");
                break;

            case "EEE":
                dcn.setText("Power System–II (M)");
                dcnLab.setText("Power System–II Lab");

                os.setText("Utilization of Electrical Energy & Electric Traction (M)");
                osLab.setText("Utilization of Electrical Energy Lab");

                web.setText("Digital Signal Processing");
                webLab.setText("Digital Signal Processing Lab");

                ai.setText("VLSI Design");
                cd.setText("Power Station Practice (M)");
                break;

            case "ECE":
                dcn.setText(dcn.getText() + " (M)");

                web.setText("Digital Signal Processing (M)");
                webLab.setText("Digital Signal Processing Lab");

                os.setText("VLSI Design (M)");
                osLab.setText("VLSI Design Lab");

                ai.setText("Antenna & Wave Propagation");

                cd.setText("Information Theory & Coding");
                break;

            case "EE":
                micro.setText(micro.getText() + " (M)");

                dcn.setText("Power System-II (M)");
                dcnLab.setText("Power System-II Lab");

                os.setText("Utilization of Electrical Energy & Electric Traction (M)");
                osLab.setText("Utilization of Electrical Energy Lab");

                web.setText("Electrical Machine–III (M)");
                webLab.setText("Electrical Machine–III Lab");

                ai.setText("EHV AC & HVDC Transmissions");

                cd.setText("Power Station Practice");
                break;

            case "MT":
                micro.setText(micro.getText() + " (M)");

                dcn.setText("Automotive Electronics");
                dcnLab.setText("Automotive Electronics Lab");

                os.setText("Programmable Logic Controller & SCADA (M)");
                osLab.setText("Programmable Logic Controller & SCADA Lab");

                web.setText("Computer Integrated Manufacturing (M)");
                webLab.setText("Computer Integrated Manufacturing Lab");

                ai.setText("Management of Manufacturing System");

                cd.setText("Manufacturing Technology");
                break;

            case "ICE":
                web.setText("Digital Signal Processing (M)");
                webLab.setText("Digital Signal Processing Lab");

                os.setText("Modern Control Systems (M)");
                osLab.setText("Modern Control Systems Lab");

                micro.setText("Process Control (M)");
                microLab.setText("Process Control Lab (M)");

                ai.setText("Analytical Instrumentation");
                cd.setText("Pneumatic & Hydraulic Instrumentation (M)");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Pneumatic & Hydraulic Instrumentation Lab (M)");
                break;

            case "MAE":
                ai.setText("Operations Research");

                cd.setText("Refrigeration & Air Conditioning (M)");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Refrigeration & Air Conditioning Lab (M)");

                web.setText("Automobile Engineering (M)");
                webLab.setText("Automobile Engineering Lab");

                os.setText("Machine Design (M)");
                osLab.setText("Machine Design Lab");

                micro.setText(micro.getText() + " (M)");
                break;

            case "ME":
                ai.setText("Organizational Behaviour");

                cd.setText("Refrigeration & Air Conditioning (M)");

                lab1.setVisibility(View.VISIBLE);
                lab1.setText("Refrigeration & Air Conditioning Lab (M)");

                web.setText("Fluid Systems");
                webLab.setText("Fluid Systems Lab");

                os.setText("Machine Design-II (M)");
                osLab.setText("Machine Design-II Lab");

                micro.setText("Metal Cutting & Tool Design (M)");
                microLab.setText("Metal Cutting and Tool Design Lab");

                dcn.setText("Metrology");
                dcnLab.setText("Metrology Lab");
                break;

            case "TE":
                ai.setText("Layered Manufacturing");

                cd.setText("Total Quality Management");

                dcn.setText("Press Tool Design–I (M)");
                dcnLab.setText("Press Tool Design–I Lab");

                micro.setText("Metal Cutting & Tool Design (M)");
                microLab.setText("Metal Cutting and Tool Design Lab");

                os.setText("Mould Design-I (M)");
                osLab.setText("Mould Design-I Lab");

                web.setText("Finite Element Method");
                webLab.setText("Finite Element Method Lab");
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
        i = new Intent(this, Syllabus.class);
        switch (v.getId()) {
            case R.id.ai:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "AI").putExtra("Sem", "6")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                        i.putExtra("Subject", "AWP") .putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "EE":
                        i.putExtra("Subject", "ACDC").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "MMS-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", Urls.managementBook);
                        break;
                    case "EEE":
                        i.putExtra("Subject", "VLSI-ECE").putExtra("Sem","ECE6")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "Analytical").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "OR").putExtra("Sem", "MAE6")
                                .putExtra("Book", Urls.operationResearchBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "OB-ME").putExtra("Sem", "ME6")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "LM").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.cd:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "CD").putExtra("Sem", "6")
                                .putExtra("Book", Urls.cdBook);
                        break;
                    case "ECE":
                        i.putExtra("Subject","InfoTheory-ECE").putExtra("Sem","ECE6")
                                .putExtra("Book", "http://coltech.vnu.edu.vn/~thainp/books/Wiley_-_2006_-_Elements_of_Information_Theory_2nd_Ed.pdf");
                        break;
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject","PSP").putExtra("Sem","ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "Manufacturing-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "PHI").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                    case "ME":
                        i.putExtra("Subject", "RAC-MAE").putExtra("Sem", "MAE6")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "TQM-TE").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;


            case R.id.dcn:
                switch (stream) {
                    case "IT":
                    case "ECE":
                    case "MAE":
                    case "ICE":
                        i.putExtra("Subject", "DCN").putExtra("Sem", "6")
                                .putExtra("Book", Urls.dcnBook);
                        break;
                    case "CSE":
                        i.putExtra("Subject", "CN").putExtra("Sem", "6")
                                .putExtra("Book", "");
                        break;
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "PS-II").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "Auto").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                        i.putExtra("Subject", "Metrology").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "TE":
                        i.putExtra("Subject", "PTD1").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.dcnLab:
                switch (stream) {
                    case "IT":
                    case "ECE":
                    case "MAE":
                    case "ICE":
                        i.putExtra("Subject", "DCNLab").putExtra("Sem", "6")
                                .putExtra("Book", Urls.dcnBook);
                        break;
                    case "CSE":
                        i.putExtra("Subject", "CNLab").putExtra("Sem", "6")
                                .putExtra("Book", "");
                        break;
                    case "EE":
                    case "EEE":
                        i.putExtra("Subject", "PELab-II").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "AutoLab").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                        i.putExtra("Subject", "MetrologyLab").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.metrologyBook);
                        break;
                    case "TE":
                        i.putExtra("Subject", "PTDLab1").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.micro:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "EEE":
                    case "MAE":
                    case "EE":
                        i.putExtra("Subject", "Micro").putExtra("Sem", "6")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "Micro-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "ICE":
                        i.putExtra("Subject", "Process").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "TE":
                        i.putExtra("Subject", "MCTD-ME").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                }
                break;

            case R.id.microLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "EEE":
                    case "EE":
                    case "MAE":
                        i.putExtra("Subject", "MicroLab").putExtra("Sem", "6")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "MT":
                        i.putExtra("Subject", "MicroLab-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", Urls.microBook);
                        break;
                    case "ICE":
                        i.putExtra("Subject", "ProcessLab").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "ME":
                    case "TE":
                        i.putExtra("Subject", "MCTDLab-ME").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.mctdBook);
                        break;
                }
                break;

            case R.id.os:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "OS").putExtra("Sem", "6")
                                 .putExtra("Book", Urls.osBook);
                         break;
                    case "EE":
                    case "EEE":
                        i.putExtra("Subject", "Energy").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                        i.putExtra("Subject", "VLSI-ECE").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "PLC-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "MCS").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "MD-MAE").putExtra("Sem", "MAE6")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "MD-II").putExtra("Sem", "ME6")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "Mould1").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.osLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "OSLab").putExtra("Sem", "6")
                                 .putExtra("Book", Urls.osBook);
                        break;
                    case "EEE":
                    case "EE":
                        i.putExtra("Subject", "EnergyLab").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "ECE":
                        i.putExtra("Subject", "VLSILab-ECE").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "PLCLab-MT").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "ICE":
                        i.putExtra("Subject", "MCSLab").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "MDLab-MAE").putExtra("Sem", "MAE6")
                                .putExtra("Book", Urls.machineDesignBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "MDLab-II").putExtra("Sem", "ME6")
                                .putExtra("Book", "");
                        break;
                    case "TE":
                        i.putExtra("Subject", "MouldLab1").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.web:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i.putExtra("Subject", "Web").putExtra("Sem", "6")
                                 .putExtra("Book", "");
                         break;
                    case "ECE":
                    case "EEE":
                    case "ICE":
                         i.putExtra("Subject","DSP-ECE").putExtra("Sem","ECE6")
                                 .putExtra("Book", "");
                         break;
                    case "EE":
                        i.putExtra("Subject", "EM-III").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "CIM").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "Automobile").putExtra("Sem", "MAE6")
                                .putExtra("Book", Urls.automobileEngineeringBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "FS-ME").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;
                    case "TE":
                        i.putExtra("Subject", "FEM-TE").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.webLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i.putExtra("Subject", "WebLab").putExtra("Sem", "6")
                                 .putExtra("Book", "");
                        break;
                    case "EEE":
                    case "ECE":
                    case "ICE":
                        i.putExtra("Subject","DSPLab-ECE").putExtra("Sem","ECE6")
                                 .putExtra("Book", "");
                        break;
                    case "EE":
                        i.putExtra("Subject", "EMLab-III").putExtra("Sem", "ECE6")
                                .putExtra("Book", "");
                        break;
                    case "MT":
                        i.putExtra("Subject", "CIMLab").putExtra("Sem", "MT6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                        i.putExtra("Subject", "AutomobileLab").putExtra("Sem", "MAE6")
                                .putExtra("Book", Urls.automobileEngineeringBook);
                        break;
                    case "ME":
                        i.putExtra("Subject", "FSLab-ME").putExtra("Sem", "ME6")
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;
                    case "TE":
                        i.putExtra("Subject", "FEMLab-TE").putExtra("Sem", "TE6")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case R.id.lab1:
                switch (stream) {
                    case "ICE":
                        i.putExtra("Subject", "PHILab").putExtra("Sem", "ICE6")
                                .putExtra("Book", "");
                        break;
                    case "MAE":
                    case "ME":
                        i.putExtra("Subject", "RACLab-MAE").putExtra("Sem", "MAE6")
                                .putExtra("Book", "");
                        break;
                }
                break;
        }
        try {
            i.putExtra("SubjectName", ((Button)v).getText().toString());
            if (i != null)
                startActivity(i);
        } catch (Exception e){e.printStackTrace();}
    }
}