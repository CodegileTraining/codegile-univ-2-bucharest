package com.codegile.univ.paul.week1.day4.problems;

public class Bus extends Automobile {

    private int numOfSeats;

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getNumberOfSeats() {
        return super.getNumberOfWheels();
    }
}
