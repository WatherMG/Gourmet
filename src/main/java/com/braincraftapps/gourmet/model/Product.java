package com.braincraftapps.gourmet.model;

/**
 * Created by Алексей on 16.04.2015.
 */
public class Product {
    private long id;
    private String name;
    private float fats;
    private float protein;
    private float carbohydrate;
    private float totalCalories;

    public Product() {
    }

    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(long id, String name, float fats, float protein, float carbohydrate, float totalCalories) {
        this.id = id;
        this.name = name;
        this.fats = fats;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.totalCalories = totalCalories;
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

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(float totalCalories) {
        this.totalCalories = totalCalories;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
