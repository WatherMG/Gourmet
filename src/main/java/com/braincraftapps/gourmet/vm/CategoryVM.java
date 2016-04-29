package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoryVM implements Parcelable {

    private long id;
    private String name;
    private String image;
    private String recipesCount;

    public CategoryVM() {
    }

    public CategoryVM(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryVM(long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public CategoryVM(long id, String name, String image, String recipesCount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.recipesCount = recipesCount;
    }

    public CategoryVM(Parcel in) {
        id = in.readInt();
        name = in.readString();
        image = in.readString();
        recipesCount = in.readString();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRecipesCount() {
        return recipesCount;
    }

    public void setRecipesCount(String recipesCount) {
        this.recipesCount = recipesCount;
    }

    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(name);
        dest.writeString(image);
    }

    public static final Parcelable.Creator<CategoryVM> CREATOR = new Parcelable.Creator<CategoryVM>() {
        @Override
        public CategoryVM createFromParcel(Parcel source) {
            return new CategoryVM(source);
        }

        @Override
        public CategoryVM[] newArray(int size) {
            return new CategoryVM[size];
        }
    };
}
