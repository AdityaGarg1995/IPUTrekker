package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;


public class SEM7_PE extends AppCompatActivity implements View.OnClickListener {

//   4 4 6 7
//    Button button1,button2,button3,button4;
    Intent intent;
//    public  static final String url2 = "http://bookboon.com/en/environmental-engineering-ebooks";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe7);

        findViewById(R.id.ppo).setOnClickListener(this);
        findViewById(R.id.rer).setOnClickListener(this);
        findViewById(R.id.pppe).setOnClickListener(this);
        findViewById(R.id.psps).setOnClickListener(this);

        findViewById(R.id.sga_ojt).setOnClickListener(this);
        findViewById(R.id.sta_ojt).setOnClickListener(this);
        findViewById(R.id.pp_ojt).setOnClickListener(this);
        findViewById(R.id.pspsLab).setOnClickListener(this);

//        E_A
        findViewById(R.id.tom).setOnClickListener(this);
        findViewById(R.id.ppm).setOnClickListener(this);
        findViewById(R.id.bpp).setOnClickListener(this);
        findViewById(R.id.pmcm).setOnClickListener(this);
        findViewById(R.id.ncmp).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);

//        E_B
        findViewById(R.id.mie).setOnClickListener(this);
        findViewById(R.id.commEng).setOnClickListener(this);
        findViewById(R.id.ita).setOnClickListener(this);
        findViewById(R.id.fem).setOnClickListener(this);
        findViewById(R.id.rotor).setOnClickListener(this);
        findViewById(R.id.mis).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("PE: 7th Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
//            Compulsory
            case R.id.ppo:
                intent.putExtra("Subject", "PPO").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.rer:
                intent.putExtra("Subject", "RER").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.pppe:
                intent.putExtra("Subject", "PPPE").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.psps:
                intent.putExtra("Subject", "PSPS").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;

            case R.id.sga_ojt:
                intent.putExtra("Subject", "SGA-OJT").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.sta_ojt:
                intent.putExtra("Subject", "STA-OJT").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.pp_ojt:
                intent.putExtra("Subject", "PP-OJT").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.pspsLab:
                intent.putExtra("Subject", "PSPSLab").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
//            E_A
            case R.id.tom:
                intent.putExtra("Subject", "ToM").putExtra("Sem", "PE7").putExtra("Book", Urls.theoryOfMachinesBook);
                break;
            case R.id.ppm:
                intent.putExtra("Subject", "PPM").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.bpp:
                intent.putExtra("Subject", "BPP").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.pmcm:
                intent.putExtra("Subject", "PMCM").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.ncmp:
                intent.putExtra("Subject", "NCMP").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.dbms:
                intent.putExtra("Subject", "DBMS").putExtra("Sem", "CE7").putExtra("Book", Urls.dbmsBook);
                break;
//            E_B
            case R.id.mie:
                intent.putExtra("Subject", "MIE").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.commEng:
                intent.putExtra("Subject", "CommEng").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.ita:
                intent.putExtra("Subject", "ITA").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.fem:
                intent.putExtra("Subject", "FEM").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.rotor:
                intent.putExtra("Subject", "Rotor").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
            case R.id.mis:
                intent.putExtra("Subject", "MIS").putExtra("Sem", "PE7").putExtra("Book", "");
                break;
//            Common to all
            case R.id.sociology:
                intent.putExtra("Subject", "Sociology").putExtra("Sem", "7").putExtra("Book", "");
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}