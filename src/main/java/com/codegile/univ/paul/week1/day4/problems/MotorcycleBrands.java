package com.codegile.univ.paul.week1.day4.problems;

public enum MotorcycleBrands {
    SUZUKi("Suzuki"),
    YAMAHA("Yamaha"),
    FUFUKI("Fufuki");

    public String brand;
    MotorcycleBrands(String brand){
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }
}
