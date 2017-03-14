package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;


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


    String stream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee2);

//        Button button1,button2,button3,button4,button5,button6;

//        button1 = (Button)findViewById(R.id.ee11);
//        button2 = (Button)findViewById(R.id.ee12);
//        button3 = (Button)findViewById(R.id.ee13);
//        button4 = (Button)findViewById(R.id.ee14);
//        button5 = (Button)findViewById(R.id.ee15);
//        button6 = (Button)findViewById(R.id.ee16);


//        button1.setOnClickListener(this);
//        button2.setOnClickListener(this);
//        button3.setOnClickListener(this);
//        button4.setOnClickListener(this);
//        button5.setOnClickListener(this);
//        button6.setOnClickListener(this);


        findViewById(R.id.ee11).setOnClickListener(this);
        findViewById(R.id.ee12).setOnClickListener(this);
        findViewById(R.id.ee13).setOnClickListener(this);
        findViewById(R.id.ee14).setOnClickListener(this);
        findViewById(R.id.ee15).setOnClickListener(this);
        findViewById(R.id.ee16).setOnClickListener(this);


        stream = getIntent().getStringExtra("StreamName");

        final Activity a = this;
        a.setTitle("EE: Semester-wise Result");




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
            case R.id.ee11: url = result[0];
                break;
            case R.id.ee12: url = result[1];
                break;
            case R.id.ee13: url = result[2];
                break;
            case R.id.ee14: url = result[3];
                break;
            case R.id.ee15: url = result[4];
                break;
            case R.id.ee16: url = result[5];
                break;
        }

        if(!url.equals("") && (intent != null)){
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

    }

}