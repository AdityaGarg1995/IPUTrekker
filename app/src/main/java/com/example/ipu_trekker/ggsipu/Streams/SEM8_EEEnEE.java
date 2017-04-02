package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM8_EEEnEE extends AppCompatActivity implements View.OnClickListener{
//  3 2 7 7

    Button buttons[] = new Button[19], dspLab, dsp, psas, psasLab;

    Intent intent;

    String stream;

    String peA[] = {"Mechanical Vibrations", "Design of Electrical Machine", "Project Management", "Smart Grid",
            "Nuclear Power Generation & Supply", "Power System Analysis & Stability", "Robotics"},
           peB[] = {"Energy Management", "Data Communication & Networks",  "High Voltage AC & DC Technology",
            "Residual Life Assessment & Extension of TPP", "Cryogenic Engineering", "Total Quality Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee8);

        buttons[0] = psas = (Button)findViewById(R.id.psas);
        buttons[1] = dsp = (Button)findViewById(R.id.dsp);
        buttons[2] = (Button)findViewById(R.id.hvpe_ii);

        buttons[17] = psasLab = (Button)findViewById(R.id.psasLab);
        buttons[18] = dspLab = (Button)findViewById(R.id.dspLab);


//        E-A
        buttons[3] = (Button)findViewById(R.id.ape);
        buttons[4] = (Button)findViewById(R.id.dip);
        buttons[5] = (Button)findViewById(R.id.psoc);
        buttons[6] = (Button)findViewById(R.id.reaps);
        buttons[7] = (Button)findViewById(R.id.eec);
        buttons[8] = (Button)findViewById(R.id.fuzzy);
        buttons[9] = (Button)findViewById(R.id.esd);

//        E-B
        buttons[10] = (Button)findViewById(R.id.embed);
        buttons[11] = (Button)findViewById(R.id.dcn);
        buttons[12] = (Button)findViewById(R.id.oopc);
        buttons[13] = (Button)findViewById(R.id.ppi);
        buttons[14] = (Button)findViewById(R.id.smart);
        buttons[15] = (Button)findViewById(R.id.dc);
        buttons[16] = (Button)findViewById(R.id.epq);

        for(int i = 0; i < 19; i++)
            buttons[i].setOnClickListener(this);

        stream = getIntent().getStringExtra("Stream");
        final Activity a = this;
        a.setTitle(stream + ": 8th Semester Subjects");

        if(stream.equals("EEE")){
            dspLab.setVisibility(View.INVISIBLE);

            psas.setText("Neuro-Fuzzy Systems");
            psasLab.setText("Neuro-Fuzzy Systems Lab");
            dsp.setText("Power System Operation & Control");
        }

        else if(stream.equals("PE")){
            psas.setText("Environmental Management");
            dsp.setText("Microprocessor & Microcontroller");

            psasLab.setText("Environmental & Energy Audit Lab");
            dspLab.setText("Microprocessor & Microcontroller Lab");

            buttons[16].setVisibility(View.INVISIBLE);

            for (int i = 0; i < 7; i++)
                buttons[i+3].setText(peA[i]);
            for (int i = 0; i < 6; i++)
                buttons[i+10].setText(peB[i]);
        }
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.hvpe_ii:
                intent.putExtra("Subject", "HVPE-II").putExtra("Sem", "8").putExtra("Book", Urls.hvpe_iiBook);
                break;

            case R.id.dsp:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "DSP").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "PSOC").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Micro").putExtra("Sem", "PE8").putExtra("Book", Urls.microBook);
                        break;
                }
                break;
            case R.id.psas:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "PSAS").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "Fuzzy").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Envo").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.dspLab:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "DSPLab").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "MicroLab").putExtra("Sem", "PE8").putExtra("Book", Urls.microBook);
                        break;
                }
                break;
            case R.id.psasLab:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "ACSLab").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "FuzzyLab").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "EnvoLab").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

//            E-A
            case R.id.ape:
                switch (stream) {
                    case "EE":
                    case "EEE":
                    intent.putExtra("Subject", "APE").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "MV").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.dip:
                switch (stream) {
                    case "EE":
                    case "EEE":
                    intent.putExtra("Subject", "DIP").putExtra("Sem", "8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "DEM").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.psoc:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "PSOC").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "EM3-EEE").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "PM").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.reaps:
                switch (stream){
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "REAPS").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "SG").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.eec:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "EEC").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Nuclear").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.fuzzy:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "Fuzzy").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "EEE":
                    case "PE":
                        intent.putExtra("Subject", "PSAS").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.esd:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "ESD").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Robotics").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                }
                break;


//            E-B
            case R.id.embed:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "Embedded").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Energy").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.dcn:
                switch (stream) {
                    case "EE":
                    case "EEE":
                    case "PE":
                        intent.putExtra("Subject", "DCN").putExtra("Sem", "EE8").putExtra("Book", Urls.dcnBook);
                        break;
                }
                break;

            case R.id.oopc:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "C++").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "ACDC").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.ppi:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "PPI").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "RLA").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.smart:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "Smart").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "Cryo").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.dc:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "DigiComm").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                    case "PE":
                        intent.putExtra("Subject", "TQM").putExtra("Sem", "PE8").putExtra("Book", "");
                        break;
                }
                break;

            case R.id.epq:
                switch (stream) {
                    case "EE":
                    case "EEE":
                        intent.putExtra("Subject", "EPQ").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                }
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}    }
}