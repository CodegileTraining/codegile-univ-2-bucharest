package com.codegile.univ.paul.week1.day4.problems;

public enum BusBrands { // TODO: Names of enums should be kept as their singular form (BusBrand)
    MERCEDES("Mercedes"),
    VOLkSWAGEN("Volkswagen"); // TODO: Enum values should be all-caps

    public String brand; // TODO: Why is this field public?

    BusBrands(String brand){
        this.brand=brand;
    } // TODO: Always use CTRL+ALT+L to format your code

    public String getBrand() {
        return brand;
    }
}
