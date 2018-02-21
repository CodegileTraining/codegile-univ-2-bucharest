package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.Random;

public class Driver {

    private String name;
    // TODO: Declare variables as abstractly as possible (List)
    // TODO: Also, are you sure the best/safest option is a string list for this field? (see Java Collections)
    private ArrayList<String> drivbleVehicles;

    // TODO: Fix typos


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
        // TODO: Try to further generify this method - TBD (To be discussed)
        if (vehicle instanceof Car) {
            if (drivbleVehicles.contains("car")) {
                // TODO: Override toString() method in your classes to make the code more succinct
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

    // TODO: Why is there a separate drive() method for Motorcycles?
    public void drive(Motorcycle motorcycle) {
        if (!drivbleVehicles.contains("motrcycle")) { // TODO: Notice that it might be unsafe to use strings here - a typo can ruin everything
            System.out.println(name + " cannot drive a motorcycle: " + motorcycle.getBrand() + " " + motorcycle.getModel());
        } else {
            System.out.println(name + " is driving a motorcycle: " + motorcycle.getBrand() + " " + motorcycle.getModel());
        }
    }
    public ArrayList<Driver> createDrivers(int numberOfDrivers, Random random) // TODO: Are you sure this method is in the right place? (Single Responsibility Principle)
    { // TODO: Separate methods by single new lines and keep opening brackets on the same line as the method declaration (or use CTRL+ALT+L)
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
