package com.braincraftapps.gourmet.model;

/**
 * Created by Алексей on 16.04.2015.
 */
public class UserRatedRecipe {
    private long id;
    private long userId;
    private long recipeId;
    private float rating;

    public UserRatedRecipe() {
    }

    public UserRatedRecipe(long id, long userId, long recipeId, float rating) {
        this.id = id;
        this.userId = userId;
        this.recipeId = recipeId;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
