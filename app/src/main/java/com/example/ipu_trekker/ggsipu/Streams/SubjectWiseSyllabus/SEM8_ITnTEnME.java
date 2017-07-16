package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import java.util.ArrayList;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.lab;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.setSoftComputing;

public class SEM8_ITnTEnME extends AppCompatActivity implements View.OnClickListener {

//    3 2 8 7
//    IT8, TE8, ME8
    Intent intent;
    Activity a = this;
    String stream;

    Button buttons[] = new Button[20];

    ArrayList<Button> buttonList = new ArrayList<>();
    ArrayList<SubjectQuadruplet> mSubjectQuadruplets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it8);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": " + ImportantStrings.sem8sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        buttons[0] = (Button) findViewById(R.id.hvpe_ii);
        buttons[1] = (Button) findViewById(R.id.adHoc);
        buttons[2] = (Button) findViewById(R.id.mc);

        mSubjectQuadruplets.add(0, ImportantStrings.setHVPEII());
        setSubjects();
    }


    public SubjectQuadruplet setRobotics(){
        return new SubjectQuadruplet("Robotics", "PE8", "Robotics", "");
    }

    public void setSubjects(){
        switch (stream){
            case "IT":
                buttons[3] = (Button) findViewById(R.id.adHocLab);
                buttons[4] = (Button) findViewById(R.id.mcLab);

                buttons[5] = (Button) findViewById(R.id.bigData);
                buttons[6] = (Button) findViewById(R.id.social);
                buttons[7] = (Button) findViewById(R.id.infoTheory);
                buttons[8] = (Button) findViewById(R.id.vlsi);
                buttons[9] = (Button) findViewById(R.id.soft);
                buttons[10] = (Button) findViewById(R.id.net);
                buttons[11] = (Button) findViewById(R.id.hci);
                buttons[12] = (Button) findViewById(R.id.biInfo);

                buttons[13] = (Button) findViewById(R.id.dip);
                buttons[14] = (Button) findViewById(R.id.nextGen);
                buttons[15] = (Button) findViewById(R.id.gps);
                buttons[16] = (Button) findViewById(R.id.satComm);
                buttons[17] = (Button) findViewById(R.id.ecom);
                buttons[18] = (Button) findViewById(R.id.ds);
                buttons[19] = (Button) findViewById(R.id.trends);


                String adHocSubject = "Ad hoc & Sensor Networks",
                       mcSubject = "Mobile Communication",
                       adHoc = "AdHoc",
                       mc = "MC",
                       distribute = "Distributed";

                mSubjectQuadruplets.add(1, new SubjectQuadruplet(adHoc, "8", adHocSubject,
                        Urls.adHocBook));
                mSubjectQuadruplets.add(2, new SubjectQuadruplet(mc, "8", mcSubject,
                        Urls.mcBook));

                mSubjectQuadruplets.add(3, new SubjectQuadruplet(adHoc + "Lab", "8", adHocSubject + lab,
                        Urls.adHocBook));
                mSubjectQuadruplets.add(4, new SubjectQuadruplet(mc + "Lab", "8", mcSubject + lab,
                        "http://iit.qau.edu.pk/books/Android.Application.Development.for.For.Dummies.pdf"));

                mSubjectQuadruplets.add(5, new SubjectQuadruplet("BigData", "8", "Big Data Analytics",
                        "http://eecs.wsu.edu/~yinghui/mat/courses/fall%202015/resources/Big%20data%20for%20dummies.pdf"));
                mSubjectQuadruplets.add(6, new SubjectQuadruplet("SocialNetwork", "8", "Social Network Analysis",
                        "https://archive.org/details/SocialAndEconomicNetworksMatthewO.Jackson"));
                mSubjectQuadruplets.add(7, new SubjectQuadruplet("InfoTheory", "8", "Information Theory & Coding",
                        "http://coltech.vnu.edu.vn/~thainp/books/Wiley_-_2006_-_Elements_of_Information_Theory_2nd_Ed.pdf"));
                mSubjectQuadruplets.add(8, new SubjectQuadruplet("VLSI", "8", "VLSI Design",
                        Urls.vlsiBook));
                mSubjectQuadruplets.add(9, setSoftComputing());
                mSubjectQuadruplets.add(10, new SubjectQuadruplet(".NET", "8", "Web Application development using .NET",
                        "ftp://www.mans.edu.eg/Learn/Asp.Net2008/Sams.ASP.NET.3.5.Unleashed.Jan.2008.pdf"));
                mSubjectQuadruplets.add(11, new SubjectQuadruplet("HCI", "8", "Human Computer Interaction",
                        "http://fit.mta.edu.vn/files/DanhSach/__Human_computer_interaction.pdf"));
                mSubjectQuadruplets.add(12, new SubjectQuadruplet("BioInfo", "8", "Bio Informatics",
                        "ftp://ftp.ufv.br/dbg/material%20curso%20bioinfo/Leitura%20Complementar/livros/MIT%20Press,%20Bioinformatics%20The%20Machine%20Learning%20Approach%202Nd%20Edition.pdf"));

                mSubjectQuadruplets.add(13, new SubjectQuadruplet("DIP", "8", "Digital Image Processing",
                        Urls.dipBook));
                mSubjectQuadruplets.add(14, new SubjectQuadruplet("NextGen", "8", "Next Generation Networks",
                        "https://imcs.dvfu.ru/lib.int/docs/Networks/Administration/Next%20Generation%20Network%20Services.pdf"));
                mSubjectQuadruplets.add(15, new SubjectQuadruplet("GPS", "8", "GPS & GIS",
                        "http://www.garmin.com/manuals/gps4beg.pdf"));
                mSubjectQuadruplets.add(16, new SubjectQuadruplet("SatComm", "8", "Satellite Communication",
                        Urls.satCommBook));
                mSubjectQuadruplets.add(17, new SubjectQuadruplet("Ecom", "8", "E-Commerce & M-Commerce",
                        Urls.ecomBook));
                mSubjectQuadruplets.add(18, new SubjectQuadruplet(distribute, "8", distribute+" Systems",
                        "https://vowi.fsinf.at/images/b/bc/TU_Wien-Verteilte_Systeme_VO_(G%C3%B6schka)_-_Tannenbaum-distributed_systems_principles_and_paradigms_2nd_edition.pdf"));
                mSubjectQuadruplets.add(19, new SubjectQuadruplet("TrendsInIT", "8", "Selected Topics of Recent Trends in Information Technology",
                        "https://mis343dw.wikispaces.com/file/view/%5Bbackup%5Ddata-warehousing-fundamentals-for-it-professionals.9780470462072.52994.pdf"));

                for (int i = 0; i < 20; i++) {
                    buttons[i].setOnClickListener(this);
                    buttons[i].setText(mSubjectQuadruplets.get(i).getSubjectName());
                    buttonList.add(i, buttons[i]);
                }
                break;

            case "TE":
                buttons[3] = (Button) findViewById(R.id.bigData);
                buttons[4] = (Button) findViewById(R.id.social);
                buttons[5] = (Button) findViewById(R.id.infoTheory);
                buttons[6] = (Button) findViewById(R.id.vlsi);
                buttons[7] = (Button) findViewById(R.id.soft);
                buttons[8] = (Button) findViewById(R.id.net);

                buttons[9] = (Button) findViewById(R.id.dip);
                buttons[10] = (Button) findViewById(R.id.nextGen);
                buttons[11] = (Button) findViewById(R.id.gps);
                buttons[12] = (Button) findViewById(R.id.satComm);
                buttons[13] = (Button) findViewById(R.id.ecom);


                buttons[14] = (Button) findViewById(R.id.adHocLab);
                buttons[15] = (Button) findViewById(R.id.mcLab);
                buttons[16] = (Button) findViewById(R.id.hci);
                buttons[17] = (Button) findViewById(R.id.biInfo);
                buttons[18] = (Button) findViewById(R.id.ds);
                buttons[19] = (Button) findViewById(R.id.trends);


                for(int i = 14; i < 20; i++)
                   buttons[i].setVisibility(View.GONE);


                TextView t1 = (TextView) findViewById(R.id.t1);
                t1.setVisibility(View.GONE);

                mSubjectQuadruplets.add(1, new SubjectQuadruplet("ADCDD", "TE8", "Advanced Die Casting & Die Design", ""));
                mSubjectQuadruplets.add(2, new SubjectQuadruplet("MMS", "TE8", "Modern Manufacturing Methods", ""));

                mSubjectQuadruplets.add(3, new SubjectQuadruplet("Cryo", "PE8", "Cryogenic Engineering", ""));
                mSubjectQuadruplets.add(4, new SubjectQuadruplet("TDO", "TE8", "Theory of Design Optimization", ""));
                mSubjectQuadruplets.add(5, new SubjectQuadruplet("FMS", "PE8", "Flexible Manufacturing System", ""));
                mSubjectQuadruplets.add(6, new SubjectQuadruplet("Plastic", "ME8", "Applied Plasticity", ""));
                mSubjectQuadruplets.add(7, setRobotics());
                mSubjectQuadruplets.add(8, new SubjectQuadruplet("ESMS", "MT8", "Engineering System Modeling & Simulation", ""));

                mSubjectQuadruplets.add(9, new SubjectQuadruplet("PM", "PE8", "Project Management", ""));
                mSubjectQuadruplets.add(10, setSoftComputing());
                mSubjectQuadruplets.add(11, new SubjectQuadruplet("IM", "5", "Industrial Management", ""));
                mSubjectQuadruplets.add(12, new SubjectQuadruplet("SCMP", "TE8", "Supply Chain Management-Planning", ""));
                mSubjectQuadruplets.add(13, new SubjectQuadruplet("Safety", "TE8", "Safety Engineering", ""));

                for (int i = 0; i < 14; i++) {
                    buttons[i].setOnClickListener(this);
                    buttons[i].setText(mSubjectQuadruplets.get(i).getSubjectName());
                    buttonList.add(i, buttons[i]);
                }
                break;

            case "ME":
                buttons[3] = (Button) findViewById(R.id.adHocLab);
                buttons[4] = (Button) findViewById(R.id.mcLab);

                buttons[5] = (Button) findViewById(R.id.bigData);
                buttons[6] = (Button) findViewById(R.id.social);
                buttons[7] = (Button) findViewById(R.id.infoTheory);
                buttons[8] = (Button) findViewById(R.id.vlsi);
                buttons[9] = (Button) findViewById(R.id.soft);
                buttons[10] = (Button) findViewById(R.id.net);

                buttons[11] = (Button) findViewById(R.id.dip);
                buttons[12] = (Button) findViewById(R.id.nextGen);
                buttons[13] = (Button) findViewById(R.id.gps);
                buttons[14] = (Button) findViewById(R.id.satComm);
                buttons[15] = (Button) findViewById(R.id.ecom);


                buttons[16] = (Button) findViewById(R.id.hci);
                buttons[17] = (Button) findViewById(R.id.biInfo);
                buttons[18] = (Button) findViewById(R.id.ds);
                buttons[19] = (Button) findViewById(R.id.trends);


                for(int i = 16; i < 20; i++)
                    buttons[i].setVisibility(View.GONE);

                String sqcrSubject = "Statistical Quality Control & Reliability",
                       esmsSubject = "Engineering System Modeling & Simulation",
                       sqcr = "SQCR",
                       esms = "ESMS";

                mSubjectQuadruplets.add(1, new SubjectQuadruplet(sqcr, "ME8", sqcrSubject, ""));
                mSubjectQuadruplets.add(2, new SubjectQuadruplet(esms, "MT8", esmsSubject, ""));

                mSubjectQuadruplets.add(3, new SubjectQuadruplet(sqcr + "Lab", "ME8", sqcrSubject + lab, ""));
                mSubjectQuadruplets.add(4, new SubjectQuadruplet(esms + "Lab", "MT8", esmsSubject + lab, ""));

                mSubjectQuadruplets.add(5, new SubjectQuadruplet("Nuclear", "PE8", "Nuclear Power Generation & Supply", ""));
                mSubjectQuadruplets.add(6, setRobotics());
                mSubjectQuadruplets.add(7, new SubjectQuadruplet("RP", "ME8", "Rapid prototyping", ""));
                mSubjectQuadruplets.add(8, new SubjectQuadruplet("MV", "PE8", "Mechanical Vibrations", ""));
                mSubjectQuadruplets.add(9, setSoftComputing());
                mSubjectQuadruplets.add(10, new SubjectQuadruplet("DCN", "ECE8", "Data Communication & Networks", Urls.dcnBook));

                mSubjectQuadruplets.add(11, new SubjectQuadruplet("GD", "ME8", "Gas Dynamics", ""));
                mSubjectQuadruplets.add(12, new SubjectQuadruplet("SCMP", "TE8", "Supply Chain Management-Planning", ""));
                mSubjectQuadruplets.add(13, new SubjectQuadruplet("TQM", "PE8", "Total Quality Management", ""));
                mSubjectQuadruplets.add(14, new SubjectQuadruplet("Cryo", "PE8", "Cryogenic Engineering", ""));
                mSubjectQuadruplets.add(15, new SubjectQuadruplet("TM", "ME8", "Turbo Machinery", ""));

                for (int i = 0; i < 16; i++) {
                    buttons[i].setOnClickListener(this);
                    buttons[i].setText(mSubjectQuadruplets.get(i).getSubjectName());
                    buttonList.add(i, buttons[i]);
                }
                break;
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this,Syllabus.class);
        for (int i = 0; i < buttonList.size(); i++)
            if (v == buttonList.get(i))
                ImportantStrings.putExtraSubjectQuadruplet(intent, mSubjectQuadruplets.get(i));
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if(intent != null)
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