package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;

public class Driver {

    public String name;
    public ArrayList<String> drivebleVehicles;

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Car && !drivebleVehicles.contains("car")) {
            System.out.println(name + " cannot drive " + vehicle.getModel());
        }
        if (vehicle instanceof Bus && !drivebleVehicles.contains("bus")) {
            System.out.println(name + " cannot drive " + vehicle.getModel());
        }
        System.out.println(name + " is driving " + vehicle.getModel());
    }

    public void drive(Motorcycle motorcycle) {
        if (!drivebleVehicles.contains("motorcycle")) {
            System.out.println(name + " cannot drive " + motorcycle.getModel());
        }
        System.out.println(name + " is driving " + motorcycle.getModel());
    }
}