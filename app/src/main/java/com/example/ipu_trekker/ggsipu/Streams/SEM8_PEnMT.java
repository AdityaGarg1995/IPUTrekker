package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.StreamNames;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

public class SEM8_PEnMT extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Activity a = this;
    String sem, stream;
    Button buttons[] = new Button[19];
    SubjectQuadruplet mSubjectQuadruplet[];
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe8_mt8);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": 8th Semester Subjects");

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);

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

        mSubjectQuadruplet = new SubjectQuadruplet[18];

        mSubjectQuadruplet[0] = StreamNames.setHVPEII();
        setSubjects(stream);

        for (int i = 0; i < 18; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setText(mSubjectQuadruplet[i].getSubjectName());
        }

    }


    public void setSubjects(String stream){
        if(stream.equals("PE")){
            mSubjectQuadruplet[1] = new SubjectQuadruplet("Envo", "PE8",
                    "Environmental Management", "");
            mSubjectQuadruplet[2] = new SubjectQuadruplet("Micro", "PE8",
                    "Microprocessor & Microcontroller", Urls.microBook);

            mSubjectQuadruplet[3] = new SubjectQuadruplet("EnvoLab", "PE8",
                    "Environmental & Energy Audit Lab", "");
            mSubjectQuadruplet[4] = new SubjectQuadruplet("MicroLab", "PE8",
                    "Microprocessor & Microcontroller Lab", Urls.microBook);

            mSubjectQuadruplet[5] = new SubjectQuadruplet("MV", "PE8",
                    "Mechanical Vibrations", "");
            mSubjectQuadruplet[6] = new SubjectQuadruplet("DEM", "PE8",
                    "Design of Electrical Machine", "");
            mSubjectQuadruplet[7] = new SubjectQuadruplet("PM", "PE8",
                    "Project Management", "");
            mSubjectQuadruplet[8] = new SubjectQuadruplet("SG", "PE8",
                    "Smart Grid", "");
            mSubjectQuadruplet[9] = new SubjectQuadruplet("PSAS", "PE8",
                    "Power System Analysis & Stability", "");
            mSubjectQuadruplet[10] = new SubjectQuadruplet("Nuclear", "PE8",
                    "Nuclear Power Generation & Supply", "");
            mSubjectQuadruplet[11] = new SubjectQuadruplet("Robotics", "PE8",
                    "Robotics", "");

            mSubjectQuadruplet[12] = new SubjectQuadruplet("DCN", "ECE8",
                    "Data Communication & Networks", Urls.dcnBook);
            mSubjectQuadruplet[13] = new SubjectQuadruplet("Energy", "PE8",
                    "Energy Management", "");
            mSubjectQuadruplet[14] = new SubjectQuadruplet("ACDC", "PE8",
                    "High Voltage AC & DC Technology", "");
            mSubjectQuadruplet[15] = new SubjectQuadruplet("RLA", "PE8",
                    "Residual Life Assessment & Extension of TPP", "");
            mSubjectQuadruplet[16] = new SubjectQuadruplet("Cryo", "PE8",
                    "Cryogenic Engineering", "");
            mSubjectQuadruplet[17] = new SubjectQuadruplet("TQM", "PE8",
                    "Total Quality Management", "");
        }

        else if(stream.equals("MT")){
            mSubjectQuadruplet[1] = new SubjectQuadruplet("Robotics", "PE8",
                    "Robotics", "");
            mSubjectQuadruplet[2] = new SubjectQuadruplet("Embed-MT", "MT8",
                    "Embedded System", "");

            mSubjectQuadruplet[3] = new SubjectQuadruplet("Robotics", "PE8",
                    "Robotics Lab", "");
            mSubjectQuadruplet[4] = new SubjectQuadruplet("Embed-MT", "MT8",
                    "Embedded System Lab", "");

            mSubjectQuadruplet[5] = new SubjectQuadruplet("ESMS", "MT8",
                    "Engineering System Modelling & Simulation", "");
            mSubjectQuadruplet[6] = new SubjectQuadruplet("FLP", "MT8",
                    "Facility & Layout Planning", "");
            mSubjectQuadruplet[7] = new SubjectQuadruplet("OOSE", "CSE8",
                    "Object Oriented Software Engineering", Urls.ooseBook);
            mSubjectQuadruplet[8] = new SubjectQuadruplet("FA", "MT8",
                    "Factory Automation", "");
            mSubjectQuadruplet[9] = new SubjectQuadruplet("RAC-MT", "MT8",
                    "Refrigeration & Air Conditioning", "");
            mSubjectQuadruplet[10] = new SubjectQuadruplet("VLSI", "8",
                    "VLSI Design", Urls.vlsiBook);
            mSubjectQuadruplet[11] = new SubjectQuadruplet("DCN", "ECE8",
                    "Data Communication & Networks", Urls.dcnBook);

            mSubjectQuadruplet[12] = new SubjectQuadruplet("Consumer", "ECE8",
                    "Consumer Electronics", "");
            mSubjectQuadruplet[13] = new SubjectQuadruplet("SCMP", "TE8",
                    "Supply Chain Management – Planning", "");
            mSubjectQuadruplet[14] = new SubjectQuadruplet("Smart-MT", "MT8",
                    "Intelligent & Smart Instrumentation", "");
            mSubjectQuadruplet[15] = new SubjectQuadruplet("RMM", "MT8",
                    "Reliability & Maintenance Management", "");
            mSubjectQuadruplet[16] = new SubjectQuadruplet("FMM", "MT8",
                    "Flexible Manufacturing System", "");
            mSubjectQuadruplet[17] = new SubjectQuadruplet("EECA", "MT8",
                    "Engineering Economics & Cost Analysis", "");

            t1.setText("ELECTIVE – III");
            t2.setText("ELECTIVE – IV");
        }
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        for (int i = 0; i < 18; i++)
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