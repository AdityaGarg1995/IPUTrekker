package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class SEM1Syllabus extends AppCompatActivity implements View.OnClickListener {

    Button button[] = new Button[13];


   Activity a = this;
   Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);

        findViewById(R.id.am_i).setOnClickListener(this);
        findViewById(R.id.ap_i).setOnClickListener(this);
        findViewById(R.id.ap_iLab).setOnClickListener(this);
        findViewById(R.id.chem).setOnClickListener(this);
        findViewById(R.id.chemLab).setOnClickListener(this);
        findViewById(R.id.egLab).setOnClickListener(this);
        findViewById(R.id.et).setOnClickListener(this);
        findViewById(R.id.etLab).setOnClickListener(this);
        findViewById(R.id.foc).setOnClickListener(this);
        findViewById(R.id.focLab).setOnClickListener(this);
        findViewById(R.id.hvpe_i).setOnClickListener(this);
        findViewById(R.id.mp).setOnClickListener(this);
        findViewById(R.id.mpLab).setOnClickListener(this);

        a.setTitle("1st Semester Subjects");
    }

    @Override
    public void onClick(View v) {
        i = new Intent(this, Syllabus.class);
        switch (v.getId()){

            case R.id.am_i:
               i.putExtra("Subject", "AM-I").putExtra("Book", Urls.amBook);
                break;

            case R.id.ap_i:
                i.putExtra("Subject", "AP-I").putExtra("Book", Urls.ap_iBook);
                break;
            case R.id.ap_iLab:
                i.putExtra("Subject", "APLab-I").putExtra("Book", Urls.ap_iBook);
                break;

            case R.id.chem:
                i.putExtra("Subject", "Chem").putExtra("Book", Urls.chemBook);
                break;
            case R.id.chemLab:
                i.putExtra("Subject", "ChemLab").putExtra("Book", Urls.chemBook);
                break;

            case R.id.egLab:
                i.putExtra("Subject", "EGLab").putExtra("Book", "http://bit.ly/2biUxCC");
                break;

            case R.id.et:
                i.putExtra("Subject", "ET").putExtra("Book", "");
                break;
            case R.id.etLab:
                i.putExtra("Subject", "ETLab").putExtra("Book", "");
                break;

            case R.id.foc:
                i.putExtra("Subject", "FoC").putExtra("Book", "http://www.openoffice.org/why/");
                break;
            case R.id.focLab:
                i.putExtra("Subject", "FoCLab").putExtra("Book", "http://projects.gnome.org/dia/");
                break;

            case R.id.hvpe_i:
                i.putExtra("Subject", "HVPE").putExtra("Book", "http.//www.universalhumanvalues.info");
                break;

            case R.id.mp:
                i.putExtra("Subject", "MP").putExtra("Book", Urls.mpBook);
                break;
            case R.id.mpLab:
                i.putExtra("Subject", "MPLab").putExtra("Book", Urls.mpBook);
                break;
        }
        try {
            i.putExtra("Sem", "1").putExtra("SubjectName", ((Button)v).getText().toString());
            if (i !=null)
               startActivity(i);
        }catch (Exception e){e.printStackTrace();}
    }
}