package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum BusMake {
    WOLKSWAGEN("WolksWagen"),
    MERCEDES("Mercedes");

    private String readable;

    BusMake(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static BusMake getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
