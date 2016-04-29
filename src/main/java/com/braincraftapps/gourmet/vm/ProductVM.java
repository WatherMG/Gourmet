package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Алексей on 17.04.2015.
 */
public class ProductVM implements Parcelable {
    private long id;
    private String name;
    private float fats;
    private float protein;
    private float carbohydrate;
    private float totalCalories;

    public ProductVM() {
    }

    public ProductVM(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductVM(long id, String name, float fats, float protein, float carbohydrate, float totalCalories) {
        this.id = id;
        this.name = name;
        this.fats = fats;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.totalCalories = totalCalories;
    }

    public ProductVM(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        this.fats = in.readFloat();
        this.protein = in.readFloat();
        this.carbohydrate = in.readFloat();
        this.totalCalories = in.readFloat();
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

    public float getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public float getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(float totalCalories) {
        this.totalCalories = totalCalories;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeFloat(this.fats);
        dest.writeFloat(this.protein);
        dest.writeFloat(this.carbohydrate);
        dest.writeFloat(this.totalCalories);
    }

    public static final Parcelable.Creator<ProductVM> CREATOR = new Parcelable.Creator<ProductVM>() {
        @Override
        public ProductVM createFromParcel(Parcel source) {
            return new ProductVM(source);
        }

        @Override
        public ProductVM[] newArray(int size) {
            return new ProductVM[size];
        }
    };
}
