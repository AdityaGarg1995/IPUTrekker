package com.example.ankushsingh.ggsipu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ankushsingh.ggsipu.Colleges.amity;

import java.util.ArrayList;

/**
 * Created by Aditya Garg on 01-10-2016.
 */

public class CollegeAdapter extends ArrayAdapter<CollegeListItem> {

    public CollegeAdapter(Context context, ArrayList<CollegeListItem> list) {
        super(context, 0, list);
    }



}
