package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;

public class SEM6_CEnENE extends AppCompatActivity implements View.OnClickListener {

    Button gis, qsce, hydraulics, te_i,
           teLab_i, gisLab, seminar, camp, lab1;

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
        a.setTitle(stream + ": " + ImportantStrings.sem6sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        setSubject();
    }


    public void setSubject(){

        String seminarCE = "Seminar",
               nues = "(NUES)";

        if(stream.equals("CE")){
            seminar.setText(String.format("%s on Civil Engineering projects/Visits/Case Studies %s", seminarCE, nues));

            lab1 = (Button)findViewById(R.id.lab1);
            lab1.setVisibility(View.GONE);
        }

        else if(stream.equals("ENE")){
            gis.setText("Principles of Solid Waste Management (M)");
            qsce.setText("Industrial Waste Management (M)");
            hydraulics.setText("Economics for Engineers");

            gisLab.setText("Solid Waste Management Lab");
            camp.setText("Environmental Monitoring & Surveying Camp");
            seminar.setText(String.format("%s (topics shouls be linked to industrial training/Surveying Camp/Soft Skills learnt) %s", seminarCE, nues));
            teLab_i.setText("Effluent Treatment System Design & Drawing Lab");

            lab1 = (Button)findViewById(R.id.lab1);
            lab1.setOnClickListener(this);
            lab1.setVisibility(View.VISIBLE);
            lab1.setText("Economic Development & Environmental Concerns");
        }
    }

    public void intentPutExtra(String subject, String book){
        intent.putExtra("Subject", subject).putExtra("Book", book);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch (v.getId()) {
//           Theory
            case R.id.te_i: intentPutExtra("TE-I", "");
                break;
            case R.id.asd: intentPutExtra("ASD", "");
                break;
            case R.id.gis:
                switch (stream) {
                    case "CE": intentPutExtra("GIS", "");
                        break;
                    case "ENE": intentPutExtra("PSWM", "");
                        break;
                }
                break;
            case R.id.qsce:
                switch (stream) {
                    case "CE": intentPutExtra("QSCE", "");
                        break;
                    case "ENE": intentPutExtra("IWM", "");
                        break;
                }
                break;
            case R.id.hydraulics:
                switch (stream) {
                    case "CE": intentPutExtra("Hydraulics-II", "");
                        break;
                    case "ENE": intentPutExtra("Eco", "");
                        break;
                }
                break;

//           Electives
            case R.id.eso: intentPutExtra("ESO", "");
                break;
            case R.id.orm: intentPutExtra("ORM", "");
                break;
            case R.id.dd: intentPutExtra("DD", "");
                break;

//           Practicals
            case R.id.asdLab: intentPutExtra("ASDLab", "");
                break;
            case R.id.gisLab:
                switch (stream) {
                    case "CE": intentPutExtra("GISLab", "");
                        break;
                    case "ENE":intentPutExtra("PSWMLab", "");
                        break;
                }
                break;
            case R.id.teLab_i:
                switch (stream) {
                    case "CE": intentPutExtra("TELab-I", "");
                        break;
                    case "ENE": intentPutExtra("ETSLab", "");
                        break;
                }
                break;
            case R.id.seminar:
                String seminar = "Seminar";
                switch (stream) {
                    case "CE": intentPutExtra(seminar, "NA");
                        break;
                    case "ENE": intentPutExtra(seminar + "-ENE", "NA");
                        break;
                }
                break;
            case R.id.camp:
                String camp = "Camp";
                switch (stream) {
                    case "CE":
                        intentPutExtra(camp + "-CE", "NA");
                        break;
                    case "ENE":
                        intentPutExtra(camp + "-ENE", "NA");
                        break;
                }
                break;
            case R.id.lab1:
                if (stream.equals("ENE"))
                    intentPutExtra("EcoLab", "");
                break;
        }
        try {
            intent.putExtra("Sem", "CE6").putExtra("SubjectName", ((Button) v).getText().toString());
            if ((intent != null))
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}