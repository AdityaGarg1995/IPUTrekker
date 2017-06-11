package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.Syllabus;

public class SEM7_EEEnEE extends AppCompatActivity implements View.OnClickListener{
//    3 3 6 7
//    Button button1,button2,button3,button4;
    Intent intent;

    public static final String url2 = "http://www.engineersinstitute.com/gate_exam_reference_books_electrical_eee.php";

    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee7);

        findViewById(R.id.ed).setOnClickListener(this);
        findViewById(R.id.acs).setOnClickListener(this);
        findViewById(R.id.emd).setOnClickListener(this);

        findViewById(R.id.edLab).setOnClickListener(this);
        findViewById(R.id.acsLab).setOnClickListener(this);

        Button emdLab = (Button)findViewById(R.id.emdLab);
        emdLab.setOnClickListener(this);

//        E-A
        findViewById(R.id.rer).setOnClickListener(this);
        findViewById(R.id.tdas).setOnClickListener(this);
        findViewById(R.id.scada).setOnClickListener(this);
        findViewById(R.id.mecha).setOnClickListener(this);
        findViewById(R.id.hve).setOnClickListener(this);

        Button topics = (Button)findViewById(R.id.topics);
        topics.setOnClickListener(this);

//        E-B
        findViewById(R.id.opto).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);
        findViewById(R.id.bmi).setOnClickListener(this);
        findViewById(R.id.dsd).setOnClickListener(this);
        findViewById(R.id.plcc).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);

        Button eb = (Button)findViewById(R.id.eb);
        eb.setVisibility(View.GONE);

        stream = getIntent().getStringExtra("Stream");
        final Activity a = this;
        a.setTitle(stream + ": 7th Semester Subjects");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        if(stream.equals("EEE")){

            eb.setVisibility(View.VISIBLE);
            eb.setOnClickListener(this);
            eb.setText("Electrical Machines Design");

            emdLab.setText("EHV AC & HVDC Transmissions");

            emdLab.setVisibility(View.GONE);

            topics.setText(topics.getText().toString() + "E");
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.ed:
                intent.putExtra("Subject", "ED").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.acs:
                intent.putExtra("Subject", "ACS").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.emd:
                if(stream.equals("EE"))
                   intent.putExtra("Subject", "EMD").putExtra("Sem", "EE7").putExtra("Book", "");
                else if(stream.equals("EEE"))
                    intent.putExtra("Subject", "ACDC-EEE").putExtra("Sem", "EE7").putExtra("Book", "");
                break;

            case R.id.edLab:
                intent.putExtra("Subject", "EDLab").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.acsLab:
                intent.putExtra("Subject", "ACSLab").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.emdLab:
                if(stream.equals("EE"))
                    intent.putExtra("Subject", "EMDLab").putExtra("Sem", "EE7").putExtra("Book", "");
                break;

//            E-A
            case R.id.rer:
                intent.putExtra("Subject", "RER").putExtra("Sem", "ECE7").putExtra("Book", "");
                break;
            case R.id.pds:
                intent.putExtra("Subject", "PDS").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.tdas:
                intent.putExtra("Subject", "TDAS").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.scada:
                intent.putExtra("Subject", "SCADA").putExtra("Sem", "ECE7").putExtra("Book", "");
                break;
            case R.id.mecha:
                intent.putExtra("Subject", "Mecha").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.hve:
                intent.putExtra("Subject", "HVE").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.topics:
                if(stream.equals("EE"))
                   intent.putExtra("Subject", "Topics").putExtra("Sem", "EE7").putExtra("Book", "");
                else if(stream.equals("EEE"))
                    intent.putExtra("Subject", "TopicsEEE").putExtra("Sem", "EE7").putExtra("Book", "");
                break;

//            E-B
            case R.id.opto:
                intent.putExtra("Subject", "Opto").putExtra("Sem", "7").putExtra("Book", "");
                break;
            case R.id.dbms:
                intent.putExtra("Subject", "DBMS").putExtra("Sem", "CE7").putExtra("Book", "");
                break;
            case R.id.bmi:
                intent.putExtra("Subject", "BMI").putExtra("Sem", "ECE7").putExtra("Book", "");
                break;
            case R.id.dsd:
                intent.putExtra("Subject", "DSD").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.plcc:
                intent.putExtra("Subject", "PLCC").putExtra("Sem", "EE7").putExtra("Book", "");
                break;
            case R.id.sociology:
                intent.putExtra("Subject", "Sociology").putExtra("Sem", "7").putExtra("Book", "");
                break;
            case R.id.eb:
                if(stream.equals("EEE"))
                   intent.putExtra("Subject", "EMD").putExtra("Sem", "EE7").putExtra("Book", "");
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

