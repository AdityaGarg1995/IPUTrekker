package com.example.ipu_trekker.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus.ZChooseSemForSyllabus;
import com.example.ipu_trekker.ggsipu.Urls;


public class StreamMenuActivity extends AppCompatActivity implements View.OnClickListener{

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
                a.setTitle(ImportantStrings.it);
                break;

            case "CSE":
                urlSyllabus = Urls.cseSyllabus;
                urlBook = Urls.cseBookList;
                a.setTitle(ImportantStrings.cse);
                break;

            case "ECE":
                urlSyllabus = Urls.eceSyllabus;
                urlBook = Urls.eceBookList;
                a.setTitle(ImportantStrings.ece);
                break;

            case "EEE":
                urlSyllabus = Urls.eeeSyllabus;
                urlBook = Urls.eeeBookList;
                a.setTitle(ImportantStrings.eee);
                break;

            case "EE":
                urlSyllabus = Urls.eeSyllabus;
                urlBook = Urls.eeBookList;
                a.setTitle(ImportantStrings.ee);
                break;

            case "ICE":
                urlSyllabus = Urls.iceSyllabus;
                urlBook = Urls.iceBookList;
                a.setTitle(ImportantStrings.ice);
                break;

            case "MT":
                urlSyllabus = Urls.mechSyllabus;
                urlBook = Urls.mechBookList;
                a.setTitle(ImportantStrings.mt);
                break;

            case "MAE":
                urlSyllabus = Urls.maeSyllabus;
                urlBook = Urls.maeBookList;
                a.setTitle(ImportantStrings.mae);
                break;

            case "ME":
                urlSyllabus = Urls.meSyllabus;
                urlBook = Urls.meBookList;
                a.setTitle(ImportantStrings.me);
                break;

            case "TE":
                urlSyllabus = Urls.toolSyllabus;
                urlBook = Urls.toolBookList;
                a.setTitle(ImportantStrings.te);
                break;

            case "PE":
                urlSyllabus = Urls.powerSyllabus;
                urlBook = Urls.powerBookList;
                a.setTitle(ImportantStrings.pe);
                break;

            case "CE":
                urlSyllabus = Urls.civilSyllabus;
                urlBook = Urls.civilBookList;
                a.setTitle(ImportantStrings.ce);
                break;

            case "ENE":
                urlSyllabus = Urls.eneSyllabus;
                urlBook = Urls.eneBookList;
                a.setTitle(ImportantStrings.ene);
                break;
        }
    }


    @Override
    public void onClick(View v) {
        Intent intent  = new Intent();
        switch(v.getId()){
            case R.id.it2: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(urlSyllabus));
                break;
            case R.id.it3: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(urlBook));
                break;
            case R.id.it7: intent = new Intent(this, ZChooseSemForSyllabus.class).putExtra("Stream", streamCode);
                break;
            case R.id.it6:
                if(streamCode.equals("EE") || streamCode.equals("ME") || streamCode.equals("MT"))
                    intent = new Intent(this,RESULT_PDF_EEnMEnMT.class);
                else
                    intent = new Intent(this,RESULT_PDF.class);
                intent.putExtra("StreamName", streamCode);
                break;
        }
        try {
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}