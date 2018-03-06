package com.codegile.univ.paul.week1.day4.problems;

import java.util.List;

public enum DrivableVehicles {
    CAR("Car"),
    BUS("Bus"),
    MOTORCYCLE("Motorcycle");

    private String readable;

    DrivableVehicles(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

}
