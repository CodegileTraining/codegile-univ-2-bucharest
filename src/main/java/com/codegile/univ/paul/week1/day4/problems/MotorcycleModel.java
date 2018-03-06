package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum MotorcycleModel {
    CC50("CC50"),
    CC125("CC125"),
    CC600("CC600"),
    CC1200("CC1200");

    private String readable;

    MotorcycleModel(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static MotorcycleModel getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
