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

//    Button[] buttons = new Button[8];

    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nues);

        String task = getIntent().getStringExtra("Task");

        TextView text = (TextView)findViewById(R.id.text);

        AssetManager am1 = getAssets();

        if(task.equals("NCC")){
            try {
                InputStream input1 = am1.open("NCC");
                byte[] buffer = new byte[input1.available()];
                input1.read(buffer);
                input1.close(); // byte buffer into a string
                text.setText(new String(buffer));
            } catch (IOException e) { e.printStackTrace(); }
        }

        else if (task.equals("Codes")){
            try {
                InputStream input1 = am1.open("Codes");
                byte[] buffer = new byte[input1.available()];
                input1.read(buffer);
                input1.close(); // byte buffer into a string
                text.setText(new String(buffer));
            } catch (IOException e) { e.printStackTrace(); }
        }
//        findViewById(R.id.c1).setOnClickListener(this);
//        findViewById(R.id.c2).setOnClickListener(this);
//        findViewById(R.id.c3).setOnClickListener(this);
//        findViewById(R.id.c4).setOnClickListener(this);
//        findViewById(R.id.c5).setOnClickListener(this);
//        findViewById(R.id.c6).setOnClickListener(this);
//        findViewById(R.id.c7).setOnClickListener(this);
//        findViewById(R.id.c8).setOnClickListener(this);

//        final Activity a = this;
        a.setTitle(task);
    }


    @Override
    public void onClick(View v) {

//        String url = "";
//        Intent intent = new Intent(Intent.ACTION_VIEW);

//        switch (v.getId()){
//            case R.id.c1: url = url1;
//                break;
//            case R.id.c2: url = url2;
//                break;
//            case R.id.c3: url = url3;
//                break;
//            case R.id.c4: url = url4;
//                break;
//            case R.id.c5: url = url5;
//                break;
//            case R.id.c6: url = url6;
//                break;
//            case R.id.c7: url = url7;
//                break;
//            case R.id.c8: url = url8;
//                break;
//        }

//        if(!url.equals("") && (intent != null)){
//            intent.setData(Uri.parse(url));
//            startActivity(intent);
//        }
    }
}