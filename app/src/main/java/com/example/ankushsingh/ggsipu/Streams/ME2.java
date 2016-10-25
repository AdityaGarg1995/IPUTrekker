package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class ME2 extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8;
    Intent intent;

    String url1="http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/111_ME_1stSEM.pdf";
    String url2="http://164.100.158.135/ExamResults/2016/310716/PDF2/111_ME_2_SEM.pdf";
    String url3="http://www.ipu.ac.in/exam/ExamResults/2016/290316/111_ME_3rd%20Sem.pdf";
    String url4="http://164.100.158.135/ExamResults/2016/310716/PDF4/111_ME_4_SEM.pdf";
    String url5="http://ipu.ac.in/exam/ExamResults/2016/300316/111_ME_5th%20Sem.pdf";
    String url6="http://164.100.158.135/ExamResults/2016/310716/PDF6/111_ME_6_SEM.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me2);
        button1=(Button)findViewById(R.id.me11);
        button2=(Button)findViewById(R.id.me12);
        button3=(Button)findViewById(R.id.me13);
        button4=(Button)findViewById(R.id.me14);
        button5=(Button)findViewById(R.id.me15);
        button6=(Button)findViewById(R.id.me16);
        button7=(Button)findViewById(R.id.me17);
        button8=(Button)findViewById(R.id.me18);

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
            case R.id.me11:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url1));
                startActivity(intent);
                break;

            case R.id.me12:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url2));
                startActivity(intent);
                break;
            case R.id.me13:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url3));
                startActivity(intent);
                break;
            case R.id.me14:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url4));
                startActivity(intent);
                break;
            case R.id.me15:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url5));
                startActivity(intent);
                break;

            case R.id.me16:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url6));
                startActivity(intent);
                break;

        }
    }
}
