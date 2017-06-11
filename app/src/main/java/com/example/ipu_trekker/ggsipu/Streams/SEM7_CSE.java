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
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM7_CSE extends AppCompatActivity implements View.OnClickListener {

//    3 3 6 7
    Intent intent;
    Activity a = this;
    String sem;
    Button buttons[] = new Button[19];
    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse7);

//        Compulsory
        buttons[0] = (Button)findViewById(R.id.is);
        buttons[1] = (Button)findViewById(R.id.stqa);
        buttons[2] = (Button)findViewById(R.id.wc);

        buttons[3] = (Button)findViewById(R.id.isLab);
        buttons[4] = (Button)findViewById(R.id.stqaLab);
        buttons[5] = (Button)findViewById(R.id.wcLab);

//        Electives-A
        buttons[6] = (Button)findViewById(R.id.ct);
        buttons[7] = (Button)findViewById(R.id.ipr);
        buttons[8] = (Button)findViewById(R.id.dmbi);
        buttons[9] = (Button)findViewById(R.id.embed);
        buttons[10] = (Button)findViewById(R.id.aca);
        buttons[11] = (Button)findViewById(R.id.nlp);

//        Elective-B
        buttons[12] = (Button)findViewById(R.id.sociology);
        buttons[13] = (Button)findViewById(R.id.dsp);
        buttons[14] = (Button)findViewById(R.id.snm);
        buttons[15] = (Button)findViewById(R.id.adbms);
        buttons[16] = (Button)findViewById(R.id.pc);
        buttons[17] = (Button)findViewById(R.id.acn);
        buttons[18] = (Button)findViewById(R.id.cs);

        a.setTitle("CSE: 7th Semester Subjects");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        for (int i = 0; i < 19; i++)
            buttons[i].setOnClickListener(this);

        mSubjectQuadruplet = new SubjectQuadruplet[19];
        mSubjectQuadruplet[0] = new SubjectQuadruplet("IS", "CSE7", "Information Security", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("STQA", "CSE7", "Software Testing & Quality Assurance", "");
        mSubjectQuadruplet[0] = new SubjectQuadruplet("WC", "7", "Wireless Communication", Urls.wcBook);

        mSubjectQuadruplet[3] = new SubjectQuadruplet("ISLab", "CSE7", "Information Security Lab", "");
        mSubjectQuadruplet[4] = new SubjectQuadruplet("STQALab", "CSE7", "Software Testing & Quality Assurance Lab", "");
        mSubjectQuadruplet[5] = new SubjectQuadruplet("WCLab", "7", "Wireless Communication Lab", Urls.wcBook);
//                E_A
        mSubjectQuadruplet[6] = new SubjectQuadruplet("CT", "CSE7", "", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("IPR", "CSE7", "", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("Embedded", "7", "", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("DMBI", "CSE7", "", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("ACA", "CSE7", "", "");
        mSubjectQuadruplet[11] = new SubjectQuadruplet("NLP", "CSE7", "", "");
//                E_B
        mSubjectQuadruplet[12] = new SubjectQuadruplet("DSP", "7", "Digital Signal Processing", "");
        mSubjectQuadruplet[13] = new SubjectQuadruplet("SnM", "CSE7", "", "");
        mSubjectQuadruplet[14] = new SubjectQuadruplet("ADBMS", "CSE7", "", "");
        mSubjectQuadruplet[15] = new SubjectQuadruplet("PC", "CSE7", "", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("ACN", "7", "", Urls.acnBook);
        mSubjectQuadruplet[17] = new SubjectQuadruplet("CS", "CSE7", "", "");
        mSubjectQuadruplet[18] = new SubjectQuadruplet("Sociology", "7", "", Urls.sociologyBook);
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 19; i++)
            if(v == buttons[i])
                intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                        .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                        .putExtra("Book", mSubjectQuadruplet[i].getBook());
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}