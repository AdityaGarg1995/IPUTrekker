package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.RESULT;

public class CSE extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4;
    Intent intent;

    String url1 = "http://ipu.ac.in/UnivSyllabus/btechsyllabus010813/" +
                  "2Final%20B.Tech%20Syllabus%203rd%20Semester4,5,6,7,8/3Final%20Syllabus-CSE-3rd%20Semester4,5,6,7,8.pdf";
    String url2 = "http://gatecse.in/best-books-for-gate/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        button1 = (Button)findViewById(R.id.cse2);
        button2 = (Button)findViewById(R.id.cse3);
        button3 = (Button)findViewById(R.id.cse6);
        button4 = (Button)findViewById(R.id.cse7);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener( this);
        button4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.cse2:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url1));
                startActivity(intent);
                break;

            case R.id.cse3:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url2));
                startActivity(intent);
                break;

            case R.id.cse7:
                intent = new Intent(this,RESULT.class);
                startActivity(intent);
                break;

            case R.id.cse6:
                intent = new Intent(this,CSE2.class);
                startActivity(intent);
                break;

        }
    }

}
