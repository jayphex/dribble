package com.dribble.summerproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MVP {
    @Id
    private int mwaka;
    private String name;
    private String imageURL;

    public MVP() {
        // default constructor
    }

    public MVP(int mwaka, String name, String imageURL) {
        this.mwaka = mwaka;
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getName() {
        return name;
    }
}
