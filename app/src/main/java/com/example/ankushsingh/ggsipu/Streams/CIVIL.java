package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class CIVIL extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4;
    Intent intent;

    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

//        findViewById(R.id.it2).setOnClickListener(this);
//        findViewById(R.id.it3).setOnClickListener(this);
//        findViewById(R.id.it6).setOnClickListener(this);
//        findViewById(R.id.it7).setOnClickListener(this);

//        a.setTitle("Civil Engineering");

    }


    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.it2: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.civilSyllabus));
//                break;
//            case R.id.it3: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.civilBookList));
//                break;
//            case R.id.it7: intent = new Intent(this,ZChooseSemForSyll.class).putExtra("Stream","CE");
//                break;
//            case R.id.it6: intent = new Intent(this,IT2.class).putExtra("StreamName", "CE");
//                break;
//        }
//        if(intent != null)
//            startActivity(intent);

    }

}