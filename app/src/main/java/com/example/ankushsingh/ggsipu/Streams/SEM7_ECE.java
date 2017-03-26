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
import com.example.ankushsingh.ggsipu.Urls;

public class SEM7_ECE extends AppCompatActivity implements View.OnClickListener{
//    3 3 9 7
//    Button button1,button2,button3,button4;
    Intent intent;

    public static final String url2 = "http://www.gatestudy.com/list-of-books-for-gate-ece";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece7);

//        Compulsory -Theory
        findViewById(R.id.embed).setOnClickListener(this);
        findViewById(R.id.opto).setOnClickListener(this);
        findViewById(R.id.wc).setOnClickListener(this);

//        Compulsory -Practical
        findViewById(R.id.embedLab).setOnClickListener(this);
        findViewById(R.id.optoLab).setOnClickListener(this);
        findViewById(R.id.wcLab).setOnClickListener(this);

//        E-A
        findViewById(R.id.adsp).setOnClickListener(this);
        findViewById(R.id.mems).setOnClickListener(this);
        findViewById(R.id.avlsi).setOnClickListener(this);
        findViewById(R.id.bmi).setOnClickListener(this);
        findViewById(R.id.scada).setOnClickListener(this);
        findViewById(R.id.pe).setOnClickListener(this);
        findViewById(R.id.rfdc).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);
        findViewById(R.id.rer).setOnClickListener(this);

//        E-B
        findViewById(R.id.rn).setOnClickListener(this);
        findViewById(R.id.pm).setOnClickListener(this);
        findViewById(R.id.eco).setOnClickListener(this);
        findViewById(R.id.gc).setOnClickListener(this);
        findViewById(R.id.pc).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);
        findViewById(R.id.topics).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("ECE: 7th Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.embed:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","Embedded").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.opto:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","Opto").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.wc:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","WC").putExtra("Sem", "7")
                        .putExtra("Book", Urls.wcBook);
                break;

            case R.id.embedLab:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","EmbeddedLab").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.optoLab:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","OptoLab").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.wcLab:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","WCLab").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;

//            E-A
            case R.id.adsp:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","ADSP").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.mems:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","MEMS").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.avlsi:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","AVLSI").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.bmi:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","BMI").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.scada:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","SCADA").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.pe:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","PE-ECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.rfdc:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","RFDC").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.dbms:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","DBMS").putExtra("Sem", "CE7")
                        .putExtra("Book", Urls.dbmsBook);
                break;
            case R.id.rer:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","RER").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;

//            E-B
            case R.id.rn:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","RnN").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.pm:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","PM").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.eco:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","ECO-ECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.gc:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","Grid").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.pc:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","PC").putExtra("Sem", "CSE7")
                        .putExtra("Book", "");
                break;
            case R.id.sociology:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","Sociology").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.topics:
                intent = new Intent(this, Syllabus.class).putExtra("Subject","TopicsECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "NA");
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
