package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.StreamNames;
import com.example.ankushsingh.ggsipu.Urls;


public class IT extends AppCompatActivity implements View.OnClickListener{

//    Button button1,button2,button3,button4;
    Intent intent;

    public static final String url2 = "http://gatecse.in/best-books-for-gate/",
                               cnsBook = "http://www.iiitd.edu.in/~gauravg/",
                               evsBook = "dst.gov.in/green-chem.pdf";

    String streamCode, urlSyllabus, urlBook;

    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        findViewById(R.id.it2).setOnClickListener(this);
        findViewById(R.id.it3).setOnClickListener(this);
        findViewById(R.id.it6).setOnClickListener(this);
        findViewById(R.id.it7).setOnClickListener(this);

        streamCode = getIntent().getStringExtra("StreamCode");

        setUrls();

    }

    public void setUrls(){

        switch (streamCode){

            case "IT":
                urlSyllabus = Urls.itSyllabus;
                urlBook = Urls.itBookList;
                a.setTitle(StreamNames.it);
                break;

            case "CSE":
                urlSyllabus = Urls.cseSyllabus;
                urlBook = Urls.cseBookList;
                a.setTitle(StreamNames.cse);
                break;

            case "ECE":
                urlSyllabus = Urls.eceSyllabus;
                urlBook = Urls.eceBookList;
                a.setTitle(StreamNames.ece);
                break;

            case "EEE":
                urlSyllabus = Urls.eeeSyllabus;
                urlBook = Urls.eeeBookList;
                a.setTitle(StreamNames.eee);
                break;

            case "EE":
                urlSyllabus = Urls.eeSyllabus;
                urlBook = Urls.eeBookList;
                a.setTitle(StreamNames.ee);
                break;

            case "ICE":
                urlSyllabus = Urls.iceSyllabus;
                urlBook = Urls.iceBookList;
                a.setTitle(StreamNames.ice);
                break;

            case "MT":
                urlSyllabus = Urls.mechSyllabus;
                urlBook = Urls.mechBookList;
                a.setTitle(StreamNames.mech);
                break;

            case "MAE":
                urlSyllabus = Urls.maeSyllabus;
                urlBook = Urls.maeBookList;
                a.setTitle(StreamNames.mae);
                break;

            case "ME":
                urlSyllabus = Urls.meSyllabus;
                urlBook = Urls.meBookList;
                a.setTitle(StreamNames.me);
                break;

            case "TE":
                urlSyllabus = Urls.toolSyllabus;
                urlBook = Urls.toolBookList;
                a.setTitle(StreamNames.tool);
                break;

            case "PE":
                urlSyllabus = Urls.powerSyllabus;
                urlBook = Urls.powerBookList;
                a.setTitle(StreamNames.power);
                break;

            case "CE":
                urlSyllabus = Urls.civilSyllabus;
                urlBook = Urls.civilBookList;
                a.setTitle(StreamNames.civil);
                break;

            case "ENE":
                urlSyllabus = Urls.eneSyllabus;
                urlBook = Urls.eneBookList;
                a.setTitle(StreamNames.ene);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.it2: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(urlSyllabus));
                break;
            case R.id.it3: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(urlBook));
                break;
            case R.id.it7: intent = new Intent(this, ZChooseSemForSyll.class).putExtra("Stream", streamCode);
                break;
            case R.id.it6:
                if(streamCode.equals("EE") || streamCode.equals("ME") || streamCode.equals("MT"))
                    intent = new Intent(this,EE2.class).putExtra("StreamName", streamCode);
                else
                    intent = new Intent(this,IT2.class).putExtra("StreamName", streamCode);
                break;
        }
        try {
            if (intent != null)
                startActivity(intent);
        }
        catch (Exception e){e.printStackTrace();}
    }
}
