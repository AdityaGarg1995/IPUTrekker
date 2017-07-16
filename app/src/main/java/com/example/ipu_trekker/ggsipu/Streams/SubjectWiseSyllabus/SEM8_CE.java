package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;


public class SEM8_CE extends AppCompatActivity implements View.OnClickListener {
//  CE8
//  3 1 3 4
    Button buttons[] = new Button[11];

    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil8);

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

        mSubjectQuadruplet = new SubjectQuadruplet[11];
        mSubjectQuadruplet[0] = ImportantStrings.setHVPEII();

        mSubjectQuadruplet[1] = new SubjectQuadruplet("Planning", "CE8",
                "Planning & Management of Construction Projects", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("Bridges", "CE8",
                "Analysis & Design of Bridges", "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("EstimationLab", "CE8",
                "Estimation of Projects using applicable software", "");

        mSubjectQuadruplet[4] = new SubjectQuadruplet("TPM", "CE8",
                "Transportation, Planning & Management", "");
        mSubjectQuadruplet[5] = new SubjectQuadruplet("GroundWater", "CE8",
                "Ground Water Assessment, Development & Management", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("AGE", "CE8",
                "Advanced Geotechnical Engineering", "");

        mSubjectQuadruplet[7] = new SubjectQuadruplet("FEM-SE", "CE8",
                "FEM in Structural Engineering", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("GroundWater(2)", "CE8",
                "Ground Water Contamination & Mitigation measures",
                "http://www.interpore.org/reference_material/mgfc-course/");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("Envo", "CE8",
                "Environment Engineering", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("OSE", "CE8",
                "Offshore Structural Engineering", "");

        for(int i = 0; i < 11; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

        Activity a = this;
        a.setTitle("CE: " + ImportantStrings.sem8sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
        for(int i = 0; i < 11; i++)
            if(v == buttons[i])
                ImportantStrings.putExtraSubjectQuadruplet(intent, mSubjectQuadruplet[i]);
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e) {e.printStackTrace();}
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