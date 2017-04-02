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

public class SEM7_CE extends AppCompatActivity implements View.OnClickListener {
//    CE7
//    3 2 4 5
//    Button[] buttons = new Button[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil7);

        findViewById(R.id.eco).setOnClickListener(this);
        findViewById(R.id.ie).setOnClickListener(this);
        findViewById(R.id.te_ii).setOnClickListener(this);

        findViewById(R.id.ied).setOnClickListener(this);
        findViewById(R.id.ecoLab).setOnClickListener(this);

        findViewById(R.id.wrsp).setOnClickListener(this);
        findViewById(R.id.earthquake).setOnClickListener(this);
        findViewById(R.id.grs).setOnClickListener(this);
        findViewById(R.id.srr).setOnClickListener(this);

        findViewById(R.id.da).setOnClickListener(this);
        findViewById(R.id.green).setOnClickListener(this);
        findViewById(R.id.dcn).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("CE: 7th Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.eco:
                intent.putExtra("Subject", "Economics").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.ie:
                intent.putExtra("Subject", "Irrigation").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.te_ii:
                intent.putExtra("Subject", "TE-II").putExtra("Sem", "CE7").putExtra("Book", "");
                break;

            case R.id.ied:
                intent.putExtra("Subject", "IrrigationLab").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.ecoLab:
                intent.putExtra("Subject", "EconomicsLab").putExtra("Sem", "CE7").putExtra("Book", "");
                break;

//            E_A
            case R.id.wrsp:
                intent.putExtra("Subject", "WRSP").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.earthquake:
                intent.putExtra("Subject", "Earthquake").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.grs:
                intent.putExtra("Subject", "GRS").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.srr:
                intent.putExtra("Subject", "SRR").putExtra("Sem", "CE7").putExtra("Book", "http://cpwd.gov.in/Units/handbook.pdf");
                break;

//            E_B
            case R.id.dcn:
                intent.putExtra("Subject", "DCN").putExtra("Sem", "CE7").putExtra("Book", Urls.dcnBook);
                break;
            case R.id.green:
                intent.putExtra("Subject", "Green").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.da:
                intent.putExtra("Subject", "DA").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.sociology:
                intent.putExtra("Subject", "Sociology").putExtra("Sem", "7").putExtra("Book", "");
                break;
            case R.id.dbms:
                intent.putExtra("Subject", "DBMS").putExtra("Sem", "CE7").putExtra("Book", Urls.dbmsBook);
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if ((intent != null))
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}