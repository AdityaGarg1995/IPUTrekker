package com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ipu_trekker.ggsipu.R;
import com.example.ipu_trekker.ggsipu.ImportantStrings;
import com.example.ipu_trekker.ggsipu.Syllabus;
import com.example.ipu_trekker.ggsipu.Urls;

import static com.example.ipu_trekker.ggsipu.ImportantStrings.amSubject;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.lab;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.mandatory;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.nues;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.putExtraCustom;
import static com.example.ipu_trekker.ggsipu.ImportantStrings.stldSubject;


//4th sem
public class SEM4 extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Activity a = this;
    String stream;

    Button am_iv, amLab, control, csLab, dbms, dbmsLab, toc, oops, oopsLab, coa, coaLab, lab1,
           button[] = new Button[6], pb[] = new Button[6];

    final String AMIV = amSubject + "–IV",
                 AMLab = amSubject + " Lab",

                 coaSubject = "Computer Organization & Architecture",
                 em         = "Electrical Machines",
                 cs         = "Control Systems",
                 ae_ii      = "Analog Electronics–II",
                 nast       = "Numerical Analysis & Statistical Techniques",
                 emit       = "Electrical Measuring Instruments & Transducers",
                 eemi       = "Electrical & Electronics Measuring Instruments",
                 ts         = "Thermal Science",
                 comm       = "Communication Systems",
                 ps         = "Power System–I",
                 nas        = "Network Analysis & Synthesis",
                 emft       = "Electromagnetic Field Theory",
                 hnp        = "Hydraulics & Pneumatics",
                 kdm        = "Kinematics & Dynamics of Machinery",
                 mm         = "Manufacturing Machines";


    String em_ii_m = em+"-II"+mandatory,
           em_ii_lab = em+"-II"+lab;
    String eceTSub[] = {AMIV, comm+mandatory, ae_ii, nas+mandatory, emft, coaSubject},
           ecePSub[] = {AMLab, comm+lab, nas+lab, ae_ii+lab, "Linux Programming & Administration Lab", ""},

           eeeTSub[] = {em_ii_m, ae_ii+mandatory, ps+mandatory, eemi, emft, cs+mandatory},
           eeePSub[] = {em_ii_lab, ae_ii+lab, ps+lab, eemi+lab, cs+lab, ""},

           eeTSub[] = {em_ii_m, cs+mandatory, ps+mandatory, emit+mandatory, emft, "Thermodynamics"},
           eePSub[] = {em_ii_lab, cs+lab, ps+lab+mandatory, emit+lab, "", ""};


//    PE
    final String hmt = "Heat & Mass Transfer",
                 fm  = "Fluid Mechanics";
    String peTSub[] = {"Power Generation Engineering (M)", "Energy Conversion (M)", hmt, fm, stldSubject, cs+mandatory},
           pePSub[] = {hmt+lab, fm+lab, stldSubject+lab, cs+lab, "", ""};


//    MT
    final String sns = "Signals & Systems",
                 tom = "Theory of Machines",
                 mni = "Measurements & Instrumentation",
                 fs  = "Fluid Systems";
    String mtTSub[] = {"Organizational Behaviour", kdm+mandatory, sns+mandatory, cs+mandatory, ts, hnp+mandatory},
           mtPSub[] = {kdm+lab, sns+lab, cs+lab, hnp+lab, "", ""},

           maeTSub[] = {nast, fs, tom+mandatory, mm+mandatory, mni, stldSubject+mandatory},
           maePSub[] = {nast+lab, fs+lab, tom+lab, mm+lab, stldSubject+lab, ""};


//  ME
    final  String kom    = "Kinematics of Machines",
                  som_ii = "Strength of Materials",
                  icegt  = "I.C. Engines & Gas Turbine";
    String meTSub[] = {kom+mandatory, som_ii+"-II"+mandatory, mm+mandatory, mni, icegt, fm+mandatory},
           mePSub[] = {kom+lab, som_ii+lab+"-II", mm+lab, icegt+lab, fm+lab, ""};


//  TE
    final String med = "Machine Element Design",
                 mqa = "Metrology & Quality Assurance",
                 mt  = "Machine Tools";
    String teTSub[] = {tom+mandatory, "Metal Forming (M)", mt+mandatory, med, ts, mqa+mandatory},
           tePSub[] = {tom+lab, mt+lab, med+lab, mqa+lab, "", ""};


//    ENE
    final String pollution = "Air & Noise Pollution",
                 eh = "Environmental Hydraulics";
    String eneTSub[] = {"Physico-Chemical Treatment Processes (M)", "Structural Engineering", eh+mandatory,
                   "Introduction to Environmental Legislations (M)", "Geotechnical Engineering", pollution+mandatory},
           enePSub[] = {"Water Engineering Design & Drawing Lab", "Structure Lab", eh+lab,
                   pollution+" Monitoring & Design Lab", "Seminar"+nues, ""};


//    ICE
    final String taic = "Theory & Applications of Integrated Circuits",
                 powerElec = "Power Electronics";
    String iceTSub[] = {mni+mandatory, cs+mandatory, powerElec, taic+mandatory, em, comm},
           icePSub[] = {mni+lab+mandatory, cs+lab+mandatory, powerElec+lab, taic+lab+mandatory, em+lab, ""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4);

        stream = getIntent().getStringExtra("Stream");
        a.setTitle(stream + ": " + ImportantStrings.sem4sub);

        Toast.makeText(getApplicationContext(), "Swipe up for more", Toast.LENGTH_SHORT).show();

        am_iv    = button[0] = (Button)findViewById(R.id.am_iv);
        control  = button[1] = (Button)findViewById(R.id.control);
        dbms     = button[2] = (Button)findViewById(R.id.dbms);
        oops     = button[3] = (Button)findViewById(R.id.oops);
        toc      = button[4] = (Button)findViewById(R.id.toc);
        coa      = button[5] = (Button)findViewById(R.id.coa);

        amLab    = pb[0] = (Button)findViewById(R.id.amLab);
        csLab    = pb[1] = (Button)findViewById(R.id.csLab);
        dbmsLab  = pb[2] = (Button)findViewById(R.id.dbmsLab);
        oopsLab  = pb[3] = (Button)findViewById(R.id.oopsLab);
        coaLab   = pb[4] = (Button)findViewById(R.id.coaLab);
        lab1     = pb[5] = (Button)findViewById(R.id.lab1);

        for(int i = 0; i < 6; i++) {
            button[i].setOnClickListener(this);
            pb[i].setOnClickListener(this);
        }
        lab1.setVisibility(View.GONE);

        setSubject(stream);
    }


    public void setSubject(String stream){

        String tocSubject = "Theory of Computation" + mandatory;
        switch (stream) {
            case "IT":
                dbms.setText(String.format("%s%s", ImportantStrings.dbmsSubject, mandatory));
                coa.setText(String.format("%s%s", coaSubject, mandatory));
                toc.setText(tocSubject);
                break;

            case "CSE":
                dbms.setText(String.format("%s%s", ImportantStrings.dbmsSubject, mandatory));
                coa.setText(String.format("%s%s", coaSubject, mandatory));
                toc.setText(tocSubject);
                control.setText(comm);
                csLab.setText(String.format("%s%s", comm, lab));
                break;

            case "ECE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eceTSub[i]);
                    if(!ecePSub[i].equals("")){
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "EEE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eeeTSub[i]);
                    if(!eeePSub[i].equals("")){
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "EE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eeTSub[i]);
                    if(!eePSub[i].equals("")) {
                        pb[i].setText(eePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "PE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(peTSub[i]);
                    if(!pePSub[i].equals("")) {
                        pb[i].setText(pePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "MT":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(mtTSub[i]);
                    if(!mtPSub[i].equals("")) {
                        pb[i].setText(mtPSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "MAE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(maeTSub[i]);
                    if(!maePSub[i].equals("")) {
                        pb[i].setText(maePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "ME":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(meTSub[i]);
                    if(!mePSub[i].equals("")) {
                        pb[i].setText(mePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "TE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(teTSub[i]);
                    if(!tePSub[i].equals("")) {
                        pb[i].setText(tePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "ICE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(iceTSub[i]);
                    if(!icePSub[i].equals("")) {
                        pb[i].setText(icePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "ENE":
                for(int i = 0; i < 6; i++) {
                    button[i].setText(eneTSub[i]);
                    if(!enePSub[i].equals("")) {
                        pb[i].setText(enePSub[i]);
                        pb[i].setVisibility(View.VISIBLE);
                    }
                    else pb[i].setVisibility(View.GONE);
                }
                break;

            case "CE":

                String sa = "Structural Analysis",
                       as = "Advanced Surveying",
                       hhm = "Hydraulics & Hydraulic Machines";

                am_iv.setText("Design of Concrete Structure (M)");
                amLab.setText("Cement & Concrete Testing Lab");

                coa.setText(String.format("%s%s", hhm, mandatory));
                coaLab.setText(String.format("%s%s", hhm, lab));

                control.setText("Soil Mechanics (M)");

                csLab.setText("Seminar");

                dbms.setText(String.format("%s%s", sa, mandatory));
                dbmsLab.setText(String.format("%s%s", sa, lab));

                oops.setText(as);
                oopsLab.setText(String.format("%s%s", as, lab));

                toc.setText("Water Engineering");
                break;
        }
    }

    public void setAM_IV(){
        intent.putExtra("Subject", "AM-IV").putExtra("Sem", "4").putExtra("Book", Urls.amBook);
    }
    public void setAMLab(){
        intent.putExtra("Subject", "AM-IV").putExtra("Sem", "4").putExtra("Book", Urls.amBook);
    }

    public void setDBMS(){
        intent.putExtra("Subject", "DBMS").putExtra("Sem", "4").putExtra("Book", Urls.dbmsBook);
    }
    public void setDBMSLab(){
        intent.putExtra("Subject", "DBMSLab").putExtra("Sem", "4").putExtra("Book", Urls.dbmsBook);
    }

    public void setCOA(){
        intent.putExtra("Subject", "COA").putExtra("Sem", "4").putExtra("Book", Urls.coaBook);
    }
    public void setLinuxLab(){
        intent.putExtra("Subject", "Linux").putExtra("Sem", "4").putExtra("Book", Urls.coaBook);
    }
    public void setCOALab(){
        intent.putExtra("Subject", "COALab").putExtra("Sem", "4").putExtra("Book", Urls.coaBook);
    }

    public void setOOPS(){
        intent.putExtra("Subject", "OOPS").putExtra("Sem", "4").putExtra("Book", Urls.oopsBook);
    }
    public void setOOPSLab(){
        intent.putExtra("Subject", "OOPSLab").putExtra("Sem", "4").putExtra("Book", Urls.oopsBook);
    }

    public void setControlSystems(){
        putExtraCustom(intent, "Control", "4", Urls.controlBook);
    }
    public void setControlSystemsLab(){
        putExtraCustom(intent, "CSLab", "4", Urls.controlBook);
    }

    public void setCommSystems(){
        intent.putExtra("Subject", "Comm").putExtra("Sem", "4").putExtra("Book", "");
    }
    public void setCommSystemsLab(){
        intent.putExtra("Subject", "CommLab").putExtra("Sem", "4").putExtra("Book", "");
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, Syllabus.class);
        String subjectName = ((Button)v).getText().toString();

        String te4  = "TE4",
               ce4  = "CE4",
               mae4 = "MAE4",
               me4  = "ME4",
               mt4  = "MT4",
               ice4 = "ICE4",
               eee4 = "EEE4",
               pe4  = "PE4",
               ene4 = "ENE4";
        final String seminar = "Seminar";

        switch (stream){
            case "IT":
                switch (v.getId()){
                    case R.id.am_iv: setAM_IV();
                        break;
                    case R.id.amLab: setAMLab();
                        break;

                    case R.id.dbms: setDBMS();
                        break;
                    case R.id.dbmsLab: setDBMSLab();
                        break;

                    case R.id.coa: setCOA();
                        break;
                    case R.id.coaLab: setCOALab();
                        break;

                    case R.id.oops: setOOPS();
                        break;
                    case R.id.oopsLab:  setOOPSLab();
                        break;

                    case R.id.toc: putExtraCustom(intent, "TOC", "4", Urls.tocBook);
                        break;

                    case R.id.control: setControlSystems();
                        break;
                    case R.id.csLab: setControlSystemsLab();
                        break;
                }
                break;

            case "CSE":
                switch (v.getId()){
                    case R.id.am_iv: setAM_IV();
                        break;
                    case R.id.amLab: setAMLab();
                        break;

                    case R.id.dbms: setDBMS();
                        break;
                    case R.id.dbmsLab: setDBMSLab();
                        break;

                    case R.id.coa: setCOA();
                        break;
                    case R.id.coaLab: setLinuxLab();
                        break;

                    case R.id.oops: setOOPS();
                        break;
                    case R.id.oopsLab: setOOPSLab();
                        break;

                    case R.id.toc: putExtraCustom(intent, "TOC", "4", Urls.tocBook);
                        break;

                    case R.id.control: setCommSystems();
                        break;
                    case R.id.csLab: setCommSystemsLab();
                        break;
                }
                break;

            case "CE":
                String hydro = "Hydraulics";
                switch (v.getId()){
                    case R.id.am_iv: putExtraCustom(intent, "Concrete", "");
                        break;
                    case R.id.amLab: putExtraCustom(intent, "CementLab", "");
                        break;

                    case R.id.dbms: putExtraCustom(intent, "SA", "");
                        break;
                    case R.id.dbmsLab: putExtraCustom(intent, "SALab", "");
                        break;

                    case R.id.coa: putExtraCustom(intent, hydro, "");
                        break;
                    case R.id.coaLab: putExtraCustom(intent, hydro+"Lab", "");
                        break;

                    case R.id.oops: putExtraCustom(intent, "Survey-II", "");
                        break;
                    case R.id.oopsLab: putExtraCustom(intent, "SurveyLab-II", "");
                        break;

                    case R.id.toc: putExtraCustom(intent, "Water", "");
                        break;

                    case R.id.control: putExtraCustom(intent, "Soil", "");
                        break;

                    case R.id.csLab: putExtraCustom(intent, seminar, "");
                        break;
                }
                intent.putExtra("Sem", ce4);
                break;

            case "ECE":
                switch (subjectName){
                    case AMIV: setAM_IV();
                        break;
                    case AMLab: setAMLab();
                        break;

                    case comm + mandatory: setCommSystems();
                        break;
                    case comm + lab: setCommSystemsLab();
                        break;

                    case coaSubject: setCOA();
                        break;
                    case "Linux Programming & Administration Lab": setLinuxLab();
                        break;

                    case nas+mandatory:
                        intent.putExtra("Subject", "NAS").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                    case nas+lab:
                        intent.putExtra("Subject", "NASLab").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case ae_ii:
                        intent.putExtra("Subject", "AE-II").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                    case ae_ii+lab:
                        intent.putExtra("Subject", "AELab-II").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;

                    case emft:
                        intent.putExtra("Subject", "EMFT").putExtra("Sem", "4")
                                .putExtra("Book", "");
                        break;
                }
                break;

            case "EEE":
            case "EE":
                switch (subjectName){
//                    Common
                    case em+"-II"+mandatory:
                        intent.putExtra("Subject", "EM-II").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                    case em+"-II"+lab:
                        intent.putExtra("Subject", "EM-II").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

                    case ps+mandatory:
                        intent.putExtra("Subject", "PS-I").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                    case ps+lab:
                    case ps+lab+mandatory:
                        intent.putExtra("Subject", "PSLab-I").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

                    case cs+mandatory:
                        setControlSystems();
                        break;
                    case cs+lab:
                        setControlSystemsLab();
                        break;

                    case emft:
                        intent.putExtra("Subject", "EMFT").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

//                    EEE
                    case ae_ii+mandatory:
                        intent.putExtra("Subject", "AE-II").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                    case ae_ii+lab:
                        intent.putExtra("Subject", "AELab-II").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

                    case eemi:
                        intent.putExtra("Subject", "EEMI").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                    case eemi+lab:
                        intent.putExtra("Subject", "EEMILab").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

//                    EE
                    case emit+mandatory:
                        intent.putExtra("Subject", "EMIT").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                    case emit+lab:
                        intent.putExtra("Subject", "EMITLab").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;

                    case "Thermodynamics":
                        intent.putExtra("Subject", "Thermo").putExtra("Sem", eee4)
                                .putExtra("Book", "");
                        break;
                }
                break;

            case "PE":
                switch (subjectName){
                    case "Power Generation Engineering (M)":
                        intent.putExtra("Subject", "PGE").putExtra("Sem", pe4)
                                .putExtra("Book", "");
                        break;

                    case "Energy Conversion (M)":
                        intent.putExtra("Subject", "EC").putExtra("Sem", pe4)
                                .putExtra("Book", "");
                        break;

                    case cs+mandatory:
                        setControlSystems();
                        break;
                    case cs+lab:
                        setControlSystemsLab();
                        break;

                    case hmt:
                        putExtraCustom(intent, "HMTE", pe4, "");
                        break;
                    case hmt+" Lab":
                        putExtraCustom(intent, "HMTLab", pe4, "");
                        break;

                    case "Fluid":
                        putExtraCustom(intent, "Fluid", me4, Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Lab":
                        putExtraCustom(intent, "FluidLab", me4, Urls.fluidMechanicsBook);
                        break;

                    case stldSubject:
                        putExtraCustom(intent, "STLD", pe4, Urls.stldBook);
                        break;
                    case stldSubject + lab:
                        putExtraCustom(intent, "STLDLab", pe4, Urls.stldBook);
                        break;
                }
                break;

            case "MAE":
                switch (subjectName) {
                    case stldSubject + mandatory:
                        intent.putExtra("Subject", "STLD").putExtra("Sem", pe4)
                                .putExtra("Book", Urls.stldBook);
                        break;
                    case stldSubject + lab:
                    case stldSubject + lab + mandatory:
                        intent.putExtra("Subject", "STLDLab").putExtra("Sem", pe4)
                                .putExtra("Book", Urls.stldBook);
                        break;

                    case nast:
                        intent.putExtra("Subject", "NASTLab").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.amBook);
                        break;
                    case nast + lab:
                        intent.putExtra("Subject", "NASTLab").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.amBook);
                        break;

                    case fs:
                        intent.putExtra("Subject", "FS").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;
                    case fs+lab:
                        intent.putExtra("Subject", "FSLab").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.fluidSystemsBook);
                        break;

                    case tom+mandatory:
                        intent.putExtra("Subject", "ToM").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;
                    case tom+lab:
                        intent.putExtra("Subject", "ToMLab").putExtra("Sem", mae4)
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;

                    case mm+mandatory:
                        intent.putExtra("Subject", "MM").putExtra("Sem", me4)
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;
                    case mm+lab:
                        intent.putExtra("Subject", "MLab").putExtra("Sem", me4)
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;

                    case mni:
                    case mni + mandatory:
                        intent.putExtra("Subject", "MnI").putExtra("Sem", me4)
                                .putExtra("Book", Urls.mniBook);
                        break;
                }
                break;

            case "ME":
                switch (subjectName){
                    case mm+mandatory:
                        intent.putExtra("Subject", "MM").putExtra("Sem", me4)
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;
                    case mm+lab:
                        intent.putExtra("Subject", "MMLab").putExtra("Sem", me4)
                                .putExtra("Book", Urls.manufacturingMachinesBook);
                        break;

                    case mni:
                        intent.putExtra("Subject", "MnI").putExtra("Sem", me4)
                                .putExtra("Book", Urls.mniBook);
                        break;

                    case "Fluid":
                        intent.putExtra("Subject", "Fluid").putExtra("Sem", me4)
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;
                    case "Fluid Lab":
                        intent.putExtra("Subject", "FluidLab").putExtra("Sem", me4)
                                .putExtra("Book", Urls.fluidMechanicsBook);
                        break;

                    case icegt:
                        intent.putExtra("Subject", "ICGT").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;
                    case icegt+lab:
                        intent.putExtra("Subject", "ICGTLab").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;

                    case kom+mandatory:
                        intent.putExtra("Subject", "KoM").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;
                    case kom+lab:
                        intent.putExtra("Subject", "KoMLab").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;

                    case som_ii+"-II"+mandatory:
                        intent.putExtra("Subject", "SoM-II").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;
                    case som_ii+lab+"-II":
                        intent.putExtra("Subject", "SoMLab-II").putExtra("Sem", me4)
                                .putExtra("Book", "");
                        break;

                }
                break;

            case "MT":
                switch (subjectName){
                    case cs+mandatory: setControlSystems();
                        break;
                    case cs+lab: setControlSystemsLab();
                        break;

                    case kdm+mandatory:
                        intent.putExtra("Subject", "KDM").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.kinematicsBook);
                        break;
                    case kdm+lab:
                        intent.putExtra("Subject", "KDMLab").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.kinematicsBook);
                        break;

                    case hnp + mandatory:
                        intent.putExtra("Subject", "HnP").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.hydraulicsNPneumaticsBook);
                        break;
                    case hnp + lab:
                        intent.putExtra("Subject", "HnPLab").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.hydraulicsNPneumaticsBook);
                        break;

                    case sns+mandatory:
                        intent.putExtra("Subject", "SnS-MT").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.snsBook);
                        break;
                    case sns+lab:
                        intent.putExtra("Subject", "SnS-MT").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.snsBook);
                        break;

                    case "Organizational Behaviour":
                        intent.putExtra("Subject", "OB").putExtra("Sem", mt4)
                                .putExtra("Book", "");
                        break;

                    case ts:
                        intent.putExtra("Subject", "TS-TE").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.thermalScienceBook);
                        break;
                }
                break;

            case "TE":
                switch (subjectName){
                    case tom+mandatory:
                        intent.putExtra("Subject", "ToM").putExtra("Sem", te4)
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;
                    case tom+lab:
                        intent.putExtra("Subject", "ToMLab").putExtra("Sem", te4)
                                .putExtra("Book", Urls.theoryOfMachinesBook);
                        break;

                    case "Metal Forming (M)":
                        intent.putExtra("Subject", "MF").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;

                    case med:
                        intent.putExtra("Subject", "MED").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;
                    case med+lab:
                        intent.putExtra("Subject", "MEDLab").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;

                    case mt+mandatory:
                        intent.putExtra("Subject", "MT").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;
                    case mt+lab:
                        intent.putExtra("Subject", "MTLab").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;

                    case mqa+mandatory:
                        intent.putExtra("Subject", "MQA").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;
                    case mqa+lab:
                        intent.putExtra("Subject", "MQALab").putExtra("Sem", te4)
                                .putExtra("Book", "");
                        break;

                    case ts:
                        intent.putExtra("Subject", "TS-TE").putExtra("Sem", mt4)
                                .putExtra("Book", Urls.thermalScienceBook);
                        break;
                }
                break;

            case "ENE":
                switch (subjectName){
                    case "Physico-Chemical Treatment Processes (M)":
                        intent.putExtra("Subject", "PCTP")
                                .putExtra("Book", "");
                        break;

                    case pollution+mandatory:
                        intent.putExtra("Subject", "ANP")
                                .putExtra("Book", "");
                        break;
                    case pollution+" Monitoring & Design Lab":
                        intent.putExtra("Subject", "ANPLab")
                                .putExtra("Book", "");
                        break;

                    case eh+mandatory:
                        intent.putExtra("Subject", "EH")
                                .putExtra("Book", "");
                        break;
                    case eh+lab:
                        intent.putExtra("Subject", "EHLab")
                                .putExtra("Book", "");
                        break;

                    case "Structural Engineering":
                        intent.putExtra("Subject", "SE-ENE")
                                .putExtra("Book", "");
                        break;
                    case "Structure Lab":
                        intent.putExtra("Subject", "SE-ENE")
                                .putExtra("Book", "");
                        break;

                    case "Introduction to Environmental Legislations" + mandatory:
                        intent.putExtra("Subject", "IEL")
                                .putExtra("Book", "");
                        break;

                    case "Geotechnical Engineering":
                        intent.putExtra("Subject", "GE")
                                .putExtra("Book", "");
                        break;

                    case seminar+nues:
                        intent.putExtra("Subject", seminar)
                                .putExtra("Book", "NA");
                        break;

                    case "Water Engineering Design & Drawing Lab":
                        intent.putExtra("Subject", "WEDLab")
                                .putExtra("Book", "");
                        break;
                }
                intent.putExtra("Sem", ene4);
                break;

            case "ICE":
                switch (subjectName){
                    case cs+mandatory: setControlSystems();
                        break;
                    case cs+lab: setControlSystemsLab();
                        break;

                    case powerElec: putExtraCustom(intent, "PE", ice4, "");
                        break;
                    case powerElec+lab: putExtraCustom(intent, "PELab", ice4, "");
                        break;

                    case taic+mandatory: putExtraCustom(intent, "TAIC", ice4, "");
                        break;
                    case taic+lab: putExtraCustom(intent, "TAICLab", ice4, "");
                        break;

                    case em: putExtraCustom(intent, "EM-ICE", ice4, Urls.electricalMachineBook);
                        break;
                    case em+lab: putExtraCustom(intent, "EMLab-ICE", ice4, Urls.electricalMachineBook);
                        break;

                    case mni+mandatory: putExtraCustom(intent, "MnI-ICE", ice4, Urls.mniBook);
                        break;
                    case mni+lab: putExtraCustom(intent, "MnILab-ICE", ice4, Urls.mniBook);
                        break;

                    case comm: putExtraCustom(intent, "Comm-ICE", ice4, "");
                        break;
                }
                break;
        }

        try {
            intent.putExtra("SubjectName", subjectName);
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