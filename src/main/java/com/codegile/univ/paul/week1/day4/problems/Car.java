package com.codegile.univ.paul.week1.day4.problems;

import com.codegile.univ.paul.week1.day4.problems.enums.CarBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.CarModel;

public class Car extends Automobile {

    private CarBrand carBrand;
    private CarModel carModel;

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}
