package com.asturchio.bucketlist;

import androidx.annotation.DrawableRes;

public class Place {

    String name;
    String description;
    int image;

    public Place(String name, String description, @DrawableRes int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
