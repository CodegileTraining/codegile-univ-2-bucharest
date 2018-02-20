package com.codegile.univ.paul.week1.day4.problems;

public enum BusModels {
    C100("C100"),
    D200("D200");

    public String model;

    BusModels(String model)
    {
        this.model=model;
    }

    public String getModel() {
        return model;
    }
}
