package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.StreamNames;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM8_ENE extends AppCompatActivity implements View.OnClickListener {

    Button buttons[] = new Button[11];
    Intent intent;
    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ene8);

        final Activity a = this;
        a.setTitle("ENE: 8th Semester Subjects");

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

        mSubjectQuadruplet[0] = new SubjectQuadruplet("HVPE-II", "8",
                StreamNames.hvpe_ii, Urls.hvpe_iiBook);
        mSubjectQuadruplet[1] = new SubjectQuadruplet("Planning", "CE8",
                "Planning & Management of Environmental Projects", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("EM", "CE8",
                "Environmental Modelling", "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("GISLab-ENE", "CE8",
                "Estimation of Environmental Projects", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("EMLab", "CE8",
                "Environment Modelling Applications", "");

        mSubjectQuadruplet[5] = new SubjectQuadruplet("TPM", "CE8",
                "Transportation Planning & Management", "");
        mSubjectQuadruplet[6] = new SubjectQuadruplet("GroundWater", "CE8",
                "Ground Water Assessment Development & Management", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("EPHI", "CE8",
                "Environmental Preventive Health Issues", "");

        mSubjectQuadruplet[8] = new SubjectQuadruplet("Climate", "CE8",
                "Climate change assessment & mitigation measures", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("GroundWater(2)", "CE8",
                "Ground Water Contamination & Remediation", "http://www.interpore.org/reference_material/mgfc-course/");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("BCT", "CE8",
                "Bio & Chemical Technology Applications in Waste Management", "");

        for (int i = 0; i < 11; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 11; i++)
            if (v == buttons[i])
                intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                        .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                        .putExtra("Book", mSubjectQuadruplet[i].getBook());
        try {
            intent.putExtra("SubjectName", ((Button) v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e) { e.printStackTrace(); }
    }
}