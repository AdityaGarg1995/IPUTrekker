package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.RESULT;

public class EE extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button6,button5;
    Intent intent;

    String url1 = "http://ipu.ac.in/UnivSyllabus/btechsyllabus010813/2Final%20B.Tech%20Syllabus%203rd%20Semester4,5,6,7,8/Final%20Syllabus-EE-3rd%20Semester4,5,6,7,8.pdf";
    String url2 = "http://www.engineersinstitute.com/gate_exam_reference_books_electrical_eee.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);
        button1 = (Button)findViewById(R.id.ee2);
        button2 = (Button)findViewById(R.id.ee3);
        button6 = (Button)findViewById(R.id.ee6);
        button5 = (Button)findViewById(R.id.ee7);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button6.setOnClickListener(this);
        button5.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.ee2:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url1));
                startActivity(intent);
                break;

            case R.id.ee3:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url2));
                startActivity(intent);
                break;

            case R.id.ee7:
                intent = new Intent(this,RESULT.class);
                startActivity(intent);
                break;

            case R.id.ee6:
                intent = new Intent(this,EE2.class);
                startActivity(intent);
                break;

        }

    }


}
