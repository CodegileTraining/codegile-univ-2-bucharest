package com.codegile.univ.paul.week1.day4.problems;

public enum CarModels {
    MODEL1("Model 1"),
    MODEL2("Model 2"),
    MODEL3("Model 3"),
    MODEL4("Model 4");

    private final String model;

    CarModels(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }
}
