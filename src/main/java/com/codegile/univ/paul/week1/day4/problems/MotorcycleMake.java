package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum MotorcycleMake {
    SUZUKI("Suzuki"),
    YAMAHA("Yamaha"),
    DUCATII("Ducatti");

    private String readable;

    MotorcycleMake(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static MotorcycleMake getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
