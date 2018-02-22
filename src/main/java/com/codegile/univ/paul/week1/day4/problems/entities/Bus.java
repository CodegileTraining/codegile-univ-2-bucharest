package com.codegile.univ.paul.week1.day4.problems.entities;

import com.codegile.univ.paul.week1.day4.problems.enums.BusBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.BusModel;

public class Bus extends Automobile {

    private BusBrand brand;
    private BusModel model;

    public Bus(int numberOfWheels) {
        this.setNumberOfWheels(numberOfWheels);
    }

    public BusBrand getBrand() {
        return brand;
    }

    public BusModel getModel() {
        return model;
    }

    public void setBrand(BusBrand brand) {
        this.brand = brand;
    }

    public void setModel(BusModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return brand.getBrand() + " " + model.getModel();
    }
}