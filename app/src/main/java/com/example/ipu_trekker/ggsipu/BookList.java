package com.example.ipu_trekker.ggsipu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BookList extends AppCompatActivity implements View.OnClickListener {


    Button[] buttons = new Button[23];
    ArrayList<String> a = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse7);

//        ListView mListView = (ListView) findViewById(R.id.listView);

//        //3rd sem
//        a.add(Urls.amBook);
//        a.add(Urls.stldBook);
//        a.add(Urls.dsBook);
//        buttons[0] = (Button) findViewById(R.id.c1);
//        buttons[1]= (Button) findViewById(R.id.c2);
//        buttons[2] = (Button) findViewById(R.id.c3);
//        buttons[3] = (Button) findViewById(R.id.c4);


//        //4th Sem
//        a.add(Urls.am_ivBook);
//        a.add(Urls.coaBook);
//        a.add(Urls.tocBook);
//        a.add(Urls.dbmsBook);
//        a.add(Urls.oopsBook);
//        buttons[4] = (Button)findViewById(R.id.c5);
//        buttons[5] = (Button)findViewById(R.id.c6);
//        buttons[6] = (Button)findViewById(R.id.c7);
//        buttons[7] = (Button)findViewById(R.id.c8);
//        buttons[8] = (Button)findViewById(R.id.c9);


//        //5th sem
//        a.add(Urls.adaBook);
//        a.add(Urls.seBook);
//        a.add(Urls.javaBook);
//        a.add(Urls.imBook);
//        buttons[9] = (Button)findViewById(R.id.c10);
//        buttons[10] = (Button)findViewById(R.id.c11);
//        buttons[11] = (Button)findViewById(R.id.c12);
//        buttons[12] = (Button)findViewById(R.id.c13);


//        //6th sem
//        a.add(Urls.cdBook);
//        a.add(Urls.osBook);
//        a.add(Urls.dcnBook);
//        a.add(Urls.microBook);
//        buttons[13] = (Button)findViewById(R.id.c14);
//        buttons[14] = (Button)findViewById(R.id.c15);
//        buttons[15] = (Button)findViewById(R.id.c16);
//        buttons[16] = (Button)findViewById(R.id.c17);


//        //7th sem
//        a.add(Urls.acnBook);
//        a.add(Urls.wcBook);
//        a.add(Urls.cryptoBook);
//        buttons[17] = (Button)findViewById(R.id.c18);
//        buttons[18] = (Button)findViewById(R.id.c19);
//        buttons[19] = (Button)findViewById(R.id.c20);

//        //8th sem
//        a.add(Urls.adHocBook);
//        a.add(Urls.mcBook);
//        a.add(Urls.hvpe_iiBook);
//        buttons[20] = (Button)findViewById(R.id.c21);
//        buttons[21] = (Button)findViewById(R.id.c22);
//        buttons[22] = (Button)findViewById(R.id.c23);

//        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,a);
//        mListView.setAdapter(adapter);

//        for(int i = 0; i < 23; i++){
//            buttons[i].setOnClickListener(this);
//        }

    }

    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.c1: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//            case R.id.c2: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.stldBook)));
//                break;
//            case R.id.c3: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.dsBook)));
//                break;
//
//
//            case R.id.c4: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.am_ivBook)));
//                break;
//            case R.id.c5: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.coaBook)));
//                break;
//            case R.id.c6: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.dbmsBook)));
//                break;
//            case R.id.c7: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.oopsBook)));
//                break;
//
//
//            case R.id.c8: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.adaBook)));
//                break;
//            case R.id.c9: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.seBook)));
//                break;
//            case R.id.c10: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.javaBook)));
//                break;
//            case R.id.c11: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.imBook)));
//                break;
//
//
//            case R.id.c12: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.cdBook)));
//                break;
//            case R.id.c13: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.osBook)));
//                break;
//            case R.id.c14: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.dcnBook)));
//                break;
//            case R.id.c15: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.microBook)));
//                break;
//
//
//            case R.id.c16: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//            case R.id.c17: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//            case R.id.c18: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//
//
//            case R.id.c19: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//            case R.id.c20: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//            case R.id.c21: startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(Urls.amBook)));
//                break;
//
//        }
    }
}
