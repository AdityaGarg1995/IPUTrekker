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


public class SEM7_ME extends AppCompatActivity implements View.OnClickListener {

    Activity a = this;
    Button buttons[] = new Button[21];
    SubjectQuadruplet mSubjectQuadruplet[] = new SubjectQuadruplet[21];

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me7);

        buttons[0] = (Button) findViewById(R.id.b1);
        buttons[1] = (Button) findViewById(R.id.b2);
        buttons[2] = (Button) findViewById(R.id.b3);
        buttons[3] = (Button) findViewById(R.id.b4);
        buttons[4] = (Button) findViewById(R.id.b5);
        buttons[5] = (Button) findViewById(R.id.b6);
        buttons[6] = (Button) findViewById(R.id.b7);
        buttons[7] = (Button) findViewById(R.id.b8);
        buttons[8] = (Button) findViewById(R.id.b9);
        buttons[9] = (Button) findViewById(R.id.b10);
        buttons[10] = (Button) findViewById(R.id.b11);
        buttons[11] = (Button) findViewById(R.id.b12);
        buttons[12] = (Button) findViewById(R.id.b13);
        buttons[13] = (Button) findViewById(R.id.b14);
        buttons[14] = (Button) findViewById(R.id.b15);
        buttons[15] = (Button) findViewById(R.id.b16);
        buttons[16] = (Button) findViewById(R.id.b17);
        buttons[17] = (Button) findViewById(R.id.b18);
        buttons[18] = (Button) findViewById(R.id.b19);
        buttons[19] = (Button) findViewById(R.id.b20);
        buttons[20] = (Button) findViewById(R.id.b21);

        String cim      = "Computer Integrated Manufacturing",
               autoEngg = "Automobile Engineering",
               lab      = " Lab";

        mSubjectQuadruplet[0] = new SubjectQuadruplet("Automobile-ME", "MAE7", autoEngg, "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("CIM", "MAE7", cim, "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("PPE", "MAE7", "Power Plant Engineering", "http://urlin.us/3seue");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("AutomobileLab-ME", "MAE7", autoEngg + lab, "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("CIMLab", "MAE7", cim + lab, "");

        mSubjectQuadruplet[5] = new SubjectQuadruplet("OT", "MAE7", "Optimization Techniques", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("PMCM", "MAE7", "Preventive Maintenance & Condition Monitoring", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("IDS", "MAE7", "Introduction to Data Science", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("NCMP", "MAE7", "Non-conventional Manufacturing Processes", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("GMPD", "MAE7", "Geometric Modelling & Product Design", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("AMSM", "MAE7", "Advanced Material Science & Metallurgy",  Urls.amsmBook);
        mSubjectQuadruplet[11] = new SubjectQuadruplet("OR-MT", "MT7", "Operations Research", "");
        mSubjectQuadruplet[12] = new SubjectQuadruplet("DBMS", "CE7", ImportantStrings.dbmsSubject, Urls.dbmsBook);

        mSubjectQuadruplet[13] = ImportantStrings.setRER();
        mSubjectQuadruplet[14] = ImportantStrings.setMIS();
        mSubjectQuadruplet[15] = new SubjectQuadruplet("FEM", "MAE7", "Finite Element Methods", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("Mecha", "EE7", "Mechatronics", "");
        mSubjectQuadruplet[17] = new SubjectQuadruplet("Rotor", "MAE7", "Rotor Dynamics", "");
        mSubjectQuadruplet[18] = new SubjectQuadruplet("AI-MAE", "MAE7", "Artificial Intelligence", "");
        mSubjectQuadruplet[19] = new SubjectQuadruplet("CFD", "MAE7", "Computational Fluid Dynamics", "");
        mSubjectQuadruplet[20] = ImportantStrings.setSociology();

        for(int i = 0; i < 21; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

        a.setTitle("ME: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 20; i++)
            if(v == buttons[i])
                ImportantStrings.putExtraSubjectQuadruplet(intent, mSubjectQuadruplet[i]);
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch(Exception e){e.printStackTrace();}
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