package com.codegile.univ.paul.week1.day4.problems;

import java.util.List;

public class Driver {

    private String name;
    private List<DrivableVehicle> drivableVehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DrivableVehicle> getDrivableVehicles() {
        return drivableVehicles;
    }

    public void setDrivableVehicles(List<DrivableVehicle> drivableVehicles) {
        this.drivableVehicles = drivableVehicles;
    }

    public void drive(Vehicle vehicle){
        String type = vehicle.getClass().getSimpleName();
        if (drivableVehicles.contains(DrivableVehicle.valueOfClassName(type))) {
            System.out.println("Driver is driving" + vehicle.toString());
        } else {
            System.out.println("cant drive blabla");
        }
    }
}