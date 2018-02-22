package com.codegile.univ.paul.week1.day4.problems.entities;

import com.codegile.univ.paul.week1.day4.problems.enums.CarBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.CarModel;

public class Car extends Automobile {

    private CarBrand brand;
    private CarModel model;

    public Car() {
        this.setNumberOfWheels(4);
    }

    public CarBrand getBrand() {
        return brand;
    }

    public CarModel getModel() {
        return model;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }
}
