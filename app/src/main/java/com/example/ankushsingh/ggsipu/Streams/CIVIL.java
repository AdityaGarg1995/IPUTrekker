package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.RESULT;

public class CIVIL extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4;
    Intent intent;

    String url1="http://ipu.ac.in/UnivSyllabus/btechsyllabus010813/2Final%20B.Tech%20Syllabus%203rd%20Semester4,5,6,7,8/1Final%20Syllabus-CIVIL-3rd%20Semester4,5,6,7,8.pdf",
           url2="http://bookboon.com/en/civil-engineering-ebooks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        button1 = (Button)findViewById(R.id.civil2);
        button2 = (Button)findViewById(R.id.civil3);
        button3 = (Button)findViewById(R.id.civil6);
        button4 = (Button)findViewById(R.id.civil7);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.civil2:
                intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url1));
                break;

            case R.id.civil3:
                intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url2));
                break;

            case R.id.civil7:
                intent = new Intent(this,RESULT.class);
                break;

            case R.id.civil6:
                intent = new Intent(this,CIVIL2.class);
                break;

        }

        startActivity(intent);

    }

}