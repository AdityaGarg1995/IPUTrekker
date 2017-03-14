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

public class CIVIL2 extends AppCompatActivity implements View.OnClickListener {

//    Button button1,button2,button3,button4,button5,button6,button7,button8;


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

        switch (v.getId()){

            case R.id.am_i:
               i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-I")
                                                   .putExtra("Sem", "1")
                                                   .putExtra("SubjectName", "Applied Mathematics-I");
                break;

            case R.id.ap_i:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AP-I")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Applied Physics-I");
                break;

            case R.id.ap_iLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "APLab-I")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Applied Physics-I Lab");
                break;

            case R.id.chem:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "Chem")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Chemistry");
                break;

            case R.id.chemLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ChemLab")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Chemistry Lab");
                break;

            case R.id.egLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EGLab")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Engineering Graphics Lab");
                break;

            case R.id.et:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ET")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Electricsl Technology");
                break;

            case R.id.etLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ETLab")
                                                    .putExtra("Sem", "1")
                                                    .putExtra("SubjectName", "Electrical Technology Lab");
                break;

            case R.id.foc: i = new Intent(this, Syllabus.class).putExtra("Subject", "FoC")
                                                               .putExtra("Sem", "1")
                                                               .putExtra("SubjectName", "Fundamentals of Computing");
                break;

            case R.id.focLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "FoCLab")
                                                                  .putExtra("Sem", "1")
                                                                  .putExtra("SubjectName", "Fundamental of Computing Lab");
                break;

            case R.id.hvpe_i: i = new Intent(this, Syllabus.class).putExtra("Subject", "HVPE")
                    .putExtra("Sem", "1")
                    .putExtra("SubjectName", "Human Values and Professional Ethics");
                break;

            case R.id.mp: i = new Intent(this, Syllabus.class).putExtra("Subject", "MP")
                    .putExtra("Sem", "1")
                    .putExtra("SubjectName", "Manufacturing Processes");
                break;

            case R.id.mpLab: i = new Intent(this, Syllabus.class).putExtra("Subject", "MPLab")
                    .putExtra("Sem", "1")
                    .putExtra("SubjectName", "Manufacturing Processes Lab");
                break;

        }

//        if(!url.equals("") && (intent != null)) {
//            intent.setData(Uri.parse(url));
            startActivity(i);
//        }

    }

}