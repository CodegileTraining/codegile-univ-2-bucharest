package com.codegile.univ.paul.week1.day4.problems.entities;

import java.util.ArrayList;

public class Driver {

    private String name;
    // TODO: Declare variables as abstractly as possible (List)
    // TODO: Also, are you sure the best/safest option is a string list for this field? (see Java Collections)
    private ArrayList<Class<? extends Vehicle>> drivableVehicles;

    // TODO: Fix typos


    public String getName() {
        return name;
    }

    public ArrayList<Class<? extends Vehicle>> getDrivableVehicles() {
        return drivableVehicles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDrivableVehicles(ArrayList<Class<? extends Vehicle>> drivableVehicles) {
        this.drivableVehicles = drivableVehicles;
    }

    public void drive(Vehicle vehicle) {
        if (drivableVehicles.contains(vehicle.getClass())) {
            System.out.println(name + " is driving a " + vehicle.getClass().getSimpleName() + ": " + vehicle);
        } else {
            System.out.println(name + " cannot drive a " + vehicle.getClass().getSimpleName() + ": " + vehicle);
        }
    }

}






