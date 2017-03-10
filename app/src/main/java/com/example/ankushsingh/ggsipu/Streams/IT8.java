package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;

public class IT8 extends AppCompatActivity implements View.OnClickListener {


    Intent i;
    Activity a = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it8);

        a.setTitle("IT: 8th Semester Subjects");
//        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        findViewById(R.id.adHoc).setOnClickListener(this);
        findViewById(R.id.adHocLab).setOnClickListener(this);
        findViewById(R.id.mc).setOnClickListener(this);
        findViewById(R.id.mcLab).setOnClickListener(this);
        findViewById(R.id.hvpe_ii).setOnClickListener(this);


        findViewById(R.id.net).setOnClickListener(this);
        findViewById(R.id.bigData).setOnClickListener(this);
        findViewById(R.id.ds).setOnClickListener(this);
        findViewById(R.id.ecom).setOnClickListener(this);
        findViewById(R.id.gps).setOnClickListener(this);
        findViewById(R.id.hci).setOnClickListener(this);
        findViewById(R.id.infoTheory).setOnClickListener(this);
        findViewById(R.id.nextGen).setOnClickListener(this);
        findViewById(R.id.satComm).setOnClickListener(this);
        findViewById(R.id.social).setOnClickListener(this);
        findViewById(R.id.soft).setOnClickListener(this);
        findViewById(R.id.trends).setOnClickListener(this);
        findViewById(R.id.vlsi).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.adHoc: i = new Intent(this,Syllabus.class).putExtra("Subject","AdHoc")
                                                                .putExtra("Sem","8")
                                                                .putExtra("SubjectName","AdHoc & Sensor Networks");
                break;

            case R.id.adHocLab: i = new Intent(this,Syllabus.class).putExtra("Subject","AdHocLab")
                                                                   .putExtra("Sem","8")
                                                                   .putExtra("SubjectName","AdHoc & Sensor Networks Lab");
                break;

            case R.id.mc: i = new Intent(this,Syllabus.class).putExtra("Subject","MC")
                                                             .putExtra("Sem","8")
                                                             .putExtra("SubjectName","Mobile Computing");
                break;

            case R.id.mcLab: i = new Intent(this,Syllabus.class).putExtra("Subject","MCLab")
                                                                .putExtra("Sem","8")
                                                                .putExtra("SubjectName","Mobile Computing Lab");
                break;

            case R.id.hvpe_ii: i = new Intent(this,Syllabus.class).putExtra("Subject","HVPE-II")
                                                                  .putExtra("Sem","8")
                                                                  .putExtra("SubjectName","Human Values & Professional Ethics-II");
                break;



            case R.id.net: i = new Intent(this,Syllabus.class).putExtra("Subject",".NET")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Web Application Development using .NET");
                break;

            case R.id.bigData: i = new Intent(this,Syllabus.class).putExtra("Subject","BigData")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Big Data Analytics");
                break;

            case R.id.dip: i = new Intent(this,Syllabus.class).putExtra("Subject","DIP")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Digital Image Processing");
                break;

            case R.id.ds: i = new Intent(this,Syllabus.class).putExtra("Subject","Distributed")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Distributed Systems");
                break;

            case R.id.ecom: i = new Intent(this,Syllabus.class).putExtra("Subject","Ecom")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","E-Commerce & M-Commerce");
                break;

            case R.id.gps: i = new Intent(this,Syllabus.class).putExtra("Subject","GPS")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","GPS & GIS");
                break;

            case R.id.infoTheory: i = new Intent(this,Syllabus.class).putExtra("Subject","InfoTheory")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Information Theory & Coding");
                break;

            case R.id.nextGen: i = new Intent(this,Syllabus.class).putExtra("Subject","NextGen")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Next Generation Networks");
                break;

            case R.id.soft: i = new Intent(this,Syllabus.class).putExtra("Subject","Soft")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Soft Computing");
                break;

            case R.id.social: i = new Intent(this,Syllabus.class).putExtra("Subject","SocialNetwork")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Social Network Analysis");
                break;

            case R.id.satComm: i = new Intent(this,Syllabus.class).putExtra("Subject","SatComm")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Satellite Communication");
                break;

            case R.id.trends: i = new Intent(this,Syllabus.class).putExtra("Subject","TrendsInIT")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","Selected Topics of Recent Trends in IT");
                break;

            case R.id.vlsi: i = new Intent(this,Syllabus.class).putExtra("Subject","VLSI")
                    .putExtra("Sem","8")
                    .putExtra("SubjectName","VLSI Design");
                break;


        }

        startActivity(i);

    }


}
