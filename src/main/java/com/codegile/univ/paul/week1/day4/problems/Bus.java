package com.codegile.univ.paul.week1.day4.problems;

public class Bus extends Vehicle {

    private int numOfSeats;
    private String make;
    private String model;


    public int getNumOfSeats() {
        return numOfSeats;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
