package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.StreamNames;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM7_ICE extends AppCompatActivity implements View.OnClickListener{

    Button buttons[] = new Button[18];
    Intent intent;

    Activity a = this;
    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice7);

        buttons[0] = (Button) findViewById(R.id.b1);
        buttons[1] = (Button) findViewById(R.id.b2);
        buttons[2] = (Button) findViewById(R.id.b3);

        buttons[3] = (Button) findViewById(R.id.b4);
        buttons[4] = (Button) findViewById(R.id.b5);

        buttons[5] = (Button) findViewById(R.id.b6);
        buttons[6] = (Button) findViewById(R.id.b7);
        buttons[7] = (Button) findViewById(R.id.b8);
        buttons[8] = (Button) findViewById(R.id.b9);
        buttons[9] = (Button) findViewById(R.id.b10);
        buttons[10] = (Button) findViewById(R.id.b11);
        buttons[11] = (Button) findViewById(R.id.b12);
        buttons[12] = (Button) findViewById(R.id.b13);

        buttons[13] = (Button) findViewById(R.id.b14);
        buttons[14] = (Button) findViewById(R.id.b15);
        buttons[15] = (Button) findViewById(R.id.b16);
        buttons[16] = (Button) findViewById(R.id.b17);
        buttons[17] = (Button) findViewById(R.id.b18);

        mSubjectQuadruplet = new SubjectQuadruplet[18];

        mSubjectQuadruplet[0] = new SubjectQuadruplet("DCS", "ICE7", "Digital Control Systems", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("BMI", "ECE7", "Biomedical Instrumentation", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("ANN", "ICE7", "Artificial Neural Networks", "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("DCSLab", "ICE7", "Digital Control Systems Lab", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("BMILab", "ECE7", "Biomedical Instrumentation Lab", "");

        mSubjectQuadruplet[5] = new SubjectQuadruplet("IAC", "ICE7", "Industrial Automation & Control", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("Mecha", "EE7", "Mechatronics", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("ED", "EE7", "Electrical Drives", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("ID", "ICE7", "Instrumentation Diagnostics", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("PMOT", "MT7", "Process Modeling & Optimization Techniques", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("DBMS", "CE7", "Database Management Systems", Urls.dbmsBook);
        mSubjectQuadruplet[11] = new SubjectQuadruplet("RER", "PE7", "Renewable Energy Resources", "");
        mSubjectQuadruplet[12] = new SubjectQuadruplet("TopicsICE", "ICE7", "Selected Topics in ICE", "");

        mSubjectQuadruplet[13] = new SubjectQuadruplet("Materials", "ICE7", "Engineering Materials", "");
        mSubjectQuadruplet[14] = new SubjectQuadruplet("CA", "ICE7", "", "");
        mSubjectQuadruplet[15] = new SubjectQuadruplet("SE-ICE", "ICE7", "", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("OS-ICE", "ICE7", "", "");
        mSubjectQuadruplet[17] = new SubjectQuadruplet("Sociology", "7", StreamNames.sociology, Urls.sociologyBook);

        a.setTitle("ICE: 7th Semester Syllabus");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        for (int i = 0; i < 18; i++){
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 18; i++)
            if(v == buttons[i])
               intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                    .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                    .putExtra("Book", mSubjectQuadruplet[i].getBook());
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e) { e.printStackTrace(); }
    }
}