package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM7_ECE extends AppCompatActivity implements View.OnClickListener{
//    3 3 9 7
//    Button button1,button2,button3,button4;
    Intent intent;

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
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.embed:
                intent.putExtra("Subject","Embedded").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.opto:
                intent.putExtra("Subject","Opto").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.wc:
                intent.putExtra("Subject","WC").putExtra("Sem", "7")
                        .putExtra("Book", Urls.wcBook);
                break;

            case R.id.embedLab:
                intent.putExtra("Subject","EmbeddedLab").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.optoLab:
                intent.putExtra("Subject","OptoLab").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.wcLab:
                intent.putExtra("Subject","WCLab").putExtra("Sem", "7")
                        .putExtra("Book",Urls.wcBook);
                break;

//            E-A
            case R.id.adsp:
                intent.putExtra("Subject","ADSP").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.mems:
                intent.putExtra("Subject","MEMS").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.avlsi:
                intent.putExtra("Subject","AVLSI").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.bmi:
                intent.putExtra("Subject","BMI").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.scada:
                intent.putExtra("Subject","SCADA").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.pe:
                intent.putExtra("Subject","PE-ECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.rfdc:
                intent.putExtra("Subject","RFDC").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.dbms:
                intent.putExtra("Subject","DBMS").putExtra("Sem", "CE7")
                        .putExtra("Book", Urls.dbmsBook);
                break;
            case R.id.rer:
                intent.putExtra("Subject","RER").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;

//            E-B
            case R.id.rn:
                intent.putExtra("Subject","RnN").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.pm:
                intent.putExtra("Subject","PM").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.eco:
                intent.putExtra("Subject","ECO-ECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
            case R.id.gc:
                intent.putExtra("Subject","Grid").putExtra("Sem", "7")
                        .putExtra("Book", "");
                break;
            case R.id.pc:
                intent.putExtra("Subject","PC").putExtra("Sem", "CSE7")
                        .putExtra("Book", "");
                break;
            case R.id.sociology:
                intent.putExtra("Subject","Sociology").putExtra("Sem", "7")
                        .putExtra("Book", Urls.sociologyBook);
                break;
            case R.id.topics:
                intent.putExtra("Subject","TopicsECE").putExtra("Sem", "ECE7")
                        .putExtra("Book", "");
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}