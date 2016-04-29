package com.braincraftapps.gourmet.model;

/**
 * Created by Алексей on 16.04.2015.
 */
public class Ingredient {
    private long id;
    private float quantity;
    private long measurementId;
    private long productId;
    private long categoryId;
    private long recipeId;

    public Ingredient() {
    }

    public Ingredient(long id, long recipeId, long productId, long measurementId, float quantity) {
        this.id = id;
        this.recipeId = recipeId;
        this.productId = productId;
        this.measurementId = measurementId;
        this.quantity = quantity;
    }

    public Ingredient(long id, long productId, long categoryId) {
        this.id = id;
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public Ingredient(long id, long recipeId, long categoryId, long productId, long measurementId, float quantity) {
        this.id = id;
        this.recipeId = recipeId;
        this.categoryId = categoryId;
        this.productId = productId;
        this.measurementId = measurementId;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public long getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(long measurementId) {
        this.measurementId = measurementId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return this.quantity + " measurementId " + this.measurementId + " productId " + this.productId;
    }
}
