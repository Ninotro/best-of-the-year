package com.experis.course.bestoftheyear.model;

public class Movie {
    private static int lastID = 0;
    private int id;
    private String title;

    public Movie(String title) {
        this.id = ++lastID;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }
}
