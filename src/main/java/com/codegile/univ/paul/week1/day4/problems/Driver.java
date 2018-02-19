package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;

public class Driver {

    private String name;
    private ArrayList<String> drivbleVehicles;

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Car && !drivbleVehicles.contains("car")) {
            System.out.println(name + " cannot drive " + ((Car) vehicle).getModel());
        }
        if (vehicle instanceof Bus && !drivbleVehicles.contains("bus")) {
            System.out.println(name + " cannot drive " + ((Car) vehicle).getModel());
        }
        System.out.println(name + " is driving " + ((Car) vehicle).getModel());
    }

    public void drive(Motorcycle motorcycle) {
        if (!drivbleVehicles.contains("motrcycle")) {
            System.out.println(name + " cannot drive " + motorcycle.getModel());
        }
        System.out.println(name + " is driving " + motorcycle.getModel());
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getDrivbleVehicles() {
        return drivbleVehicles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDrivbleVehicles(ArrayList<String> drivbleVehicles) {
        this.drivbleVehicles = drivbleVehicles;
    }
}