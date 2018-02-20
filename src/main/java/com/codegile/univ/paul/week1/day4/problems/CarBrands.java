package com.codegile.univ.paul.week1.day4.problems;

public enum CarBrands {

    FORD("Ford"),
    VOLKSWAGEN("VolksWagen"),
    OPEL("Opel"),
    BMW("BMW");

    private final String brand;

    CarBrands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
