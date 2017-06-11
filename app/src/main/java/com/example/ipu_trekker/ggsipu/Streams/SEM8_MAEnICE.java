package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.StreamNames;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import java.util.ArrayList;


public class SEM8_MAEnICE extends AppCompatActivity implements View.OnClickListener {

//    public static final String url2 = "http://www.gatecounsellor.com/books/mechanical-engineering-me/machine-tool-design/";
    Intent intent;
    Activity a = this;
    ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<SubjectQuadruplet> mSubjectQuadruplets = new ArrayList<>();
    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mae8_ice8);

        stream = getIntent().getStringExtra("Stream");

        a.setTitle(stream + ": 8th Semester Subjects");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        buttons.add(0, (Button) findViewById(R.id.b1));
        buttons.add(1, (Button) findViewById(R.id.b2));
        buttons.add(2, (Button) findViewById(R.id.b3));
        buttons.add(3, (Button) findViewById(R.id.b4));
        buttons.add(4, (Button) findViewById(R.id.b5));
        buttons.add(5, (Button) findViewById(R.id.b6));
        buttons.add(6, (Button) findViewById(R.id.b7));
        buttons.add(7, (Button) findViewById(R.id.b8));
        buttons.add(8, (Button) findViewById(R.id.b9));
        buttons.add(9, (Button) findViewById(R.id.b10));
        buttons.add(10, (Button) findViewById(R.id.b11));
        buttons.add(11, (Button) findViewById(R.id.b12));
        buttons.add(12, (Button) findViewById(R.id.b13));
        buttons.add(13, (Button) findViewById(R.id.b14));
        buttons.add(14, (Button) findViewById(R.id.b15));
        buttons.add(15, (Button) findViewById(R.id.b16));
        buttons.add(16, (Button) findViewById(R.id.b17));

        mSubjectQuadruplets.add(0, StreamNames.setHVPEII());
        setSubjects(stream);

        for (int i = 0; i < 17; i++) {
            buttons.get(i).setOnClickListener(this);
            buttons.get(i).setText(mSubjectQuadruplets.get(i).getSubjectName());
        }

    }


    public void setSubjects(String stream){

        switch (stream){
            case "ICE":
                mSubjectQuadruplets.add(1, new SubjectQuadruplet("ISC", "ECE8", "Intelligent Systems & Control", ""));
                mSubjectQuadruplets.add(2, new SubjectQuadruplet("VI", "ECE8", "Virtual Instrumentation", ""));

                mSubjectQuadruplets.add(3, new SubjectQuadruplet("ISCLab", "ECE8", "Robotics Lab", ""));
                mSubjectQuadruplets.add(4, new SubjectQuadruplet("VILab", "ECE8", "Virtual Instrumentation Lab", ""));

                mSubjectQuadruplets.add(5, new SubjectQuadruplet("SMS", "ECE8", "System Modelling & Simulation", ""));
                mSubjectQuadruplets.add(6, new SubjectQuadruplet("Embedded", "EE8", "Embedded Systems", ""));
                mSubjectQuadruplets.add(7, new SubjectQuadruplet("DIP", "8", "Digital Image Processing",
                        Urls.dipBook));
                mSubjectQuadruplets.add(8, new SubjectQuadruplet("VLSI", "8", "VLSI Design",
                        Urls.vlsiBook));
                mSubjectQuadruplets.add(9, new SubjectQuadruplet("Consumer", "ECE8", "Consumer Electronics", ""));
                mSubjectQuadruplets.add(10, new SubjectQuadruplet("MC", "8", "Mobile Communication",
                        Urls.mcBook));

                mSubjectQuadruplets.add(11, new SubjectQuadruplet("Robotics", "ECE8", "Robotics", ""));
                mSubjectQuadruplets.add(12, new SubjectQuadruplet("AdHoc", "8", "Ad Hoc & Sensor Networks",
                        Urls.adHocBook));
                mSubjectQuadruplets.add(13, new SubjectQuadruplet("OOSE", "CSE8", "Object Oriented Software Engineering", ""));
                mSubjectQuadruplets.add(14, new SubjectQuadruplet("CGMM-ECE", "ECE8", "Computer Graphics & Multimedia", ""));
                mSubjectQuadruplets.add(15, new SubjectQuadruplet("EMFT", "ECE8", "Electromagnetic Field Theory", ""));
                mSubjectQuadruplets.add(16, new SubjectQuadruplet("SatComm", "8", "Satellite Communication", ""));
                break;

            case "MAE":
                mSubjectQuadruplets.add(1, new SubjectQuadruplet("Robotics", "PE8", "Robotics", ""));
                mSubjectQuadruplets.add(2, new SubjectQuadruplet("ESMS", "MT8", "Engineering System Modelling & Simulation", ""));

                mSubjectQuadruplets.add(3, new SubjectQuadruplet("RoboticsLab", "PE8", "Robotics Lab", ""));
                mSubjectQuadruplets.add(4, new SubjectQuadruplet("ESMSLab", "PE8", "Engineering System Modelling & Simulation Lab", ""));

                mSubjectQuadruplets.add(5, new SubjectQuadruplet("IPMV", "ECE8", "Image Processing & Machine Vision", ""));
                mSubjectQuadruplets.add(6, new SubjectQuadruplet("Soft", "8", "Soft Computing",
                        "http://www.wearealgerians.com/up/uploads/139955152739491.pdf"));
                mSubjectQuadruplets.add(7, new SubjectQuadruplet("TQM", "PE8", "Total Quality Management", ""));
                mSubjectQuadruplets.add(8, new SubjectQuadruplet("Plastic", "ME8", "Applied Plasticity", ""));
                mSubjectQuadruplets.add(9, new SubjectQuadruplet("CAGPD", "ME8", "Computer Aided Graphics & Product Design", ""));
                mSubjectQuadruplets.add(10, new SubjectQuadruplet("MSBPD", "ECE8", "Microprocessor System Based Process Design", ""));

                mSubjectQuadruplets.add(11, new SubjectQuadruplet("GTC", "MAE8", "Gas Turbines & Compressors", ""));
                mSubjectQuadruplets.add(12, new SubjectQuadruplet("RP", "ME8", "Cryogenic Engineering", ""));
                mSubjectQuadruplets.add(13, new SubjectQuadruplet("RP", "ME8", "Rapid Prototyping", ""));
                mSubjectQuadruplets.add(14, new SubjectQuadruplet("FMS", "MT8", "Flexible Manufacturing System", ""));
                mSubjectQuadruplets.add(15, new SubjectQuadruplet("SCMP", "TE8", "Supply Chain Management - Planning", ""));
                mSubjectQuadruplets.add(16, new SubjectQuadruplet("PPCE", "MAE8", "Process Planning & Cost Estimation", ""));
                break;
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < buttons.size(); i++){
            if(v == buttons.get(i)){
                intent.putExtra("Subject", mSubjectQuadruplets.get(i).getSubject())
                      .putExtra("Sem", mSubjectQuadruplets.get(i).getSem())
                      .putExtra("Book", mSubjectQuadruplets.get(i).getBook());
            }
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch(Exception e){e.printStackTrace();}
    }
}