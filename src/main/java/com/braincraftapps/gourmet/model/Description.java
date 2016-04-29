package com.braincraftapps.gourmet.model;

import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2015.
 */
public class Description extends ArrayList<Description> {
    private int step;
    private String description;
    private int image;
    private boolean isRowWithImage = false;

    public Description(int step,String description) {
        this.description = description;
        this.step = step;
    }

    public Description(int image, boolean isRowWithImage) {
        this.image = image;
        this.isRowWithImage = isRowWithImage;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isRowWithImage() {
        return isRowWithImage;
    }

    public void setRowWithImage(boolean isRowWithImage) {
        this.isRowWithImage = isRowWithImage;
    }
}
