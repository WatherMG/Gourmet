package com.braincraftapps.gourmet.model;

import java.util.ArrayList;

/**
 * Created by Alex Sysoiev on 15.03.2015.
 */
public class Recipes extends ArrayList<Recipes> {
    private String title;
    private int image;
    private int time;
    private String category;
    private String shortDescription;
    private float calories;
    private float rating;

    public Recipes() {
    }

    public Recipes(String title, int image, int time, String category, float calories, float rating) {
        this.title = title;
        this.image = image;
        this.time = time;
        this.category = category;
        this.calories = calories;
        this.rating = rating;
    }

    public Recipes(String title, int image, int time, String category, String shortDescription, float calories, float rating) {
        this.title = title;
        this.image = image;
        this.time = time;
        this.category = category;
        this.shortDescription = shortDescription;
        this.calories = calories;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
