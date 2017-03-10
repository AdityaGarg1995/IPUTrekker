package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class TOOL extends AppCompatActivity implements View.OnClickListener {

    Intent intent;

    public static final String url2 = "http://www.gatecounsellor.com/books/mechanical-engineering-me/machine-tool-design/";

    Activity a = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        findViewById(R.id.it2).setOnClickListener(this);
        findViewById(R.id.it3).setOnClickListener(this);
        findViewById(R.id.it6).setOnClickListener(this);
        findViewById(R.id.it7).setOnClickListener(this);

        a.setTitle("Tool Engineering");

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.it2: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.toolSyllabus));
                break;
            case R.id.it3: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url2));
                break;
            case R.id.it7: intent = new Intent(this,RESULT.class).putExtra("Stream","Tool Engineering");
                break;
            case R.id.it6: intent = new Intent(this,IT2.class).putExtra("StreamName", "Tool");
                break;
        }

        if(intent != null)
          startActivity(intent);

    }
}
