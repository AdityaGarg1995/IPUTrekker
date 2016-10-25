package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class IT2 extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8;
    Intent intent;

    String url1 = "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/031_IT_1stSEM.pdf";
    String url2 = "http://164.100.158.135/ExamResults/2016/310716/PDF2/031_IT_2_SEM.pdf";
    String url3 = "http://ipu.ac.in/exam/ExamResults/2016/290316/031_IT_3rd%20Sem.pdf";
    String url4 = "http://164.100.158.135/ExamResults/2016/310716/PDF4/031_IT_4_SEM.pdf";
    String url5 = "http://ipu.ac.in/exam/ExamResults/2016/300316/031_IT_5th%20Sem.pdf";
    String url6 = "http://164.100.158.135/ExamResults/2016/310716/PDF6/031_IT_6_SEM.pdf";
    String url7 = "http://ipu.ac.in/exam/ExamResults/2016/300316/031_IT_7th%20Sem.pdf";
    String url8 = "http://164.100.158.135/ExamResults/2016/310716/PDF8/031_IT_8_SEM.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it2);

        button1 = (Button)findViewById(R.id.it11);
        button2 = (Button)findViewById(R.id.it12);
        button3 = (Button)findViewById(R.id.it13);
        button4 = (Button)findViewById(R.id.it14);
        button5 = (Button)findViewById(R.id.it15);
        button6 = (Button)findViewById(R.id.it16);
        button7 = (Button)findViewById(R.id.it17);
        button8 = (Button)findViewById(R.id.it18);

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

        switch (v.getId()){

            case R.id.it11:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url1));
                startActivity(intent);
                break;

            case R.id.it12:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url2));
                startActivity(intent);
                break;

            case R.id.it13:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url3));
                startActivity(intent);
                break;

            case R.id.it14:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url4));
                startActivity(intent);
                break;

            case R.id.it15:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url5));
                startActivity(intent);
                break;

            case R.id.it16:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url6));
                startActivity(intent);
                break;

            case R.id.it17:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url7));
                startActivity(intent);
                break;

            case R.id.it18:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url8));
                startActivity(intent);
                break;

        }

    }


}
