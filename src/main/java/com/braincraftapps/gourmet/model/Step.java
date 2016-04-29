package com.braincraftapps.gourmet.model;

public class Step {
    private long id;
    private long recipeId;
    private int number;
    private String description;
    private String image;
    private boolean isRowWithImage = false;

    public Step(long id, long recipeId, int number, String description) {
        this.id = id;
        this.recipeId = recipeId;
        this.number = number;
        this.description = description;
    }

    public Step(long id, long recipeId, String image, boolean isRowWithImage) {
        this.id = id;
        this.recipeId = recipeId;
        this.image = image;
        this.isRowWithImage = isRowWithImage;
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

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isRowWithImage() {
        return isRowWithImage;
    }

    public void setIsRowWithImage(boolean isRowWithImage) {
        this.isRowWithImage = isRowWithImage;
    }
}
