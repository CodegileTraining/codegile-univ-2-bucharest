package com.codegile.univ.paul.week1.day4.problems.entities;


public abstract class Automobile extends Vehicle {

    private int numberOfWheels;
    private int cilinderCapactiy;

    // TODO: Fix typos

    public int getCilinderCapactiy() {
        return cilinderCapactiy;
    }

    public void setCilinderCapactiy(int cilinderCapactiy) {
        this.cilinderCapactiy = cilinderCapactiy;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
