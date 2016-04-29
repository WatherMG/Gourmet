package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Алексей on 17.04.2015.
 */
public class IngredientVM implements Parcelable {
    private long id;
    private float quantity;
    private MeasurementVM measurement;
    private ProductVM product;
    private CategoryVM category;
    private RecipeVM recipe;

    public IngredientVM() {
    }

    public IngredientVM(long id, RecipeVM recipe, ProductVM product, MeasurementVM measurement, float quantity) {
        this.id = id;
        this.recipe = recipe;
        this.product = product;
        this.measurement = measurement;
        this.quantity = quantity;
    }

    public IngredientVM(long id, ProductVM product, CategoryVM category) {
        this.id = id;
        this.product = product;
        this.category = category;
    }

    public IngredientVM(long id, float quantity, MeasurementVM measurement, ProductVM product, CategoryVM category, RecipeVM recipe) {
        this.id = id;
        this.quantity = quantity;
        this.measurement = measurement;
        this.product = product;
        this.category = category;
        this.recipe = recipe;
    }

    public IngredientVM(Parcel in) {
        this.id = in.readLong();
        this.recipe = in.readParcelable(RecipeVM.class.getClassLoader());
        this.category = in.readParcelable(CategoryVM.class.getClassLoader());
        this.product = in.readParcelable(ProductVM.class.getClassLoader());
        this.measurement = in.readParcelable(MeasurementVM.class.getClassLoader());
        this.quantity = in.readFloat();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeParcelable(this.recipe, flags);
        dest.writeParcelable(this.category, flags);
        dest.writeParcelable(this.product, flags);
        dest.writeParcelable(this.measurement, flags);
        dest.writeFloat(this.quantity);
    }

    public static final Parcelable.Creator<IngredientVM> CREATOR = new Parcelable.Creator<IngredientVM>() {
        @Override
        public IngredientVM createFromParcel(Parcel source) {
            return new IngredientVM(source);
        }

        @Override
        public IngredientVM[] newArray(int size) {
            return new IngredientVM[size];
        }
    };
}
