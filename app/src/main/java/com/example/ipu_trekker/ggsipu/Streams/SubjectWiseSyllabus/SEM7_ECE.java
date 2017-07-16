package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;

public class SEM7_ECE extends AppCompatActivity implements View.OnClickListener{
//    3 3 9 7
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece7);

//        Compulsory -Theory
        findViewById(R.id.embed).setOnClickListener(this);
        findViewById(R.id.opto).setOnClickListener(this);
        findViewById(R.id.wc).setOnClickListener(this);

//        Compulsory -Practical
        findViewById(R.id.embedLab).setOnClickListener(this);
        findViewById(R.id.optoLab).setOnClickListener(this);
        findViewById(R.id.wcLab).setOnClickListener(this);

//        E-A
        findViewById(R.id.adsp).setOnClickListener(this);
        findViewById(R.id.mems).setOnClickListener(this);
        findViewById(R.id.avlsi).setOnClickListener(this);
        findViewById(R.id.bmi).setOnClickListener(this);
        findViewById(R.id.scada).setOnClickListener(this);
        findViewById(R.id.pe).setOnClickListener(this);
        findViewById(R.id.rfdc).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);
        findViewById(R.id.rer).setOnClickListener(this);

//        E-B
        findViewById(R.id.rn).setOnClickListener(this);
        findViewById(R.id.pm).setOnClickListener(this);
        findViewById(R.id.eco).setOnClickListener(this);
        findViewById(R.id.gc).setOnClickListener(this);
        findViewById(R.id.pc).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);
        findViewById(R.id.topics).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("ECE: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        String embedded = "Embedded";
        switch(v.getId()){
            case R.id.embed:
                putExtraCustom(intent, embedded, "7", "");
                break;
            case R.id.opto:
                putExtraCustom(intent, "Opto", "7", "");
                break;
            case R.id.wc:
                putExtraCustom(intent, "WC", "7", Urls.wcBook);
                break;

            case R.id.embedLab:
                putExtraCustom(intent, embedded+"Lab", "7", "");
                break;
            case R.id.optoLab:
                putExtraCustom(intent, "OptoLab", "7", "");
                break;
            case R.id.wcLab:
                putExtraCustom(intent, "WCLab", "7", Urls.wcBook);
                break;

//            E-A
            case R.id.adsp:
                putExtraCustom(intent, "ADSP", "ECE7", "");
                break;
            case R.id.mems:
                putExtraCustom(intent, "MEMS", "ECE7", "");
                break;
            case R.id.avlsi:
                putExtraCustom(intent, "AVLSI", "ECE7", "");
                break;
            case R.id.bmi:
                putExtraCustom(intent, "BMI", "ECE7", "");
                break;
            case R.id.scada:
                putExtraCustom(intent, "SCADA", "ECE7", "");
                break;
            case R.id.pe:
                putExtraCustom(intent, "PE-ECE", "ECE7", "");
                break;
            case R.id.rfdc:
                putExtraCustom(intent, "RFDC", "ECE7", "");
                break;
            case R.id.dbms:
                ImportantStrings.dbmsIntentExtra(intent, "CE7");
                break;
            case R.id.rer:
                putExtraCustom(intent, "RER", "ECE7", "");
                break;

//            E-B
            case R.id.rn:
                putExtraCustom(intent, "RnN", "ECE7", "");
                break;
            case R.id.pm:
                putExtraCustom(intent, "PM", "ECE7", "");
                break;
            case R.id.eco:
                putExtraCustom(intent, "ECO-ECE", "ECE7", "");
                break;
            case R.id.gc:
                putExtraCustom(intent, "Grid", "7", "");
                break;
            case R.id.pc:
                putExtraCustom(intent, "PC", "CSE7", "");
                break;
            case R.id.sociology:
                ImportantStrings.sociologyEngg(intent);
                break;
            case R.id.topics:
                putExtraCustom(intent, "TopicsECE", "ECE7", "");
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