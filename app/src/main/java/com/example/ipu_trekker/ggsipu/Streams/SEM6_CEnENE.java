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

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

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
        intent = new Intent(this, Syllabus.class);
        switch (v.getId()) {
//           Theory
            case R.id.te_i: intent.putExtra("Subject", "TE-I").putExtra("Book", "");
                break;
            case R.id.asd: intent.putExtra("Subject", "ASD").putExtra("Book", "");
                break;
            case R.id.gis:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "GIS").putExtra("Book", "");
                        break;
                    case "ENE": intent.putExtra("Subject", "PSWM").putExtra("Book", "");
                        break;
                }
                break;
            case R.id.qsce:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "QSCE").putExtra("Book", "");
                        break;
                    case "ENE": intent.putExtra("Subject", "IWM").putExtra("Book", "");
                        break;
                }
                break;
            case R.id.hydraulics:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "Hydraulics-II").putExtra("Book", "");
                        break;
                    case "ENE": intent.putExtra("Subject", "Eco").putExtra("Book", "");
                        break;
                }
                break;

//           Electives
            case R.id.eso: intent.putExtra("Subject", "ESO").putExtra("Book", "");
                break;
            case R.id.orm: intent.putExtra("Subject", "ORM").putExtra("Book", "");
                break;
            case R.id.dd: intent.putExtra("Subject", "DD").putExtra("Book", "");
                break;

//           Practicals
            case R.id.asdLab: intent.putExtra("Subject", "ASDLab").putExtra("Book", "");
                break;
            case R.id.gisLab:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "GISLab").putExtra("Book", "");
                        break;
                    case "ENE":intent.putExtra("Subject", "PSWMLab").putExtra("Book", "");
                        break;
                }
                break;
            case R.id.teLab_i:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "TELab-I").putExtra("Book", "");
                        break;
                    case "ENE": intent.putExtra("Subject", "ETSLab").putExtra("Book", "");
                        break;
                }
                break;
            case R.id.seminar:
                switch (stream) {
                    case "CE": intent.putExtra("Subject", "Seminar").putExtra("Book", "NA");
                        break;
                    case "ENE": intent.putExtra("Subject", "Seminar-ENE").putExtra("Book", "NA");
                        break;
                }
                break;
            case R.id.camp:
                switch (stream) {
                    case "CE":
                        intent.putExtra("Subject", "Camp-CE").putExtra("Book", "NA");
                        break;
                    case "ENE":
                        intent.putExtra("Subject", "Camp-ENE").putExtra("Book", "NA");
                        break;
                }
                break;
            case R.id.lab1:
                if (stream.equals("ENE"))
                    intent.putExtra("Subject", "EcoLab").putExtra("Book", "");
                break;
        }
        try {
            intent.putExtra("Sem", "CE6").putExtra("SubjectName", ((Button) v).getText().toString());
            if ((intent != null))
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}