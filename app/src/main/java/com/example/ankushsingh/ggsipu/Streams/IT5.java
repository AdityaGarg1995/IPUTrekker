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



public class IT5 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;
    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it5);

        stream = getIntent().getStringExtra("Stream");


        a.setTitle(stream + ": 5th Semester Subjects");
        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        findViewById(R.id.ada).setOnClickListener(this);
        findViewById(R.id.adaLab).setOnClickListener(this);
        findViewById(R.id.im).setOnClickListener(this);
        findViewById(R.id.java).setOnClickListener(this);
        findViewById(R.id.javaLab).setOnClickListener(this);
        findViewById(R.id.se).setOnClickListener(this);
        findViewById(R.id.seLab).setOnClickListener(this);
        findViewById(R.id.skills).setOnClickListener(this);
        findViewById(R.id.skillsLab).setOnClickListener(this);


        Button comm = (Button) findViewById(R.id.comm);
        comm.setOnClickListener(this);

        Button commLab = (Button) findViewById(R.id.commLab);
        commLab.setOnClickListener(this);


        if(stream.equals("CSE")){
            comm.setText("Digital Communication");
            commLab.setText("Digital Communication Lab");
        }

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.ada:       i = new Intent(this,Syllabus.class).putExtra("Subject","ADA")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Algorithms Design & Analysis");
                break;

            case R.id.adaLab:    i = new Intent(this,Syllabus.class).putExtra("Subject","ADALab")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Algorithms Design & Analysis Lab");
                break;


            case R.id.comm:

                if(stream.equals("IT"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","CommSys")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Communication Systems");
                else if(stream.equals("CSE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","DigiComm")
                                                       .putExtra("Sem","5")
                                                       .putExtra("SubjectName","Digital Communication");
                break;


            case R.id.commLab:

                if(stream.equals("IT"))
                   i = new Intent(this,Syllabus.class).putExtra("Subject","CommSysLab")
                                                      .putExtra("Sem","5")
                                                      .putExtra("SubjectName","Communication Systems Lab");

                else if(stream.equals("CSE") || stream.equals("ECE"))
                    i = new Intent(this,Syllabus.class).putExtra("Subject","DigiCommLab")
                                                       .putExtra("Sem","5")
                                                       .putExtra("SubjectName","Digital Communication Lab");
                break;


            case R.id.im:        i = new Intent(this,Syllabus.class).putExtra("Subject","IM")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Industrial Management");
                break;

            case R.id.se:        i = new Intent(this,Syllabus.class).putExtra("Subject","SE")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Software Engineering");
                break;

            case R.id.seLab:     i = new Intent(this,Syllabus.class).putExtra("Subject","SELab")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Software Engineering Lab");
                break;

            case R.id.java:      i = new Intent(this,Syllabus.class).putExtra("Subject","JAVA")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Java Programming");
                break;

            case R.id.javaLab:   i = new Intent(this,Syllabus.class).putExtra("Subject","JAVALab")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Java Programming Lab");
                break;

            case R.id.skills:    i = new Intent(this,Syllabus.class).putExtra("Subject","Skills")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName", "Communication Skills for Professionals");
                break;

            case R.id.skillsLab: i = new Intent(this,Syllabus.class).putExtra("Subject","SkillsLab")
                                                                    .putExtra("Sem","5")
                                                                    .putExtra("SubjectName","Communication Skills for Professionals Lab");
                break;

        }

        if(i != null)
            startActivity(i);

    }
}
