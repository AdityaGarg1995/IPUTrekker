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

public class SEM8_EEEnEE extends AppCompatActivity implements View.OnClickListener{
//  3 2 7 7

    Button buttons[] = new Button[19],
           dspLab,
           dsp,
           psas,
           psasLab;

    Intent intent;

    String stream;

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
        a.setTitle(stream + ": " + ImportantStrings.sem8sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        if(stream.equals("EEE")){

            String nfs = "Neuro-Fuzzy Systems";
            dspLab.setVisibility(View.GONE);

            psas.setText(nfs);
            psasLab.setText(nfs + " Lab");
            dsp.setText("Power System Operation & Control");
        }
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()) {
            case R.id.hvpe_ii:
                ImportantStrings.hvpeII(intent);
                break;

            case R.id.dsp:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "DSP").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "PSOC").putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", "EE8");
                break;
            case R.id.psas:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "PSAS").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "Fuzzy").putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", "EE8");
                break;

            case R.id.dspLab:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "DSPLab").putExtra("Sem", "EE8").putExtra("Book", "");
                        break;
                }
                break;
            case R.id.psasLab:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "ACSLab").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "FuzzyLab").putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", "EE8");
                break;

//            E-A
            case R.id.ape:
                intent.putExtra("Subject", "APE").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.dip:
                intent.putExtra("Subject", "DIP").putExtra("Sem", "8").putExtra("Book", Urls.dipBook);
                break;

            case R.id.psoc:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "PSOC").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "EM3-EEE").putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", "EE8");
                break;

            case R.id.reaps:
                intent.putExtra("Subject", "REAPS").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.eec:
                intent.putExtra("Subject", "EEC").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.fuzzy:
                switch (stream) {
                    case "EE":
                        intent.putExtra("Subject", "Fuzzy").putExtra("Book", "");
                        break;
                    case "EEE":
                        intent.putExtra("Subject", "PSAS").putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", "EE8");
                break;

            case R.id.esd:
                intent.putExtra("Subject", "ESD").putExtra("Sem", "EE8").putExtra("Book", "");
                break;


//            E-B
            case R.id.embed:
                intent.putExtra("Subject", "Embedded").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.dcn:
                intent.putExtra("Subject", "DCN").putExtra("Sem", "EE8").putExtra("Book", Urls.dcnBook);
                break;

            case R.id.oopc:
                intent.putExtra("Subject", "C++").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.ppi:
                intent.putExtra("Subject", "PPI").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.smart:
                intent.putExtra("Subject", "Smart").putExtra("Sem", "EE8").putExtra("Book", "");
                break;

            case R.id.dc:
                intent.putExtra("Subject", "DigiComm").putExtra("Sem", "ECE8").putExtra("Book", "");
                break;

            case R.id.epq:
                intent.putExtra("Subject", "EPQ").putExtra("Sem", "EE8").putExtra("Book", "");
                break;
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