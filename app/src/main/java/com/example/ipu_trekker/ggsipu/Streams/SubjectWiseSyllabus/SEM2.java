package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;

public class SEM2 extends AppCompatActivity  implements View.OnClickListener {

    Activity a = this;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);

        findViewById(R.id.am_ii).setOnClickListener(this);
        findViewById(R.id.ap_ii).setOnClickListener(this);
        findViewById(R.id.ap_iiLab).setOnClickListener(this);
        findViewById(R.id.ed).setOnClickListener(this);
        findViewById(R.id.edLab).setOnClickListener(this);
        findViewById(R.id.em).setOnClickListener(this);
        findViewById(R.id.emLab).setOnClickListener(this);
        findViewById(R.id.evs).setOnClickListener(this);
        findViewById(R.id.evsLab).setOnClickListener(this);
        findViewById(R.id.itp).setOnClickListener(this);
        findViewById(R.id.itpLab).setOnClickListener(this);
        findViewById(R.id.skills_i).setOnClickListener(this);

        a.setTitle(ImportantStrings.sem2sub);
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.am_ii:
                putExtraCustom(intent, "AM-II", Urls.amBook);
                break;

            case R.id.ap_ii:
                putExtraCustom(intent, "AP-II", Urls.ap_iBook);
                break;
            case R.id.ap_iiLab:
                putExtraCustom(intent, "APLab-II", Urls.ap_iBook);
                break;

            case R.id.ed:
                putExtraCustom(intent, "ED", "https://archive.org/details/ElectronicDevicesCircuits");
                break;
            case R.id.edLab:
                putExtraCustom(intent, "EDLab", "https://archive.org/details/ElectronicDevicesCircuits");
                break;

            case R.id.em:
                putExtraCustom(intent, "EM", "scilab.in/textbook_companion/generate_book/3204");
                break;
            case R.id.emLab:
                putExtraCustom(intent, "EMLab", "scilab.in/textbook_companion/generate_book/3204");
                break;

            case R.id.evs:
                putExtraCustom(intent, "EVS", "http://mft.info/core/uploads/sites/32/2016/04/ENVIRONMENTAL-SCIENCE.pdf");
                break;
            case R.id.evsLab:
                putExtraCustom(intent, "EVSLab", "dst.gov.in/green-chem.pdf");
                break;

            case R.id.itp:
                putExtraCustom(intent, "ITP", "http://www.codeblocks.org/");
                break;
            case R.id.itpLab:
                putExtraCustom(intent, "ITPLab", "http://www.codeblocks.org/");
                break;

            case R.id.skills_i:
                putExtraCustom(intent, "Skills-I", "http://www.eiilmuniversity.co.in/downloads/Communication_Principles.pdf");
                break;
        }
        try {
            intent.putExtra("Sem", "2").putExtra("SubjectName", ((Button)v).getText().toString());
            if(intent != null)
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