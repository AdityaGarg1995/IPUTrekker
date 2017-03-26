package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class IT7 extends AppCompatActivity implements View.OnClickListener {
//   3 3 7 7
    Intent intent;
    Activity a  = this;
    String stream = "";

    Button buttons[] = new Button[20];

    SubjectQuadruplet mSubjectQuadruplet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it7);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 7th Semester Subjects");

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

        mSubjectQuadruplet = new SubjectQuadruplet[20];
        mSubjectQuadruplet[0] = new SubjectQuadruplet("ACN", "7", "Advanced Computer Networks", Urls.acnBook);
        mSubjectQuadruplet[1] = new SubjectQuadruplet("CNS", "7", "Cryptography & Network Security", Urls.cryptoBook);
        mSubjectQuadruplet[2] = new SubjectQuadruplet("WC", "7", "Wireless Communication", Urls.wcBook);

        mSubjectQuadruplet[3] = new SubjectQuadruplet("ACNLab", "7", "Advanced Computer Networks Lab", Urls.acnBook);
        mSubjectQuadruplet[4] = new SubjectQuadruplet("CNSLab", "7", "Cryptography & Network Security Lab", Urls.cryptoBook);
        mSubjectQuadruplet[5] = new SubjectQuadruplet("WCLab", "7", "Wireless Communication Lab", Urls.wcBook);
//                E_A
        mSubjectQuadruplet[6] = new SubjectQuadruplet("Embedded", "7", "Embedded Systems", "");
        mSubjectQuadruplet[7] = new SubjectQuadruplet("Opto", "7", "Optoelectronics & Optical Communication", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("Cloud", "7", "Cloud Computing", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("DistributedDB", "7", "Distributed Databases", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("Semantic", "7", "Semantic Web Technologies", "");
        mSubjectQuadruplet[11] = new SubjectQuadruplet("ST", "7", "Software Testing", Urls.softwareTestingBook);
        mSubjectQuadruplet[12] = new SubjectQuadruplet("DSP", "7", "Digital Signal Processing", "");
//                E_B
        mSubjectQuadruplet[13] = new SubjectQuadruplet("CSharp", "7", ".NET & C# Programming", Urls.cSharpBook);
        mSubjectQuadruplet[14] = new SubjectQuadruplet("J2EE", "7", "Enterprise Computing in Java", "");
        mSubjectQuadruplet[15] = new SubjectQuadruplet("SysAdmin", "7", "System & Network Administration", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("Grid", "7", "Grid Computing", "");
        mSubjectQuadruplet[17] = new SubjectQuadruplet("AdvancedDBA", "7", "Advanced Database Administration", "");
        mSubjectQuadruplet[18] = new SubjectQuadruplet("Graphs", "7", "Probablistic Graphical Models", "");
        mSubjectQuadruplet[19] = new SubjectQuadruplet("Sociology", "7", "Sociology & Elements of Indian History for Engineers", Urls.sociologyBook);

        setSubjects();
        for(int i = 0; i < 20; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

    }

    public void setSubjects(){
        switch (stream) {
            case "MAE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("CAD", "MAE7", "Computer Aided Design", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("CIM", "MAE7", "Computer Integrated Manufacturing", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("Mecha", "EE7", "Mechatronics", "");

                mSubjectQuadruplet[3] = new SubjectQuadruplet("CADLab", "MAE7", "Computer Aided Design Lab", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("CIMLab", "MAE7", "Computer Integrated Manufacturing Lab", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("MechaLab", "EE7", "Mechatronics Lab", "");
//        E_A
                mSubjectQuadruplet[6] = new SubjectQuadruplet("OT", "7", "Optimization Techniques", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("PMCM", "PE7", "Preventive Maintenance & Condition Monitoring", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("CFD", "MAE7", "Computational Fluid Dynamics", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("FEM", "PE7", "Finite Element Methods", "");
                mSubjectQuadruplet[10] = new SubjectQuadruplet("RER", "PE7", "Renewable Energy Resources", "");
                mSubjectQuadruplet[11] = new SubjectQuadruplet("AI-MAE", "MAE7", "Artificial Intelligence", "");
                mSubjectQuadruplet[12] = new SubjectQuadruplet("DBMS", "CE7", "Database Management System", Urls.dbmsBook);

//        E_B
                mSubjectQuadruplet[13] = new SubjectQuadruplet("AMSM", "MAE7", "Advanced material science & metallurgy", Urls.amsmBook);
                mSubjectQuadruplet[14] = new SubjectQuadruplet("ACS", "EE7", "Advanced Control System", Urls.advancedControlEngBook);
                mSubjectQuadruplet[15] = new SubjectQuadruplet("PPE", "MAE7", "Power Plant Engineering", "http://urlin.us/3seue");
                mSubjectQuadruplet[16] = new SubjectQuadruplet("IDS", "MAE7", "Introduction to Data Science", "");
                mSubjectQuadruplet[17] = new SubjectQuadruplet("MIS", "PE7", "Management Information System & ERP", "");
                mSubjectQuadruplet[18] = new SubjectQuadruplet("AMM", "MAE7", "Advanced Manufacturing Methods", "");
                mSubjectQuadruplet[19] = new SubjectQuadruplet("Sociology", "7", "Sociology & Elements of Indian History for Engineers", "");
                break;
            case "TE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PTD2", "TE7", "Press Tool Design–II", "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Mould2", "TE7", "Mould Design – II", "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("CAGPD", "TE7", "Computer Aided Graphics & Product Design", "");

                mSubjectQuadruplet[3] = new SubjectQuadruplet("PDTLab2", "TE7", "Press Tool Design–II Lab", "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("MouldLab2", "TE7", "Mould Design – II Lab", "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("CAGPDLab", "TE7", "Computer Aided Graphics & Product Design Lab", "");
//        E_A
                mSubjectQuadruplet[6] = new SubjectQuadruplet("VED", "TE7", "Vibrations Engineering Design", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("OR-MT", "TE7", "Operations Research", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("Automobile-TE", "TE7", "Automobile Engineering", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("CiE", "TE7", "Creativity in Engineering", "");
                mSubjectQuadruplet[10] = new SubjectQuadruplet("AWT-TE", "TE7", "Advanced Welding Technology", "");
                mSubjectQuadruplet[11] = new SubjectQuadruplet("LCA", "TE7", "Low Cost Automation", "");
                mSubjectQuadruplet[12] = new SubjectQuadruplet("DBMS", "CE7", "Database Management System", Urls.dbmsBook);

//        E_B
                mSubjectQuadruplet[13] = new SubjectQuadruplet("RER", "PE7", "Renewable Energy Resources", "");
                mSubjectQuadruplet[14] = new SubjectQuadruplet("MIS", "PE7", "Management Information System & ERP", "");
                mSubjectQuadruplet[15] = new SubjectQuadruplet("Value", "TE7", "Value Engineering", "");
                mSubjectQuadruplet[16] = new SubjectQuadruplet("MaterialMngmt", "TE7", "Material Engineering", "");
                mSubjectQuadruplet[17] = new SubjectQuadruplet("Concurrent", "TE7", "Concurrent Engineering", "");
                mSubjectQuadruplet[18] = new SubjectQuadruplet("Ergonomics", "TE7", "Ergonomics", "");
                mSubjectQuadruplet[19] = new SubjectQuadruplet("Sociology", "7", "Sociology & Elements of Indian History for Engineers", "");
                break;
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 20; i++)
            if(v == buttons[i])
                intent.putExtra("Subject", mSubjectQuadruplet[i].getSubject())
                       .putExtra("Sem", mSubjectQuadruplet[i].getSem())
                       .putExtra("Book", mSubjectQuadruplet[i].getBook());
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
              startActivity(intent);
        }
        catch(Exception e){e.printStackTrace();}
    }
}
