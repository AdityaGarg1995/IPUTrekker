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

import static com.example.ipu_trekker.ggsipu.ImportantStrings.setRER;

public class SEM7_MT extends AppCompatActivity implements View.OnClickListener {

    Button[] buttons = new Button[21];
    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt7);

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
        buttons[13] = (Button)findViewById(R.id.b14);
        buttons[14] = (Button)findViewById(R.id.b15);
        buttons[15] = (Button)findViewById(R.id.b16);
        buttons[16] = (Button)findViewById(R.id.b17);
        buttons[17] = (Button)findViewById(R.id.b18);
        buttons[18] = (Button)findViewById(R.id.b19);
        buttons[19] = (Button)findViewById(R.id.b20);

        mSubjectQuadruplet = new SubjectQuadruplet[21];

        mSubjectQuadruplet[0] = new SubjectQuadruplet("CAD", "MAE7",
                "Computer Aided Design", "");
        mSubjectQuadruplet[1] = new SubjectQuadruplet("MEMS", "MT7",
                "Micro Electro Mechanical System & NanoTechnology", "");
        mSubjectQuadruplet[2] = new SubjectQuadruplet("MSD", "MT7",
                "Mechatronics System Design", "");

        mSubjectQuadruplet[3] = new SubjectQuadruplet("CADLab", "MAE7",
                "CAD Lab", "");

        mSubjectQuadruplet[4] = new SubjectQuadruplet("IC-MT", "MT7",
                "IC Engines", "");
        mSubjectQuadruplet[5] = new SubjectQuadruplet("DIP-MT", "MT7",
                "Digital Image Processing", Urls.dipBook);
        mSubjectQuadruplet[6] = new SubjectQuadruplet("PDC", "MT7",
                "Product Design & Costing", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("NCMP", "PE7",
                "Non-Conventional Manufacturing Processes", "MT7");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("PMOT", "MT7",
                "Process Modelling & Optimization Technique", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("Automobile-ME", "MAE7",
                "Automobile Engineering", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("DBMS", "CE7",
                ImportantStrings.dbmsSubject,
                Urls.dbmsBook);

        mSubjectQuadruplet[11] = new SubjectQuadruplet("AI-MAE", "MAE7",
                "Artificial Intelligence", "");
        mSubjectQuadruplet[12] = new SubjectQuadruplet("WHRS", "MT7",
                "Waste & Heat Recovery Systems", "");
        mSubjectQuadruplet[13] = new SubjectQuadruplet("MIS", "PE7",
                "Management Information System & ERP", "");
        mSubjectQuadruplet[14] = new SubjectQuadruplet("FLNN", "MT7",
                "Fuzzy Logic & Neural Networks", "");
        mSubjectQuadruplet[15] = new SubjectQuadruplet("OR-MT", "MT7",
                "Operations Research", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("Decision-MT", "MT7",
                "Decision Science", "");
        mSubjectQuadruplet[17] = setRER();
        mSubjectQuadruplet[18] = new SubjectQuadruplet("FEM", "MAE7",
                "Finite Element Method", "");
        mSubjectQuadruplet[19] = ImportantStrings.setSociology();

        for (int i = 0; i < 20; i++){
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

        final Activity a = this;
        a.setTitle("MT: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
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