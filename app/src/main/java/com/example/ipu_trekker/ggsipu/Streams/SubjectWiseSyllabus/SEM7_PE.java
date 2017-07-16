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


public class SEM7_PE extends AppCompatActivity implements View.OnClickListener {

//   4 4 6 7
//    Button button1,button2,button3,button4;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe7);

        findViewById(R.id.ppo).setOnClickListener(this);
        findViewById(R.id.rer).setOnClickListener(this);
        findViewById(R.id.pppe).setOnClickListener(this);
        findViewById(R.id.psps).setOnClickListener(this);

        findViewById(R.id.sga_ojt).setOnClickListener(this);
        findViewById(R.id.sta_ojt).setOnClickListener(this);
        findViewById(R.id.pp_ojt).setOnClickListener(this);
        findViewById(R.id.pspsLab).setOnClickListener(this);

//        E_A
        findViewById(R.id.tom).setOnClickListener(this);
        findViewById(R.id.ppm).setOnClickListener(this);
        findViewById(R.id.bpp).setOnClickListener(this);
        findViewById(R.id.pmcm).setOnClickListener(this);
        findViewById(R.id.ncmp).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);

//        E_B
        findViewById(R.id.mie).setOnClickListener(this);
        findViewById(R.id.commEng).setOnClickListener(this);
        findViewById(R.id.ita).setOnClickListener(this);
        findViewById(R.id.fem).setOnClickListener(this);
        findViewById(R.id.rotor).setOnClickListener(this);
        findViewById(R.id.mis).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("PE: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
//            Compulsory
            case R.id.ppo:
                putExtraCustom(intent, "PPO", "PE7", Urls.theoryOfMachinesBook);
                break;
            case R.id.rer:
                putExtraCustom(intent, "RER", "PE7", "");
                break;
            case R.id.pppe:
                putExtraCustom(intent, "PPPE", "PE7", "");
                break;
            case R.id.psps:
                putExtraCustom(intent, "PSPS", "PE7", "");
                break;

            case R.id.sga_ojt:
                putExtraCustom(intent, "SGA-OJT", "PE7", "");
                break;
            case R.id.sta_ojt:
                putExtraCustom(intent, "STA-OJT", "PE7", "");
                break;
            case R.id.pp_ojt:
                putExtraCustom(intent, "PP-OJT", "PE7", "");
                break;
            case R.id.pspsLab:
                putExtraCustom(intent, "PSPSLab", "PE7", "");
                break;
//            E_A
            case R.id.tom:
                putExtraCustom(intent, "ToM", "PE7", "");
                break;
            case R.id.ppm:
                putExtraCustom(intent, "PPM", "PE7", "");
                break;
            case R.id.bpp:
                putExtraCustom(intent, "BPP", "PE7", "");
                break;
            case R.id.pmcm:
                putExtraCustom(intent, "PMCM", "PE7", "");
                break;
            case R.id.ncmp:
                putExtraCustom(intent, "NCMP", "MAE7", "");
                break;
            case R.id.dbms:
                ImportantStrings.dbmsIntentExtra(intent, "CE7");
                break;
//            E_B
            case R.id.mie:
                putExtraCustom(intent, "MIE", "PE7", "");
                break;
            case R.id.commEng:
                putExtraCustom(intent, "CommEng", "PE7", "");
                break;
            case R.id.ita:
                putExtraCustom(intent, "ITA", "PE7", "");
                break;
            case R.id.fem:
                putExtraCustom(intent, "FEM", "MAE7", "");
                break;
            case R.id.rotor:
                putExtraCustom(intent, "Rotor", "MAE7", "");
                break;
            case R.id.mis:
                putExtraCustom(intent, "MIS", "MAE7", "");
                break;
//            Common to all
            case R.id.sociology:
                ImportantStrings.sociologyEngg(intent);
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
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