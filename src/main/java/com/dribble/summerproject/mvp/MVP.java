package com.dribble.summerproject.mvp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MVP {
    @Id
    private int date;
    private String name;
    private String imageURL;

    public MVP() {
        // default constructor
    }

    public MVP(int date, String name, String imageURL) {
        this.date = date;
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
}
