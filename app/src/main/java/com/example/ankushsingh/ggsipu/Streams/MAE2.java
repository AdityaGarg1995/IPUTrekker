package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;

public class MAE2 extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8;
    Intent intent;

    String url1="http://ipu.ac.in/public/ExamResults/2016/230316/Dec2015/1st%20Semester/036_MAE_1stSEM.pdf";
    String url2="http://164.100.158.135/ExamResults/2016/310716/PDF2/036_MAE_2_SEM.pdf";
    String url3="http://ipu.ac.in/exam/ExamResults/2016/290316/036_MAE_3rd%20Sem.pdf";
    String url4="http://164.100.158.135/ExamResults/2016/310716/PDF4/036_MAE_4_SEM.pdf";
    String url5="http://ipu.ac.in/exam/ExamResults/2016/300316/036_MAE_5th%20Sem.pdf";
    String url6="http://164.100.158.135/ExamResults/2016/310716/PDF6/036_MAE_6_SEM.pdf";
    String url7="http://ipu.ac.in/exam/ExamResults/2016/300316/036_MAE_7th%20Sem.pdf";
    String url8="http://164.100.158.135/ExamResults/2016/310716/PDF8/036_MAE_8_SEM.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mae2);
        button1=(Button)findViewById(R.id.mae11);
        button2=(Button)findViewById(R.id.mae12);
        button3=(Button)findViewById(R.id.mae13);
        button4=(Button)findViewById(R.id.mae14);
        button5=(Button)findViewById(R.id.mae15);
        button6=(Button)findViewById(R.id.mae16);
        button7=(Button)findViewById(R.id.mae17);
        button8=(Button)findViewById(R.id.mae18);

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

        String url = "";
        intent = new Intent(Intent.ACTION_VIEW);

        switch (v.getId()){
            case R.id.mae11:
                url = url1;
                break;

            case R.id.mae12:
                url = url2;
                break;

            case R.id.mae13:
                url = url3;
                break;

            case R.id.mae14:
                url = url4;
                break;

            case R.id.mae15:
                url = url5;
                break;

            case R.id.mae16:
                url = url6;
                break;

            case R.id.mae17:
                url = url7;
                break;

            case R.id.mae18:
                url = url8;
                break;
        }

        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
