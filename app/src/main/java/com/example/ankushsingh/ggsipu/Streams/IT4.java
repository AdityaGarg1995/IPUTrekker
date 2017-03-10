package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;


//4th sem
public class IT4 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;
    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4);


        stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 4th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        findViewById(R.id.am_iv).setOnClickListener(this);
        findViewById(R.id.amLab).setOnClickListener(this);
        findViewById(R.id.coa).setOnClickListener(this);
        findViewById(R.id.coaLab).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);
        findViewById(R.id.dbmsLab).setOnClickListener(this);
        findViewById(R.id.oops).setOnClickListener(this);
        findViewById(R.id.oopsLab).setOnClickListener(this);
        findViewById(R.id.toc).setOnClickListener(this);


        Button control = (Button)findViewById(R.id.control);
        control.setOnClickListener(this);

        Button csLab = (Button)findViewById(R.id.csLab);
        csLab.setOnClickListener(this);


        if(stream.equals("CSE")){
            control.setText("Communictaion Systems");
            csLab.setText("Communictaion Systems Lab");
        }

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.am_iv:   i = new Intent(this,Syllabus.class).putExtra("Subject","AM-IV")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Applied Mathematics-IV");
                break;

            case R.id.amLab:   i = new Intent(this,Syllabus.class).putExtra("Subject","AMLab")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Applied Mathematics Lab");
                break;

            case R.id.coa:     i = new Intent(this,Syllabus.class).putExtra("Subject","COA")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Computer Organisation & Architecture");
                break;

            case R.id.coaLab:  i = new Intent(this,Syllabus.class).putExtra("Subject","COALab")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Computer Organisation & Architecture Lab");
                break;

            case R.id.dbms:    i = new Intent(this,Syllabus.class).putExtra("Subject","DBMS")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Database Management Systems");
                break;

            case R.id.dbmsLab: i = new Intent(this,Syllabus.class).putExtra("Subject","DBMSLab")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Database Management Systems Lab");
                break;

            //  Control/Comm Systems
            case R.id.control:

                if(stream.equals("IT"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","Control")
                                                      .putExtra("Sem","4")
                                                      .putExtra("SubjectName","Control Systems");

                else if(stream.equals("CSE"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","Comm")
                                                      .putExtra("Sem","4")
                                                      .putExtra("SubjectName","Communication Systems");

                break;

            case R.id.csLab:

                if(stream.equals("IT"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","CSLab")
                                                       .putExtra("Sem","4")
                                                       .putExtra("SubjectName","Control Systems Lab");

                else if(stream.equals("CSE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","CommLab")
                                                       .putExtra("Sem","4")
                                                       .putExtra("SubjectName","Communication Systems Lab");

                break;

            case R.id.oops:    i = new Intent(this,Syllabus.class).putExtra("Subject","OOPS")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Object Oriented Programming");
                break;

            case R.id.oopsLab: i = new Intent(this,Syllabus.class).putExtra("Subject","OOPSLab")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName", "Object Oriented Programming Lab");
                break;

            case R.id.toc:     i = new Intent(this,Syllabus.class).putExtra("Subject","TOC")
                                                                  .putExtra("Sem","4")
                                                                  .putExtra("SubjectName","Theory of Computation");
                break;

        }

        if(i != null)
            startActivity(i);

    }
}
