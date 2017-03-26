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


public class SEM7_ENE extends AppCompatActivity implements View.OnClickListener {
//   3 2 3 4
    Intent intent;
    Activity a  = this;
    String stream = "";

    Button buttons[] = new Button[13];

    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ene7);

        buttons[0] = (Button)findViewById(R.id.b1);
        buttons[1] = (Button)findViewById(R.id.b2);
        buttons[2] = (Button)findViewById(R.id.b3);
        buttons[3] = (Button)findViewById(R.id.b4);
        buttons[4] = (Button)findViewById(R.id.b5);
        buttons[5] = (Button)findViewById(R.id.b6);
        buttons[6] = (Button)findViewById(R.id.b7);
        buttons[7] = (Button)findViewById(R.id.b8);
        buttons[8] = (Button)findViewById(R.id.b9);
        buttons[9] = (Button)findViewById(R.id.b10);
        buttons[10] = (Button)findViewById(R.id.b11);
        buttons[11] = (Button)findViewById(R.id.b12);
        buttons[12] = (Button)findViewById(R.id.b13);

        mSubjectQuadruplet = new SubjectQuadruplet[13];

        mSubjectQuadruplet[0] = new SubjectQuadruplet("BHE", "CE7", "Biomedical, Hazardous & E-waste management", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("EIA", "CE7", "EIA & EMS", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("GIS-ENE", "CE7", "Applications of Remote Sensing & GIS", "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("GISLab-ENE", "CE7", "Applications of Remote Sensing & GIS Lab", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("EIALab", "CE7", "EIA & EMS Lab", "");

        mSubjectQuadruplet[5] = new SubjectQuadruplet("WRSP", "CE7", "Water Resource System Planning", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("SES", "CE7", "Sustainable Energy Systems", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("ASP", "CE7", "Advance Separation Process", "");

        mSubjectQuadruplet[8] = new SubjectQuadruplet("DA", "CE7", "Data Analytics", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("DCN", "CE7", "Data Communication & Networks", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("DBMS", "CE7", "Database Management Systems", "");
        mSubjectQuadruplet[11] = new SubjectQuadruplet("Green", "CE7", "Planning and Design of Green Buildings", "");
        mSubjectQuadruplet[12] = new SubjectQuadruplet("Sociology", "7", "Sociology and Elements of Indian History for Engineers", "");

        Activity a = this;
        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 7th Semester Subjects");

        for(int i = 0;i < 13; i++){
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

    }
    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for(int i = 0; i < 13; i++)
           if(v == buttons[i])
               intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                     .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                     .putExtra("Book", mSubjectQuadruplet[i].getBook());
        try{
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if(intent!=null)
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}
    }
}

