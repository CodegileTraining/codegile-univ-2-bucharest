package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

public enum BusModel {
    C100("C100"),
    D200("D200");

    private String model;

    BusModel(String model)
    {
        this.model=model;
    }

    public String getModel() {
        return model;
    }



    public static BusModel getRandom() {
        BusModel[] models = BusModel.values();
        int number = models.length;
        int selected = RandomProvider.getNextInt(number);
        return models[selected];
    }
}
