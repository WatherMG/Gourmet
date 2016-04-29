package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Алексей on 17.04.2015.
 */
public class ImageVM implements Parcelable{
    private long id;
    private RecipeVM recipe;
    private CategoryVM category;
    private StepVM step;
    private String URL;
    private String description;

    public ImageVM() {
    }

    public ImageVM(long id, RecipeVM recipe, String URL, String description) {
        this.id = id;
        this.recipe = recipe;
        this.URL = URL;
        this.description = description;
    }

    public ImageVM(long id, CategoryVM category, String URL) {
        this.id = id;
        this.category = category;
        this.URL = URL;
    }

    public ImageVM(long id, StepVM step, String URL, String description, RecipeVM recipe) {
        this.id = id;
        this.step = step;
        this.URL = URL;
        this.description = description;
        this.recipe = recipe;
    }

    public ImageVM(long id, RecipeVM recipe, CategoryVM category, StepVM step, String URL, String description) {
        this.id = id;
        this.recipe = recipe;
        this.category = category;
        this.step = step;
        this.URL = URL;
        this.description = description;
    }

    public ImageVM(Parcel in) {
        this.id = in.readLong();
        this.recipe = in.readParcelable(RecipeVM.class.getClassLoader());
        this.category = in.readParcelable(CategoryVM.class.getClassLoader());
        this.step = in.readParcelable(StepVM.class.getClassLoader());
        this.URL = in.readString();
        this.description = in.readString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RecipeVM getRecipe() {
        return recipe;
    }

    public void setRecipe(RecipeVM recipe) {
        this.recipe = recipe;
    }

    public CategoryVM getCategoryId() {
        return category;
    }

    public void setCategoryId(CategoryVM categoryId) {
        this.category = categoryId;
    }

    public StepVM getStepId() {
        return step;
    }

    public void setStepId(StepVM stepId) {
        this.step = stepId;
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return this.URL;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeLong(this.id);
        dest.writeParcelable(this.recipe, flags);
        dest.writeParcelable(this.category, flags);
        dest.writeParcelable(this.step, flags);
        dest.writeString(this.URL);
        dest.writeString(this.description);

    }

    public static final Parcelable.Creator<ImageVM> CREATOR = new Creator<ImageVM>() {
        @Override
        public ImageVM createFromParcel(Parcel source) {
            return new ImageVM(source);
        }

        @Override
        public ImageVM[] newArray(int size) {
            return new ImageVM[size];
        }
    };
}
