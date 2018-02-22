package com.codegile.univ.paul.week1.day4.problems.generator;

import com.codegile.univ.paul.week1.day4.problems.Main;
import com.codegile.univ.paul.week1.day4.problems.entities.Bus;
import com.codegile.univ.paul.week1.day4.problems.entities.Car;
import com.codegile.univ.paul.week1.day4.problems.entities.Driver;
import com.codegile.univ.paul.week1.day4.problems.entities.Motorcycle;
import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.ArrayList;

public class DriversGenerator {
    public ArrayList<Driver> createDrivers(int numberOfDrivers) {
       ArrayList<Driver> driverList = new ArrayList<>();

        for (int i = 0; i < numberOfDrivers; i++) {
            Driver driver = new Driver();
            driver.setName("Drvier" + (i + 1));
            driver.setDrivableVehicles(new ArrayList<>());
            if (RandomProvider.getNextBoolean()) {
                driver.getDrivableVehicles().add(Car.class);
            }
            if (RandomProvider.getNextBoolean()) {
                driver.getDrivableVehicles().add(Motorcycle.class);
            }
            if (RandomProvider.getNextBoolean()) {
                driver.getDrivableVehicles().add(Bus.class);
            }
            driverList.add(driver);

        }
        return driverList;
    }
}



