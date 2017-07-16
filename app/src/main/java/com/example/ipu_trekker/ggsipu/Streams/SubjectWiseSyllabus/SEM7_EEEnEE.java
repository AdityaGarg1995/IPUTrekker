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

import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;

public class SEM7_EEEnEE extends AppCompatActivity implements View.OnClickListener{
//    3 3 6 7
    Intent intent;

    String stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee7);

        findViewById(R.id.ed).setOnClickListener(this);
        findViewById(R.id.acs).setOnClickListener(this);
        findViewById(R.id.emd).setOnClickListener(this);

        findViewById(R.id.edLab).setOnClickListener(this);
        findViewById(R.id.acsLab).setOnClickListener(this);

        Button emdLab = (Button)findViewById(R.id.emdLab);
        emdLab.setOnClickListener(this);

//        E-A
        findViewById(R.id.rer).setOnClickListener(this);
        findViewById(R.id.tdas).setOnClickListener(this);
        findViewById(R.id.scada).setOnClickListener(this);
        findViewById(R.id.mecha).setOnClickListener(this);
        findViewById(R.id.hve).setOnClickListener(this);

        Button topics = (Button)findViewById(R.id.topics);
        topics.setOnClickListener(this);

//        E-B
        findViewById(R.id.opto).setOnClickListener(this);
        findViewById(R.id.dbms).setOnClickListener(this);
        findViewById(R.id.bmi).setOnClickListener(this);
        findViewById(R.id.dsd).setOnClickListener(this);
        findViewById(R.id.plcc).setOnClickListener(this);
        findViewById(R.id.sociology).setOnClickListener(this);

        Button eb = (Button)findViewById(R.id.eb);
        eb.setVisibility(View.GONE);

        stream = getIntent().getStringExtra("Stream");
        final Activity a = this;
        a.setTitle(stream + ": " + ImportantStrings.sem7sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();


        if(stream.equals("EEE")){

            eb.setVisibility(View.VISIBLE);
            eb.setOnClickListener(this);
            eb.setText("Electrical Machines Design");

            emdLab.setText("EHV AC & HVDC Transmissions");

            emdLab.setVisibility(View.GONE);

            topics.setText(topics.getText().toString() + "E");
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        String ed = "ED",
               acs = "ACS",
               emd = "EMD",
               lab = "Lab";

        switch(v.getId()){
            case R.id.ed:
                putExtraCustom(intent, ed, "EE7", "");
                break;
            case R.id.acs:
                putExtraCustom(intent, acs, "EE7", "");
                break;
            case R.id.emd:
                if(stream.equals("EE"))
                   putExtraCustom(intent, emd, "EE7", "");
                else if(stream.equals("EEE"))
                    putExtraCustom(intent, "ACDC-EEE", "EE7", "");
                break;

            case R.id.edLab:
                putExtraCustom(intent, ed+lab, "EE7", "");
                break;
            case R.id.acsLab:
                putExtraCustom(intent, acs+lab, "EE7", "");
                break;
            case R.id.emdLab:
                if(stream.equals("EE"))
                    putExtraCustom(intent, emd+lab, "EE7", "");
                break;

//            E-A
            case R.id.rer:
                putExtraCustom(intent, "RER", "ECE7", "");
                break;
            case R.id.pds:
                putExtraCustom(intent, "PDS", "EE7", "");
                break;
            case R.id.tdas:
                putExtraCustom(intent, "TDAS", "EE7", "");
                break;
            case R.id.scada:
                putExtraCustom(intent, "SCADA", "ECE7", "");
                break;
            case R.id.mecha:
                putExtraCustom(intent, "Mecha", "EE7", "");
                break;
            case R.id.hve:
                putExtraCustom(intent, "HVE", "EE7", "");
                break;

            case R.id.topics:
                String topics = "Topics";
                if(stream.equals("EE"))
                   putExtraCustom(intent, topics, "");
                else if(stream.equals("EEE"))
                    putExtraCustom(intent, topics+"EEE", "");
                intent.putExtra("Sem", "EE7");
                break;

//            E-B
            case R.id.opto:
                putExtraCustom(intent, "Opto", "7", "");
                break;
            case R.id.dbms:
                ImportantStrings.dbmsIntentExtra(intent, "CE7");
                break;
            case R.id.bmi:
                putExtraCustom(intent, "BMI", "ECE7", "");
                break;
            case R.id.dsd:
                putExtraCustom(intent, "DSD", "EE7", "");
                break;
            case R.id.plcc:
                putExtraCustom(intent, "PLCC", "EE7", "");
                break;
            case R.id.sociology:
                ImportantStrings.sociologyEngg(intent);
                break;
            case R.id.eb:
                if(stream.equals("EEE"))
                    putExtraCustom(intent, emd, "EE7", "");
                else  { /* Do Nothing*/ }
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