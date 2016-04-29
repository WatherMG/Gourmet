package com.braincraftapps.gourmet.model;

public class Image {
    private long id;
    private long recipeId;
    private long categoryId;
    private long stepId;
    private String URL;
    private String description;
    private boolean isCategory = false;

    public Image() {
    }

    public Image(long id, long recipeId, String URL, String description) {
        this.id = id;
        this.recipeId = recipeId;
        this.URL = URL;
        this.description = description;
    }

    public Image(long id, long categoryId, String URL) {
        this.id = id;
        this.categoryId = categoryId;
        this.URL = URL;
    }

    public Image(long id, long stepId, String URL, String description, long recipeId) {
        this.id = id;
        this.stepId = stepId;
        this.URL = URL;
        this.description = description;
        this.recipeId = recipeId;
    }

    public Image(long id, long recipeId, long categoryId, long stepId, String URL, String description) {
        this.id = id;
        this.recipeId = recipeId;
        this.categoryId = categoryId;
        this.stepId = stepId;
        this.URL = URL;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getStepId() {
        return stepId;
    }

    public void setStepId(long stepId) {
        this.stepId = stepId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
