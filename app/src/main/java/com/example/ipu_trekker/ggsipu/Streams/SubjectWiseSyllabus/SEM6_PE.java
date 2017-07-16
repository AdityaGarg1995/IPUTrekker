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


public class SEM6_PE extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pe6);

        findViewById(R.id.load).setOnClickListener(this);
        findViewById(R.id.ppc).setOnClickListener(this);
        findViewById(R.id.ppci).setOnClickListener(this);
        findViewById(R.id.pstd).setOnClickListener(this);

        findViewById(R.id.ic).setOnClickListener(this);
        findViewById(R.id.peed).setOnClickListener(this);
        findViewById(R.id.md).setOnClickListener(this);
        findViewById(R.id.emft).setOnClickListener(this);

        findViewById(R.id.sta_ojt).setOnClickListener(this);
        findViewById(R.id.sga_ojt).setOnClickListener(this);
        findViewById(R.id.pp_ojt).setOnClickListener(this);

        findViewById(R.id.icLab).setOnClickListener(this);
        findViewById(R.id.peedLab).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("PE: " + ImportantStrings.sem6sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Syllabus.class);
        switch (v.getId()){
            case R.id.load:
                putExtraCustom(intent, "Load", "");
                break;
            case R.id.ppc:
                putExtraCustom(intent, "PPC", "");
                break;
            case R.id.ppci:
                putExtraCustom(intent, "PPCI", "");
                break;
            case R.id.pstd:
                putExtraCustom(intent, "PSTD", "");
                break;

            case R.id.ic:
                putExtraCustom(intent, "IC", "");
                break;
            case R.id.peed:
                putExtraCustom(intent, "PEED", "");
                break;
            case R.id.md:
                putExtraCustom(intent, "MD", "");
                break;
            case R.id.emft: ;
                putExtraCustom(intent, "EMFT", "");
                break;

            case R.id.sta_ojt:
                putExtraCustom(intent, "STA-OJT", "NA");
                break;
            case R.id.sga_ojt:
                putExtraCustom(intent, "SGA-OJT", "NA");
                break;
            case R.id.pp_ojt:
                putExtraCustom(intent, "PP-OJT", "NA");
                break;
            case R.id.icLab:
                putExtraCustom(intent, "ICLab", "");
                break;
            case R.id.peedLab: ;
                putExtraCustom(intent, "PEEDLab", "");
                break;
        }

        try {
            intent.putExtra("Sem", "PE6").putExtra("SubjectName", ((Button)v).getText().toString());
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