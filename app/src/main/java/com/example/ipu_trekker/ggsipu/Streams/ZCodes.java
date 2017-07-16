package com.example.ipu_trekker.ggsipu.Streams;



import android.app.Activity;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ipu_trekker.ggsipu.R;

import java.io.IOException;
import java.io.InputStream;

public class ZCodes extends AppCompatActivity implements View.OnClickListener {

    Activity a = this;
    AssetManager am1;
    TextView text;

    public void showText(String string){
        try {
            InputStream input1 = am1.open(string);
            byte[] buffer = new byte[input1.available()];
            input1.read(buffer);
            input1.close(); // byte buffer into a string
            text.setText(new String(buffer));
        } catch (IOException e) { e.printStackTrace(); }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nues);

        String task = getIntent().getStringExtra("Task");
        text = (TextView)findViewById(R.id.text);
        am1 = getAssets();

        switch (task) {
            case "NCC":
                a.setTitle("NCC/NSS");
                showText("NCC");
                break;
            case"Codes":
                a.setTitle("Stream Codes");
                showText("Codes");
                break;
            case "Codes2":
                a.setTitle("Stream Codes-II");
                showText("Codes2");
                break;
            case "College":
                a.setTitle("College Codes");
                showText("CollegeCodes");
                break;
        }
    }


    @Override
    public void onClick(View v) {

    }
}