package com.example.ankushsingh.ggsipu.Streams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;

public class MECH2 extends AppCompatActivity implements View.OnClickListener {

//    Button[] buttons = new Button[6];
    String stream;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);

//        buttons[0] = (Button)findViewById(R.id.ee11);
//        buttons[1] = (Button)findViewById(R.id.ee12);
//        buttons[2] = (Button)findViewById(R.id.ee13);
//        buttons[3] = (Button)findViewById(R.id.ee14);
//        buttons[4] = (Button)findViewById(R.id.ee15);
//        buttons[5] = (Button)findViewById(R.id.ee16);
//
//        for(int i = 0; i < 6; i++)
//            buttons[i].setOnClickListener(this);
//
//        stream = getIntent().getExtras().getString("Stream");
//        final Activity a = this;
//        a.setTitle(stream);

    }


    @Override
    public void onClick(View v) {

//            String url = "";
//            intent = new Intent(Intent.ACTION_VIEW);

//            switch (v.getId()) {
//                case R.id.ee11: url = url1;
//                    break;
//                case R.id.ee12: url = url2;
//                    break;
//                case R.id.ee13: url = url3;
//                    break;
//                case R.id.ee14:url = url4;
//                    break;
//                case R.id.ee15:url = url5;
//                    break;
//                case R.id.ee16:url = url6;
//                    break;
//            }

//            if(!url.equals("") && (intent != null)){
//                intent.setData(Uri.parse(url));
//                startActivity(intent);
//            }


//        else if(stream == "IT Syllabus: Choose Semester"){
//
//            switch (v.getId()) {
//                case R.id.ee11: startActivity(new Intent(this, IT3.class));
//                    break;
//                case R.id.ee12: startActivity(new Intent(this, IT4.class));
//                    break;
//                case R.id.ee13: intent = new Intent(this, IT5.class);
//                    break;
//                case R.id.ee14: intent = new Intent(this, IT6.class);
//                    break;
//                case R.id.ee15: intent = new Intent(this, IT7.class);
//                    break;
//                case R.id.ee16: intent = new Intent(this, IT8.class);
//                    break;
//            }
//        }

    }


}