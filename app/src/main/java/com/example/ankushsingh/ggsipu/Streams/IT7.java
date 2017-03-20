package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;

public class IT7 extends AppCompatActivity implements View.OnClickListener {

    Intent i;
    Activity a  = this;
    String stream = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it7);

        a.setTitle("IT: 7th Semester Subjects");
//        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        findViewById(R.id.acn)      .setOnClickListener(this);
        findViewById(R.id.acnLab)   .setOnClickListener(this);
        findViewById(R.id.crypto)   .setOnClickListener(this);
        findViewById(R.id.cryptoLab).setOnClickListener(this);
        findViewById(R.id.wc)       .setOnClickListener(this);
        findViewById(R.id.wcLab)    .setOnClickListener(this);


        findViewById(R.id.adba).setOnClickListener(this);
        findViewById(R.id.cloud).setOnClickListener(this);
        findViewById(R.id.cSharp).setOnClickListener(this);
        findViewById(R.id.ddb).setOnClickListener(this);
        findViewById(R.id.dsp).setOnClickListener(this);
        findViewById(R.id.embed).setOnClickListener(this);
        findViewById(R.id.graphs).setOnClickListener(this);
        findViewById(R.id.grid).setOnClickListener(this);
        findViewById(R.id.j2ee).setOnClickListener(this);
        findViewById(R.id.opto).setOnClickListener(this);
        findViewById(R.id.semantic).setOnClickListener(this);
        findViewById(R.id.sysAdmin).setOnClickListener(this);
        findViewById(R.id.st).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);


        stream = getIntent().getStringExtra("Stream");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.acn:       i = new Intent(this,Syllabus.class).putExtra("Subject","ACN")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Advanced Computer Networks");
                break;

            case R.id.acnLab:    i = new Intent(this,Syllabus.class).putExtra("Subject","ACNLab")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Advanced Computer Networks Lab");
                break;

            case R.id.wc:        i = new Intent(this,Syllabus.class).putExtra("Subject","WC")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Wireless Communication");
                break;

            case R.id.wcLab:     i = new Intent(this,Syllabus.class).putExtra("Subject","WCLab")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Wireless Communication Lab");
                break;

            case R.id.crypto:    i = new Intent(this,Syllabus.class).putExtra("Subject","CNS")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Cryptography & Network Security");
                break;

            case R.id.cryptoLab: i = new Intent(this,Syllabus.class).putExtra("Subject","CNSLab")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Cryptography & Network Security Lab");
                break;


            case R.id.adba:      i = new Intent(this,Syllabus.class).putExtra("Subject","AdvancedDBA")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Advanced Database Administration");
                break;

            case R.id.cloud:     i = new Intent(this,Syllabus.class).putExtra("Subject","Cloud")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Cloud Computing");

                break;

            case R.id.cSharp:    i = new Intent(this,Syllabus.class).putExtra("Subject","CSharp")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","NET & C# Programming");
               break;

            case R.id.ddb:       i = new Intent(this,Syllabus.class).putExtra("Subject","DistributedDB")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Distributed Databases");
               break;

            case R.id.dsp:       i = new Intent(this,Syllabus.class).putExtra("Subject","DSP")
                                                              .putExtra("Sem","7")
                                                              .putExtra("SubjectName","Digital Signal Processing");
               break;

            case R.id.embed:     i = new Intent(this,Syllabus.class).putExtra("Subject","Embedded")
                                                                .putExtra("Sem","7")
                                                                .putExtra("SubjectName","Embedded Sytems");
               break;

            case R.id.graphs:    i = new Intent(this,Syllabus.class).putExtra("Subject","Graphs")
                                                                 .putExtra("Sem","7")
                                                                 .putExtra("SubjectName","Probabilistic Graphical Models");
               break;

            case R.id.grid:      i = new Intent(this,Syllabus.class).putExtra("Subject","Grid")
                                                               .putExtra("Sem","7")
                                                               .putExtra("SubjectName","Grid Computing");
               break;

            case R.id.j2ee:      i = new Intent(this,Syllabus.class).putExtra("Subject","J2EE")
                                                               .putExtra("Sem","7")
                                                               .putExtra("SubjectName","Enterprise Computing in Java");
               break;

            case R.id.opto:      i = new Intent(this,Syllabus.class).putExtra("Subject","Opto")
                                                               .putExtra("Sem","7")
                                                               .putExtra("SubjectName","Optoelectronics & Optical Comm");
               break;

            case R.id.semantic:  i = new Intent(this,Syllabus.class).putExtra("Subject","Semantic")
                                                                   .putExtra("Sem","7")
                                                                   .putExtra("SubjectName","Semantic Web Technologies");
               break;

            case R.id.sociology: i = new Intent(this,Syllabus.class).putExtra("Subject","Sociology")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName",
                                                                "Sociology and Elements of Indian History for Engineers");
               break;

            case R.id.st:        i = new Intent(this,Syllabus.class).putExtra("Subject","ST")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","Software Testing");
               break;

            case R.id.sysAdmin:  i = new Intent(this,Syllabus.class).putExtra("Subject","SysAdmin")
                                                                    .putExtra("Sem","7")
                                                                    .putExtra("SubjectName","System & Network Administration");
               break;
        }
        try {
            startActivity(i);
        }
        catch(Exception e){e.printStackTrace();}
    }
}
