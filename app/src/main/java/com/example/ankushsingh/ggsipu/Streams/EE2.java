package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.StreamNames;
import com.example.ankushsingh.ggsipu.Urls;


public class EE2 extends AppCompatActivity implements View.OnClickListener{

    String eeResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/110_EE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/110_EE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/110_EE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/110_EE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/110_EE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/110_EE_6_SEM.pdf"
    };

    String mechResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/112_MET_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/112_MET_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/112_MET_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/112_MET_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/112_MET_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/112_MET_6_SEM.pdf"
    };

    String meResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/111_ME_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/111_ME_2_SEM.pdf",
            "http://www.ipu.ac.in/exam/ExamResults/2016/290316/111_ME_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/111_ME_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/111_ME_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/111_ME_6_SEM.pdf"
    };

    Activity a = this;

    String stream, urlSyllabus, urlBook;

    public void setUrls(){
        switch (stream){
            case "EE":
                urlSyllabus = Urls.eeSyllabus;
                urlBook = Urls.eeBookList;
                a.setTitle(StreamNames.ee);
                break;

            case "MT":
                urlSyllabus = Urls.mechSyllabus;
                urlBook = Urls.mechBookList;
                a.setTitle(StreamNames.mech);
                break;

            case "ME":
                urlSyllabus = Urls.meSyllabus;
                urlBook = Urls.meBookList;
                a.setTitle(StreamNames.me);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it2);

        findViewById(R.id.c1).setOnClickListener(this);
        findViewById(R.id.c2).setOnClickListener(this);
        findViewById(R.id.c3).setOnClickListener(this);
        findViewById(R.id.c4).setOnClickListener(this);
        findViewById(R.id.c5).setOnClickListener(this);
        findViewById(R.id.c6).setOnClickListener(this);

        findViewById(R.id.c7).setVisibility(View.INVISIBLE);
        findViewById(R.id.c8).setVisibility(View.INVISIBLE);

        stream = getIntent().getStringExtra("StreamName");
        setUrls();
        a.setTitle(stream + ": Semester-wise Result");
    }


    public String[] resultUrls(String stream){
        String result[] = {};
        switch(stream){
            case "EE": result = eeResult;
                break;
            case "ME": result = meResult;
                break;
            case "MT": result = mechResult;
                break;
        }
        return result;
    }


    @Override
    public void onClick(View v) {
        String url = "", result[] = resultUrls(stream);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.c1: url = result[0];
                break;
            case R.id.c2: url = result[1];
                break;
            case R.id.c3: url = result[2];
                break;
            case R.id.c4: url = result[3];
                break;
            case R.id.c5: url = result[4];
                break;
            case R.id.c6: url = result[5];
                break;
        }
        try {
            if (!url.equals("") && (intent != null)) {
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        } catch (Exception e){ e.printStackTrace(); }
    }
}