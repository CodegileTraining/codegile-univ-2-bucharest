package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

public enum CarModel {
    MODEL1("Model 1"),
    MODEL2("Model 2"),
    MODEL3("Model 3"),
    MODEL4("Model 4"),
    MODEL5("Model 5");

    private final String model;

    CarModel(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public static CarModel getRandom() {
        CarModel[] models = CarModel.values();
        int number = models.length;
        int selected = RandomProvider.getNextInt(number);
        return models[selected];
    }
}
