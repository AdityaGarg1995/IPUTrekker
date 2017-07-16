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

import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;

public class SEM5_PE extends AppCompatActivity implements View.OnClickListener{

    Intent intent;

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

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        final Activity a = this;
        a.setTitle("PE: " + ImportantStrings.sem5sub);
    }



    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.skills:
                putExtraCustom(intent,"Skills", Urls.skillsBook);
                break;
            case R.id.skillsLab:
                putExtraCustom(intent,"SkillsLab",Urls.skillsBook);
                break;
            case R.id.im:
                putExtraCustom(intent, "IM", Urls.imBook);
                break;

            case R.id.sta:
                putExtraCustom(intent, "STA", "");
                break;
            case R.id.sga:
                putExtraCustom(intent, "SGA", "");
                break;
            case R.id.ega:
                putExtraCustom(intent, "EGA", "");
                break;
            case R.id.rac:
                putExtraCustom(intent, "RAC", "");
                break;
            case R.id.eemi:
                putExtraCustom(intent, "EEMI", "");
                break;

            case R.id.tppLab:
                putExtraCustom(intent, "TPPLab", "");
                break;
            case R.id.racLab:
                putExtraCustom(intent, "RACLab", "");
                break;
            case R.id.eemiLab:
                putExtraCustom(intent, "EEMILab", "");
                break;
        }
        try {
            if(v.getId() == R.id.skills || v.getId() == R.id.skillsLab || v.getId() == R.id.im)
                intent.putExtra("Sem", "5");
            else  intent.putExtra("Sem", "PE5");

            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }
}