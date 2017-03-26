package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class IT8 extends AppCompatActivity implements View.OnClickListener {

//    3 2 8 7
    Intent i;
    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it8);

        a.setTitle("IT: 8th Semester Subjects");

//        Common to all
        findViewById(R.id.hvpe_ii).setOnClickListener(this);

        findViewById(R.id.adHoc).setOnClickListener(this);
        findViewById(R.id.adHocLab).setOnClickListener(this);
        findViewById(R.id.mc).setOnClickListener(this);
        findViewById(R.id.mcLab).setOnClickListener(this);

        findViewById(R.id.net).setOnClickListener(this);
        findViewById(R.id.bigData).setOnClickListener(this);
        findViewById(R.id.ds).setOnClickListener(this);
        findViewById(R.id.ecom).setOnClickListener(this);
        findViewById(R.id.gps).setOnClickListener(this);
        findViewById(R.id.hci).setOnClickListener(this);
        findViewById(R.id.infoTheory).setOnClickListener(this);
        findViewById(R.id.nextGen).setOnClickListener(this);
        findViewById(R.id.satComm).setOnClickListener(this);
        findViewById(R.id.social).setOnClickListener(this);
        findViewById(R.id.soft).setOnClickListener(this);
        findViewById(R.id.trends).setOnClickListener(this);
        findViewById(R.id.vlsi).setOnClickListener(this);
        findViewById(R.id.dip).setOnClickListener(this);
        findViewById(R.id.biInfo).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        i = new Intent(this,Syllabus.class);
        switch (v.getId()){
//            Common to all
            case R.id.hvpe_ii: i.putExtra("Subject","HVPE-II")
                    .putExtra("Book", Urls.hvpe_iiBook);
                break;

            case R.id.adHoc: i.putExtra("Subject","AdHoc")
                    .putExtra("Book", Urls.adHocBook);
                break;
            case R.id.adHocLab: i.putExtra("Subject","AdHocLab")
                    .putExtra("Book", Urls.adHocBook);
                break;

            case R.id.mc: i.putExtra("Subject","MC")
                    .putExtra("Book", Urls.mcBook);
                break;
            case R.id.mcLab: i.putExtra("Subject","MCLab")
                    .putExtra("Book", "http://iit.qau.edu.pk/books/Android.Application.Development.for.For.Dummies.pdf");
                break;

            case R.id.net: i.putExtra("Subject",".NET")
                    .putExtra("Book", "ftp://www.mans.edu.eg/Learn/Asp.Net2008/Sams.ASP.NET.3.5.Unleashed.Jan.2008.pdf");
                break;

            case R.id.bigData: i.putExtra("Subject","BigData")
                    .putExtra("Book", "http://eecs.wsu.edu/~yinghui/mat/courses/fall%202015/resources/Big%20data%20for%20dummies.pdf");
                break;

            case R.id.dip: i.putExtra("Subject","DIP")
                    .putExtra("Book", "http://web.ipac.caltech.edu/staff/fmasci/home/astro_refs/Digital_Image_Processing_3rdEd_truncated.pdf");
                break;

            case R.id.ds: i.putExtra("Subject","Distributed")
                    .putExtra("Book", "https://vowi.fsinf.at/images/b/bc/TU_Wien-Verteilte_Systeme_VO_(G%C3%B6schka)_-_Tannenbaum-distributed_systems_principles_and_paradigms_2nd_edition.pdf");
                break;

            case R.id.ecom: i.putExtra("Subject","Ecom")
                    .putExtra("Book", Urls.ecomBook);
                break;

            case R.id.gps: i.putExtra("Subject","GPS")
                    .putExtra("Book", "http://www.garmin.com/manuals/gps4beg.pdf");
                break;

            case R.id.infoTheory: i.putExtra("Subject","InfoTheory")
                    .putExtra("Book", "http://coltech.vnu.edu.vn/~thainp/books/Wiley_-_2006_-_Elements_of_Information_Theory_2nd_Ed.pdf");
                break;

            case R.id.nextGen: i.putExtra("Subject","NextGen")
                    .putExtra("Book", "https://imcs.dvfu.ru/lib.int/docs/Networks/Administration/Next%20Generation%20Network%20Services.pdf");
                break;

            case R.id.soft: i.putExtra("Subject","Soft")
                    .putExtra("Book", "http://www.wearealgerians.com/up/uploads/139955152739491.pdf");
                break;

            case R.id.social: i.putExtra("Subject","SocialNetwork")
                    .putExtra("Book", "https://archive.org/details/SocialAndEconomicNetworksMatthewO.Jackson");
                break;

            case R.id.satComm: i.putExtra("Subject","SatComm")
                    .putExtra("Book", "http://bigsemite.tripod.com/mcgraw.pdf");
                break;

            case R.id.trends: i.putExtra("Subject","TrendsInIT")
                    .putExtra("Book", "https://mis343dw.wikispaces.com/file/view/%5Bbackup%5Ddata-warehousing-fundamentals-for-it-professionals.9780470462072.52994.pdf");
                break;

            case R.id.vlsi: i.putExtra("Subject","VLSI")
                    .putExtra("Book", "https://elearningatria.files.wordpress.com/2013/10/ece-v-fundamentals-of-cmos-vlsi-10ec56-notes.pdf");
                break;
            case R.id.biInfo: i.putExtra("Subject","BioInfo")
                    .putExtra("Book", "ftp://ftp.ufv.br/dbg/material%20curso%20bioinfo/Leitura%20Complementar/livros/MIT%20Press,%20Bioinformatics%20The%20Machine%20Learning%20Approach%202Nd%20Edition.pdf");
                break;
            case R.id.hci: i.putExtra("Subject", "HCI")
                    .putExtra("Book", "http://fit.mta.edu.vn/files/DanhSach/__Human_computer_interaction.pdf");
                break;
        }
        try {
            i.putExtra("Sem", "8").putExtra("SubjectName", ((Button)v).getText().toString());
            if(i != null)
               startActivity(i);
        } catch(Exception e){e.printStackTrace();}
    }
}