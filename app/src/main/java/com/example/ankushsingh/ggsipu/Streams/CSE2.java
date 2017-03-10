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


public class CSE2 extends AppCompatActivity  implements View.OnClickListener {


    Activity a = this;
    Intent i;

    public static final String cseResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/027_CSE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/027_CSE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/027_CSE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/027_CSE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/027_CSE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/027_CSE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/027_CSE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/027_CSE_8_SEM.pdf"
    };


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
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AM-II")
                                                    .putExtra("Sem", "2")
                                                    .putExtra("SubjectName", "Applied Mathematics-II");
                break;

            case R.id.ap_ii:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "AP-II")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Applied Physics-II");
                break;

            case R.id.ap_iiLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "APLab-II")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Applied Mathematics-II Lab");
                break;

            case R.id.ed:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ED")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Electronic Devices");
                break;

            case R.id.edLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EDLab")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Electronic Devices Lab");
                break;

            case R.id.em:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EM")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Engineering Mechanics");
                break;

            case R.id.emLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EMLab")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Engineering mechanics Lab");
                break;

            case R.id.evs:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EVS")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Environmental Studies");
                break;

            case R.id.evsLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "EVSLab")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Environmental Studies Lab");
                break;

            case R.id.itp:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ITP")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Introduction to Programming");
                break;

            case R.id.itpLab:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "ITPLab")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Introduction to Programming Lab");
                break;

            case R.id.skills_i:
                i = new Intent(this, Syllabus.class).putExtra("Subject", "Skills-I")
                        .putExtra("Sem", "2")
                        .putExtra("SubjectName", "Communication Skills");
                break;

        }

//        if(!url.equals("") && (intent != null)) {
//            intent.setData(Uri.parse(url));
            startActivity(i);
//        }
    }


}
