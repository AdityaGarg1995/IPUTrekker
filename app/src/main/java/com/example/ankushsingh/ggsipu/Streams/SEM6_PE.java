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
                intent.putExtra("Subject", "Load");
                break;
            case R.id.ppc:
                intent.putExtra("Subject", "PPC");
                break;
            case R.id.ppci:
                intent.putExtra("Subject", "PPCI");
                break;
            case R.id.pstd:
                intent.putExtra("Subject", "PSTD");
                break;

            case R.id.ic:
                intent.putExtra("Subject", "IC");
                break;
            case R.id.peed:
                intent.putExtra("Subject", "PEED");
                break;
            case R.id.md:
                intent.putExtra("Subject", "MD");
                break;
            case R.id.emft: ;
                intent.putExtra("Subject", "EMFT");
                break;

            case R.id.sta_ojt:
                intent.putExtra("Subject", "STA-OJT");
                break;
            case R.id.sga_ojt:
                intent.putExtra("Subject", "SGA-OJT");
                break;
            case R.id.pp_ojt:
                intent.putExtra("Subject", "PP-OJT");
                break;
            case R.id.icLab:
                intent.putExtra("Subject", "ICLab");
                break;
            case R.id.peedLab: ;
                intent.putExtra("Subject", "PEEDLab");
                break;
        }

        try {
            intent.putExtra("Sem", "PE6").putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null) {
                startActivity(intent);
            }
        }
        catch (Exception e){e.printStackTrace();}
    }
}
