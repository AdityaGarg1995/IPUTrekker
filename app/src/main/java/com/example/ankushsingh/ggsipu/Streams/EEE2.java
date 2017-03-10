package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class EEE2 extends AppCompatActivity implements View.OnClickListener{


//    Button button1,button2,button3,button4,button5,button6,button7,button8;


    public static final String eeeResult[] = {
            "http://www.ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/049_EEE_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/049_EEE_2_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/290316/049_EEE_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/049_EEE_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/049_EEE_6_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_7th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF8/049_EEE_8_SEM.pdf"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse2);

//        findViewById(R.id.c1).setOnClickListener(this);
//        findViewById(R.id.c2).setOnClickListener(this);
//        findViewById(R.id.c3).setOnClickListener(this);
//        findViewById(R.id.c4).setOnClickListener(this);
//        findViewById(R.id.c5).setOnClickListener(this);
//        findViewById(R.id.c6).setOnClickListener(this);
//        findViewById(R.id.c7).setOnClickListener(this);
//        findViewById(R.id.c8).setOnClickListener(this);


//        final Activity a = this;
//        a.setTitle("EEE: Semester-wise Result");


    }


    @Override
    public void onClick(View v) {

//        String url = "";
//        Intent intent = new Intent(Intent.ACTION_VIEW);

//        switch (v.getId()){
//            case R.id.c1: url = url1;
//                break;
//            case R.id.c2: url = url2;
//                break;
//            case R.id.c3: url = url3;
//                break;
//            case R.id.c4: url = url4;
//                break;
//            case R.id.c5: url = url5;
//                break;
//            case R.id.c6: url = url6;
//                break;
//            case R.id.c7: url = url7;
//                break;
//            case R.id.c8: url = url8;
//                break;
//        }

//        if(!url.equals("") && (intent != null)){
//            intent.setData(Uri.parse(url));
//            startActivity(intent);
//        }
    }

}
