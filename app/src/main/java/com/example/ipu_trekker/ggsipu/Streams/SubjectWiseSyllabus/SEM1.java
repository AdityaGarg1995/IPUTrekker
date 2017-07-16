package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;

public class SEM1 extends AppCompatActivity implements View.OnClickListener {

    Activity a = this;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);

        findViewById(R.id.am_i).setOnClickListener(this);
        findViewById(R.id.ap_i).setOnClickListener(this);
        findViewById(R.id.ap_iLab).setOnClickListener(this);
        findViewById(R.id.chem).setOnClickListener(this);
        findViewById(R.id.chemLab).setOnClickListener(this);
        findViewById(R.id.egLab).setOnClickListener(this);
        findViewById(R.id.et).setOnClickListener(this);
        findViewById(R.id.etLab).setOnClickListener(this);
        findViewById(R.id.foc).setOnClickListener(this);
        findViewById(R.id.focLab).setOnClickListener(this);
        findViewById(R.id.hvpe_i).setOnClickListener(this);
        findViewById(R.id.mp).setOnClickListener(this);
        findViewById(R.id.mpLab).setOnClickListener(this);

        a.setTitle(ImportantStrings.sem1sub);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.am_i:
                putExtraCustom(intent, "AM-I", Urls.amBook);
                break;

            case R.id.ap_i:
                putExtraCustom(intent, "AP-I", Urls.ap_iBook);
                break;
            case R.id.ap_iLab:
                putExtraCustom(intent, "APLab-I", Urls.ap_iBook);
                break;

            case R.id.chem:
                putExtraCustom(intent, "Chem", Urls.chemBook);
                break;
            case R.id.chemLab:
                putExtraCustom(intent, "ChemLab", Urls.chemBook);
                break;

            case R.id.egLab:
                putExtraCustom(intent, "EGLab", "http://bit.ly/2biUxCC");
                break;

            case R.id.et:
                putExtraCustom(intent, "ET", "");
                break;
            case R.id.etLab:
                putExtraCustom(intent, "ETLab", "");
                break;

            case R.id.foc:
                putExtraCustom(intent, "FoC", "http://www.openoffice.org/why/");
                break;
            case R.id.focLab:
                putExtraCustom(intent, "FoCLab", "http://projects.gnome.org/dia/");
                break;

            case R.id.hvpe_i:
                putExtraCustom(intent, "HVPE", "http.//www.universalhumanvalues.info");
                break;

            case R.id.mp:
                putExtraCustom(intent, "MP", Urls.mpBook);
                break;
            case R.id.mpLab:
                putExtraCustom(intent, "MPLab", Urls.mpBook);
                break;
        }
        try {
            intent.putExtra("Sem", "1").putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
               startActivity(intent);
        }catch (Exception e){e.printStackTrace();}
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