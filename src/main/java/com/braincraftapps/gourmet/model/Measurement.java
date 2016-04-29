package com.braincraftapps.gourmet.model;

/**
 * Created by Алексей on 16.04.2015.
 */
public class Measurement {
    private long id;
    private String name;

    public Measurement() {
    }

    public Measurement(long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return this.name;
    }
}
