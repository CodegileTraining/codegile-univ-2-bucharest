package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.Arrays;
import java.util.List;

public enum CarBrand {

    FORD("Ford", Arrays.asList(CarModel.MODEL1, CarModel.MODEL2)),
    VOLKSWAGEN("VolksWagen", Arrays.asList(CarModel.MODEL3)),
    OPEL("Opel",Arrays.asList(CarModel.MODEL4)),
    BMW("BMW",Arrays.asList(CarModel.MODEL5));

    private final String brand;
    private final List<CarModel> models;

    CarBrand(String brand, List<CarModel> models) {
        this.brand = brand;
        this.models = models;
    }

    public String getBrand() {
        return brand;
    }

    public List<CarModel> getModels() {
        return models;
    }

    public static CarBrand getRandom() {
        CarBrand[] brands = CarBrand.values();
        int number = brands.length;
        int selected = RandomProvider.getNextInt(number);
        return brands[selected];
    }
}
