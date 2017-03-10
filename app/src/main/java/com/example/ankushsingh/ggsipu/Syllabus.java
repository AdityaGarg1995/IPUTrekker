package com.example.ankushsingh.ggsipu;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Syllabus extends AppCompatActivity implements View.OnClickListener {

    TextView txtContent;
    Button book;
    Activity a = this;
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        txtContent = (TextView) findViewById(R.id.txtContent);
        book = (Button) findViewById(R.id.book);
        book.setOnClickListener(this);

        String subject = getIntent().getExtras().getString("Subject"),
               sem = getIntent().getStringExtra("Sem"),
               subjectName = getIntent().getStringExtra("SubjectName");

        a.setTitle(subjectName);

        AssetManager am = getAssets();
//        try {
//            String[] files = am.list("3sem");
//
//            for(int i=0; i<files.length; i++)
//                txtContent.append("\n File :"+i+" Name => "+files[i]);
//
//            txtContent.append(files[0]);
//        } catch (IOException e1) { e1.printStackTrace(); }

        try {
            InputStream input = am.open(sem + "sem/" +subject);
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            input.close(); // byte buffer into a string
            txtContent.setText(new String(buffer));
         }

         catch (IOException e) { e.printStackTrace(); }


    }


    public String getSubject(String subject){

        String s2 = "";
        switch (subject){

            case "AM-III": s2 = "Applied Mathematics-III";
                           url = Urls.am_iiiBook;
                break;

            case "FCS": s2 = "Foundation of Computer Science";
                        url = "";

                break;

            case "CGMM": s2 = "Computer Graphics and Multimedia";
                         url = "";
                break;

            case "CGMMLab": s2 = "Computer Graphics and Multimedia Lab";
                break;

            case "STLD": s2 = "Switching Theory and Logic Design";
                         url = Urls.stldBook;
                break;

            case "STLDLab" :s2 = "Switching Theory and Logic Design Lab";
                break;

            case "DS": s2 = "Data Structures";
                       url = Urls.dsBook;
                break;

            case "DSLab": s2 = "Data Structures Lab";
                break;

            case "CnS": s2 = "Circuits and Systems";
                break;

            case "CnSLab": s2 = "Circuits and Systems Lab";
                break;


        }

        return s2;

    }

    @Override
    public void onClick(View view) {

        if(view == book) {
            if (!url.equals(""))
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));

            else Toast.makeText(this, "To be updated soon", Toast.LENGTH_LONG);
        }
    }

}
