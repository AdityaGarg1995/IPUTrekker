package com.example.ankushsingh.ggsipu;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Aditya Garg on 06-10-2016.
 */

public class CollegeListItem {
    Drawable logo;
    String name;

    public CollegeListItem(Drawable logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public Drawable getLogo() {
        return logo;
    }

    public void setLogo(Drawable logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
