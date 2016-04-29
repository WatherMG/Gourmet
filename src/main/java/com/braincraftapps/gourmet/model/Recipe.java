package com.braincraftapps.gourmet.model;

/**
 * Created by Алексей on 16.04.2015.
 */
public class Recipe {
    private long id;
    private long categoryId;
    private String name;
    private String image;
    private String shortDescription;
    private String fullDescription;
    private int time;
    private float fats;
    private float protein;
    private float carbohydrates;
    private float totalCalories;
    private int totalImages;
    private float rating;
    private int servesCount;

    public Recipe() {
    }

    public Recipe(long id, long categoryId, String name, String image, String shortDescription, int time, float totalCalories, float rating) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
        this.shortDescription = shortDescription;
        this.time = time;
        this.totalCalories = totalCalories;
        this.rating = rating;
    }

    public Recipe(long id, long categoryId, String name, String image, String fullDescription, int time, float fats, float protein, float carbohydrates, float totalCalories, int totalImages, float rating, int servesCount) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
        this.fullDescription = fullDescription;
        this.time = time;
        this.fats = fats;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.totalCalories = totalCalories;
        this.totalImages = totalImages;
        this.rating = rating;
        this.servesCount = servesCount;
    }

    public Recipe(long id, long categoryId, String name, String image, String shortDescription, String fullDescription, int time, float fats, float protein, float carbohydrates, float totalCalories, int totalImages, float rating, int servesCount) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.time = time;
        this.fats = fats;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.totalCalories = totalCalories;
        this.totalImages = totalImages;
        this.rating = rating;
        this.servesCount = servesCount;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(float fats) {
        this.fats = fats;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(float totalCalories) {
        this.totalCalories = totalCalories;
    }

    public long getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(int totalImages) {
        this.totalImages = totalImages;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getServesCount() {
        return servesCount;
    }

    public void setServesCount(int servesCount) {
        this.servesCount = servesCount;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /*@Override
    public String toString() {

    }*/
}
