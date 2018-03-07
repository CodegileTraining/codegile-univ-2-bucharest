package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DriversGenerator {

    public static List<Driver> getDrivers(int numberOfDrivers) {
        List<Driver> drivers = new ArrayList<>();
        for (int i = 0; i < numberOfDrivers; i++) {
            Driver driver = new Driver();
            driver.setName("Driver " + (i+1));
            List<DrivableVehicles> drivableVehicles = new ArrayList<>();
            for (DrivableVehicles vehicleType : DrivableVehicles.values()) {
                if (RandomGenerator.getNextBoolean()) {
                    drivableVehicles.add(vehicleType);
                    System.out.println(driver.getName() + " is driving " + vehicleType);
                } else {
                    drivableVehicles.add(vehicleType);
                    System.out.println(driver.getName() + " cannot drive " + vehicleType);
                }
            }
            driver.setDrivableVehicles(drivableVehicles);
            drivers.add(driver);
        }
        return drivers;
    }
}
