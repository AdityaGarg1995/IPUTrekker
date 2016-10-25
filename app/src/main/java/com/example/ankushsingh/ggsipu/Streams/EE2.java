package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class EE2 extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4,button5,button6;
    Intent intent;

    String url;

    String url1 = "http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/110_EE_1stSEM.pdf",
           url2 = "http://164.100.158.135/ExamResults/2016/310716/PDF2/110_EE_2_SEM.pdf",
           url3 = "http://ipu.ac.in/exam/ExamResults/2016/290316/110_EE_3rd%20Sem.pdf",
           url4 = "http://164.100.158.135/ExamResults/2016/310716/PDF4/110_EE_4_SEM.pdf",
           url5 = "http://ipu.ac.in/exam/ExamResults/2016/300316/110_EE_5th%20Sem.pdf",
           url6 = "http://164.100.158.135/ExamResults/2016/310716/PDF6/110_EE_6_SEM.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee2);

        button1 = (Button)findViewById(R.id.ee11);
        button2 = (Button)findViewById(R.id.ee12);
        button3 = (Button)findViewById(R.id.ee13);
        button4 = (Button)findViewById(R.id.ee14);
        button5 = (Button)findViewById(R.id.ee15);
        button6 = (Button)findViewById(R.id.ee16);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        intent = new Intent(Intent.ACTION_VIEW);

        switch (v.getId()){

            case R.id.ee11:
                url = url1;
                break;

            case R.id.ee12:
                url = url2;
                break;

            case R.id.ee13:
                url = url3;
                break;

            case R.id.ee14:
                url = url4;
                break;

            case R.id.ee15:
                url = url5;
                break;

            case R.id.ee16:
                url = url6;
                break;

        }

        if(!url.equals(""))
            intent.setData(Uri.parse(url));
        startActivity(intent);

    }

}