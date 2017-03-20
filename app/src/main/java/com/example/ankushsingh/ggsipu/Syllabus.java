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
import java.net.URL;


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

        getSubject(subject);

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
            InputStream input = am.open(sem + "sem/" + subject);
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            input.close(); // byte buffer into a string
            txtContent.setText(new String(buffer));
         }
         catch (IOException e) { e.printStackTrace(); }

    }


    public void getSubject(String subject){

        switch (subject){

//            IT/CSE 3rd sem
            case "NAST":
            case "NASTLab":
            case "AM-III": url = Urls.am_iiiBook;
                break;
//            case "STLD":
//            case "STLDLab": url = Urls.stldBook;
//                break;
            case "DS":
            case "DSLab": url = Urls.dsBook;
                break;
//           IT 7th sem
            case "CSharp":  url = Urls.cSharpBook;
                break;
            case "ACN":
            case "ACNLab": url = Urls.acnBook;
                break;
            case "WC":
            case "WCLab": url = Urls.wcBook;
                break;
            case "CNS":
            case "CNSLab": url = Urls.cryptoBook;
                break;

//            IT 8th sem
            case "MC":
            case "MCLab": url = Urls.mcBook;
                break;
            case "AdHoc":
            case "AdHocLab": url = Urls.adHocBook;
                break;
            case "HVPE-II": url = Urls.hvpe_iiBook;
                break;
            case "Ecom": url = Urls.ecomBook;
                break;
            case "GPS": url = "http://www.garmin.com/manuals/gps4beg.pdf";
                break;

//          1st sem
            case "HVPE": url = "http.//www.universalhumanvalues.info";
                break;
            case "ITP":
            case "ITPLab": url = "http://www.codeblocks.org/";
                break;
            case "FoC":
            case "FoCLab":
                url = "http://www.openoffice.org/why/";
                break;

//            2nd Sem
            case "EVS":
            case "EVSLab":
                url = "dst.gov.in/green-chem.pdf";
                break;

//          IT/CSE 4th sem
            case "AM-IV":
            case "AMLab": url = Urls.am_ivBook;
                break;
            case "COA":
            case "COALab": url = Urls.coaBook;
                break;
            case "TOC": url = Urls.tocBook;
                break;
            case "DBMS":
            case "DBMSLab": url = Urls.dbmsBook;
                break;
            case "OOPS":
            case "OOPSLab": url = Urls.oopsBook;
                break;

//            IT/CSE 5th sem
            case "ADA":
            case "ADALab": url = Urls.adaBook;
                break;
            case "SE":
            case "SELab": url = Urls.seBook;
                break;
            case "JAVA":
            case "JAVALab": url = Urls.javaBook;
                break;
            case "IM": url = Urls.imBook;
                break;

//            IT/CSE 6th sem
            case "CD": url = Urls.cdBook;
                break;
            case "OS":
            case "OSLab": url = Urls.osBook;
                break;
            case "DCN":
            case "DCNLab": url = Urls.dcnBook;
                break;
            case "Micro":
            case "MicroLab": url = Urls.microBook;
                break;

            case "Seminar":
            case "Camp":
            case "Workshop":url = "NA";
                break;

            case "ASD":
            case "ASDLab": url = Urls.se_sm;
                break;
            case "BMC":    url = Urls.repair;
                break;

        }
    }

    @Override
    public void onClick(View view) {

        try {
            if (view.getId() == R.id.book) {
                if (!url.equals("") && !url.equals("NA"))
                    startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));

                else if (url.equals("NA"))
                    Toast.makeText(getApplicationContext(), "Not Applicable", Toast.LENGTH_LONG).show();
                else if (url.equals(""))
                    Toast.makeText(getApplicationContext(), "To be updated soon", Toast.LENGTH_LONG).show();
            }
        }
        catch(Exception e){e.printStackTrace();}
    }

}