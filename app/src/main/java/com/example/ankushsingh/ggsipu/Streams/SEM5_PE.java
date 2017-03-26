package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class SEM5_PE extends AppCompatActivity implements View.OnClickListener{

//    Button button1,button2,button3,button4;
    Intent intent;

//    public static final String url2 = "http://engineeringstudymaterial.net/tag/power-plant-engineering-books/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe5);

        findViewById(R.id.skills).setOnClickListener(this);
        findViewById(R.id.im).setOnClickListener(this);
        findViewById(R.id.sga).setOnClickListener(this);
        findViewById(R.id.sta).setOnClickListener(this);
        findViewById(R.id.ega).setOnClickListener(this);

        findViewById(R.id.rac).setOnClickListener(this);
        findViewById(R.id.eemi).setOnClickListener(this);


        findViewById(R.id.skillsLab).setOnClickListener(this);
        findViewById(R.id.tppLab).setOnClickListener(this);
        findViewById(R.id.racLab).setOnClickListener(this);
        findViewById(R.id.eemiLab).setOnClickListener(this);


        final Activity a = this;
        a.setTitle("PE: 5th Semester Subjects");
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.skills:
                intent.putExtra("Subject", "Skills").putExtra("Sem", "5").putExtra("Book", Urls.skillsBook);
                break;
            case R.id.skillsLab:
                intent.putExtra("Subject", "Skills").putExtra("Sem", "5").putExtra("Book", Urls.skillsBook);
                break;
            case R.id.im:
                intent.putExtra("Subject", "IM").putExtra("Sem", "5").putExtra("Book", Urls.imBook);
                break;

            case R.id.sta:
                intent.putExtra("Subject", "STA").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.sga:
                intent.putExtra("Subject", "SGA").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.ega:
                intent.putExtra("Subject", "EGA").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.rac:
                intent.putExtra("Subject", "RAC").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.eemi:
                intent.putExtra("Subject", "EEMI").putExtra("Sem", "PE5").putExtra("Book", "");
                break;

            case R.id.tppLab:
                intent.putExtra("Subject", "TPPLab").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.racLab:
                intent.putExtra("Subject", "RACLab").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
            case R.id.eemiLab:
                intent.putExtra("Subject", "EEMILab").putExtra("Sem", "PE5").putExtra("Book", "");
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}
    }
}

