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
import com.example.ipu_trekker.ggsipu.Urls;


public class SEM7_ENE extends AppCompatActivity implements View.OnClickListener {
//   3 2 3 4
    Intent intent;
    Activity a  = this;
    Button buttons[] = new Button[13];
    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ene7);

        buttons[0] = (Button)findViewById(R.id.b1);
        buttons[1] = (Button)findViewById(R.id.b2);
        buttons[2] = (Button)findViewById(R.id.b3);
        buttons[3] = (Button)findViewById(R.id.b4);
        buttons[4] = (Button)findViewById(R.id.b5);
        buttons[5] = (Button)findViewById(R.id.b6);
        buttons[6] = (Button)findViewById(R.id.b7);
        buttons[7] = (Button)findViewById(R.id.b8);
        buttons[8] = (Button)findViewById(R.id.b9);
        buttons[9] = (Button)findViewById(R.id.b10);
        buttons[10] = (Button)findViewById(R.id.b11);
        buttons[11] = (Button)findViewById(R.id.b12);
        buttons[12] = (Button)findViewById(R.id.b13);

        String gis = "Applications of Remote Sensing & GIS",
               eia = "EIA & EMS";

        mSubjectQuadruplet = new SubjectQuadruplet[13];

        mSubjectQuadruplet[0] = new SubjectQuadruplet("BHE", "Biomedical, Hazardous & E-waste management", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("EIA", eia, "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("GIS-ENE", gis, "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("GISLab-ENE", gis+" Lab", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("EIALab", eia+" Lab", "");

        mSubjectQuadruplet[5] = new SubjectQuadruplet("WRSP", "Water Resource System Planning", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("SES", "Sustainable Energy Systems", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("ASP", "Advance Separation Process", "");

        mSubjectQuadruplet[8] = new SubjectQuadruplet("DA", "Data Analytics", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("DCN", "Data Communication & Networks", Urls.dcnBook);
        mSubjectQuadruplet[10] = new SubjectQuadruplet("DBMS", ImportantStrings.dbmsSubject, Urls.dbmsBook);
        mSubjectQuadruplet[11] = new SubjectQuadruplet("Green", "Planning & Design of Green Buildings", "");
        mSubjectQuadruplet[12] = ImportantStrings.setSociology();

        Activity a = this;
        a.setTitle("ENE: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        for(int i = 0;i < 13; i++){
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for(int i = 0; i < 13; i++)
           if(v == buttons[i])
               ImportantStrings.putExtraSubjectQuadruplet2(intent, mSubjectQuadruplet[i]);
        try{
            intent.putExtra("Sem", "CE7").putExtra("SubjectName", ((Button)v).getText().toString());
            if(intent!=null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}