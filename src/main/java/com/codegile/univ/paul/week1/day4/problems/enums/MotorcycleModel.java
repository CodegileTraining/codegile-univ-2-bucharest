package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

public enum MotorcycleModel {

    M100("100"),
    M101("101"),
    M200("200"),
    M201("201"),
    M300("300"),
    M301("301");

    private String model;

    MotorcycleModel(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public static MotorcycleModel getRandom() {
        MotorcycleModel[] models = MotorcycleModel.values();
        int number = models.length;
        int selected = RandomProvider.getNextInt(number);
        return models[selected];
    }

}
