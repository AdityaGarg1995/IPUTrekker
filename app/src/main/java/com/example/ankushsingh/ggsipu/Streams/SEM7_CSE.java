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

public class SEM7_CSE extends AppCompatActivity implements View.OnClickListener {

//    3 3 6 7
//    Button button1,button2,button3,button4;
    Intent intent;

    Activity a = this;

    String sem;

    Button cTSub[] = new Button[3],
           cPSub[] = new Button[3],
           ea[]    = new Button[6],
           eb[]    = new Button[7];


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse7);

//        Compulsory 7sem
        cTSub[0] = (Button)findViewById(R.id.is);
        cTSub[1] = (Button)findViewById(R.id.stqa);
        cTSub[2] = (Button)findViewById(R.id.wc);

        cPSub[0] = (Button)findViewById(R.id.isLab);
        cPSub[1] = (Button)findViewById(R.id.stqaLab);
        cPSub[2] = (Button)findViewById(R.id.wcLab);

//        Electives-A 7sem
        ea[0] = (Button)findViewById(R.id.ct);
        ea[1] = (Button)findViewById(R.id.ipr);
        ea[2] = (Button)findViewById(R.id.dmbi);
        ea[3] = (Button)findViewById(R.id.embed);
        ea[4] = (Button)findViewById(R.id.aca);
        ea[5] = (Button)findViewById(R.id.nlp);
//        ea[6] = (Button)findViewById(R.id.s1);
//        ea[7] = (Button)findViewById(R.id.s2);
//        ea[8] = (Button)findViewById(R.id.s3);

//        Elective-B 7sem
        eb[0] = (Button)findViewById(R.id.sociology);
        eb[1] = (Button)findViewById(R.id.dsp);
        eb[2] = (Button)findViewById(R.id.snm);
        eb[3] = (Button)findViewById(R.id.adbms);
        eb[4] = (Button)findViewById(R.id.pc);
        eb[5] = (Button)findViewById(R.id.acn);
        eb[6] = (Button)findViewById(R.id.cs);
//        eb[7] = (Button)findViewById(R.id.s4);

        a.setTitle("CSE: 7th Semester Subjects");

        for(int i = 0; i < 3; i++){
            cTSub[i].setOnClickListener(this);
            cPSub[i].setOnClickListener(this);
        }
        for(int i = 0; i < 6; i++)
            ea[i].setOnClickListener(this);
        for(int i = 0; i < 5; i++)
            eb[i].setOnClickListener(this);

//        if(sem.equals("7")){
//            ea[6].setVisibility(View.INVISIBLE);
//            ea[7].setVisibility(View.INVISIBLE);
//            ea[8].setVisibility(View.INVISIBLE);
//            eb[7].setVisibility(View.INVISIBLE);
//        }

//        else if (sem.equals("8")){
//
//            cPSub[2].setVisibility(View.INVISIBLE);
//
//            cTSub[0].setText("Mobile Computing");                     //IS
//            cTSub[1].setText("Machine Learning");                     //STQA
//            cTSub[2].setText("Human Values & Professional Ethics-II"); //WC
//
//            cPSub[0].setText("Mobile Computing Lab");                  //ISLab
//            cPSub[1].setText("Machine Learning Lab");                  //STQALab
//
//            String eaSub[] = {"Digital Image Processing", "Microelectronics", "Ad Hoc & Sensor Networks",
//                    "Soft Computing", "VLSI Design", "Distributed Systems", "Object Oriented Software Engineering",
//                    "Computer Vision", "Software Project Management"},
//
//                   ebSub[] = {"Human Computer Interaction", "Information Theory & Coding", "Web Intelligence & Big Data",
//                    "Service Oriented Architecture", "Multiagent Systems", "Principles of Programming Languages",
//                    "Telecommunication Networks",
//                    "Selected Topics of Recent Trends in Computer Science & Engineering"};
//
//            for(int i = 0; i < 9; i++)
//                ea[i].setText(eaSub[i]);
//            for(int i = 0; i < 8; i++)
//                eb[i].setText(ebSub[i]);
//
//        }
    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.wc:
//                if (sem.equals("7"))
                   intent = new Intent(this, Syllabus.class).putExtra("Subject","WC").putExtra("Sem", "7")
                           .putExtra("Book", Urls.wcBook);
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","HVPE-II").putExtra("Sem", "8");
                break;
            case R.id.wcLab: intent = new Intent(this, Syllabus.class).putExtra("Subject","WCLab")
                    .putExtra("Book", Urls.wcBook);
                break;

            case R.id.is:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","IS").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","MC").putExtra("Sem", "8");

            case R.id.isLab:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","ISLab").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","MCLab").putExtra("Sem", "8");
                break;

            case R.id.stqa:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","STQA").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","ML").putExtra("Sem", "CSE8");
                break;

            case R.id.stqaLab:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","STQALab").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","MLLab").putExtra("Sem", "CSE8");
                break;

//            E-A
            case R.id.ct:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","STQALab").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","DIP").putExtra("Sem", "8");
                break;

            case R.id.ipr:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","IPR").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","Micro").putExtra("Sem", "CSE8");
                break;

            case R.id.dmbi:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","DMBI").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","AdHoc").putExtra("Sem", "8");
                break;

            case R.id.embed:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","Embedded").putExtra("Sem", "7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","Soft").putExtra("Sem", "8");
                break;

            case R.id.aca:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","ACA").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","VLSI").putExtra("Sem", "8");
                break;

            case R.id.nlp:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","NLP").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","Distributed").putExtra("Sem", "8");
                break;


//            E-B

            case R.id.sociology:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","Sociology").putExtra("Sem", "7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","HCI").putExtra("Sem", "8");
                break;
            case R.id.snm:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","SnM").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","InfoTheory").putExtra("Sem", "8");
//                break;
            case R.id.adbms:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","ADBMS").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","WIBD").putExtra("Sem", "CSE8");
                break;
            case R.id.pc:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","PC").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","SOA").putExtra("Sem", "CSE8");
                break;
            case R.id.acn:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","ACN").putExtra("Sem", "7")
                            .putExtra("Book", Urls.acnBook);
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","MS").putExtra("Sem", "CSE8");
                break;
            case R.id.cs:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","CS").putExtra("Sem", "CSE7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","PPL").putExtra("Sem", "CSE8");
                break;
            case R.id.dsp:
//                if (sem.equals("7"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject","DSP").putExtra("Sem", "7")
                            .putExtra("Book", "");
//                else if (sem.equals("8"))
//                    intent = new Intent(this, Syllabus.class).putExtra("Subject","TN").putExtra("Sem", "CSE8");
                break;
        }

        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}
    }

}
