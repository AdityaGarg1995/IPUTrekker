package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class ECE2 extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8;
    Intent intent;

    String url;

    String url1 = "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/028_ECE_1stSEM.pdf",
           url2 = "http://164.100.158.135/ExamResults/2016/310716/PDF2/028_ECE_2_SEM.pdf",
           url3 = "http://ipu.ac.in/exam/ExamResults/2016/290316/028_ECE_3rd%20Sem.pdf",
           url4 = "http://164.100.158.135/ExamResults/2016/310716/PDF4/028_ECE_4_SEM.pdf",
           url5 = "http://ipu.ac.in/exam/ExamResults/2016/300316/028_ECE_5th%20Sem.pdf",
           url6 = "http://164.100.158.135/ExamResults/2016/310716/PDF6/028_ECE_6_SEM.pdf",
           url7 = "http://ipu.ac.in/exam/ExamResults/2016/300316/028_ECE_7th%20Sem.pdf",
           url8 = "http://164.100.158.135/ExamResults/2016/310716/PDF8/028_ECE_8_SEM.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece2);

        button1 = (Button) findViewById(R.id.ec1);
        button2 = (Button) findViewById(R.id.ec2);
        button3 = (Button) findViewById(R.id.ec3);
        button4 = (Button) findViewById(R.id.ec4);
        button5 = (Button) findViewById(R.id.ec5);
        button6 = (Button) findViewById(R.id.ec6);
        button7 = (Button) findViewById(R.id.ec7);
        button8 = (Button) findViewById(R.id.ec8);

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

        switch (v.getId()) {

            case R.id.ec1:
                url = url1;
                break;

            case R.id.ec2:
                url  = url2;
                break;

            case R.id.ec3:
                url = url3;
                break;

            case R.id.ec4:
                url = url4;
                break;

            case R.id.ec5:
                url = url5;
                break;

            case R.id.ec6:
                url = url6;
                break;

            case R.id.ec7:
                url = url7;
                break;

            case R.id.ec8:
                url = url8;
                break;
        }

        if(!url.equals(""))
            intent.setData(Uri.parse(url));
        startActivity(intent);

    }

}

