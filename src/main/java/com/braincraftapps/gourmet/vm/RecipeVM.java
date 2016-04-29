package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Алексей on 17.04.2015.
 */
public class RecipeVM implements Parcelable {
    private long id;
    private CategoryVM category;
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

    public RecipeVM() {
    }

    public RecipeVM(long id, CategoryVM category, String name, String image, String shortDescription, int time, float totalCalories, float rating) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.image = image;
        this.shortDescription = shortDescription;
        this.time = time;
        this.totalCalories = totalCalories;
        this.rating = rating;
    }

    public RecipeVM(long id, CategoryVM category, String name, String image, String fullDescription, int time, float fats, float protein, float carbohydrates, float totalCalories, int totalImages, float rating, int servesCount) {
        this.id = id;
        this.category = category;
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

    public RecipeVM(Parcel in) {
        this.id = in.readLong();
        this.category = in.readParcelable(CategoryVM.class.getClassLoader());
        this.name = in.readString();
        this.image = in.readString();
        this.shortDescription = in.readString();
        this.fullDescription = in.readString();
        this.time = in.readInt();
        this.fats = in.readFloat();
        this.protein = in.readFloat();
        this.carbohydrates = in.readFloat();
        this.totalCalories = in.readFloat();
        this.totalImages = in.readInt();
        this.rating = in.readFloat();
        this.servesCount = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeParcelable(this.category, flags);
        dest.writeString(this.name);
        dest.writeString(this.image);
        dest.writeString(this.shortDescription);
        dest.writeString(this.fullDescription);
        dest.writeInt(this.time);
        dest.writeFloat(this.fats);
        dest.writeFloat(this.protein);
        dest.writeFloat(this.carbohydrates);
        dest.writeFloat(this.totalCalories);
        dest.writeInt(this.totalImages);
        dest.writeFloat(this.rating);
        dest.writeInt(this.servesCount);
    }

    public static final Parcelable.Creator<RecipeVM> CREATOR = new Creator<RecipeVM>() {
        @Override
        public RecipeVM createFromParcel(Parcel source) {
            return new RecipeVM(source);
        }

        @Override
        public RecipeVM[] newArray(int size) {
            return new RecipeVM[size];
        }
    };


    @Override
    public String toString() {
        return this.name + " " + this.category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CategoryVM getCategory() {
        return category;
    }

    public void setCategory(CategoryVM category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public float getFats() {
        return fats;
    }

    public void setFats(float fats) {
        this.fats = fats;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getTotalCalories() {
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
}
