package com.example.ipu_trekker.ggsipu;

import android.content.Intent;

import com.example.ipu_trekker.ggsipu.Streams.SubjectWiseSyllabus.SubjectQuadruplet;

public class ImportantStrings {

    public static final String cse = "Computer Science Engineering",
                               ece = "Electronics and Communication",
                               it  = "Information Technology",
                               eee = "Electronics and Electrical",
                               ee  = "Electrical Engineering",
                               me  = "Mechanical Engineering",
                               mae = "Mechanical and Automation",
                               ice = "Instrumentation and Control",
                               ene = "Environmental Engineering",
                               mt  = "Mechatronics",
                               te  = "Tool Engineering",
                               ce  = "Civil Engineering",
                               pe  = "Power Engineering";


    public static String task1 = "GGSIPU: Official Website",
                         task2 = "Individual Result";


    public static String sem1sub = "1st Semester Subjects",
                         sem2sub = "2nd Semester Subjects",
                         sem3sub = "3rd Semester Subjects",
                         sem4sub = "4th Semester Subjects",
                         sem5sub = "5th Semester Subjects",
                         sem6sub = "6th Semester Subjects",
                         sem7sub = "7th Semester Subjects",
                         sem8sub = "8th Semester Subjects";

//    Mandatory
    public final static String mandatory = " (M)";
//    NUES
    public final static String nues = " (NUES)";
//    Lab
    public final static String lab = " Lab";


    //   Subjects
    public static final String sociologySubject = "Sociology & Elements of Indian History for Engineers",
                               dbmsSubject      = "Database Management Systems",
                               hvpe_iiSubject   = "Human Values & Professional Ethics-II" + nues,
                               amSubject        = "Applied Mathematics",
                               stldSubject      = "Switching Theory & Logic Design",
                               microprocessorsSubject = "Microprocessors & Microcontrollers";

    public static void hvpeII(Intent intent){
        intent.putExtra("Subject","HVPE-II").putExtra("Sem", "8").putExtra("Book", Urls.hvpe_iiBook);
    }
    public static SubjectQuadruplet setHVPEII(){
        return new SubjectQuadruplet("HVPE-II", "8", ImportantStrings.hvpe_iiSubject, Urls.hvpe_iiBook);
    }

    public static void sociologyEngg(Intent intent){
        intent.putExtra("Subject", "Sociology").putExtra("Sem", "7").putExtra("Book", Urls.sociologyBook);
    }
    public static SubjectQuadruplet setSociology(){
        return new SubjectQuadruplet("Sociology", "7", ImportantStrings.sociologySubject, Urls.sociologyBook);
    }


    public static SubjectQuadruplet setMIS(){
        return new SubjectQuadruplet("MIS", "MAE7", "Management Information System & ERP", "");
    }

    public static SubjectQuadruplet setRER(){
        return new SubjectQuadruplet("RER", "PE7", "Renewable Energy Resources", "");
    }

    public static SubjectQuadruplet setAdhoc(){
        return new SubjectQuadruplet("AdHoc", "8", "Ad Hoc & Sensor Networks", Urls.adHocBook);
    }

    public static SubjectQuadruplet setSoftComputing(){
        return new SubjectQuadruplet("Soft", "8", "Soft Computing", Urls.softComputingBook);
    }

//    As DBMS available in many semesters
    public static void dbmsIntentExtra(Intent intent, String sem){
        intent.putExtra("Subject", "DBMS").putExtra("Sem", sem).putExtra("Book", Urls.dbmsBook);
    }


    public static void putExtraCustom(Intent intent, String subject, String sem, String book){
        intent.putExtra("Subject", subject).putExtra("Sem", sem).putExtra("Book", book);
    }

    public static void putExtraCustom(Intent intent, String subject, String book){
        intent.putExtra("Subject", subject).putExtra("Book", book);
    }

    public static void putExtraSubjectQuadruplet(Intent intent, SubjectQuadruplet mSubjectQuadruplet){
        putExtraCustom(intent, mSubjectQuadruplet.getSubject(), mSubjectQuadruplet.getSem(), mSubjectQuadruplet.getBook());
    }
    public static void putExtraSubjectQuadruplet2(Intent intent, SubjectQuadruplet mSubjectQuadruplet){
        putExtraCustom(intent, mSubjectQuadruplet.getSubject(), mSubjectQuadruplet.getBook());
    }


//.................................//
//    3377  IT7, MAE7, TE7         -
//    3367  CSE7                   -
//    3397  ECE7                   -
//    3376  EE7                    -

//    3277  EEE7                   -
//    3245  CE7                    -
//    3235  ENE7                   -
//    3285  ICE7                   -
//    3288  ME7                    -
//    3179  MT7                    -

//    4467  PE7                    -

//.................................//
//    3287  IT8                    -
//    3298  CSE8                   -
//    3277  EE8                    -
//    3233  ENE8                   -
//    3266  ICE8 MAE8              -
//    3265  ME8                    -
//    3276  PE8 MT8                -

//    3155  ECE8                   -
//    3134  CE8                    -
//    3177  EEE8                   -

//    3065  TE8                    -
}