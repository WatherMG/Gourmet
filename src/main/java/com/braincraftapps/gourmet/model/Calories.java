package com.braincraftapps.gourmet.model;

import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2015.
 */
public class Calories extends ArrayList<Calories> {
    private double totalCalories;
    private double fats;
    private double proteins;
    private double carbonates;

    public Calories(double totalCalories, double fats, double proteins, double carbonates) {
        this.totalCalories = totalCalories;
        this.fats = fats;
        this.proteins = proteins;
        this.carbonates = carbonates;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getCarbonates() {
        return carbonates;
    }

    public void setCarbonates(double carbonates) {
        this.carbonates = carbonates;
    }
}
