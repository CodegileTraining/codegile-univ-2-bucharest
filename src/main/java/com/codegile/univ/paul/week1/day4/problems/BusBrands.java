package com.codegile.univ.paul.week1.day4.problems;

public enum BusBrands {
    MERCEDES("Mercedes"),
    VOLkSWAGEN("Volkswagen");

    public String brand;

    BusBrands(String brand){
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }
}
