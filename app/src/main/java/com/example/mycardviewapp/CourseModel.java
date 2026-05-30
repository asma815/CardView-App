package com.example.mycardviewapp;

public class CourseModel {
    private String title;
    private String description;
    private String rating;
    private int imageRes;

    public CourseModel(String title, String description, String rating, int imageRes) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.imageRes = imageRes;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getRating() { return rating; }
    public int getImageRes() { return imageRes; }
}