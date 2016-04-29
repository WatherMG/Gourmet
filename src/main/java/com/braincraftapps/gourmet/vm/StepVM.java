package com.braincraftapps.gourmet.vm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Алексей on 17.04.2015.
 */
public class StepVM implements Parcelable {
    private long id;
    private RecipeVM recipe;
    private int number;
    private String description;

    public StepVM() {
    }

    public StepVM(long id, RecipeVM recipe, int number, String description) {
        this.id = id;
        this.recipe = recipe;
        this.number = number;
        this.description = description;
    }

    public StepVM(Parcel in) {
        this.id = in.readLong();
        this.recipe = in.readParcelable(RecipeVM.class.getClassLoader());
        this.number = in.readInt();
        this.description = in.readString();
    }

    @Override
    public String toString() {
        return this.number + " " + this.description;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeParcelable(this.recipe, flags);
        dest.writeInt(this.number);
        dest.writeString(this.description);

    }

    public static final Parcelable.Creator<StepVM> CREATOR = new Creator<StepVM>() {
        @Override
        public StepVM createFromParcel(Parcel source) {
            return new StepVM(source);
        }

        @Override
        public StepVM[] newArray(int size) {
            return new StepVM[size];
        }
    };
}
