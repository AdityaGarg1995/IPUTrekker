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

import static com.example.ipu_trekker.ggsipu.ImportantStrings.dbmsSubject;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.lab;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.setMIS;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.setRER;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.setSociology;

public class SEM7_ITnCSEnTEnMAE extends AppCompatActivity implements View.OnClickListener {
//   3 3 7 7
//   IT, TE, MAE, CSE
    Intent intent;
    Activity a  = this;
    String stream = "";
    Button buttons[];

    SubjectQuadruplet mSubjectQuadruplet[];

    String acn = "Advanced Computer Networks",
           wc = "Wireless Communication",
           cns = "Cryptography & Network Security";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it7);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": " + ImportantStrings.sem7sub);

        buttons = new Button[20];
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
        mSubjectQuadruplet[0] = setACN();
        mSubjectQuadruplet[1] = new SubjectQuadruplet("CNS", "7", cns, Urls.cryptoBook);
        mSubjectQuadruplet[2] = setWC();

        mSubjectQuadruplet[3] = new SubjectQuadruplet("ACNLab", "7", acn + lab, Urls.acnBook);
        mSubjectQuadruplet[4] = new SubjectQuadruplet("CNSLab", "7", cns + lab, Urls.cryptoBook);
        mSubjectQuadruplet[5] = setWCLab();
//                E_A
        mSubjectQuadruplet[6] = setEmbedded();
        mSubjectQuadruplet[7] = new SubjectQuadruplet("Opto", "7", "Optoelectronics & Optical Communication", "");
        mSubjectQuadruplet[8] = new SubjectQuadruplet("Cloud", "7", "Cloud Computing", "");
        mSubjectQuadruplet[9] = new SubjectQuadruplet("DistributedDB", "7", "Distributed Databases", "");
        mSubjectQuadruplet[10] = new SubjectQuadruplet("Semantic", "7", "Semantic Web Technologies", "");
        mSubjectQuadruplet[11] = new SubjectQuadruplet("ST", "7", "Software Testing", Urls.softwareTestingBook);
        mSubjectQuadruplet[12] = setDSP();
//                E_B
        mSubjectQuadruplet[13] = new SubjectQuadruplet("CSharp", "7", ".NET & C# Programming", Urls.cSharpBook);
        mSubjectQuadruplet[14] = new SubjectQuadruplet("J2EE", "7", "Enterprise Computing in Java", "");
        mSubjectQuadruplet[15] = new SubjectQuadruplet("SysAdmin", "7", "System & Network Administration", "");
        mSubjectQuadruplet[16] = new SubjectQuadruplet("Grid", "7", "Grid Computing", "");
        mSubjectQuadruplet[17] = new SubjectQuadruplet("AdvancedDBA", "7", "Advanced Database Administration", "");
        mSubjectQuadruplet[18] = new SubjectQuadruplet("Graphs", "7", "Probablistic Graphical Models", "");

        mSubjectQuadruplet[19] = setSociology();

        setSubjects();
        for(int i = 0; i < 20; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }
    }

    public SubjectQuadruplet setDBMS(){
        return new SubjectQuadruplet("DBMS", "CE7", dbmsSubject, Urls.dbmsBook);
    }
    public SubjectQuadruplet setACN(){
        return new SubjectQuadruplet("ACN", "7", acn, Urls.acnBook);
    }

    public SubjectQuadruplet setWC(){
        return new SubjectQuadruplet("WC", "7", wc, Urls.wcBook);
    }
    public SubjectQuadruplet setWCLab(){
        return new SubjectQuadruplet("WCLab", "7", wc, Urls.wcBook);
    }

    public SubjectQuadruplet setEmbedded(){
        return new SubjectQuadruplet("Embedded", "7", "Embedded Systems", "");
    }

    public SubjectQuadruplet setDSP(){
        return new SubjectQuadruplet("DSP", "7", "Digital Signal Processing", "");
    }


    public void setSubjects(){

        String cad   = "Computer Aided Design",
               cim   = "Computer Integrated Manufacturing",
               mecha = "Mechatronics",
               ptd   = "Press Tool Design–II",
               mould = "Mould Design–II",
               cagpd = "Computer Aided Graphics & Product Design",
               cs    = "Control Systems";


        switch (stream) {
            case "MAE":
                mSubjectQuadruplet[0] = new SubjectQuadruplet("CAD", "MAE7", cad, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("CIM", "MAE7", cim, "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("Mecha", "EE7", mecha, "");

                mSubjectQuadruplet[3] = new SubjectQuadruplet("CADLab", "MAE7", cad+lab, "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("CIMLab", "MAE7", cim+lab, "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("MechaLab", "EE7", mecha+lab, "");
//        E_A
                mSubjectQuadruplet[6] = new SubjectQuadruplet("OT", "MAE7", "Optimization Techniques", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("PMCM", "PE7", "Preventive Maintenance & Condition Monitoring", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("CFD", "MAE7", "Computational Fluid Dynamics", "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("FEM", "MAE7", "Finite Element Methods", "");
                mSubjectQuadruplet[10] = setRER();
                mSubjectQuadruplet[11] = new SubjectQuadruplet("AI-MAE", "MAE7", "Artificial Intelligence", "");
                mSubjectQuadruplet[12] = setDBMS();

//        E_B
                mSubjectQuadruplet[13] = new SubjectQuadruplet("AMSM", "MAE7", "Advanced Material Science & Metallurgy", Urls.amsmBook);
                mSubjectQuadruplet[14] = new SubjectQuadruplet("ACS", "EE7", "Advanced "+cs, Urls.advancedControlEngBook);
                mSubjectQuadruplet[15] = new SubjectQuadruplet("PPE", "MAE7", "Power Plant Engineering", "http://urlin.us/3seue");
                mSubjectQuadruplet[16] = new SubjectQuadruplet("IDS", "MAE7", "Introduction to Data Science", "");
                mSubjectQuadruplet[17] = setMIS();
                mSubjectQuadruplet[18] = new SubjectQuadruplet("AMM", "MAE7", "Advanced Manufacturing Methods", "");
                break;

            case "TE":
                String ergo = "Ergonomics",
                       engg = "Engineering",
                       conc = "Concurrent";
                mSubjectQuadruplet[0] = new SubjectQuadruplet("PTD2", "TE7", ptd, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("Mould2", "TE7", mould, "");
                mSubjectQuadruplet[2] = new SubjectQuadruplet("CAGPD", "TE7", cagpd, "");

                mSubjectQuadruplet[3] = new SubjectQuadruplet("PDTLab2", "TE7", ptd + lab, "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("MouldLab2", "TE7", mould + lab, "");
                mSubjectQuadruplet[5] = new SubjectQuadruplet("CAGPDLab", "TE7", cagpd + lab, "");
//        E_A
                mSubjectQuadruplet[6] = new SubjectQuadruplet("VED", "TE7", "Vibrations Engineering Design", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("OR-MT", "TE7", "Operations Research", "");
                mSubjectQuadruplet[8] = new SubjectQuadruplet("Automobile-TE", "TE7", "Automobile "+engg, "");
                mSubjectQuadruplet[9] = new SubjectQuadruplet("CiE", "TE7", "Creativity in "+engg, "");
                mSubjectQuadruplet[10] = new SubjectQuadruplet("AWT-TE", "TE7", "Advanced Welding Technology", "");
                mSubjectQuadruplet[11] = new SubjectQuadruplet("LCA", "TE7", "Low Cost Automation", "");
                mSubjectQuadruplet[12] = setDBMS();

//        E_B
                mSubjectQuadruplet[13] = setRER();
                mSubjectQuadruplet[14] = setMIS();
                mSubjectQuadruplet[15] = new SubjectQuadruplet("Value", "TE7", "Value "+engg, "");
                mSubjectQuadruplet[16] = new SubjectQuadruplet("MaterialMngmt", "TE7", "Material "+engg, "");
                mSubjectQuadruplet[17] = new SubjectQuadruplet(conc, "TE7", conc+" "+engg, "");
                mSubjectQuadruplet[18] = new SubjectQuadruplet(ergo, "TE7", ergo, "");
                break;

            case "CSE":
                String is = "Information Security",
                       stqa = "Software Testing & Quality Assurance",
                       lab = " Lab";

                mSubjectQuadruplet[0] = new SubjectQuadruplet("IS", "CSE7", is, "");
                mSubjectQuadruplet[1] = new SubjectQuadruplet("STQA", "CSE7", stqa, "");
                mSubjectQuadruplet[2] = setWC();

                mSubjectQuadruplet[3] = new SubjectQuadruplet("ISLab", "CSE7", is + lab, "");
                mSubjectQuadruplet[4] = new SubjectQuadruplet("STQALab", "CSE7", stqa + lab, "");
                mSubjectQuadruplet[5] = setWCLab();
//                E_A
                mSubjectQuadruplet[6] = new SubjectQuadruplet("CT", "CSE7", "Complexity Theory", "");
                mSubjectQuadruplet[7] = new SubjectQuadruplet("IPR", "CSE7", "Intellectual Property Rights", "");
                mSubjectQuadruplet[8] = setEmbedded();
                mSubjectQuadruplet[9] = new SubjectQuadruplet("DMBI", "CSE7", "Data Mining & Business Intelligence", "");
                mSubjectQuadruplet[10] = new SubjectQuadruplet("ACA", "CSE7", "Advanced Computer Architecture", "");
                mSubjectQuadruplet[11] = new SubjectQuadruplet("NLP", "CSE7", "Natural Language Processing", "");
//                E_B
                mSubjectQuadruplet[12] = new SubjectQuadruplet("", "", "", "" );
                mSubjectQuadruplet[13] = setDSP();
                mSubjectQuadruplet[14] = new SubjectQuadruplet("SnM", "CSE7", "Simulation & Modelling", "");
                mSubjectQuadruplet[15] = new SubjectQuadruplet("ADBMS", "CSE7", "Advanced DBMS", "");
                mSubjectQuadruplet[16] = new SubjectQuadruplet("PC", "CSE7", "Parallel Computing", "");
                mSubjectQuadruplet[17] = setACN();
                mSubjectQuadruplet[18] = new SubjectQuadruplet("CS", "CSE7", cs, "");
                mSubjectQuadruplet[19] = ImportantStrings.setSociology();
                buttons[12].setVisibility(View.GONE);
        }
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