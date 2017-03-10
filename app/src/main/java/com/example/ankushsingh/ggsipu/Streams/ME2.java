package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;


public class ME2 extends AppCompatActivity implements View.OnClickListener {


    Activity a = this;

    public static final String meResult[] = {
            "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/111_ME_1stSEM.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF2/111_ME_2_SEM.pdf",
            "http://www.ipu.ac.in/exam/ExamResults/2016/290316/111_ME_3rd%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF4/111_ME_4_SEM.pdf",
            "http://ipu.ac.in/exam/ExamResults/2016/300316/111_ME_5th%20Sem.pdf",
            "http://164.100.158.135/ExamResults/2016/310716/PDF6/111_ME_6_SEM.pdf"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee2);

//        findViewById(R.id.ee11).setOnClickListener(this);
//        findViewById(R.id.ee12).setOnClickListener(this);
//        findViewById(R.id.ee13).setOnClickListener(this);
//        findViewById(R.id.ee14).setOnClickListener(this);
//        findViewById(R.id.ee15).setOnClickListener(this);
//        findViewById(R.id.ee16).setOnClickListener(this);
//
//        a.setTitle("ME: Semester-wise Result");

    }


    @Override
    public void onClick(View v) {

//        String url = "";
//        Intent intent = new Intent(Intent.ACTION_VIEW);

//        switch (v.getId()){
//            case R.id.ee11: url = url1;
//                break;
//            case R.id.ee12: url = url2;
//                break;
//            case R.id.ee13: url = url3;
//                break;
//            case R.id.ee14: url = url4;
//                break;
//            case R.id.ee15: url = url5;
//                break;
//            case R.id.ee16: url = url6;
//                break;
//        }

//        if(!url.equals("") && (intent != null)){
//            intent.setData(Uri.parse(url));
//            startActivity(intent);
//        }

    }


}
