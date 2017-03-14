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
//        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


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

            case "CSE":
                dcn.setText("Computer Networks");
                dcnLab.setText("Computer Networks Lab");
                break;

            case "EEE":

                dcn.setText("Power System–II (M)");
                dcnLab.setText("Power System–II Lab");

                os.setText("Utilization of Electrical Energy & Electric Traction (M)");
                osLab.setText("Utilization of Electrical Energy Lab");

                web.setText("Digital Signal Processing");
                webLab.setText("Digital Signal Processing Lab");

                ai.setText("Power Station Practice (M)");
                cd.setText("VLSI Design");

                break;

            case "ECE":

                web.setText("Digital Signal Processing");
                webLab.setText("Digital Signal Processing Lab");

                ai.setText("Antenna & Wave Propagation");

                cd.setText("Information Theory & Coding");

                break;

            case "EE":

                micro.setText(micro.getText() + " (M)");

                dcn.setText("Power System-II (M)");
                dcnLab.setText("Power System-II Lab");

                os.setText("Utilization of Electrical Energy and Electric Traction");
                osLab.setText("Utilization of Electrical Energy Lab");

                web.setText("Electrical Machine – III (M)");
                webLab.setText("Electrical Machine – III Lab");

                ai.setText("EHV AC and HVDC Transmissions");

                cd.setText("Power Station Practice");

                break;
        }

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.ai:
                switch (stream) {
                    case "IT":
                    case "CSE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AI")
                                .putExtra("Sem", "6");
                        break;
                    case "ECE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "AWP")
                                .putExtra("Sem", "Ece6");
                        break;
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "ACDC")
                                .putExtra("Sem", "6");
                        break;
                }

            case R.id.cd:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "CD")
                            .putExtra("Sem", "6");
                        break;
                    case "ECE":
                        i = new Intent(this,Syllabus.class).putExtra("Subject","InfoTheory")
                                .putExtra("Sem","8");
                        break;
                    case "EEE":
                        i = new Intent(this,Syllabus.class).putExtra("Subject","VLSI")
                                .putExtra("Sem","8");
                        break;
                    case "EE":
                        i = new Intent(this,Syllabus.class).putExtra("Subject","PSP")
                                .putExtra("Sem","6");
                        break;
                }
                break;


            case R.id.dcn:
                if (stream.equals("IT") || stream.equals("ECE") || stream.equals("MAE") || stream.equals("ICE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "DCN")
                                                        .putExtra("Sem", "6");
                else if (stream.equals("CSE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "CN")
                                                        .putExtra("Sem", "6");
                else if (stream.equals("EE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "PE-II")
                            .putExtra("Sem", "6");
                break;


            case R.id.dcnLab:
                if (stream.equals("IT") || stream.equals("ECE") || stream.equals("MAE") || stream.equals("ICE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "DCNLab")
                                                        .putExtra("Sem", "6");
                else if (stream.equals("CSE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "CNLab")
                                                        .putExtra("Sem", "6");
                else if (stream.equals("EE"))
                    i = new Intent(this, Syllabus.class).putExtra("Subject", "PELab-II")
                            .putExtra("Sem", "6");
                break;

            case R.id.micro:
                switch (stream) {
                    case "IT":
                    case "CSE":
                    case "EEE":
                    case "MAE":
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Micro")
                                .putExtra("Sem", "6");
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
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "MicroLab")
                                .putExtra("Sem", "6");
                        break;
                }
                break;

            case R.id.os:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "OS")
                                 .putExtra("Sem", "6");
                         break;
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "Energy")
                                .putExtra("Sem", "6");
                    break;

                }
                break;

            case R.id.osLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "OSLab")
                                 .putExtra("Sem", "6");
                         break;
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EnergyLab")
                                .putExtra("Sem", "6");
                        break;
                }
                break;

            case R.id.web:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "Web")
                                 .putExtra("Sem", "6");
                         break;
                    case "ECE":
                         i = new Intent(this,Syllabus.class).putExtra("Subject","DSP")
                                 .putExtra("Sem","7");
                         break;
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EM-III")
                                .putExtra("Sem", "6");
                        break;
                }
                break;

            case R.id.webLab:
                switch (stream) {
                    case "IT":
                    case "CSE":
                         i = new Intent(this, Syllabus.class).putExtra("Subject", "WebLab")
                                 .putExtra("Sem", "6");
                         break;
                    case "ECE":
                         i = new Intent(this,Syllabus.class).putExtra("Subject","DSPLab")
                                 .putExtra("Sem","7");
                         break;
                    case "EE":
                        i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab-III")
                                .putExtra("Sem", "6");
                        break;
                }
                break;

        }

        i.putExtra("SubjectName", ((Button)v).getText());
        if(i != null)
            startActivity(i);

    }
}
