package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum CarMake {
    FORD("Ford"),
    VOLKSWAGEN("WolksWagen"),
    OPEL("Opel"),
    BMW("BMW");

    private String readable;

    CarMake(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static CarMake getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
