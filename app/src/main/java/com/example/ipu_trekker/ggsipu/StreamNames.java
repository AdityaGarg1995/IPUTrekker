package com.example.ipu_trekker.ggsipu;

import android.content.Intent;

import com.example.ipu_trekker.ggsipu.Streams.SubjectQuadruplet;

public class StreamNames {

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

//   Subjects
    public static final String sociology = "Sociology & Elements of Indian History for Engineers",
                               dbms      = "Database Management Systems",
                               hvpe_ii = "Human Values & Professional Ethics-II";

    public static final void hvpeII(Intent intent){
        intent.putExtra("Subject","HVPE-II").putExtra("Sem", "8")
                .putExtra("Book", Urls.hvpe_iiBook);
    }

    public static SubjectQuadruplet setHVPEII(){
        return new SubjectQuadruplet("HVPE-II", "8", StreamNames.hvpe_ii, Urls.hvpe_iiBook);
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