package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Urls;

public class MAE extends AppCompatActivity implements View.OnClickListener{

//    Button button1,button2,button3,button4;
//    Intent intent;
//
//    public static final String url2 = "http://www.engineersinstitute.com/gate_exam_reference_books_electrical_eee.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

//        findViewById(R.id.it2).setOnClickListener(this);
//        findViewById(R.id.it3).setOnClickListener(this);
//        findViewById(R.id.it6).setOnClickListener(this);
//        findViewById(R.id.it7).setOnClickListener(this);
//
//        final Activity a = this;
//        a.setTitle("Mechanical and Automation");
    }


    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.it2: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.maeSyllabus));
//                break;
//            case R.id.it3: intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url2));
//                break;
//            case R.id.it7: intent = new Intent(this,ZChooseSemForSyll.class).putExtra("Stream","MAE");
//                break;
//            case R.id.it6: intent = new Intent(this,IT2.class).putExtra("StreamName", "MAE");
//                break;
//        }
//        if(intent != null)
//          startActivity(intent);

    }
}
