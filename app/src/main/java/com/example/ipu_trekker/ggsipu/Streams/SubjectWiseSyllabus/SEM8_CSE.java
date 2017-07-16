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

public class SEM8_CSE extends AppCompatActivity implements View.OnClickListener{
//    3 2 9 7
//    Button button1,button2,button3,button4;

    Intent intent;
    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse8);

        findViewById(R.id.mc).setOnClickListener(this);
        findViewById(R.id.ml).setOnClickListener(this);
        findViewById(R.id.hvpe_ii).setOnClickListener(this);

        findViewById(R.id.mcLab).setOnClickListener(this);
        findViewById(R.id.mlLab).setOnClickListener(this);

//        Electives-A 7sem
        findViewById(R.id.dip).setOnClickListener(this);
        findViewById(R.id.micro).setOnClickListener(this);
        findViewById(R.id.adHoc).setOnClickListener(this);
        findViewById(R.id.sc).setOnClickListener(this);
        findViewById(R.id.vlsi).setOnClickListener(this);
        findViewById(R.id.ds).setOnClickListener(this);
        findViewById(R.id.oose).setOnClickListener(this);
        findViewById(R.id.cv).setOnClickListener(this);
        findViewById(R.id.spm).setOnClickListener(this);

//        Elective-B 7sem
        findViewById(R.id.hci).setOnClickListener(this);
        findViewById(R.id.itc).setOnClickListener(this);
        findViewById(R.id.wibd).setOnClickListener(this);
        findViewById(R.id.soa).setOnClickListener(this);
        findViewById(R.id.ms).setOnClickListener(this);
        findViewById(R.id.ppl).setOnClickListener(this);
        findViewById(R.id.tn).setOnClickListener(this);
        findViewById(R.id.trends).setOnClickListener(this);

        a.setTitle("CSE: " + ImportantStrings.sem8sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.hvpe_ii:
                ImportantStrings.hvpeII(intent);
                break;

            case R.id.mc:
                putExtraCustom(intent, "MC", "8", Urls.mcBook);
                break;
            case R.id.mcLab:
                putExtraCustom(intent, "MCLab", "8", Urls.mcBook);
                break;

            case R.id.ml:
                putExtraCustom(intent, "ML", "CSE8", "http://personal.disco.unimib.it/Vanneschi/McGrawHill_-_Machine_Learning_-Tom_Mitchell.pdf");
                break;
            case R.id.mlLab:
                putExtraCustom(intent, "MLLab", "CSE8", "http://personal.disco.unimib.it/Vanneschi/McGrawHill_-_Machine_Learning_-Tom_Mitchell.pdf");
                break;

//            E-A
            case R.id.dip:
                putExtraCustom(intent,"DIP", "8", Urls.dipBook);
                break;

            case R.id.micro:
                putExtraCustom(intent, "Micro", "CSE8", "ftp://doc.nit.ac.ir/cee/y.baleghi/Electronics/Microelectronic%20Circuits%20by%20Sedra%20Smith,5th%20edition.pdf");
                break;

            case R.id.adHoc:
                putExtraCustom(intent, "AdHoc", "8", Urls.adHocBook);
                break;

            case R.id.sc:
                putExtraCustom(intent, "Soft", "8", Urls.softComputingBook);
                break;

            case R.id.vlsi:
                putExtraCustom(intent, "VLSI", "8", Urls.vlsiBook);
                break;

            case R.id.ds:
                putExtraCustom(intent, "Distributed", "8", "https://vowi.fsinf.at/images/b/bc/TU_Wien-Verteilte_Systeme_VO_(G%C3%B6schka)_-_Tannenbaum-distributed_systems_principles_and_paradigms_2nd_edition.pdf");
                break;

            case R.id.oose:
                putExtraCustom(intent, "OOSE", "CSE8", Urls.ooseBook);
                break;
            case R.id.cv:
                putExtraCustom(intent, "CV", "CSE8", "http://cmuems.com/excap/readings/forsyth-ponce-computer-vision-a-modern-approach.pdf");
                break;
            case R.id.spm:
                putExtraCustom(intent, "SPM", "CSE8", "");
                break;

//            E-B
            case R.id.hci:
                putExtraCustom(intent, "HCI", "8", "http://fit.mta.edu.vn/files/DanhSach/__Human_computer_interaction.pdf");
                break;
            case R.id.itc:
                putExtraCustom(intent, "InfoTheory", "8", "http://coltech.vnu.edu.vn/~thainp/books/Wiley_-_2006_-_Elements_of_Information_Theory_2nd_Ed.pdf");
                break;
            case R.id.wibd:
                putExtraCustom(intent, "WIBD", "CSE8", "");
                break;
            case R.id.soa:
                putExtraCustom(intent, "SOA", "CSE8", "");
                break;
            case R.id.ms:
                putExtraCustom(intent, "MS", "CSE8", "http://coltech.vnu.edu.vn/httt/media/courses/AI++/Tai%20lieu/TLTK.pdf");
                break;
            case R.id.ppl:
                putExtraCustom(intent, "PPL", "CSE8", "http://aleteya.cs.buap.mx/~jlavalle/papers/books_on_line/John%20Wiley%20&%20Sons%20-%20Programming%20Language%20Design%20Concepts.pdf");
                break;
            case R.id.tn:
                putExtraCustom(intent,"TN", "CSE8", "");
                break;
            case R.id.trends:
                putExtraCustom(intent,"TrendsCSE", "CSE8", "");
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