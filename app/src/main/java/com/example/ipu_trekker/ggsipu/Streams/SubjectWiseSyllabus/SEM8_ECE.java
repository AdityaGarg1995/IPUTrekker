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


public class SEM8_ECE extends AppCompatActivity implements View.OnClickListener{
//    3 1 5 5
    Intent intent;

//    public static final String url2 = "http://www.engineersinstitute.com/gate_exam_reference_books_electrical_eee.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece8);

        findViewById(R.id.hvpe_ii).setOnClickListener(this);
        findViewById(R.id.satComm).setOnClickListener(this);
        findViewById(R.id.adHoc).setOnClickListener(this);

        findViewById(R.id.satCommLab).setOnClickListener(this);

        findViewById(R.id.consumer).setOnClickListener(this);
        findViewById(R.id.dip).setOnClickListener(this);
        findViewById(R.id.asic).setOnClickListener(this);
        findViewById(R.id.mc).setOnClickListener(this);
        findViewById(R.id.nano).setOnClickListener(this);

        findViewById(R.id.gps).setOnClickListener(this);
        findViewById(R.id.asp).setOnClickListener(this);
        findViewById(R.id.robotics).setOnClickListener(this);
        findViewById(R.id.cgmm).setOnClickListener(this);
        findViewById(R.id.nextGen).setOnClickListener(this);

        final Activity a = this;
        a.setTitle("ECE: " + ImportantStrings.sem8sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.hvpe_ii:
                ImportantStrings.hvpeII(intent);
                break;
            case R.id.satComm:
                intent.putExtra("Subject","SatComm").putExtra("Sem", "8")
                        .putExtra("Book", Urls.satCommBook);
                break;
            case R.id.adHoc:
                intent.putExtra("Subject","AdHoc").putExtra("Sem", "8")
                        .putExtra("Book", Urls.adHocBook);
                break;

            case R.id.satCommLab:
                intent.putExtra("Subject","SatCommLab").putExtra("Sem", "8")
                        .putExtra("Book", Urls.satCommBook);
                break;

//            E-A
            case R.id.consumer:
                intent.putExtra("Subject","Consumer").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;
            case R.id.dip:
                intent.putExtra("Subject","DIP").putExtra("Sem", "8")
                        .putExtra("Book", Urls.dipBook);
                break;
            case R.id.asic:
                intent.putExtra("Subject","ASIC").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;
            case R.id.mc:
                intent.putExtra("Subject","MC").putExtra("Sem", "8")
                        .putExtra("Book", Urls.mcBook);
                break;
            case R.id.nano:
                intent.putExtra("Subject","Nano").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;

//            E-B
            case R.id.gps:
                intent.putExtra("Subject","GPS").putExtra("Sem", "8")
                        .putExtra("Book", "http://www.garmin.com/manuals/gps4beg.pdf");
                break;
            case R.id.asp:
                intent.putExtra("Subject","Embedded").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;
            case R.id.robotics:
                intent.putExtra("Subject","Robotics").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;
            case R.id.cgmm:
                intent.putExtra("Subject","CGMM-ECE").putExtra("Sem", "ECE8")
                        .putExtra("Book", "");
                break;
            case R.id.nextGen:
                intent.putExtra("Subject","NextGen").putExtra("Sem", "8")
                        .putExtra("Book", "https://imcs.dvfu.ru/lib.int/docs/Networks/Administration/Next%20Generation%20Network%20Services.pdf");
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