package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public enum CarModel {
    MODEL1("Model 1"),
    MODEL2("Model 2"),
    MODEL3("Model 3"),
    MODEL4("Model 4");

    private String readable;

    CarModel(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }

    public static CarModel getRandom() {
        int pick = new Random().nextInt(values().length);
        return values()[pick];
    }
}
