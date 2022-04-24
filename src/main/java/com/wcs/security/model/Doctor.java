package com.wcs.security.model;

public class Doctor {

    private final int id;
    private final String name;
    private final String poster;
    private final String wikipediaLink;

    public Doctor(int id, String name, String poster, String wikipediaLink) {
        this.id = id;
        this.name = name;
        this.poster = poster;
        this.wikipediaLink = wikipediaLink;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPoster() {
        return poster;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }
}
