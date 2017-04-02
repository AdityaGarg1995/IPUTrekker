package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM2Syllabus extends AppCompatActivity  implements View.OnClickListener {

    Activity a = this;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);

        findViewById(R.id.am_ii).setOnClickListener(this);
        findViewById(R.id.ap_ii).setOnClickListener(this);
        findViewById(R.id.ap_iiLab).setOnClickListener(this);
        findViewById(R.id.ed).setOnClickListener(this);
        findViewById(R.id.edLab).setOnClickListener(this);
        findViewById(R.id.em).setOnClickListener(this);
        findViewById(R.id.emLab).setOnClickListener(this);
        findViewById(R.id.evs).setOnClickListener(this);
        findViewById(R.id.evsLab).setOnClickListener(this);
        findViewById(R.id.itp).setOnClickListener(this);
        findViewById(R.id.itpLab).setOnClickListener(this);
        findViewById(R.id.skills_i).setOnClickListener(this);

        a.setTitle("2nd Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        i = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.am_ii: i.putExtra("Subject", "AM-II").putExtra("Book", Urls.amBook);
                break;

            case R.id.ap_ii: i.putExtra("Subject", "AP-II").putExtra("Book", Urls.ap_iBook);
                break;
            case R.id.ap_iiLab: i.putExtra("Subject", "APLab-II").putExtra("Book", Urls.ap_iBook);
                break;

            case R.id.ed: i.putExtra("Subject", "ED").putExtra("Book", "https://archive.org/details/ElectronicDevicesCircuits");
                break;
            case R.id.edLab: i.putExtra("Subject", "EDLab").putExtra("Book", "https://archive.org/details/ElectronicDevicesCircuits");
                break;

            case R.id.em: i.putExtra("Subject", "EM").putExtra("Book", "scilab.in/textbook_companion/generate_book/3204");
                break;
            case R.id.emLab: i.putExtra("Subject", "EMLab").putExtra("Book", "scilab.in/textbook_companion/generate_book/3204");
                break;

            case R.id.evs: i.putExtra("Subject", "EVS").putExtra("Book", "http://mft.info/core/uploads/sites/32/2016/04/ENVIRONMENTAL-SCIENCE.pdf");
                break;
            case R.id.evsLab: i.putExtra("Subject", "EVSLab").putExtra("Book", "dst.gov.in/green-chem.pdf");
                break;

            case R.id.itp: i.putExtra("Subject", "ITP").putExtra("Book", "http://www.codeblocks.org/");
                break;
            case R.id.itpLab: i.putExtra("Subject", "ITPLab").putExtra("Book", "http://www.codeblocks.org/");
                break;

            case R.id.skills_i: i.putExtra("Subject", "Skills-I").putExtra("Book", "http://www.eiilmuniversity.co.in/downloads/Communication_Principles.pdf");
                break;
        }
        try {
            i.putExtra("Sem", "2").putExtra("SubjectName", ((Button)v).getText().toString());
            if(i != null)
              startActivity(i);
        }catch (Exception e){e.printStackTrace();}
    }
}