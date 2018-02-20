package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {

    private String name;
    private ArrayList<String> drivbleVehicles;



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

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            if (drivbleVehicles.contains("car")) {
                System.out.println(name + " is driving a car: " + ((Car) vehicle).getBrand() + " " + ((Car) vehicle).getModel());
            } else {
                System.out.println(name + " cannot drive a car: " + ((Car) vehicle).getBrand() + " " + ((Car) vehicle).getModel());
            }
        }
        if (vehicle instanceof Bus ) {
            if(drivbleVehicles.contains("bus")){
                System.out.println(name + " is driving a bus: " + ((Bus) vehicle).getBrand() + " " + ((Bus) vehicle).getModel());
            }
            else {
                System.out.println(name + " cannot drive a bus: " + ((Bus) vehicle).getBrand() + " " + ((Bus) vehicle).getModel());
            }
        }

    }

    public void drive(Motorcycle motorcycle) {
        if (!drivbleVehicles.contains("motrcycle")) {
            System.out.println(name + " cannot drive a motorcycle: " + motorcycle.getBrand() + " " + motorcycle.getModel());
        } else {
            System.out.println(name + " is driving a motorcycle: " + motorcycle.getBrand() + " " + motorcycle.getModel());
        }
    }
    public ArrayList<Driver> createDrivers(int numberOfDrivers, Random random)
    {
        ArrayList<Driver> driverList = new ArrayList<>();
        for (int i = 0; i < numberOfDrivers; i++) {
            Driver driver = new Driver();
            driver.setName("Drvier" + (i + 1));
            driver.setDrivbleVehicles(new ArrayList<>());
            if (random.nextBoolean()) {
                driver.getDrivbleVehicles().add("car");
            }
            if (random.nextBoolean()) {
                driver.getDrivbleVehicles().add("motorcycle");
            }
            if (random.nextBoolean()) {
                driver.getDrivbleVehicles().add("bus");
            }
            driverList.add(driver);

        }
        return driverList;
    }

}
