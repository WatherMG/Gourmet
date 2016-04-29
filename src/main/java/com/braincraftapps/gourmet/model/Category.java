package com.braincraftapps.gourmet.model;


public class Category {
    private long id;
    private String name;
    private String image;
    private String recipesCount;

    public Category() {
    }

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(long id, String name, String image, String recipesCount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.recipesCount = recipesCount;
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

    public String getRecipesCount() {
        return recipesCount;
    }

    public void setRecipesCount(String recipesCount) {
        this.recipesCount = recipesCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
