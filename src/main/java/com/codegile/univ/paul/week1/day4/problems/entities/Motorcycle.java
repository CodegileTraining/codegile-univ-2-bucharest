package com.codegile.univ.paul.week1.day4.problems.entities;

import com.codegile.univ.paul.week1.day4.problems.enums.MotorcycleBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.MotorcycleModel;

public class Motorcycle extends Automobile {
    private MotorcycleBrand brand;
    private MotorcycleModel model;

    public Motorcycle() {
        this.setNumberOfWheels(2);
    }

    public MotorcycleBrand getBrand() {
        return brand;
    }

    public void setBrand(MotorcycleBrand brand) {
        this.brand = brand;
    }

    public MotorcycleModel getModel() {
        return model;
    }

    public void setModel(MotorcycleModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return brand.getReadable() + " " + model.getModel();
    }
}
