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

public class IT6 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;
    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it6);


        stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 6th Semester Subjects");
//        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        findViewById(R.id.ai).setOnClickListener(this);
        findViewById(R.id.cd).setOnClickListener(this);
        findViewById(R.id.micro).setOnClickListener(this);
        findViewById(R.id.microLab).setOnClickListener(this);
        findViewById(R.id.os).setOnClickListener(this);
        findViewById(R.id.osLab).setOnClickListener(this);
        findViewById(R.id.web).setOnClickListener(this);
        findViewById(R.id.webLab).setOnClickListener(this);


        Button dcn =  (Button) findViewById(R.id.dcn),
               dcnLab = (Button) findViewById(R.id.dcnLab);

        dcn.setOnClickListener(this);
        dcnLab.setOnClickListener(this);


        if(stream.equals("CSE")){
            dcn.setText("Computer Networks");
            dcnLab.setText("Computer Networks Lab");
        }


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.ai:       i = new Intent(this,Syllabus.class).putExtra("Subject","AI")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Artificial Intelligence");
                break;

            case R.id.cd:       i = new Intent(this,Syllabus.class).putExtra("Subject","CD")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Compiler Design");
                break;


            case R.id.dcn:

                if(stream.equals("IT"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","DCN")
                                                      .putExtra("Sem","6")
                                                      .putExtra("SubjectName","Data Communication & Networks");

                else if(stream.equals("CSE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","CN")
                                                       .putExtra("Sem","6")
                                                       .putExtra("SubjectName","Computer Networks");

                break;


            case R.id.dcnLab:

                if(stream.equals("IT"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","DCNLab")
                                                      .putExtra("Sem","6")
                                                      .putExtra("SubjectName","Data Communication & Networks Lab");

                else if(stream.equals("CSE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","DCN")
                                                       .putExtra("Sem","6")
                                                       .putExtra("SubjectName","Data Communication & Networks ");

                break;

            case R.id.micro:    i = new Intent(this,Syllabus.class).putExtra("Subject","Micro")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Microprocessors & Microcontrollers");
                break;

            case R.id.microLab: i = new Intent(this,Syllabus.class).putExtra("Subject","MicroLab")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Microprocessors & Microcontrollers Lab");
                break;

            case R.id.os:       i = new Intent(this,Syllabus.class).putExtra("Subject","OS")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Operating Systems");
                break;

            case R.id.osLab:    i = new Intent(this,Syllabus.class).putExtra("Subject","OSLab")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Operating Systems Lab");
                break;

            case R.id.web:      i = new Intent(this,Syllabus.class).putExtra("Subject","Web")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName","Web Engineering");
                break;

            case R.id.webLab:   i = new Intent(this,Syllabus.class).putExtra("Subject","WebLab")
                                                                   .putExtra("Sem","6")
                                                                   .putExtra("SubjectName", "Web Engineering Lab");
                break;

        }

        if(i != null)
            startActivity(i);

    }
}
