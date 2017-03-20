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

        switch (v.getId()){

            case R.id.am_ii:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-II");
                break;
            case R.id.ap_ii:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AP-II");
                break;
            case R.id.ap_iiLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "APLab-II");
                break;
            case R.id.ed:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ED");
                break;
            case R.id.edLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EDLab");
                break;
            case R.id.em:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EM");
                break;
            case R.id.emLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab");
                break;
            case R.id.evs:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EVS");
                break;
            case R.id.evsLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EVSLab");
                break;
            case R.id.itp:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ITP");
                break;
            case R.id.itpLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ITPLab");
                break;
            case R.id.skills_i:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "Skills-I");
                break;
        }
        try {
            i.putExtra("Sem", "2").putExtra("SubjectName", ((Button)v).getText().toString());
            startActivity(i);
        }catch (Exception e){e.printStackTrace();}

    }


}
