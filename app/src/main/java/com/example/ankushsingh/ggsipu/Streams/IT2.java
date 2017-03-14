package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;


public class IT2 extends AppCompatActivity implements View.OnClickListener {

//    Button[] buttons = new Button[8];

    String stream;


    String itResult[] = {
           "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/031_IT_1stSEM.pdf",
           "http://164.100.158.135/ExamResults/2016/310716/PDF2/031_IT_2_SEM.pdf",
           "http://ipu.ac.in/exam/ExamResults/2016/290316/031_IT_3rd%20Sem.pdf",
           "http://164.100.158.135/ExamResults/2016/310716/PDF4/031_IT_4_SEM.pdf",
           "http://ipu.ac.in/exam/ExamResults/2016/300316/031_IT_5th%20Sem.pdf",
           "http://164.100.158.135/ExamResults/2016/310716/PDF6/031_IT_6_SEM.pdf",
           "http://ipu.ac.in/exam/ExamResults/2016/300316/031_IT_7th%20Sem.pdf",
           "http://164.100.158.135/ExamResults/2016/310716/PDF8/031_IT_8_SEM.pdf"
    };


    String civilResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/034_CIVIL_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/034_CIVIL_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/034_CIVIL_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/034_CIVIL_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/034_CIVIL_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/034_CIVIL_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/034_CIVIL_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/034_CIVIL_8_SEM.pdf"
    };


    String cseResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/027_CSE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/027_CSE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/027_CSE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/027_CSE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/027_CSE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/027_CSE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/027_CSE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/027_CSE_8_SEM.pdf"
    };


    String eceResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/028_ECE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/028_ECE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/028_ECE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/028_ECE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/028_ECE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/028_ECE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/028_ECE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/028_ECE_8_SEM.pdf"
    };


    String eeeResult[] = {
            "http://www.ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/049_EEE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/049_EEE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/049_EEE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/049_EEE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/049_EEE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/049_EEE_8_SEM.pdf"
    };


    String eneResut[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/056_ENE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/056_ENE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/056_ENE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/056_ENE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/056_ENE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/056_ENE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/056_ENE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/056_ENE_8_SEM.pdf"
    };


    String iceResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/030_ICE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/030_ICE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/030_ICE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/030_ICE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/030_ICE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/030_ICE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/030_ICE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/030_ICE_8_SEM.pdf"
    };


    String maeResult[] = {"http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/036_MAE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/036_MAE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/036_MAE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/036_MAE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/036_MAE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/036_MAE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/036_MAE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/036_MAE_8_SEM.pdf"
    };


    String powerResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/037_PE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/037_PE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/037_PE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/037_PE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/037_PE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/037_PE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/037_PE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/037_PE_8_SEM.pdf"
    };


    String toolResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/086_TE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/086_TE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/086_TE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/086_TE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/086_TE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/086_TE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/086_TE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/086_TE_8_SEM.pdf"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse2);

        findViewById(R.id.c1).setOnClickListener(this);
        findViewById(R.id.c2).setOnClickListener(this);
        findViewById(R.id.c3).setOnClickListener(this);
        findViewById(R.id.c4).setOnClickListener(this);
        findViewById(R.id.c5).setOnClickListener(this);
        findViewById(R.id.c6).setOnClickListener(this);
        findViewById(R.id.c7).setOnClickListener(this);
        findViewById(R.id.c8).setOnClickListener(this);


        stream = getIntent().getStringExtra("StreamName");

        final Activity a = this;
        a.setTitle(stream + ": Semester-wise Result");


    }


    public String[] resultUrls(String streamName){

        String resultUrls[] = new String[8];

        switch(streamName){
            case "IT": resultUrls = itResult;
                break;
            case "CSE": resultUrls = cseResult;
                break;
            case "ECE": resultUrls = eceResult;
                break;
            case "EEE": resultUrls = eeeResult;
                break;
            case "CE": resultUrls = civilResult;
                break;
            case "ENE": resultUrls = eneResut;
                break;
            case "ICE": resultUrls = iceResult;
                break;
            case "MAE": resultUrls = maeResult;
                break;
            case "PE": resultUrls = powerResult;
                break;
            case "TE": resultUrls = toolResult;
                break;
        }
        return resultUrls;
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

            case R.id.c7: url = result[6];
                break;

            case R.id.c8: url = result[7];
                break;

        }

        if(!url.equals("") && (intent != null)){
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    }


}
