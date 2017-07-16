package com.example.ipu_trekker.ggsipu;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
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
    String url = "", subject, sem, subjectName;


    public String get(String string){
        return getIntent().getStringExtra(string);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        txtContent = (TextView) findViewById(R.id.txtContent);

        book = (Button) findViewById(R.id.book);
        book.setOnClickListener(this);

        subject     = get("Subject");
        sem         = get("Sem");
        subjectName = get("SubjectName");
        url         = get("Book");

        a.setTitle(subjectName);
    }


    @Override
    public void onClick(View view) {
        try {AssetManager am = getAssets();
//        try {
//            String[] files = am.list("3sem");
//
//            for(int i=0; i<files.length; i++)
//                txtContent.append("\n File :"+i+" Name => "+files[i]);
//
//            txtContent.append(files[0]);
//        } catch (IOException e1) { e1.printStackTrace(); }
            try {
                InputStream input = am.open(sem + "sem/" + subject);
                byte[] buffer = new byte[input.available()];
                input.read(buffer);
                input.close(); // byte buffer into a string
                txtContent.setText(new String(buffer));
            } catch (IOException e) { e.printStackTrace(); }
            if (view == book)
                if (!url.equals("") && !url.equals("NA"))
                    startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
                else if (url.equals("NA"))
                    Toast.makeText(getApplicationContext(), "Not applicable for this subject", Toast.LENGTH_LONG).show();
                else if (url.equals(""))
                    Toast.makeText(getApplicationContext(), "To be updated soon", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){e.printStackTrace();}
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