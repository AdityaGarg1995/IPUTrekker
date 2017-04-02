package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;


public class SEM6_PE extends AppCompatActivity implements View.OnClickListener{

//    Button[] buttons = new Button[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe6);

        findViewById(R.id.load).setOnClickListener(this);
        findViewById(R.id.ppc).setOnClickListener(this);
        findViewById(R.id.ppci).setOnClickListener(this);
        findViewById(R.id.pstd).setOnClickListener(this);

        findViewById(R.id.ic).setOnClickListener(this);
        findViewById(R.id.peed).setOnClickListener(this);
        findViewById(R.id.md).setOnClickListener(this);
        findViewById(R.id.emft).setOnClickListener(this);

        findViewById(R.id.sta_ojt).setOnClickListener(this);
        findViewById(R.id.sga_ojt).setOnClickListener(this);
        findViewById(R.id.pp_ojt).setOnClickListener(this);

        findViewById(R.id.icLab).setOnClickListener(this);
        findViewById(R.id.peedLab).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("PE: 6th Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.load:
                intent.putExtra("Subject", "Load").putExtra("Book", "");
                break;
            case R.id.ppc:
                intent.putExtra("Subject", "PPC").putExtra("Book", "");
                break;
            case R.id.ppci:
                intent.putExtra("Subject", "PPCI").putExtra("Book", "");
                break;
            case R.id.pstd:
                intent.putExtra("Subject", "PSTD").putExtra("Book", "");
                break;

            case R.id.ic:
                intent.putExtra("Subject", "IC").putExtra("Book", "");
                break;
            case R.id.peed:
                intent.putExtra("Subject", "PEED").putExtra("Book", "");
                break;
            case R.id.md:
                intent.putExtra("Subject", "MD").putExtra("Book", "");
                break;
            case R.id.emft: ;
                intent.putExtra("Subject", "EMFT").putExtra("Book", "");
                break;

            case R.id.sta_ojt:
                intent.putExtra("Subject", "STA-OJT").putExtra("Book", "NA");
                break;
            case R.id.sga_ojt:
                intent.putExtra("Subject", "SGA-OJT").putExtra("Book", "NA");
                break;
            case R.id.pp_ojt:
                intent.putExtra("Subject", "PP-OJT").putExtra("Book", "NA");
                break;
            case R.id.icLab:
                intent.putExtra("Subject", "ICLab").putExtra("Book", "");
                break;
            case R.id.peedLab: ;
                intent.putExtra("Subject", "PEEDLab").putExtra("Book", "");
                break;
        }

        try {
            intent.putExtra("Sem", "PE6").putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null) {
                startActivity(intent);
            }
        } catch (Exception e){e.printStackTrace();}
    }
}