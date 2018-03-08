package com.codegile.univ.paul.week1.day4.problems;

public enum DrivableVehicle {
    CAR(Car.class.getSimpleName()),
    BUS(Bus.class.getSimpleName()),
    MOTORCYCLE(Motorcycle.class.getSimpleName());

    private String className;

    DrivableVehicle(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public static DrivableVehicle valueOfClassName(String className) {
        for(DrivableVehicle vehicle : values()) {
            if (vehicle.className.equals(className)) {
                return vehicle;
            }
        }
        return null;
    }
}
