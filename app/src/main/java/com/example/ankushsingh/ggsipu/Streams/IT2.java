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
            case "CSE": resultUrls = CSE2.cseResult;
                break;
            case "ECE": resultUrls = ECE2.eceResult;
                break;
            case "EEE": resultUrls = EEE2.eeeResult;
                break;
            case "Civil": resultUrls = CIVIL2.civilResult;
                break;
            case "ENE": resultUrls = ENVO2.eneResut;
                break;
            case "ICE": resultUrls = ICE2.iceResult;
                break;
            case "MAE": resultUrls = MAE2.maeResult;
                break;
            case "Power": resultUrls = POWER2.powerResult;
                break;
            case "Tool": resultUrls = TOOL2.toolResult;
                break;
        }
        return resultUrls;
    }


    @Override
    public void onClick(View v) {


        String url = "";
        Intent intent = new Intent(Intent.ACTION_VIEW);


        String result[] = resultUrls(stream);

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
