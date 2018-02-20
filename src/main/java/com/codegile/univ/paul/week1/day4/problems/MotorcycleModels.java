package com.codegile.univ.paul.week1.day4.problems;

public enum MotorcycleModels {
    M100("100"),
    M101("101"),
    M200("200"),
    M300("300");

    public String model;

    MotorcycleModels(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }
}
