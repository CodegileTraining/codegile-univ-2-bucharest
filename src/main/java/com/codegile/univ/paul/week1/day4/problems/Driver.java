package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;

public class Driver {

    public String name;
    public ArrayList<String> drivble_vehicles;

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Car && !drivble_vehicles.contains("car")) {
            System.out.println(name + " cannot drive " + vehicle);
        }
        if (vehicle instanceof Bus && !drivble_vehicles.contains("bus")) {
            System.out.println(name + " cannot drive " + vehicle);
        }
        System.out.println(name + " is driving " + vehicle);
    }

    public void drive(Motorcycle motorcycle) {
        if (!drivble_vehicles.contains("motrcycle")) {
            System.out.println(name + " cannot drive " + motorcycle);
        }
        System.out.println(name + " is driving " + motorcycle);
    }
}