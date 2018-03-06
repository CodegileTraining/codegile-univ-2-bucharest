package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum BusModel {
    C100("C100"),
    D200("D200");

    private String readable;

    BusModel(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static BusModel getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
