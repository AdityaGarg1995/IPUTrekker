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

public class SEM7_CE extends AppCompatActivity implements View.OnClickListener {
//    CE7
//    3 2 4 5
//    Button[] buttons = new Button[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil7);

        findViewById(R.id.eco).setOnClickListener(this);
        findViewById(R.id.ie).setOnClickListener(this);
        findViewById(R.id.te_ii).setOnClickListener(this);

        findViewById(R.id.ied).setOnClickListener(this);
        findViewById(R.id.ecoLab).setOnClickListener(this);

        findViewById(R.id.wrsp).setOnClickListener(this);
        findViewById(R.id.earthquake).setOnClickListener(this);
        findViewById(R.id.grs).setOnClickListener(this);
        findViewById(R.id.srr).setOnClickListener(this);

        findViewById(R.id.da).setOnClickListener(this);
        findViewById(R.id.green).setOnClickListener(this);
        findViewById(R.id.dcn).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("CE: " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
        String eco = "Economics",
               irrigate = "Irrigation";
        switch (v.getId()){
            case R.id.eco:
                putExtraCustom(intent, eco, "");
                break;
            case R.id.ie:
                putExtraCustom(intent, irrigate, "");
                break;
            case R.id.te_ii:
                putExtraCustom(intent, "TE-II", "");
                break;

            case R.id.ied:
                putExtraCustom(intent, irrigate + "Lab", "");
                break;
            case R.id.ecoLab:
                putExtraCustom(intent, eco + "Lab", "");
                break;

//            E_A
            case R.id.wrsp:
                putExtraCustom(intent, "WRSP", "");
                break;
            case R.id.earthquake:
                putExtraCustom(intent, "Earthquake", "");
                break;
            case R.id.grs:
                putExtraCustom(intent, "GRS", "");
                break;
            case R.id.srr:
                putExtraCustom(intent, "SRR", "http://cpwd.gov.in/Units/handbook.pdf");
                break;

//            E_B
            case R.id.dcn:
                putExtraCustom(intent, "DCN", Urls.dcnBook);
                break;
            case R.id.green:
                putExtraCustom(intent, "Green", "");
                break;
            case R.id.da:
                putExtraCustom(intent, "DA", "");
                break;
            case R.id.sociology:
                ImportantStrings.sociologyEngg(intent);
                break;
            case R.id.dbms:
                ImportantStrings.dbmsIntentExtra(intent, "CE7");
                break;
        }
        try {
            intent.putExtra("Sem", "CE7").putExtra("SubjectName", ((Button)v).getText().toString());
            if ((intent != null))
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