package com.example.ankushsingh.ggsipu.Streams;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ankushsingh.ggsipu.R;
import com.example.ankushsingh.ggsipu.Syllabus;
import com.example.ankushsingh.ggsipu.Urls;

public class SEM8_CSE extends AppCompatActivity implements View.OnClickListener{
//    3 2 9 7
//    Button button1,button2,button3,button4;

    Intent intent;

    Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse8);

        findViewById(R.id.mc).setOnClickListener(this);
        findViewById(R.id.ml).setOnClickListener(this);
        findViewById(R.id.hvpe_ii).setOnClickListener(this);

        findViewById(R.id.mcLab).setOnClickListener(this);
        findViewById(R.id.mlLab).setOnClickListener(this);

//        Electives-A 7sem
        findViewById(R.id.dip).setOnClickListener(this);
        findViewById(R.id.micro).setOnClickListener(this);
        findViewById(R.id.adHoc).setOnClickListener(this);
        findViewById(R.id.sc).setOnClickListener(this);
        findViewById(R.id.vlsi).setOnClickListener(this);
        findViewById(R.id.ds).setOnClickListener(this);
        findViewById(R.id.oose).setOnClickListener(this);
        findViewById(R.id.cv).setOnClickListener(this);
        findViewById(R.id.spm).setOnClickListener(this);

//        Elective-B 7sem
        findViewById(R.id.hci).setOnClickListener(this);
        findViewById(R.id.itc).setOnClickListener(this);
        findViewById(R.id.wibd).setOnClickListener(this);
        findViewById(R.id.soa).setOnClickListener(this);
        findViewById(R.id.ms).setOnClickListener(this);
        findViewById(R.id.ppl).setOnClickListener(this);
        findViewById(R.id.tn).setOnClickListener(this);
        findViewById(R.id.trends).setOnClickListener(this);

        a.setTitle("CSE: 8th Semester Subjects");

    }


    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        switch(v.getId()){
            case R.id.hvpe_ii:
                intent.putExtra("Subject","HVPE-II").putExtra("Sem", "8")
                        .putExtra("Book", Urls.hvpe_iiBook);
                break;

            case R.id.mc:
                intent.putExtra("Subject","MC").putExtra("Sem", "8")
                        .putExtra("Book", Urls.mcBook);
                break;
            case R.id.mcLab:
                intent.putExtra("Subject","MCLab").putExtra("Sem", "8")
                        .putExtra("Book", Urls.mcBook);
                break;

            case R.id.ml:
                intent.putExtra("Subject","ML").putExtra("Sem", "CSE8")
                        .putExtra("Book", "http://personal.disco.unimib.it/Vanneschi/McGrawHill_-_Machine_Learning_-Tom_Mitchell.pdf");
                break;
            case R.id.mlLab:
                intent.putExtra("Subject","MLLab").putExtra("Sem", "CSE8")
                        .putExtra("Book", "http://personal.disco.unimib.it/Vanneschi/McGrawHill_-_Machine_Learning_-Tom_Mitchell.pdf");
                break;

//            E-A
            case R.id.dip:
                intent.putExtra("Subject","DIP").putExtra("Sem", "8")
                        .putExtra("Book", "http://web.ipac.caltech.edu/staff/fmasci/home/astro_refs/Digital_Image_Processing_3rdEd_truncated.pdf");
                break;

            case R.id.micro:
                intent.putExtra("Subject","Micro").putExtra("Sem", "CSE8")
                        .putExtra("Book", "ftp://doc.nit.ac.ir/cee/y.baleghi/Electronics/Microelectronic%20Circuits%20by%20Sedra%20Smith,5th%20edition.pdf");
                break;

            case R.id.adHoc:
                intent.putExtra("Subject","AdHoc").putExtra("Sem", "8")
                        .putExtra("Book", Urls.adHocBook);
                break;

            case R.id.sc:
                intent.putExtra("Subject","Soft").putExtra("Sem", "8")
                        .putExtra("Book", "http://www.wearealgerians.com/up/uploads/139955152739491.pdf");
                break;

            case R.id.vlsi:
                intent.putExtra("Subject","VLSI").putExtra("Sem", "8")
                        .putExtra("Book", "https://elearningatria.files.wordpress.com/2013/10/ece-v-fundamentals-of-cmos-vlsi-10ec56-notes.pdf");
                break;

            case R.id.ds:
                intent.putExtra("Subject","Distributed").putExtra("Sem", "8")
                        .putExtra("Book", "https://vowi.fsinf.at/images/b/bc/TU_Wien-Verteilte_Systeme_VO_(G%C3%B6schka)_-_Tannenbaum-distributed_systems_principles_and_paradigms_2nd_edition.pdf");
                break;

            case R.id.oose:
                intent.putExtra("Subject","OOSE").putExtra("Sem", "CSE8")
                        .putExtra("Book", "https://nscnetwork.files.wordpress.com/2011/09/object-oriented-modeling-and-design.pdf");
                break;
            case R.id.cv:
                intent.putExtra("Subject","CV").putExtra("Sem", "CSE8")
                        .putExtra("Book", "http://cmuems.com/excap/readings/forsyth-ponce-computer-vision-a-modern-approach.pdf");
                break;
            case R.id.spm:
                intent.putExtra("Subject","SPM").putExtra("Sem", "CSE8")
                        .putExtra("Book", "");
                break;

//            E-B
            case R.id.hci:
                intent.putExtra("Subject","HCI").putExtra("Sem", "8")
                        .putExtra("Book", "http://fit.mta.edu.vn/files/DanhSach/__Human_computer_interaction.pdf");
                break;
            case R.id.itc:
                intent.putExtra("Subject","InfoTheory").putExtra("Sem", "8")
                        .putExtra("Book", "http://coltech.vnu.edu.vn/~thainp/books/Wiley_-_2006_-_Elements_of_Information_Theory_2nd_Ed.pdf");
                break;
            case R.id.wibd:
                intent.putExtra("Subject","WIBD").putExtra("Sem", "CSE8")
                        .putExtra("Book", "");
                break;
            case R.id.soa:
                intent.putExtra("Subject","SOA").putExtra("Sem", "CSE8")
                        .putExtra("Book", "");
                break;
            case R.id.ms:
                intent.putExtra("Subject","MS").putExtra("Sem", "CSE8")
                        .putExtra("Book", "http://coltech.vnu.edu.vn/httt/media/courses/AI++/Tai%20lieu/TLTK.pdf");
                break;
            case R.id.ppl:
                intent.putExtra("Subject","PPL").putExtra("Sem", "CSE8")
                        .putExtra("Book", "http://aleteya.cs.buap.mx/~jlavalle/papers/books_on_line/John%20Wiley%20&%20Sons%20-%20Programming%20Language%20Design%20Concepts.pdf");
                break;
            case R.id.tn:
                intent.putExtra("Subject","TN").putExtra("Sem", "CSE8")
                        .putExtra("Book", "");
                break;
            case R.id.trends:
                intent.putExtra("Subject","TrendsCSE").putExtra("Sem", "CSE8")
                        .putExtra("Book", "");
                break;
        }
        try {
            intent.putExtra("SubjectName", ((Button)v).getText().toString());
            if (intent != null)
                startActivity(intent);
        } catch (Exception e){e.printStackTrace();}
    }

}