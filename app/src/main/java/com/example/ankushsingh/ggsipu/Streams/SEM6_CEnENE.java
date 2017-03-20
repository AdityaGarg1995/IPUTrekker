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

public class SEM6_CEnENE extends AppCompatActivity implements View.OnClickListener {

    Button gis, qsce, hydraulics, asd, te_i,
           eso, orm, dd,
           teLab_i, gisLab, asdLab, seminar, camp, lab1;

    String stream;

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil6);

        stream = getIntent().getStringExtra("Stream");

//         Compulsory
        gis        = (Button)findViewById(R.id.gis);        gis.setOnClickListener(this);
        qsce       = (Button)findViewById(R.id.qsce);       qsce.setOnClickListener(this);
        hydraulics = (Button)findViewById(R.id.hydraulics); hydraulics.setOnClickListener(this);
        te_i       = (Button)findViewById(R.id.te_i);       te_i.setOnClickListener(this);

        findViewById(R.id.asd).setOnClickListener(this);

//        Electives
        findViewById(R.id.eso).setOnClickListener(this);
        findViewById(R.id.orm).setOnClickListener(this);
        findViewById(R.id.dd).setOnClickListener(this);

//        Practicals
        findViewById(R.id.asdLab).setOnClickListener(this);

        teLab_i = (Button)findViewById(R.id.teLab_i); teLab_i.setOnClickListener(this);
        gisLab  = (Button)findViewById(R.id.gisLab);  gisLab.setOnClickListener(this);
        camp    = (Button)findViewById(R.id.camp);    camp.setOnClickListener(this);
        seminar = (Button)findViewById(R.id.seminar); seminar.setOnClickListener(this);


        final Activity a = this;
        a.setTitle(stream + ": 6th Semester Subjects");

        setSubject();

    }


    public void setSubject(){

        if(stream.equals("CE")){
            seminar.setText("Seminar on Civil Engineering projects/Visits/Case Studies (NUES)");

            lab1 = (Button)findViewById(R.id.lab1);
            lab1.setVisibility(View.INVISIBLE);
        }

        else if(stream.equals("ENE")){
            gis.setText("Principles of Solid Waste Management (M)");
            qsce.setText("Industrial Waste Management (M)");
            hydraulics.setText("Economics for Engineers");

            gisLab.setText("Solid Waste Management Lab");
            camp.setText("Environmental Monitoring & Surveying Camp");
            seminar.setText("Seminar (topics shouls be linked to industrial training/ Surveying Camp/ Soft Skills learnt) (NUES)");
            teLab_i.setText("Effluent Treatment System Design & Drawing Lab");

            lab1 = (Button)findViewById(R.id.lab1);
            lab1.setOnClickListener(this);
            lab1.setVisibility(View.VISIBLE);
            lab1.setText("Economic Development & Environmental Concerns");
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

//           Theory
            case R.id.te_i: intent = new Intent(this, Syllabus.class).putExtra("Subject", "TE-I");
                break;
            case R.id.asd: intent = new Intent(this, Syllabus.class).putExtra("Subject", "ASD");
                break;
            case R.id.gis:
                if(stream.equals("CE"))
                   intent = new Intent(this, Syllabus.class).putExtra("Subject", "GIS");
                else if (stream.equals("ENE"))
                   intent = new Intent(this, Syllabus.class).putExtra("Subject", "PSWM");
                break;
            case R.id.qsce:
                if (stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "QSCE");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "IWM");
                break;
            case R.id.hydraulics:
                if (stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Hydraulics-II");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Eco");
                break;


//           Electives
            case R.id.eso: intent = new Intent(this, Syllabus.class).putExtra("Subject", "ESO");
                break;
            case R.id.orm: intent = new Intent(this, Syllabus.class).putExtra("Subject", "ORM");
                break;
            case R.id.dd: intent = new Intent(this, Syllabus.class).putExtra("Subject", "DD");
                break;


//           Practicals
            case R.id.asdLab: intent = new Intent(this, Syllabus.class).putExtra("Subject", "ASDLab");
                break;
            case R.id.gisLab:
                if(stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "GISLab");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "PSWMLab");
                break;
            case R.id.teLab_i:
                if(stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "TELab-I");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "ETSLab");
                break;
            case R.id.seminar:
                if(stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Seminar-ENE");
                break;
            case R.id.camp:
                if(stream.equals("CE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Camp-CE");
                else if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "Camp-ENE");
                break;
            case R.id.lab1:
                if (stream.equals("ENE"))
                    intent = new Intent(this, Syllabus.class).putExtra("Subject", "EcoLab");
                break;

        }

        try {
            intent.putExtra("Sem", "CE6").putExtra("SubjectName", ((Button) v).getText().toString());
            if ((intent != null))
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}

    }


}

