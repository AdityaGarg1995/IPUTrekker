package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class EEE2 extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4,button5,button6,button7,button8;
    Intent intent;

    String url;

    String url1 = "http://www.ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/049_EEE_1stSEM.pdf";
    String url2 = "http://164.100.158.135/ExamResults/2016/310716/PDF2/049_EEE_2_SEM.pdf";
    String url3 = "http://ipu.ac.in/exam/ExamResults/2016/290316/049_EEE_3rd%20Sem.pdf";
    String url4 = "http://164.100.158.135/ExamResults/2016/310716/PDF4/049_EEE_4_SEM.pdf";
    String url5 = "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_5th%20Sem.pdf";
    String url6 = "http://164.100.158.135/ExamResults/2016/310716/PDF6/049_EEE_6_SEM.pdf";
    String url7 = "http://ipu.ac.in/exam/ExamResults/2016/300316/049_EEE_7th%20Sem.pdf";
    String url8 = "http://164.100.158.135/ExamResults/2016/310716/PDF8/049_EEE_8_SEM.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee2);

        button1 = (Button)findViewById(R.id.eee21);
        button2 = (Button)findViewById(R.id.eee22);
        button3 = (Button)findViewById(R.id.eee23);
        button4 = (Button)findViewById(R.id.eee24);
        button5 = (Button)findViewById(R.id.eee25);
        button6 = (Button)findViewById(R.id.eee26);
        button7 = (Button)findViewById(R.id.eee27);
        button8 = (Button)findViewById(R.id.eee28);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        intent = new Intent(Intent.ACTION_VIEW);

        switch (v.getId()){

            case R.id.eee21:
                url = url1;
                break;

            case R.id.eee22:
                url = url2;
                break;

            case R.id.eee23:
                url = url3;
                break;

            case R.id.eee24:
                url = url4;
                break;

            case R.id.eee25:
                url = url5;
                break;

            case R.id.eee26:
                url = url6;
                break;

            case R.id.eee27:
                url = url7;
                break;

            case R.id.eee28:
                url = url8;
                break;
        }

        if(!url.equals(""))
            intent.setData(Uri.parse(url));
        startActivity(intent);

    }

}
